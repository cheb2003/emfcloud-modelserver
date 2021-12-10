package com.xnzk.emfcloud.modelserver.cdo;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.server.CDOServerBrowser;
import org.eclipse.emf.cdo.server.db.CDODBUtil;
import org.eclipse.emf.cdo.server.net4j.CDONet4jServerUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.session.CDOSessionConfiguration;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOAdapterPolicy;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.container.IPluginContainer;

/**
 * @author chenyoujun
 */
public class Client {
    public static void main(String[] args) throws CommitException {
//        IConnector connector = Net4jUtil.getConnector(IPluginContainer.INSTANCE, "tcp://localhost");
//        CDOSessionConfiguration sessionConfiguration = CDONet4jUtil.createNet4jSessionConfiguration();
////        sessionConfiguration.setsetConnector(connector);
////        sessionConfiguration.setRepositoryName("aa");
//        CDOSession session = sessionConfiguration.openSession();
//        session.close();

//        String server = IConfiguration.INSTANCE.getServer();
//        String repository = IConfiguration.INSTANCE.getRepository();

        IManagedContainer container = ContainerUtil.createContainer();

        Net4jUtil.prepareContainer(container); // Register Net4j factories
        TCPUtil.prepareContainer(container); // Register TCP factories

        CDONet4jUtil.prepareContainer(container); // Register CDO client factories
        CDONet4jServerUtil.prepareContainer(container); // Register CDO server factories

        container.registerFactory(new CDOServerBrowser.ContainerBased.Factory(container));
        CDODBUtil.prepareContainer(container); // Register DBBrowserPage.Factory

        container.activate();
        IConnector connector = TCPUtil.getConnector(container, "localhost:2037");

        CDONet4jSessionConfiguration config = CDONet4jUtil.createNet4jSessionConfiguration();
        config.setConnector(connector);
        config.setRepositoryName("clone");
        final CDONet4jSession cdoSession = config.openNet4jSession();
//        final CDOTransaction cdoTransaction = cdoSession.openTransaction();;
//        final CDOResource resource = cdoTransaction.createResource("/");;
//        cdoTransaction.commit();
//        cdoTransaction.close();
        final CDOView cdoView = cdoSession.openView();
        final CDOResource rootResource = cdoView.getRootResource();
        rootResource.getName();

        cdoSession.close();


//        session = config.openNet4jSession();
//        view = session.openView();
//        view.options().addChangeSubscriptionPolicy(CDOAdapterPolicy.ALL);
    }
}

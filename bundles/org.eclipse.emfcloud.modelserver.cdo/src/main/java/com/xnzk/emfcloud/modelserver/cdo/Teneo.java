package com.xnzk.emfcloud.modelserver.cdo;

import com.xnzk.flash.meta.tenant.TenantPackage;
import org.eclipse.emf.cdo.examples.company.CompanyFactory;
import org.eclipse.emf.cdo.examples.company.CompanyPackage;
import org.eclipse.emf.cdo.examples.company.Product;
import org.eclipse.emf.cdo.examples.company.VAT;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Environment;

import java.util.Properties;

/**
 * @author chenyoujun
 */
public class Teneo {
    public static void main(String[] args) {
        final Properties props = new Properties();
        props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
        props.setProperty(Environment.USER, "root");
        props.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3307/teneo?&useUnicode=true&characterEncoding=utf-8&autoReconnect=true");
        props.setProperty(Environment.PASS, "123456");
        props.setProperty(Environment.DIALECT, org.hibernate.dialect.MySQL5InnoDBDialect.class.getName());
        props.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT, "REFRESH,PERSIST,MERGE");
        // the name of the session factory
        String hbName = "Library";
// create the HbDataStore using the name
        final HbDataStore hbds = HbHelper.INSTANCE.createRegisterDataStore(hbName);

// set the properties
        hbds.setDataStoreProperties(props);

// sets its epackages stored in this datastore
        hbds.setEPackages(new EPackage[]{CompanyPackage.eINSTANCE});

// initialize, also creates the database tables
        try {
            hbds.initialize();
        } finally {
            // print the generated mapping
            System.err.println(hbds.getMappingXML());
        }
        final SessionFactory sessionFactory = hbds.getSessionFactory();
        final Session hbSession = sessionFactory.openSession();
        final Transaction tx = hbSession.getTransaction();
        tx.begin();
        final Product product = CompanyFactory.eINSTANCE.createProduct();
        product.setName("product");
        product.setDescription("product description");
        product.setPrice(0.01f);
        product.setVat(VAT.VAT15);
        hbSession.save(product);
        tx.commit();
        hbSession.close();
    }
}

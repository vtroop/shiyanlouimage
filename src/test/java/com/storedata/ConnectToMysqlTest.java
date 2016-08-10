package com.storedata;

import com.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;

import java.sql.SQLException;

/**
 * Created by Evilina on 2016/7/31.
 */
public class ConnectToMysqlTest {

    @Before
    public void setUp() throws Exception {

    }

    private ApplicationContext applicationContext;
    @Test
    public void testHibernate() throws SQLException {
        applicationContext = new FileSystemXmlApplicationContext("C:\\Users\\Evilina\\Desktop\\shiyanlouimage\\web\\WEB-INF\\applicationContext.xml");
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        System.out.println(dataSource.getConnection().toString());
        SessionFactory sessionFactory = applicationContext.getBean(SessionFactory.class);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        UserEntity userEntity = new UserEntity("nihao", "123");
        session.save(userEntity);
        transaction.commit();
        session.close();

    }
}
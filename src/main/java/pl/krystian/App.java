package pl.krystian;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        SettersGetters settersGetters = new SettersGetters();
        settersGetters.setId(1);
        settersGetters.setMarka("Ford");
        settersGetters.setPrzebieg(230000);
        settersGetters.setRocznik(2004);

        Configuration con = new Configuration().configure().addAnnotatedClass(SettersGetters.class);

        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(settersGetters);

        tx.commit();
    }
}

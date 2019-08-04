package pl.krystian;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {
            SettersGetters settersGetters = new SettersGetters();
            settersGetters.setId(2);
            settersGetters.setMarka("Volkswagen");
            settersGetters.setPrzebieg(190000);
            settersGetters.setRocznik(2007);

            Configuration con = new Configuration().configure().addAnnotatedClass(SettersGetters.class);

            ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

            SessionFactory sf = con.buildSessionFactory(reg);

            Session session = sf.openSession();

            Transaction tx = session.beginTransaction();

            session.save(settersGetters);

            tx.commit();
    }
}

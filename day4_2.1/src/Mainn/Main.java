package Mainn;
import java.rmi.RemoteException;
import java.time.LocalDate;
import Adapters.MernisServiceAdapter;
import Business.concretes.BaseCustomerManager;
import Business.concretes.StarbucksCustomerManager;
import Business.concretes.CustomerCheckManager;
import Business.concretes.NeroCustomerManager;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1,"Umut Kaan", "Özdemir", LocalDate.of(2001, 7, 22), "12271387810"));

	}

}

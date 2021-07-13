package Business.concretes;

import java.rmi.RemoteException;

import Business.abstracts.CustomerService;
import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void Save(Customer customer)
	{
		// TODO Auto-generated method stub
	
		
		System.out.println("Veritabanýna kaydedildi : " + customer.getFirstName() + " " + customer.getLastName());
	}

}

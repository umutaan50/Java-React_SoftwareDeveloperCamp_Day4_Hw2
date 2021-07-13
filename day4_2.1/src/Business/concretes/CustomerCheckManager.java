package Business.concretes;

import java.rmi.RemoteException;

import Business.abstracts.CustomerCheckService;
import Business.abstracts.CustomerService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	
	//boolean CheckIfRealPerson(Customer customer) ;
	@Override
	public boolean CheckIfRealPerson(Customer customer){
		
		return true;
		
	}

	
}

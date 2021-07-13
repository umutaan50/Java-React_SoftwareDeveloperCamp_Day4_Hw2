package Business.concretes;

import java.rmi.RemoteException;

import Business.concretes.BaseCustomerManager;
import Business.abstracts.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		
			if (customerCheckService.CheckIfRealPerson(customer)) {
				System.out.println("Valid person.");
			}
			else {
				System.out.println("Not a valid person.");
			}
		
	}


}

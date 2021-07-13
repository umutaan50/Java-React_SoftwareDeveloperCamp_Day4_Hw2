package Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import Business.abstracts.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	
	
	
	@Override
	public boolean CheckIfRealPerson(Customer customer)  
		
	{
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = true;
		
		try 
		{
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());		
		} 
		catch (Exception e) 
		{
			System.out.println("Not a valid person");
		}
		
		/*try {
			result=client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName().toUpperCase(new Locale("tr")), customer.getLastName().toUpperCase(new Locale("tr")), 
					customer.getDateOfBirth ());
		} catch (RemoteException e) {
			e.printStackTrace();
		}*/
		return result;
		
		
//		boolean result = true;
//		
//		try {
//			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
//			
//		} catch (RemoteException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		
//		}
//		return result;		
		
	}

}

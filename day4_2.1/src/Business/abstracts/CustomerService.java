package Business.abstracts;
import java.rmi.RemoteException;

// interface implementasyonunu yapan herkes bu operasyonu kullanmak, implemente etmek zorundadýr.
import Entities.Customer;

public interface CustomerService {
		void Save(Customer customer);
}

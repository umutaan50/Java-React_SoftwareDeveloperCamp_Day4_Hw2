package Business.abstracts;
import java.rmi.RemoteException;

// interface implementasyonunu yapan herkes bu operasyonu kullanmak, implemente etmek zorundad�r.
import Entities.Customer;

public interface CustomerService {
		void Save(Customer customer);
}

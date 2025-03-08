package spotify.dal;
import java.util.List;
import spotify.exceptions.NoSuchTransaction;
import spotify.spotify_entity.Transaction;
public interface TransactionDao {	

	public float getUserBalance() throws Exception;
	
	public void updateUserBalance(float amount) throws Exception;
		
	public List<Transaction> getTransactions() throws Exception;
	
	public void addTransaction(Transaction t) throws Exception;
	
	public void removeTransaction(int id) throws Exception, NoSuchTransaction;
	
	public void updateTransaction(int id, float newAmount) throws Exception, NoSuchTransaction;
	
	public Transaction getTransaction(int id ) throws Exception, NoSuchTransaction;
			
}

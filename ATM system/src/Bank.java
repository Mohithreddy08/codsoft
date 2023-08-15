	import java.util.HashMap;
	import java.util.Map;

	public class Bank {
	    private Map<Integer, Account> accounts;

	    public Bank() {
	        accounts = new HashMap<>();
	    }
	    public void addAccount(Account account) {
	        accounts.put(account.getAccountNumber(), account);
	    }

	    public Account getAccount(int accountNumber) {
	        return accounts.get(accountNumber);
	    }
	}


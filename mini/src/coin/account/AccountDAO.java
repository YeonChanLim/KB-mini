package coin.account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import coin.exception.AlreadyHasAccountException;
import coin.exception.RecordNotFoundException;

public interface AccountDAO {
	Connection getConnect() throws SQLException;
	void closeAll(PreparedStatement ps, Connection conn)throws SQLException;
	void closeAll(ResultSet rs, PreparedStatement ps, Connection conn)throws SQLException;
	
	void openAccount(int custId) throws SQLException, RecordNotFoundException, AlreadyHasAccountException;
	int getAccountStatus(String accountNo) throws SQLException, RecordNotFoundException;
	int getAccountBalance(String accountNo) throws SQLException, RecordNotFoundException;
}

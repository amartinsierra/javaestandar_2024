package dao;

import java.util.List;

public interface ClientesDao {
	List<Cliente> findByCuenta(int idCuenta);
}

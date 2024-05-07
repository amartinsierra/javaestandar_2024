package dao;

import java.util.List;

public interface MovimientosDao {
	List<Movimiento> findByCuenta(int idCuenta);
	void save(Movimiento movimiento);
}

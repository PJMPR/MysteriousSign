/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import HogwartLibrary.History;
import java.sql.Connection;
import java.sql.SQLException;
import mapper.HistoryMapper;

public class HistoryRepository extends RepoBase<History>{


	public HistoryRepository(Connection connection, HistoryMapper mapper) {

		super(connection, mapper);


	}

	

	@Override
	protected String tableName() {

		// TODO Auto-generated method stub

		return "History";

	}

	@Override
	protected String createTableSql() {

		// TODO Auto-generated method stub

		return "CREATE TABLE History("

				+ "idHistory bigint GENERATED BY DEFAULT AS IDENTITY,"

				+ "hire boolean),"
                        
                                + "TooLongHire boolean),"
                        
                                + "reservation boolean,"
                        
                                + "punishment int,"
                        
                                + "PRIMARY_KEY (idHistory),"

				+ ")";

	}

	@Override
	protected String insertSql() {

		// TODO Auto-generated method stub

		return "INSERT INTO History INSERT INTO history(idHistory, hire, TooLongHire, reservation, punishment) VALUES (?, ?, ?, ?, ?, ?)";

	}

	@Override
        protected String deleteSql() {

		// TODO Auto-generated method stub

		return "DELETE FROM History WHERE IdHisotry = ?";

	}

	@Override
	protected String updateSql() {

		// TODO Auto-generated method stub

		return "UPDATE History SET idHistory = ?, hire = ?, TooLongHire = ?, reservation = ?, punishment = ? WHERE idHistory = ?";

	}

	@Override
	protected String selectByIdSql() {

		// TODO Auto-generated method stub

		return "SELECT * FROM History WHERE idHistory=?";

	}

	@Override
	protected String selectAllSql() {

		// TODO Auto-generated method stub

		return "SELECT * FROM History";

	}

	

	@Override
        protected void setupInsert(History entity) throws SQLException {

		insert.setInt(1, entity.getIdHistory());

		insert.setBoolean(4, entity.getHire());
                
                insert.setBoolean(5, entity.getTooLongHire());
                
                insert.setBoolean(6, entity.getReservation());
                
                insert.setInt(7, entity.getPunishment());

		

	}



	@Override
	protected void setupUpdate(History entity) throws SQLException {

		update.setDouble(1, entity.getIdHistory());

		update.setBoolean(4, entity.getHire());
                
                update.setBoolean(5, entity.getTooLongHire());
                
                update.setBoolean(6, entity.getReservation());
                
                update.setInt(7, entity.getPunishment());



}

}

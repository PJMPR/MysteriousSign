/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mapper;




import java.sql.ResultSet;

import java.sql.SQLException;



import Repository.IRepository;

import HogwartLibrary.IHaveId;



public interface IMapResultSetIntoEntity<TEntity extends IHaveId> {



	public TEntity map(ResultSet rs) throws SQLException;

	

}
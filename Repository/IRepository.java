/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.util.List;
import HogwartLibrary.IHaveId;


public interface IRepository<TEntity extends IHaveId> {



	public TEntity get(int personId);



	public List<TEntity> getAll();



	public void add(TEntity entity);



	public void update(TEntity entity);



	public void delete(TEntity entity);



}

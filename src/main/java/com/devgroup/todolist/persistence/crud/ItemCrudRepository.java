package com.devgroup.todolist.persistence.crud;

import com.devgroup.todolist.persistence.entity.ItemEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ItemCrudRepository extends CrudRepository<ItemEntity, Integer> {

}

package com.devgroup.todolist.persistence.crud;

import com.devgroup.todolist.persistence.entity.FolderEntity;
import org.springframework.data.repository.CrudRepository;

public interface FolderCrudRepository extends CrudRepository<FolderEntity, Integer> {

}

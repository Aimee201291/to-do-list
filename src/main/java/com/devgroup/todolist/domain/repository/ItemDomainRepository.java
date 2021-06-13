package com.devgroup.todolist.domain.repository;

import com.devgroup.todolist.domain.Item;
import com.devgroup.todolist.persistence.entity.ItemEntity;

import java.util.List;
import java.util.Optional;

public interface ItemDomainRepository {

    List<Item> getAll();
    Optional<Item> getItem(int id);
    Item save(Item item);
    void delete(int id);
}

package com.devgroup.todolist.persistence;

import com.devgroup.todolist.domain.Item;
import com.devgroup.todolist.domain.repository.ItemDomainRepository;
import com.devgroup.todolist.persistence.crud.ItemCrudRepository;
import com.devgroup.todolist.persistence.entity.ItemEntity;
import com.devgroup.todolist.persistence.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ItemRepository implements ItemDomainRepository {

    @Autowired
    private ItemCrudRepository itemCrudRepository;

    @Autowired
    private ItemMapper mapper;

    @Override
    public List<Item> getAll() {
        List<ItemEntity> items = (List<ItemEntity>) itemCrudRepository.findAll();
        return mapper.toItems(items);
    }

    @Override
    public Optional<Item> getItem(int itemId) {
        return itemCrudRepository.findById(itemId).map(item -> mapper.toItem(item));
    }

    @Override
    public Item save(Item item) {
        ItemEntity itemEntity = mapper.toItemEntity(item);
        return mapper.toItem(itemCrudRepository.save(itemEntity));
    }

    @Override
    public Item update(int id) {
        ItemEntity myItem = (itemCrudRepository.findById(id)).get();
        if (myItem.getDone() == true) {
            myItem.setDone(false);
        } else {
            myItem.setDone(true);
        }
        return mapper.toItem(itemCrudRepository.save(myItem));
    }

    @Override
    public void delete(int itemId) {
        itemCrudRepository.deleteById(itemId);
    }

}

package com.devgroup.todolist.domain.service;

import com.devgroup.todolist.domain.Item;
import com.devgroup.todolist.domain.repository.ItemDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemDomainRepository itemDomainRepository;

    public List<Item> getAll() {
        return itemDomainRepository.getAll();
    }

    public Optional<Item> getItem(int itemId) {
        return itemDomainRepository.getItem(itemId);
    }

    public Item save(Item item) {
        return itemDomainRepository.save(item);
    }

    public boolean delete(int itemId) {
        if (getItem(itemId).isPresent()) {
            itemDomainRepository.delete(itemId);
            return true;
        } else {
            return false;
        }
    }

}

package com.devgroup.todolist.persistence.mapper;

import com.devgroup.todolist.domain.Item;
import com.devgroup.todolist.persistence.entity.ItemEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    @Mappings({
            @Mapping(source = "itemId", target = "id"),
            @Mapping(source = "description", target = "name"),
            @Mapping(source = "done", target = "status"),
    })
    Item toItem(ItemEntity itemEntity);
    List<Item> toItems(List<ItemEntity> items);

    @InheritInverseConfiguration
    ItemEntity toItemEntity(Item item);
}

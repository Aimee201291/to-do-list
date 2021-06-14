package com.devgroup.todolist.persistence.mapper;

import com.devgroup.todolist.domain.FolderItem;
import com.devgroup.todolist.domain.Item;
import com.devgroup.todolist.persistence.entity.FolderItemEntity;
import com.devgroup.todolist.persistence.entity.ItemEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ItemMapper.class})
public interface FolderItemMapper {

    @Mappings({
            @Mapping(source = "itemId", target = "iId"),
            @Mapping(source = "folderId", target = "fId"),
    })
    FolderItem toFolderItem(FolderItemEntity folderItemEntity);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "folder", ignore = true),
            @Mapping(target = "item", ignore = true),
            /*@Mapping(target = "folderId", ignore = true),*/
    })
    FolderItemEntity toFolderItemEntity(FolderItem folderItem);

}

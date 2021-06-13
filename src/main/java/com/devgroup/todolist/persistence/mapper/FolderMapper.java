package com.devgroup.todolist.persistence.mapper;

import com.devgroup.todolist.domain.Folder;
import com.devgroup.todolist.persistence.entity.FolderEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {FolderItemMapper.class})
public interface FolderMapper {

    @Mappings({
            @Mapping(source = "folderId", target = "id"),
            @Mapping(source = "creationDate", target = "date"),
            @Mapping(source = "allItems", target = "items"),
    })
    Folder toFolder(FolderEntity folderEntity);
    List<Folder> toFolder(List<FolderEntity> folders);

    @InheritInverseConfiguration
    FolderEntity toFolderEntity(Folder folder);
}

package com.devgroup.todolist.persistence;

import com.devgroup.todolist.domain.Folder;
import com.devgroup.todolist.domain.repository.FolderDomainRepository;
import com.devgroup.todolist.persistence.crud.FolderCrudRepository;
import com.devgroup.todolist.persistence.entity.FolderEntity;
import com.devgroup.todolist.persistence.mapper.FolderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FolderRepository implements FolderDomainRepository {

    @Autowired
    private FolderCrudRepository folderCrudRepository;

    @Autowired
    private FolderMapper mapper;

    @Override
    public List<Folder> getAll() {
        return mapper.toFolder((List<FolderEntity>) folderCrudRepository.findAll());
    }

    @Override
    public Folder save(Folder folder) {
        FolderEntity folderEntity = mapper.toFolderEntity(folder);
        //folderEntity.getAllItems().forEach(item -> item.setFolder(folderEntity));
        return mapper.toFolder(folderCrudRepository.save(folderEntity));
    }
}

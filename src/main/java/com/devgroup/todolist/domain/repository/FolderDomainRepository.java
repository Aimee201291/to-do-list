package com.devgroup.todolist.domain.repository;

import com.devgroup.todolist.domain.Folder;

import java.util.List;

public interface FolderDomainRepository {

    List<Folder> getAll();
    Folder save(Folder folder);
}

package com.devgroup.todolist.domain.service;

import com.devgroup.todolist.domain.Folder;
import com.devgroup.todolist.domain.repository.FolderDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FolderService {

    @Autowired
    private FolderDomainRepository folderDomainRepository;

    public List<Folder> getAll() {
        return folderDomainRepository.getAll();
    }

    public Folder save(Folder folder) {
        return folderDomainRepository.save(folder);
    }

}

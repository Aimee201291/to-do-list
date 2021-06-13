package com.devgroup.todolist.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Folder {

    private int id;
    private String name;
    private LocalDateTime date;
    private List<FolderItem> items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public List<FolderItem> getItems() {
        return items;
    }

    public void setItems(List<FolderItem> items) {
        this.items = items;
    }
}

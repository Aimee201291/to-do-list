-- -----------------------------------------------------
-- Table "ITEMS"
-- -----------------------------------------------------
CREATE TABLE  ITEMS (
  "item_id" SERIAL NOT NULL,
  "description" VARCHAR(45) NOT NULL,
  "done" BOOLEAN NOT NULL
);

-- ----------------------------
-- Primary Key structure for table ITEMS
-- ----------------------------
ALTER TABLE ITEMS ADD PRIMARY KEY ("item_id");
  
-- -----------------------------------------------------
-- Table "FOLDERS"
-- -----------------------------------------------------
CREATE TABLE  FOLDERS (
  "folder_id" SERIAL NOT NULL,
  "name" VARCHAR(45) NOT NULL,
  "creation_date" TIMESTAMP NULL
);

-- ----------------------------
-- Primary Key structure for table FOLDERS
-- ----------------------------
ALTER TABLE FOLDERS ADD PRIMARY KEY ("folder_id");
	
-- -----------------------------------------------------
-- Table "FOLDERS_ITEMS"
-- -----------------------------------------------------
CREATE TABLE  FOLDERS_ITEMS (
  "id" SERIAL NOT NULL,
  "folder_id" INT NOT NULL,
  "item_id" INT NOT NULL
);

-- ----------------------------
-- Primary Key structure for table FOLDERS
-- ----------------------------
ALTER TABLE FOLDERS_ITEMS ADD PRIMARY KEY ("id");

-- ----------------------------
-- Foreign Key structure for table "FOLDERS_ITEMS"
-- ----------------------------
ALTER TABLE FOLDERS_ITEMS ADD CONSTRAINT fk_FOLDERS_ITEMS_ITEMS FOREIGN KEY ("item_id") REFERENCES ITEMS ("item_id") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE FOLDERS_ITEMS ADD CONSTRAINT fk_FOLDERS_ITEMS_FOLDERS FOREIGN KEY ("folder_id") REFERENCES FOLDERS ("folder_id") ON DELETE NO ACTION ON UPDATE NO ACTION;



-- ITEMS
INSERT INTO items VALUES (1, 'Buy groceries', false);
INSERT INTO items VALUES (2, 'Prepare weekly report', true);
INSERT INTO items VALUES (3, 'Write to candidates', true);
INSERT INTO items VALUES (4, 'Clean my desk', true);

-- FOLDERS
INSERT INTO folders VALUES (1, 'Work', TO_TIMESTAMP('12/06/2021 9:30:00','DD/MM/YYYY HH24:MI:SS'));
INSERT INTO folders VALUES (2, 'Home', TO_TIMESTAMP('13/06/2021 10:30:00','DD/MM/YYYY HH24:MI:SS'));

-- FOLDERS_ITEMS
INSERT INTO folders_items VALUES (1, 2, 1);
INSERT INTO folders_items VALUES (2, 1, 2);
INSERT INTO folders_items VALUES (3, 1, 3);
INSERT INTO folders_items VALUES (4, 2, 4);

-- SEQUENCES
SELECT setval('public.items_item_id_seq', 4, true);
SELECT setval('public.folders_folder_id_seq', 2, true);
SELECT setval('public.folders_items_id_seq', 4, true);
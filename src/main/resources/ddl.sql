CREATE TABLE b (
   dbid INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY
);

CREATE TABLE a (
   b_id int(11) NOT NULL PRIMARY KEY REFERENCES b(dbid) ON DELETE CASCADE
);

insert into b values (1),(2),(3),(4),(5),(6),(7);
insert into a values (1),(2),(3),(4),(5),(6),(7);
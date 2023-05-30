## SQL Ödev 08 | Tablo Oluşturmak | Verileri Güncellemek"

<br>
<br>
<br>

1-) test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.


```

CREATE TABLE employee (
  id INTEGER,
  name VARCHAR(50) NOT NULL,
  birthday DATE,
  email VARCHAR(100)
);

```


<br>
<br>
<br>

2-) Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

```

insert into employee (id, name, birthday, email) values (1, 'Ursula Coley', '1930-11-07', 'ucoley0@army.mil');
insert into employee (id, name, birthday, email) values (2, 'Madelon Cobleigh', '1969-05-15', 'mcobleigh1@yandex.ru');
insert into employee (id, name, birthday, email) values (3, 'Arlina Scandred', '1966-06-01', 'ascandred2@alibaba.com');
insert into employee (id, name, birthday, email) values (4, 'Jorey Strethill', '1955-07-07', 'jstrethill3@pen.io');
insert into employee (id, name, birthday, email) values (5, 'Clemmie Leethem', '1961-03-27', 'cleethem4@bluehost.com');
insert into employee (id, name, birthday, email) values (6, 'Gail Yerrall', '1936-04-25', 'gyerrall5@salon.com');
insert into employee (id, name, birthday, email) values (7, 'Fairlie Kield', '1900-12-15', 'fkield6@gnu.org');
insert into employee (id, name, birthday, email) values (8, 'Orson Henighan', '1955-01-14', 'ohenighan7@arstechnica.com');
insert into employee (id, name, birthday, email) values (9, 'Anne Norville', '1922-05-20', 'anorville8@addtoany.com');
insert into employee (id, name, birthday, email) values (10, 'Nike Walklot', '1969-03-25', 'nwalklot9@answers.com');
insert into employee (id, name, birthday, email) values (11, 'Jenilee Deluze', '1923-12-25', 'jdeluzea@mozilla.com');
insert into employee (id, name, birthday, email) values (12, 'Tildy Lawland', '1968-04-07', 'tlawlandb@is.gd');
insert into employee (id, name, birthday, email) values (13, 'Jonathon Ailmer', '1968-06-09', 'jailmerc@eventbrite.com');
insert into employee (id, name, birthday, email) values (14, 'Seth Jaine', '1942-01-23', 'sjained@indiegogo.com');
insert into employee (id, name, birthday, email) values (15, 'Marty Barbisch', '1962-07-23', 'mbarbische@craigslist.org');
insert into employee (id, name, birthday, email) values (16, 'Imogen Degoe', '1951-11-02', 'idegoef@pinterest.com');
insert into employee (id, name, birthday, email) values (17, 'Appolonia Emanuel', '1904-07-04', 'aemanuelg@mozilla.org');
insert into employee (id, name, birthday, email) values (18, 'Zsa zsa Pierce', '1949-12-06', 'zzsah@photobucket.com');
insert into employee (id, name, birthday, email) values (19, 'Benjamen Attyeo', '1966-10-29', 'battyeoi@google.cn');
insert into employee (id, name, birthday, email) values (20, 'Rollo Clist', '1923-04-11', 'rclistj@yahoo.com');
insert into employee (id, name, birthday, email) values (21, 'Averil McLay', '1946-04-22', 'amclayk@webmd.com');
insert into employee (id, name, birthday, email) values (22, 'Brena Ciobotaru', '1934-12-03', 'bciobotarul@geocities.com');
insert into employee (id, name, birthday, email) values (23, 'My Kehri', '1962-04-03', 'mkehrim@shutterfly.com');
insert into employee (id, name, birthday, email) values (24, 'Noellyn Oliphant', '1942-03-05', 'noliphantn@studiopress.com');
insert into employee (id, name, birthday, email) values (25, 'Hinda Schrieves', '1995-02-22', 'hschrieveso@msu.edu');
insert into employee (id, name, birthday, email) values (26, 'Cecilius Traise', '1994-09-26', 'ctraisep@ask.com');
insert into employee (id, name, birthday, email) values (27, 'Herta Rothman', '1933-05-19', 'hrothmanq@chronoengine.com');
insert into employee (id, name, birthday, email) values (28, 'Towney Coyne', '1982-07-08', 'tcoyner@biglobe.ne.jp');
insert into employee (id, name, birthday, email) values (29, 'Jonis Gawke', '1922-06-16', 'jgawkes@tuttocitta.it');
insert into employee (id, name, birthday, email) values (30, 'Noble Cormode', '1944-09-18', 'ncormodet@friendfeed.com');
insert into employee (id, name, birthday, email) values (31, 'Solly Whitear', '1957-09-01', 'swhitearu@guardian.co.uk');
insert into employee (id, name, birthday, email) values (32, 'Lynea Iliff', '1906-04-21', 'liliffv@multiply.com');
insert into employee (id, name, birthday, email) values (33, 'Donnie Lusher', '1952-08-17', 'dlusherw@t-online.de');
insert into employee (id, name, birthday, email) values (34, 'Nance Blaydes', '1929-01-11', 'nblaydesx@spotify.com');
insert into employee (id, name, birthday, email) values (35, 'Almeda Yeudall', '1948-03-30', 'ayeudally@prnewswire.com');
insert into employee (id, name, birthday, email) values (36, 'Carce Andreazzi', '1954-07-04', 'candreazziz@bloglines.com');
insert into employee (id, name, birthday, email) values (37, 'Petronella Schmidt', '1908-07-22', 'pschmidt10@rakuten.co.jp');
insert into employee (id, name, birthday, email) values (38, 'Florence Mettricke', '1992-06-16', 'fmettricke11@storify.com');
insert into employee (id, name, birthday, email) values (39, 'Arin Nowick', '1970-07-24', 'anowick12@nymag.com');
insert into employee (id, name, birthday, email) values (40, 'Mort Channon', '1988-07-03', 'mchannon13@umn.edu');
insert into employee (id, name, birthday, email) values (41, 'Corey Doody', '1990-06-22', 'cdoody14@comcast.net');
insert into employee (id, name, birthday, email) values (42, 'Finlay Hanalan', '1919-12-08', 'fhanalan15@paypal.com');
insert into employee (id, name, birthday, email) values (43, 'Korella Bozworth', '1927-06-22', 'kbozworth16@noaa.gov');
insert into employee (id, name, birthday, email) values (44, 'Garvin Gronous', '1952-07-04', 'ggronous17@java.com');
insert into employee (id, name, birthday, email) values (45, 'Curran Challace', '1939-01-18', 'cchallace18@digg.com');
insert into employee (id, name, birthday, email) values (46, 'Wells Holdron', '1949-08-27', 'wholdron19@tumblr.com');
insert into employee (id, name, birthday, email) values (47, 'Gena Musprat', '1972-02-25', 'gmusprat1a@wix.com');
insert into employee (id, name, birthday, email) values (48, 'Weider Kuhnke', '1998-07-11', 'wkuhnke1b@google.cn');
insert into employee (id, name, birthday, email) values (49, 'Rodney Watterson', '1991-01-04', 'rwatterson1c@indiatimes.com');
insert into employee (id, name, birthday, email) values (50, 'Luigi Crumbie', '1992-04-12', 'lcrumbie1d@goodreads.com');

```

<br>
<br>
<br>

3-) Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.


```

// İsim (name) sütununu güncellemek:

UPDATE employee
SET name = 'John Doe'
WHERE name = 'Gena Musprat';


// Doğum günü (birthday) sütununu güncellemek:

UPDATE employee
SET birthday = '1990-06-15'
WHERE email = 'anorville8@addtoany.com';


// E-posta (email) sütununu güncellemek:

UPDATE employee
SET email = 'johndoe@example.com'
WHERE birthday = '1942-01-23';


// İsim ve doğum günü sütunlarını güncellemek:

UPDATE employee
SET name = 'Jane Smith',
    birthday = '1985-03-20'
WHERE id = 4;


// Tüm sütunları güncellemek:

UPDATE employee
SET name = 'Robert Johnson',
    birthday = '1978-12-10',
    email = 'robertjohnson@example.com'
WHERE id = 5;


```


<br>
<br>
<br>


4-) Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.



```

DELETE FROM employee
WHERE id = 44;

DELETE FROM employee
WHERE name ='Zsa zsa Pierce';

DELETE FROM employee
WHERE name = 'Jane Smith' AND birthday = '1985-03-20';

DELETE FROM employee
WHERE email = 'umallinsonn@hp.com';

DELETE FROM employee
WHERE id >5
RETURNING *;

```

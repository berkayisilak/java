## SQL Ödev 3 | LIKE ve ILIKE

<br>
<br>
<br>

1-)  <strong>country</strong> tablosunda bulunan  <strong>country</strong> sütunundaki ülke isimlerinden 'A' karakteri ile başlayıp 'a' karakteri ile sonlananları sıralayınız.

```

SELECT country FROM country
WHERE country ~~ 'A%a' 

```



<br>
<br>
<br>

2-) <strong>country</strong> tablosunda bulunan <strong>country</strong> sütunundaki ülke isimlerinden en az 6 karakterden oluşan ve sonu 'n' karakteri ile sonlananları sıralayınız.

```

SELECT country FROM country 
WHERE country LIKE '_____%n' 

```


<br>
<br>
<br>

3-) <strong>film</strong> tablosunda bulunan <strong>title</strong> sütunundaki film isimlerinden en az 4 adet büyük ya da küçük harf farketmesizin <strong>'T'</strong> karakteri içeren film isimlerini sıralayınız.

```

SELECT title FROM film 
WHERE title ~~* '%T%T%T%T%' 

```


<br>
<br>
<br>

4-) <strong>film</strong> tablosunda bulunan tüm sütunlardaki verilerden <strong>title</strong> 'C' karakteri ile başlayan ve uzunluğu (length) 90 dan büyük olan ve <strong>rental_rate</strong> 2.99 olan verileri sıralayınız.

```

SELECT * FROM film 
WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99; 

```

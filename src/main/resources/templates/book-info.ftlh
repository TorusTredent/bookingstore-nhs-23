<!DOCTYPE html>
<html>
<head>
    <title>BookStore</title>
</head>
<body>
<h1>BookStore</h1><hr>
<h4>Подробное описание товара:</h4>
<b> Название книги: </b> ${book.title}<br>
<b> Описание книги: </b> ${book.description}<br>
<b> Атор книги: </b> ${book.bookAuthor}<br>
<b> Цена: </b> ${book.price}<br>
<b> Автор объявления: </b> ${book.author}<br>
<hr>
<form action="/book/delete/${book.id}" method="post">
    <input type="submit" value="Удалить товар">
</form>
</body>
</html>
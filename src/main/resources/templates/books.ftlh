<!DOCTYPE html>
<html>
<head>
    <title>BookStore</title>
</head>
<body>
<h1>BookStore</h1><hr>
<h4>Книги на любой вкус по всей Беларуси</h4>
<form action="/" method="get">
    Поиск по названию объявления: <input type="text" name="title"><br>
    <input type="submit" value="Поиск"/>
</form>
<#list books as book>
    <div>
        <p><b>${book.title}</b> ${book.price} | <a href = "/book/${book.id}">Подробнее...</a></p>
    </div>
</#list>
<hr>
<h3>Создать новый товар</h3>
<form action="/book/create" method="post">
    Название книги: <input type="text" name="title"><br><br>
    Описание книги: <input type="text" name="description"><br><br>
    Автор книги: <input type="text" name="bookAuthor"><br><br>
    Цена: <input type="number" name="price"><br><br>
    Продавец: <input type="text" name="author"><br><br>
    <input type="submit" value="Добавить книгу"/>
</form>
</body>
</html>
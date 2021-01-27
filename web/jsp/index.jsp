<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta content="utf-8">

    <h1>Анкета</h1>
</head>
<body>
<form action="/test">
Имя: <input type="text" name="name"><br>
Фамилия: <input type="text" name="surname"><br>
Возраст: <input type="text" name="age"><br>

<p><b>Вы пыгали с парашюта?</b></p>
<p><label>
    <input type="radio" name="a1" value="yes">
</label>Да</p>
<p><label>
    <input type="radio" name="a1" value="no">
</label>Нет</p>
<p><b>Вы играете в шахматы?</b></p>
<p><label>
    <input type="radio" name="a2" value="yes">
</label>Да</p>
<p><label>
    <input type="radio" name="a2" value="no">
</label>Нет</p>
<p><input type="submit" value="Отправить"></p>
</body>
</html>
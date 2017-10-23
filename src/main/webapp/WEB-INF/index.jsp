<%@ page contentType="text/html; charset=UTF-8" %><html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="style.css">
    <title>My Calc</title>
</head>
<body>
<h1>My Calculator</h1>
<form action="calc">
    <input name="x" placeholder="x" required> <br />
    <br /> <input name="y" placeholder="y" required> <br />
    <br /> <select name="op" required>
    <option>+</option>
    <option>-</option>
    <option>*</option>
    <option>/</option>
</select> <br /> <br /> <input type="submit" value="Calc">
</form>
</body>
</html>
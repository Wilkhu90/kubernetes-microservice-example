<!DOCTYPE html>
<html>
    <head>
        <title>Test Webpage</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        </head>
    <body>
        <table>
            <tr>
                <th>Name</th>  
                <th>Price</th>
            </tr>
            <#list users as user>
            <tr>
                <td>${user.username}</td>
                <td>${user.message}</td>
            </tr>
            </#list>
        </table>
    </body>
</html>
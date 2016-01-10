<!DOCTYPE html>
<html>
<head>
<title>|Welcome|</title>
    <script src="//cdn.tinymce.com/4/tinymce.min.js"></script>
    <script>tinymce.init({ selector:'textarea' });</script>
</head>
<body>
<g:form action="save" controller="admin" method="post">
    
    <g:textArea rows="35" name="content" value="${page.content}"/>
    <g:hiddenField name="mid" value="${page.id}"/>
    <g:submitButton action="save" name="submit" value="save"/>
</g:form>
</body>
</html>

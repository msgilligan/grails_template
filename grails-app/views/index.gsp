<!doctype html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Grails!</title>
	</head>
	<body>
		<g:form name="AddForm" url="[controller:'Main',action:'AddItem']">
		<div class = "input">
			<p>
     		   <label for="name">Name: </label>
    		    <input type="text" name="name" id="name" />
      		  <label for="id">Comments: </label>
    		    <input type="text" name="comment" id="comment" />
   		     <input type="submit" value="Add new item" />
   		 	</p>
		</div>
		</g:form>

		<g:form name="RemoveForm" url="[controller:'Main',action:'RemoveItem']">
		<div class = "remove">
			<p>
       		 	<label for="name">Name: </label>
        		<input type="text" name="name" id="name" />
        		<input type="submit" value="Remove item" />
    		</p>
		</div>
		</g:form>

		<table class = "item_table">
			<div class = "item_properties">
				<tr><td>Name</td><td>Comment</td></tr>
			</div>
			<g:each in="${items}" var="item">
    			<div class="item">
 					<tr><td>${item.name}</td><td>${item.comment}</td></tr>
    			</div>
		</table>
	</body>
</html>

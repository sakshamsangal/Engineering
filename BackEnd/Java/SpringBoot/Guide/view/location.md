```

<form action="saveLoc" method="post">
<pre>
Id: 		<input type="text" name="id"/>
Code:		<input type="text" name="code"/>
Name:		<input type="text" name="name"/>
Type: Urban <input type="radio" name="type" value="URBAN"/>
	  Rural <input type="radio" name="type" value="RURAL"/>
			<input type="submit" value="save"/>
</pre>
</form>
${msg}

<a href="displayLocations">View All</a>



<c:forEach items="${locations}" var="location">
<tr>
<td>${location.id}</td>
<td>${location.code}</td>
<td>${location.name}</td>
<td>${location.type}</td>
<td><a href="deleteLocation?id=${location.id}">delete</a></td>
<td><a href="showUpdate?id=${location.id}">edit</a></td>
</tr>
</c:forEach>
</table>
<a href="showCreate">Add Location</a>

<img src="pieChart.jpeg"/>


<form action="updateLoc" method="post">
<pre>
Id:         <input type="text" name="id" value="${location.id}" readonly/>
Code:       <input type="text" name="code" value="${location.code}"/>
Name:       <input type="text" name="name" value="${location.name}"/>
Type:
    Urban   <input type="radio" name="type" value="URBAN" ${location.type=='URBAN'?'checked':''}/>
	Rural   <input type="radio" name="type" value="RURAL" ${location.type=='RURAL'?'checked':''}/>
Email:      <input type="text" name="email" value="${location.name}"/>
Phone:      <input type="text" name="phone" value="${location.name}"/>
Address:    <input type="text" name="address" value="${location.name}"/>
<input type="submit" value="save"/>
</pre>
</form>

```
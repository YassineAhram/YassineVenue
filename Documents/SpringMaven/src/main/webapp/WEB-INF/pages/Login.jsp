<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
   <h1>Yassine's Venue Login</h1>
     <h5>An account is free and provides you with a whole range of options to make the most of your nights out in London -</h5>
     <form action="Welcome.jsp" method="post">
        
        <p>
			Email <input type="email" name="email address" placeholder="example@gmail.com" autofocus required /><br />
		</p>
		
		<p>
			Password <input type="password" name="password" maxlength="8" size="15" autofocus required /><br />
		</p>
		
		<p>
		   <input  type="checkbox" name="Remember" value="Remember-me" />Remember-me<br/>
		 </p>  
		
		
		<p>
		  <input type="submit" name="login" value="Login"/>
		  
          <input type="reset" name="clear" value="reset request"/><br/>
        </p>
     
     
     
     </form>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
  <h1>Register</h1>
    <h6>
      <p>
    Register for an account with Yassine's Venue. It only takes a minute and gives you a range of benefits such as quick online reservations. we’ll make sure you’re the first to hear all our latest news and offers.
      </p>
   
      <p>
    What’s more, as a little thank you for signing up, you’ll get a 241 cocktail voucher. Keep an eye on your inbox – it’ll be winging its way to you soon.
     </p><br/>
  </h6>
  <form action="Welcome.jsp" method="post">
  
  
		<p>
			First Name <input type="text" name="firstname" required /><br />
		</p>

		<p>
			Last Name <input type="text" name="lastname" required /><br />
		</p>

	
		<p>
			Email <input type="email" name="email" placeholder="example@gmail.com" autofocus required /><br />
		</p>
		
		<p>
			Password <input type="password" name="password" id="password1" required /><br />
		</p>
		
		

		<p>
			Mobile <input type="tel" name="mobile" pattern="^[0-9]{2,3}-? ?[0-9]{6,7}$" required /><br />
		</p>

		<p>
			Address <input type="text" name="address" required /><br />
		</p>

		<p>
			PostCode <input type="text" name="pc" pattern="^([A-Z]{1,2}[0-9]{1,2}|[A-Z]{1}[0-9][1-9]|[A-Z]{2}[0-9]) [0-9][A-Z]{2}$" required /><br />
		</p>
		
		<p>
		
		I confirm that I am over 18 <input type="checkbox" name="over" required /><br />
		
		
		</p>
		
		<p>
         Select Country
                <select size="3" name="country" id="country" required >
                    <option selected="selected" value="negro">negro
                    <option value="blanco"/>
                </select>
         </p><br>

		<p>
		 <button type="submit">Register</button>

		 <button type="reset">Reset</button><br />
		</p>

  
  </form>


</body>
</html>
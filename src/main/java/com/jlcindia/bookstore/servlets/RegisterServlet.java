package com.jlcindia.bookstore.servlets; 
 
import java.io.IOException; 
 
import javax.servlet.RequestDispatcher; 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
 
import com.jlcindia.bookstore.to.UserTO; 

@WebServlet(name = "myreg", urlPatterns = "/myreg.jlc") 
public class RegisterServlet extends JLCBaseServlet { 
public void service(HttpServletRequest req, HttpServletResponse res) throws 
ServletException, IOException { 
System.out.println("RegisterServlet-service()"); 
 
// 1.Collect the Input 
String fullName = req.getParameter("fullName"); 
String email = req.getParameter("email"); 
String phone = req.getParameter("phone"); 
String dob = req.getParameter("dob"); 
String city = req.getParameter("city"); 
String username = req.getParameter("username"); 
String password = req.getParameter("password"); 
 
// 2.Process 
UserTO userTO = new UserTO(); 
userTO.setFullName(fullName); 
userTO.setEmail(email); 
userTO.setPhone(Long.parseLong(phone)); 
userTO.setDob(dob); 
userTO.setCity(city); 
userTO.setUsername(username); 
userTO.setPassword(password); 
userTO.setStatus("Active"); 

int x = userService.registerUser(userTO); 
 
// 3.Prepare to forward 
String page = ""; 
if (x == 1) { 
page = "login.jsp"; 
String regMsg = "Congrats, Login first time"; 
req.setAttribute("RegMsg", regMsg); 
} else { 
page = "register.jsp"; 
String regMsg = "Registration failed, Try again"; 
req.setAttribute("RegMsg", regMsg); 
} 
RequestDispatcher rd = req.getRequestDispatcher(page); 
rd.forward(req, res); 
} 
} 

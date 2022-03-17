package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class EmployeeServlet extends HttpServlet{
	
	EmployeeData data=new EmployeeData();
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		List<employee> employees = new ArrayList<>();
		employees = data.getData();
		
		Gson gson = new Gson();
		String str = gson.toJson(employees);
		
		
		PrintWriter p = res.getWriter();
		res.setContentType("application/json");
		res.setCharacterEncoding("UTF-8");
		p.println(str);
		p.close();
		
	}
	
}

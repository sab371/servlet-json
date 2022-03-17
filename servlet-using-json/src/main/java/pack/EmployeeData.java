package pack;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {
	public List<employee> getData(){
		return Arrays.asList(new employee(001,"div",8383082928L),
				new employee(002,"sab",8893179278L),
				new employee(003,"shen",8327984739L),
				new employee(004,"sree",8228982988L));
	}
}

package batchPro.batchPro;

import java.time.LocalDate;
import java.util.List;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import emp.Employee;
import emp.EmployeeMapper;

// 일괄처리할 작업들을 여기서 구현하자!
public class MyJob extends QuartzJobBean{

	@Autowired
	EmployeeMapper employeeMapper;
	
	
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		//일괄처리할 작업 내용을 작성!!!
		System.out.println("ㅎㅇ");
		
		LocalDate today = LocalDate.now();
		String start = today.toString()+"T00:00:00";
		String end = (today.plusDays(0)).toString()+"T00:00:00";
		System.out.println(employeeMapper);
		List<Employee> list = employeeMapper.selectAllofTheday(start, end);
		int tot = 0;
		for(Employee employee : list) {
			tot += employee.getSalary();
		}
		System.out.println("연봉의 총합 : "+tot);
	}
	
}

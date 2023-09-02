import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	private int empNo;
	private String name;
	private double salary;
	public Employee() {
		
	}
	
	public Employee(int empNo, String name, double salary) {
		this.empNo = empNo;
		this.name = name;
		this.salary  = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeInt(empNo);
		out.writeUTF(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		empNo = in.readInt();
		name = in.readUTF();
	}

}

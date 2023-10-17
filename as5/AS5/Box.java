
public class Box<T extends Employee> {
    private T obj;
	public Box() {
		// TODO Auto-generated constructor stub
	}
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
public double oksalary()
{   return obj.totsalary();}
	
}

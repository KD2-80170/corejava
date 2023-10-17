import java.util.Scanner;

public class Strlength {
  private String st;
	public Strlength() {
		// TODO Auto-generated constructor stub
	}

	
	public String getSt() {
		return st;
	}


	public void setSt(String st) {
		this.st = st;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		Scanner sc =new Scanner(System.in);
		 try {
			 System.out.println("enter string ");
			String st =sc.nextLine();
			if(st.length()>80)
				throw new ExceptionLineTooLong();
			System.out.println(st);
			
		} catch ( ExceptionLineTooLong e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkHashMapeg {

	public LinkHashMapeg() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int choice;
		Map<Integer, Student> map = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0.enter for exit");
			System.out.println("1.enter for enter record");
			System.out.println("2.Search by roll no");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Student s = new Student();
				s.accept();
				map.put(s.getRollno(), s);
				break;

			case 2:
				System.out.println("enter rollno to search record");
				int rno = sc.nextInt();
				Student k = map.get(rno);
				System.out.println(k);
				break;
			default:
				System.out.println("enter valid choice");
				break;
			}
		} while (choice != 0);
	}

}

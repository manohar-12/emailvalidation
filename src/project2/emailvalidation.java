package project2;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class emailvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String list[]= {"abc@gmail.com","manoharyadav26@gmail.com","hello@gmail.com",
				"abcdef@gmail.com","learn@gmail.com"};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email:");
		String email=sc.next();
		int flag=0;
		for(int i=0;i<list.length;i++) {
			Pattern p=Pattern.compile(list[i]);
			Matcher m=p.matcher(email);
			if(m.matches()) {
				System.out.println("email is valid");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("email is invalid");
			
		}

	}

}

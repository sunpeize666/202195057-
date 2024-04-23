package java_Middle.java;
import java.util.Scanner;
public class Middle01 {
	{
Scanner stdin new Scanner(System.in);
System.out.print("원하는 숫자를 입력하세요 : ");
	int num = stdin.nextInt();
	int i=1;
	while (i <= num)
	{
		int j=1;
		while (j<=i)
		{
			System.out.print("*");
			j++;
		}
	}
	
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}

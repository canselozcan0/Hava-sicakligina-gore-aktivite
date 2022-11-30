import java.util.Scanner;

public class driver {
public static void main(String[] args) {
	int heat;
	Scanner input = new Scanner(System.in);
	System.out.println("Sıcaklığı giriniz: ");
	heat = input.nextInt();
	
//	if (heat<5) {
//		System.out.println("You can go to the skyboard! :)");
//	}else if(heat >= 5 && heat <= 25) {
//		if (heat<15) {
//		System.out.println("You can gon to the cinema");
//		}
//		if(heat>10) {
//			System.out.println("You can go to the picnic");
//		}
//	}else {
//		System.out.println("You can go to the swimming");
//	}
	if(heat<5) {
		System.out.println("Kayak yapabilirsiniz :))");
	}else if(heat>=5 && heat<=15) {
		System.out.println("Sinemaaaa yehu :)");
	}else if(heat>15 && heat<=25) {
		System.out.println("Piknik keyfisiii");
	}else {
		System.out.println("Kesinlikle artık yüzmelisin !!");
	}
}
}

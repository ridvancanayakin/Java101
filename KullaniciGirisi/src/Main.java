import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String n,p,r,np;
		np="java123";
		Scanner s = new Scanner(System.in);
		System.out.println("Kullan�c� Ad�n�z: ");
		n = s.nextLine();
		System.out.println("�ifreniz: ");
		p = s.nextLine();
		if(n.equals("patika")&&p.equals(np)) {
			System.out.println("Giri� Yapt�n�z !");
		}else {
			System.out.println("Bilgiler Yanl��!\n �ifrenizi S�n�flamak �ster misiniz? y\\n");
			r=s.nextLine();
			if(r.equals("y")) {
				System.out.println("�ifrenizi Giriniz");
				n=s.nextLine();
				if(np.equals(n)) {
					System.out.println("�ifre eski �ifre ile ayn� olamaz");
					return;
				}else {
					np=n;
					System.out.println("�ifre de�i�tirildi !");
				}
			}else {
				System.out.println("�ifre De�i�tirilmeden Program Sonland�r�lacak !");
			}
		}
	}
}

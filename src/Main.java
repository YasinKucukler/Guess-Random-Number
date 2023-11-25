import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int randomNum = random.nextInt(100);
		int userGuess, counter = 5;
		boolean isCorrect = false;
		do {
			System.out.println("===============================================");
			System.out.println("Lütfen bir tahminde bulununuz :");
			userGuess = input.nextInt();
			if(userGuess >100 || userGuess < 0)
			{
				System.out.println("Lütfen 0 ve 100 aralığında bir sayı giriniz!!!");
				System.out.println("Kalan tahnmin hakkınız :" + --counter);
				continue;
			}
			
			if (userGuess == randomNum)
			{
				System.out.println( "Evet doğru tahminde bulundunuz!!!" +
									" \nAradığınız sayı: " + randomNum);
				isCorrect = true;
			}else{
				System.out.println("Yanlış tahminde bulundunuz" +
					"\nKalan tahmin hakkınız :" + --counter);
				if (randomNum < userGuess)
				{
					System.out.println("Daha küçük bir sayı tahmininde bulununuz.");
				} else {
					System.out.println("Daha büyük bir sayı tahmininde bulununuz.");
				}
				if (counter == 0)
				{
					System.out.println("Başka hakkınız kalmadı.");
					break;
				}
			}
		}while(!isCorrect);
	}
}
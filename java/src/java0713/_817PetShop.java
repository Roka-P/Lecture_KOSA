package java0713;

public class _817PetShop {
	public void carePet(_817IPet pet) {
		if (pet instanceof _817Dog) {
			System.out.println("���� �����ϴ�.");
		} else if (pet instanceof _817Cat) {
			System.out.println("����̸� �����ϴ�.");
		} else if (pet instanceof _817GoldFish) {
			System.out.println("����⸦ �����ϴ�.");
		} 
	}
}

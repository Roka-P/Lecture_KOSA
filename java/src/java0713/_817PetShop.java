package java0713;

public class _817PetShop {
	public void carePet(_817IPet pet) {
		if (pet instanceof _817Dog) {
			System.out.println("개를 돌봅니다.");
		} else if (pet instanceof _817Cat) {
			System.out.println("고양이를 돌봅니다.");
		} else if (pet instanceof _817GoldFish) {
			System.out.println("물고기를 돌봅니다.");
		} 
	}
}

package java0713;

public class _817PetShopExample {

	public static void main(String[] args) {
		_817Animal baduk = new _817Dog();
		_817Animal nabi = new _817Cat();
		_817Animal tiger = new _817Tiger();
		_817Animal[] animals = new _817Animal[3];
		animals[0] = baduk;
		animals[1] = nabi;
		animals[2] = tiger;
		for (_817Animal anim : animals) {
			anim.eat();
		}
		
		System.out.println();
		_817IPet[] pets = new _817IPet[3];
		pets[0] = (_817IPet)baduk;
		pets[1] = (_817IPet)nabi;
//		pets[1] = (IPet)tiger;
		pets[2] = new _817GoldFish();
//		pets[2] = new Shark();
		for(_817IPet pet : pets) {
			pet.play();
		}
		
		System.out.println();
		_817PetShop shop = new _817PetShop();
		shop.carePet((_817IPet)baduk);
		shop.carePet((_817Cat)nabi);
		shop.carePet(pets[2]);
//		Tiger t = new Tiger();
//		shop.carePet(t);
	}

}

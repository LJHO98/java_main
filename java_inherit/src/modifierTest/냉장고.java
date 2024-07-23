package modifierTest;

import homeProduct.House;

public class 냉장고 extends House{
	@Override
	protected void power() {
		System.out.println("냉장고");
	}
}

//부모클래스와 다른 패키지에 있는 자식클래스에서 부모클래스의 있는것들을 사용하려면 protected를 붙어주어햐 한다.
//public과 달리 같은 부모클래스를 가진 자식클래스들만 사용가능하게 하려고 사용.
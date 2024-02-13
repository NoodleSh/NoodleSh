package com.ohgiraffers.section02.extend;


/* 인터페이스 상속 시 implements 키워드 대신 extends를 사용한다. */
//public class rabbitFarm<T implements Animal>{} // 에러남
//public class rabbitFarm<T extends Animal>{} // 정상
public class RabbitFarm<T extends Rabbit & Animal> { // 타입변수가 토끼이거나 토끼 후손만 가능
    // 제네릭 클래스를 상속받을때는 인터페이스도 extends로 상속

    /* & 로 여러 타입을 동시에 가지는 타입 변수를 지정할 수 있다. (&로 묶어준 모든 타입에 해당해야함)
    * 단, 클래스는 하나만 지정할 수 있으며 &의 맨앞에는 클래스, 이후로는 인터페이스가 와야한다.*/
//    public class RabbitFarm<T extends  Rabbit & Animal>{}

    private T animal;

    public RabbitFarm(){

    }
    public RabbitFarm(T animal){
        this.animal = animal;
    }

    public void setAnimal(T animal){
        this.animal = animal;
    }

    public T getAnimal(){
        return this.animal;
    }


}

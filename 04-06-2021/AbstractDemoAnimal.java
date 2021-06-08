package com.ojas.clients;

	abstract class Animal {

		abstract void soundOfAnimal();

		void disp() {
			System.out.println("Welcome");
		}
	}

	class Cat extends Animal {

		@Override
		void soundOfAnimal() {
			System.out.println("Meoh Meoh");
		}

	}

	class Dog extends Animal {

		@Override
		void soundOfAnimal() {
			System.out.println("Bow Bow");
		}

	}

	public class AbstractDemoAnimal {

		public static void main(String[] args) {

			Animal obj = new Cat();
			obj.soundOfAnimal();
			obj.disp();

			obj = new Dog();
			obj.soundOfAnimal();
			obj.disp();

		}


}

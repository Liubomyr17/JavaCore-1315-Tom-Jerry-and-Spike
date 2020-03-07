package com.company;

/*

1315 Tom, Jerry and Spike
 Multiple Interface Inheritance
 
Level 13 Lection 6. Tom, Jerry and Spike
Create the Dog, Cat, and Mouse classes.
Implement the interfaces in the added classes, given that:
- A cat can move around, can eat someone and can be eaten by itself.
- The mouse (Mouse) can move and can be eaten.
- A dog (Dog) can move around and eat someone.

Requirements:
1. The Cat class must be declared inside the Solution class.
2. The Dog class must be declared inside the Solution class.
3. The Mouse class must be declared inside the Solution class.
4. A cat can move, can eat someone and can be eaten by itself.
5. Mouse (Mouse) can move and can be eaten.
6. Dog (Dog) can move around and eat someone.


 */

import java.awt.*;

public class Main {
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Eatable {
        void eaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    class Dog implements Movable, Eat {

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    class Cat implements Movable, Eat, Eatable {

        @Override
        public void move() {
        }
        @Override
        public void eaten() {

        }
        @Override
        public void eat() {

        }
    }

    class Mouse implements Movable, Eatable {

        @Override
        public void move() {
        }

        @Override
        public void eaten() {
        }
    }
}





package com.goit.module12;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Phaser;

public class Bus {

    //Registered main thread
    private static final Phaser PHASER = new Phaser(1);
    private static final int startDestination = 1;
    private static final int finishDestination = 6;

    public static void main(String[] args) throws InterruptedException {
        List<Passenger> passengers = new ArrayList<>();

        //Generating passengers
        for (int i = 1; i < 5; i++) {
            if ((int) (Math.random() * 2) > 0) {
                passengers.add(new Passenger(i, i + 1));
            }

            if ((int) (Math.random() * 2) > 0) {
                passengers.add(new Passenger(i, 5));
            }
        }

        System.out.println("Bus leaving the park");
        //In this phase is only a Bus
        PHASER.arrive();

        for (int i = startDestination; i <= finishDestination; i++) {
            if (i == finishDestination) {
                System.out.println("Bus are going to park");
                //Breaking a barrier
                PHASER.arriveAndDeregister(); //исключаем зарегестрированный фейзер
            } else {
                int currentStop = PHASER.getPhase();
                System.out.println("Stop number: " + currentStop);

                //checking if any passengers waiting in a bus stop
                passengers.forEach((passenger -> {
                    if (passenger.departure == currentStop) {
                        PHASER.register(); //добавление нового участника в фейзер
                        passenger.start();
                    }
                }));
                PHASER.arriveAndAwaitAdvance();
            }
        }
    }

    public static class Passenger extends Thread {
        private int departure;
        private int destination;

        public Passenger(int departure, int destination) {
            this.departure = departure;
            this.destination = destination;
            System.out.println(this + " waits on bus stop number  " + this.departure);
        }

        @Override
        public void run() {
            try {
                System.out.println(this + " get in the bus");

                //waiting the bus
                while (PHASER.getPhase() < destination) {
                    PHASER.arriveAndAwaitAdvance();
                }

                Thread.sleep(1);
                System.out.println(this + " left the bus");
                //de-register thread
                PHASER.arriveAndDeregister();
            } catch (InterruptedException e) {
            }
        }

        @Override
        public String toString() {
            return "Passenger {" + departure + " -> " + destination + '}';
        }
    }
}

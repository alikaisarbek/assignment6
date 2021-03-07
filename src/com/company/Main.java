package com.company;

public class Main {
            public static void main(String[] args) {
                for(int i = 0; i < 5; i++)
                {
                    SeaLogistic log = new SeaLogistic();
                    log.deliver();
                }

                for(int i = 0; i < 5; i++)
                {
                    RoadLogistic log2 = new RoadLogistic();
                    log2.deliver();
                }
            }
        }


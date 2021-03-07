package com.company;

public abstract class Logistic {
    abstract Transport createTransport();

    public void deliver()
    {
        Transport transport = createTransport();
        transport.deliver();
    }
}

class SeaLogistic extends Logistic
{
    @Override
    public Transport createTransport()
    {
        return new Ship();
    }
}

class RoadLogistic extends Logistic
{
    @Override
    public Transport createTransport()
    {
        return new Truck();
    }
}

interface Transport
{
    public void deliver();
}

class Ship implements Transport
{
    @Override
    public void deliver()
    {
        System.out.println("Delivering Ship with id: " + this);
    }

}

class Truck implements Transport
{
    @Override
    public void deliver()
    {
        System.out.println("Delivering Truck with id: " + this);
    }
}

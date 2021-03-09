package review_oop;

public class Vehicle {
    String car;
    int capacity;
    double price;

    public Vehicle(){

    }

    public Vehicle(String car, int capacity, double price) {
        this.car = car;
        this.capacity = capacity;
        this.price = price;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calTax(int capacity, double price){
        if(capacity <100){
            return price/100;
        }else if(capacity>100&&capacity<200){
            return (price/100)*3;
        }else{
            return (price/100)*5;
        }
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "car='" + car + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}

package pl.javastart.task;

public class Televisor {
    boolean isOn = false;

    public Televisor() {
    }

    void turnOn() {
        System.out.println("Włączenie telewizora");
        this.isOn = true;
    }

    void turnOff() {
        System.out.println("Wyłączenie telewizora");
        this.isOn = false;
    }

    void showStatus() {
        System.out.println("Czy telewizor jest włączony? " + isOn);
    }

    public boolean isOn() {
        return isOn;
    }
}


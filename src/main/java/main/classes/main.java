package main.classes;

import java.util.StringJoiner;

public class main {

    private double temp;
    private double temp_max;

    public main(double temp, double temp_max) {
        this.temp = temp;
        this.temp_max = temp_max;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", main.class.getSimpleName() + "[", "]")
                .add("temp:" + temp)
                .add("temp_max:" + temp_max)
                .toString();
    }
}

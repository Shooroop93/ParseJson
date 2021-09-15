package main.classes;

import java.util.List;
import java.util.StringJoiner;

public class Value {

    private main main;

    private String dt_txt;

    public Value(main main, String dt_txt, String name) {
        this.main = main;
        this.dt_txt = dt_txt;
    }

    public main getMain() {
        return main;
    }

    public void setMain(main main) {
        this.main = main;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Value.class.getSimpleName() + "[", "]")
                .add("main=" + main)
                .add("dt_txt='" + dt_txt + "'")
                .toString();
    }
}

package main.classes;

import java.util.List;
import java.util.StringJoiner;

public class Root {

    private List<Value> list;

    public List<Value> getList() {
        return list;
    }

    public void setList(List<Value> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Root.class.getSimpleName() + "[", "]")
                .add("list=" + list)
                .toString();
    }
}

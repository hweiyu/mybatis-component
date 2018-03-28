package hwy;

import hwy.model.Bean;

public class TestBean extends Bean {

    private String val1 = "test1";

    private String val2 = "test2";

    public TestBean() {}

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    public String getVal2() {
        return val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }
}

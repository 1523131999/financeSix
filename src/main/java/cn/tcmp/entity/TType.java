package cn.tcmp.entity;

public class TType {
    private Integer key;
    private String value;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TType{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

package lombok;

/**
 * A plain old java object, with getters and setters and custom constructor.
 */
public class MyPojo {

    public MyPojo(String firstAttribute, int secondAttribute) {
        this.firstAttribute = firstAttribute;
        this.secondAttribute = secondAttribute;
    }

    private String firstAttribute;
    private int secondAttribute;

    public String getFirstAttribute() {
        return firstAttribute;
    }

    public void setFirstAttribute(String firstAttribute) {
        this.firstAttribute = firstAttribute;
    }

    public int getSecondAttribute() {
        return secondAttribute;
    }

    public void setSecondAttribute(int secondAttribute) {
        this.secondAttribute = secondAttribute;
    }
}

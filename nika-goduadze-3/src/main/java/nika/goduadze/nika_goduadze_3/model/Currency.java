package nika.goduadze.nika_goduadze_3.model;

public class Currency {
    private String code;
    private float curr;
    private String description;

    public Currency(String code, float curr, String description) {
        this.code = code;
        this.curr = curr;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getCurr() {
        return curr;
    }

    public void setCurr(float curr) {
        this.curr = curr;
    }
}

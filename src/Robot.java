public class Robot {

    private String name;
    private Integer run = 1000000000;
    private Integer jump = 200000000;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getRun() {
        return run;
    }

    public Integer getJump() {
        return jump;
    }
}

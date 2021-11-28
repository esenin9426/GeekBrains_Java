public class Robot{

    private String name = "No name";
    private Integer run = 200000000;
    private Integer jump = 10000000;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println(this.name);
        return this.name;}

    public Integer getRun() {
        System.out.println(this.name + " пробежал " + this.run);
        return this.run;
    }

    public Integer getJump() {
        System.out.println(this.name + " прыгнул " + this.run);
        return this.jump;
    }
}

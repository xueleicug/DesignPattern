package example.pattern.decorator;

public class PoliceDecorator extends PeopleDecorator {

    private Uniform uniform;

    private Pistol pistol;

    public PoliceDecorator(People people) {
        this.people = people;
        this.uniform = new Uniform();
        this.pistol = new Pistol();
    }

    @Override
    public void show() {
        System.out.println("A teacher with:");
        uniform.display();
        pistol.display();
    }
}

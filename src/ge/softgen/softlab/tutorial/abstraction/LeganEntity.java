package ge.softgen.softlab.tutorial.abstraction;

public class LeganEntity extends Entity {
    String name, id;

    public LeganEntity(String name, String id) {
        setName(name);
        setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new RuntimeException("Incorrect name!");
        }
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null) {
            throw new RuntimeException("Incorrect id!");
        }
        this.id = id;
    }
}

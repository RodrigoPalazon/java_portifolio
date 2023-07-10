package academy.devdojo.maratonajava.javacore.Y_collections.domain;

import java.util.Objects;

public class ProgrammingLanguage implements Comparable<ProgrammingLanguage>{
    private Long id;
    private String name;
    private double version;

    public ProgrammingLanguage(Long id, String name, double version) {
        Objects.requireNonNull(id, "ID cannot be null");
        Objects.requireNonNull(name, "Name cannot be null");
        this.id = id;
        this.name = name;
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgrammingLanguage that = (ProgrammingLanguage) o;
        return Double.compare(that.version, version) == 0 && Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, version);
    }

    @Override
    public String toString() {
        return "ProgrammingLanguages{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", version=" + version +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public int compareTo(ProgrammingLanguage anotherPL) {
        //negative if this < anotherPL
        //if this == anotherPL, return 0
        //positive if this > anotherPL
        if(this.id < anotherPL.getId()){
            return -1;
        }else if(this.id.equals(anotherPL.getId())){
            return 0;
        }else{
            return 1;
        }
    }
}

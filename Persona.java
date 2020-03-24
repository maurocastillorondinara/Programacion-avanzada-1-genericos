package unidad2;

import java.util.Objects;

public class Persona implements Comparable{
    private String name;
    private String lname;
    private long dni;
    private int age;

    public Persona(String name, String lname, long dni, int age)
    {
        setName(name);
        setLastname(lname);
        setDni(dni);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLastname(String lastname) {
        this.lname = lastname;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int edad) {
        this.age = edad;
    }

    @Override
    public boolean equals(Object o)
    {
        boolean flag = false;
        if (this == o) flag = true;
        if (o == null ) flag = false;
        if(o instanceof Persona)
        {
            Persona persona = (Persona) o;
            if(dni == persona.dni &&
                    age == persona.age &&
                    Objects.equals(name, persona.name) &&
                    Objects.equals(lname, persona.lname))
            {
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,lname,dni,age) ;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", lname='" + lname + '\'' +
                ", dni=" + dni +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int flag = -1;
        if(o instanceof Persona)
        {
            Persona p = (Persona)o;
            if(p.getAge() == this.getAge())
            {
                flag = 0;
            }else if(this.getAge() > p.getAge())
            {
                flag = 1;
            }
        }

        return flag;
    }


}

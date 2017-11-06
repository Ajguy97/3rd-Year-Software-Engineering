package enterprise.web_jpa_war.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-06T23:10:15")
@StaticMetamodel(Computer.class)
public class Computer_ { 

    public static volatile SingularAttribute<Computer, Integer> pkId;
    public static volatile SingularAttribute<Computer, String> memory;
    public static volatile SingularAttribute<Computer, String> pccase;
    public static volatile SingularAttribute<Computer, String> psu;
    public static volatile SingularAttribute<Computer, String> motherboard;
    public static volatile SingularAttribute<Computer, String> cpu;
    public static volatile SingularAttribute<Computer, String> storage;
    public static volatile SingularAttribute<Computer, String> gpu;

}
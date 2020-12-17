# POJO design pattern

## Imports
```java
import javax.persistence.Entity;
import javax.persistence.Id;
```

## Class
```java
@Entity
public class Location { } 
```

## Field
```java
@Id
private int id;
private String code;
private String name;
private String type;
```

## Getter and setter
```java
public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getCode() {
    return code;
}

public void setCode(String code) {
    this.code = code;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getType() {
    return type;
}

public void setType(String type) {
    this.type = type;
}
```

## toString
```java
@Override
public String toString() {
    return "Location [id=" + id + ", code=" + code + ", name=" + name + ", type=" + type + "]";
}
```

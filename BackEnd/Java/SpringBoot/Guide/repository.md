# Repository

## JPA
```java
public interface LocationRepository extends JpaRepository<Location, Integer> {

    @Query("select type,count(type) from Location group by type")
    public List<Object[]> findTypeAndTypeCount();
}
```
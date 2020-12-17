# Database caching

## maven dependency
``` xml
<!-- enable cache support -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-cache</artifactId>
</dependency>

<!-- enable hazelcast implementation of cache -->
<dependency>
    <groupId>com.hazelcast</groupId>
    <artifactId>hazelcast</artifactId>
</dependency>

<!-- integration of cache hazelcast -->
<dependency>
    <groupId>com.hazelcast</groupId>
    <artifactId>hazelcast-spring</artifactId>
</dependency>
```

## Configuration
``` java
@Configuration
public class ProductCacheConfig {
    @Bean
    public Config cacheConfig() {
        return new Config()
            .setInstanceName("hazel-instance")
            .addMapConfig(new MapConfig()
                .setName("product-cache")
                .setTimeToLiveSeconds(3000)
                .setMaxSizeConfig(new MaxSizeConfig(200, MaxSizePolicy.FREE_HEAP_SIZE))
                .setEvictionPolicy(EvictionPolicy.LRU)
            );                    
    }

}
```
## in main class
`@EnableCaching`

## in Product class 
`Product implements Serializable`

## in rest controller
``` java
@Transactional(readOnly = true)
@Cacheable("product-cache")
Product getProduct()

@CacheEvict("product-cache")
deleteProduct() 
```
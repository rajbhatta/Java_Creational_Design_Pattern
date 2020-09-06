## How to work with static factory pattern? ##
```java
package dbutil;

import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;

public class CosmosDBConFactory {

    private CosmosDBConFactory(){

    }

    private static CosmosClient getCosmosClient(String host, String key){
       return new CosmosClientBuilder().endpoint(host).key(key).buildClient();
    }

    public static CosmosClient getConnection(String host, String key){
        return getCosmosClient(host,key);
    }
}
```

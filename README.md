## Execução do projeto 

### MVN Profile definido no pom.xml

Para executar um comando mvn clean install é necessário informar o profile do Maven

Para Dev
``` 
mvn clean install -P dev 
``` 

Para Test

``` 
mvn clean install -P test 
```

OBS: caso seja necessário executar alguma dependência específica para um determinado perfil Maven

## Para o profile de test pode ser executado o banco H2

``` 
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>compile</scope>
</dependency>
```

## Para o profile de dev pode ser executado o banco MySql

``` 
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <scope>runtime</scope>
</dependency>
```



# File-counter-plugin

This project is my first plugin project. It is founding how many file is in the your given path.

## API Kullanımı

#### İnject to project

```
  <plugin>
        <groupId>org.first.homework</groupId>
        <artifactId>file-counter-and-extension</artifactId>
        <version>1.0-SNAPSHOT</version>
        <executions>
           <execution>
                <goals>
                    <goal>file-counter</goal>
                </goals>
            </execution>
        </executions>
        <configuration>
            <scope>C:\Users\AEO\Desktop\Java-Development</scope>
        </configuration>
    </plugin>
```



#### Giving Path

```
<scope>Your Path</scope>
```


#### Runing

```
mvn org.first.homework:file-counter-and-extension:1.0-SNAPSHOT:file-counter
```
  
## Program output should be like this

![picture](https://github.com/aozcann/file-counter-plugin/blob/master/img/img.png)

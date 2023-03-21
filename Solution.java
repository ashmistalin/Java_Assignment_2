class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
public class Solution{
    public static void main(String[] args){
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}

```
## OUTPUT:
C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=3980:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Dell\IdeaProjects\java java\out\production\java java" Solution
I am walking
I am flying I am singing
Process finished with exit code 0
```

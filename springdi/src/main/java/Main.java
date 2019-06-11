import com.model.BlankAnimal;
import com.model.Hero;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        BlankAnimal blankAnimal=(BlankAnimal) applicationContext.getBean("blank");
       // blankAnimal.play();
        blankAnimal.getAnimal().attack();
        Hero hero= (Hero) applicationContext.getBean("hero1");
        hero.getEnemy().attack();
        System.out.println(hero.getName());
    }
}

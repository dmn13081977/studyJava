package my;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public interface Music {
   String getsong();

   default void doInit(){
      System.out.println("initialization");
   }

   default void doDestroy(){
      System.out.println("destruction");
   }

}

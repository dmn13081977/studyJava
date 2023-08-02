package org.projects;

public interface Music {
   String getsong();

   default void doInit(){
      System.out.println("initialization");
   }

   default void doDestroy(){
      System.out.println("destruction");
   }

}

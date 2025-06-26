package Emp;

public class Main {

   public  static void main(String... args){
      RAM ram = new RAM();
      ram.setGeneration("DDR1");
      ram.setSize("16GB");
      Hardisk hardisk = new Hardisk();
      hardisk.setSize("100GB");
      hardisk.setType("SSD");
      Processor processor = new Processor();
      processor.setGeneration("8th Gen");
      Laptop l1 = new Laptop();
      l1.setHardisk(hardisk);
      l1.setProcessor(processor);
      l1.setRam(ram);
      l1.setLogo("MAC");
      Laptop l2 = new Laptop();
      l2.setHardisk(hardisk);
      l2.setProcessor(processor);
      l2.setRam(ram);
      l2.setLogo("hp");

   }
}
package com.bilgeadam.melih.computer;

import com.bilgeadam.melih.computer.cpu.Cpu;
import com.bilgeadam.melih.computer.cpu.Cpu1;
import com.bilgeadam.melih.computer.cpu.Cpu2;
import com.bilgeadam.melih.computer.keyboard.Keyboard;

public class MainClass {
    public static void main(String[] args) {
        Cpu newCpu = new Cpu();
        newCpu.setName("Intel");
        newCpu.setModel("i7");
        newCpu.setNumberOfPins(12);
        newCpu.setOverHeated(true);
        System.out.println(newCpu);

        Cpu1 cpu1 = new Cpu1("Intel", "i7", 1500, 12, true);
        System.out.println(cpu1);
        Cpu2 cpu2 = new Cpu2("Intel", "i5", 1100, 8, false);
        System.out.println(cpu2);
        cpu1.testCpu1();
        cpu2.testCpu2();
        Keyboard keyboard = new Keyboard();


        System.out.println(keyboard);

    }

    //Melih DUMANLI

}

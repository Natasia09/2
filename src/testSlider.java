/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class testSlider {
    public static void main(String[] args) {
        testSlider();
    }
    
    public static void testSlider() {
      Slider a = new Slider(88,"Slider",0.5,0,true,40);
        System.out.println(a);
        a.up();
        System.out.println(a);
    }
}

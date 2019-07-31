/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlayGround;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Gishan
 */
public class DesignerPDFViewer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = 0,current;
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0;i<26;i++){
            map.put((char)(i+97), s.nextInt());
        }
        s.nextLine();
        char[] word = s.nextLine().toCharArray();
        
        for(int i = 0 ;i<word.length;i++){
            current=map.get(word[i]);
            max=(max<current)?current:max;
        }
        System.out.println(word.length*max);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlayGround;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Gishan
 */
public class ClimbingtheLeaderboard {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), rank = 1, mark;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            mark = s.nextInt();
            if (!map.containsKey(mark)) {
                map.put(mark, rank++);
            }
        }
        int m = s.nextInt(), mark2;
        Map<Integer, Integer> map2 = new LinkedHashMap<>();
        for (int i = 0; i < m; i++) {
            mark2 = s.nextInt();
            if (map.containsKey(mark2)) {
                map2.put(mark2, map.get(mark2));
            }
            else {
                for (int mark3 : map.keySet()) {
//                    System.out.println("mark3 - "+mark3);
                    if (mark3 <= mark2) {
                        map2.put(mark2, map.get(mark3));
                    }
                }
            }
        }
        System.out.println("size - "+map2.size());
        for (int mark3 : map2.keySet()) {
            
            System.out.println(mark3+" - "+map2.get(mark3));
        }
    }
}

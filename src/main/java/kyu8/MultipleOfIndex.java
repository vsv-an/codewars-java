package kyu8;

import java.util.*;
import org.apache.commons.lang3.ArrayUtils;

public class MultipleOfIndex {
     public static int[] multipleOfIndex(int[] array) {
         List<Integer> list = new ArrayList<Integer>();
         for (int i = 1; i < array.length; i++) {
             if (array[i] % i == 0) {
                 list.add(array[i]);
             }
         }

         int[] result = new int[list.size()];
         int i = 0;
         for (Integer e : list) {
             result[i] = e.intValue();
             i++;
         }
         return result;
//         int count = 0;
//         for (int i = 1; i < array.length; i++) {
//             if (array[i] % i == 0) {
//                 count++;
//             }
//         }
//         int[] result = new int[count];
//         for(int i = 1, j = 0; i < array.length; i++) {
//             if (array[i] % i == 0) {
//                 result[j] = array[i];
//                 j++;
//             }
//         }
//         return result;
    }
}

//package Algorithms;
//
//import com.sun.source.tree.NewArrayTree;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class SocksLaundering {
//
//    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 1, 4, 4, 5, 3, 7, 4, 4, 4,7};
//        int[] arr2 = {2, 5, 3, 2, 1};
//        int k = 5;
//        socksLaundry(arr1, arr2, k);
//
//    }
//
//    public static int socksLaundry (int[]arr1, int[]arr2, int k){
//
//            // get all clean socks sorted and paired
//        Map<Integer, Integer> cleanPairs = new HashMap<>();
//            int count;
//        for(int i =0; i< arr1.length; i++) {
//            if(cleanPairs.get(arr1[i]) != null) {
//            count = cleanPairs.get(arr1[i]);
//                cleanPairs.put(arr1[i], count + 1);
//            }
//            else {
//                cleanPairs.put(arr1[i], 1);
//            }
//
//        }
//        System.out.println(cleanPairs);
//
////            // get total pair
//        int total = getPairs((HashMap<Integer, Integer>) cleanPairs);
//
//        System.out.println(total);
//            //check if washer can't take any return paired
//            if (k < 1) {
//                return total;
//            }
//            // get all dirty socks sorted and paired
//            HashMap<Integer, Integer> dirtyPairs = new HashMap<>();
////            int newCount;
////            for(int i=0; i< arr2.length; i++) {
////                if(dirtyPairs.get(arr2[i]) != null) {
////                    newCount = dirtyPairs.get(arr2[i]);
////                    dirtyPairs.put(arr2[i], newCount + 1);
////                }
////                else {
////                    dirtyPairs.put(arr2[i], 1);
////                }
////            }
//
//            for(int i : arr2) {
//                dirtyPairs.put(i, dirtyPairs.getOrDefault(i, 0) + 1);
//            }
//            System.out.println(dirtyPairs);
////            // get unpaired clean and get a pair from dirty
//        for (Map.Entry <Integer, Integer> logs: cleanPairs.entrySet()) {
//
//            // early break for k
//            if(k == 0){break;}
//            int check = logs.getKey();
//            int val = logs.getValue();
//            if(val %2 == 1 && dirtyPairs.get(check) != null && k > 0) {
//               cleanPairs.put(check, val + 1);
//               dirtyPairs.put(check, dirtyPairs.get(check) - 1);
//               k--;
////                System.out.println(cleanPairs);
////                System.out.println(dirtyPairs);
////                System.out.println(k);
//            }
//
//        }
//
//
//
//
//
//
//
////            console.log(dirtySocks)
////            let dirtyPaired = 0
//            for (key in dirtySocks){
//                // early break for k = 0
//                if (k < 2) break
//                        let evenK = k - k%2
//                if (dirtySocks[key] >= 2 && k >= 2){
//                    // a sock pair is more than machine can wash, pick what machince can wash
//                    if (dirtySocks[key] >= evenK){
//                        return getPaired(cleanSocks)+(evenK/2)
//                    } else {
//                        let paired = dirtySocks[key] - dirtySocks[key]%2;
//                        dirtySocks[key] -= paired;
//                        k -= paired;
//                        cleanSocks[key]? cleanSocks[key]+= paired : cleanSocks[key] = paired
//                    }
////
////
////                }
////            }
////
////            // add washed and paired
////            return getPaired(cleanSocks)
////
////        }
//
//
//        return getPairs(cleanPairs);
////    }
//    private static int getPairs(HashMap<Integer, Integer> cleanPairs) {
//        int totals = 0;
//        for(Map.Entry<Integer, Integer> entry: cleanPairs.entrySet()) {
//            totals += entry.getValue()/2;
//        }
//        return totals;
//    }
//}

package ctf.binarysearch;
import java.util.*;
import java.util.Arrays.*;

/**
 * Created by oushinroku on 2017/6/23.
 */
public class BinarySearch {

   public static int rank(int key, int[] a){
      int start = 0;
      int end = a.length -1;
      while (start <= end){
         int mid = start + (end - start)/2;
         if(key < a[mid]) end = mid - 1;
         else if(key > a[mid]) start = mid + 1;
         else return mid;
      }
      return -1;
   }

   public static void main(String[] args){
      int[] whiteList = {1,232,33,11,332,115,23,32,53,15,16};
      Arrays.sort(whiteList);
      int[] keys = {1,33,23,4324,115,32332};
      for(int i=0;i<keys.length;i++){
         if(rank(keys[i],whiteList) < 0){
            System.out.printf("the key is %d\n",keys[i]);
         }
      }
   }
}

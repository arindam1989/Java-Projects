import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
This program takes a list of items
K is the length of Sub array
 Step 1 : Then for each Sub array take the minimum item
 Step 2: Accumulate all the items from step 1 and return
         the maximum item of this accumulated list
* */
public class JavaTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(4);
        list.add(3);
        list.add(4);
        list.add(3);
        int k = 2;
        int ret = maxMin(list, k);
        System.out.println(ret);
    }

    private static int maxMin(List<Integer> list, int k) {
        List<Integer> subList = new ArrayList<>();
        List<Integer> minList = new ArrayList<>();
        int c = 0;
        for(int i = 0; i < list.size();i++ ){
            subList.add(list.get(i));
            c++;
            if(c==k) {
                int min = getMinArray(subList);
                minList.add(min);
                subList.clear();
                i=i-k+1;
                c = 0;
            }
        }
        Collections.sort(minList);
        System.out.println(minList);
        return minList.get(minList.size()-1);
    }

    private static int getMinArray(List<Integer> sublist){
        Collections.sort(sublist);
        return sublist.get(0);
    }
}

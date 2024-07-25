package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSeqArr {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3};
        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();
//        helperSubSeq(arr,0,result, new ArrayList<>());
//        System.out.println(result);

        int sum=3;
        int count = helperSumCount(arr,0,0,sum,result,new ArrayList<>());
        System.out.println(result);
        System.out.println(count);
    }
     public static void helperSubSeq(int[] arr, int index, List<List<Integer>> result, List<Integer> list){
        if(index== arr.length){
            result.add(new ArrayList<>(list));

            return;
        }
        list.add(arr[index]);
        helperSubSeq(arr,index+1,result,list);
        list.remove(list.size()-1);
        helperSubSeq(arr,index+1,result,list);
    }
    static void helperSum(int [] arr , int index , int s,int sum,List<List<Integer>> result , List<Integer> list){
        if(index== arr.length){
            if(s==sum){
                result.add(new ArrayList<>(list));
            }
            return;
        }

        list.add(arr[index]);
        s+=arr[index];

        helperSum(arr,index+1,s,sum,result,list);

        s-=arr[index];
        list.remove(list.size()-1);

        helperSum(arr,index+1,s,sum,result,list);

    }
    static boolean helperSumOne(int [] arr , int index , int s,int sum,List<List<Integer>> result , List<Integer> list){
        if(index== arr.length){
            if(s==sum){
                result.add(new ArrayList<>(list));
                return true;
            }
            return false;
        }

        list.add(arr[index]);
        s+=arr[index];

       if(helperSumOne(arr,index+1,s,sum,result,list)==true) {
           return true;
       }

        s-=arr[index];
        list.remove(list.size()-1);

        if(helperSumOne(arr,index+1,s,sum,result,list)==true){
            return true;
        }
        return false;

    }
    static int helperSumCount(int [] arr , int index , int s,int sum,List<List<Integer>> result , List<Integer> list){
        if(index== arr.length){
            if(s>sum) return 0;
            if(s==sum){
                result.add(new ArrayList<>(list));
                return 1;
            }
            return 0;
        }

        list.add(arr[index]);
        s+=arr[index];

        int l=helperSumCount(arr,index+1,s,sum,result,list);

        s-=arr[index];
        list.remove(list.size()-1);

        int r = helperSumCount(arr,index+1,s,sum,result,list);

        return l+r;

    }


}

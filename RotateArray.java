

import java.util.*;
import java.lang.*;
import java.io.*;

class RotateArray {
    public static void brutForce(int arr[],int rotation){
        int temp[]=new int[2];
		for(int i=0;i<rotation;i++){
		    temp[i]=arr[i];
		}
		int j=0;
		for(j=0;j<arr.length-rotation;j++){
		    arr[j]=arr[j+rotation];
		}
		for(int i=0;i<rotation;i++){
		    arr[j++]=temp[i];
		}
		for(j=0;j<arr.length;j++){
		  System.out.print(arr[j]+" ");
		}
    }
    public static void reverse(int arr[],int low,int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void rotate(int arr[],int r) {
      int length=arr.length;
      r=r%length;
      reverse(arr,0,length-r-1);
      reverse(arr,length-r,length-1);
      reverse(arr,0,length-1);      
    }
	public static void main (String[] args) {
		int arr[]={3,-1,99,-100 };
		int rotation=4;
		//brutForce(arr,rotation);
        rotate(arr,rotation);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
          }
	}
}
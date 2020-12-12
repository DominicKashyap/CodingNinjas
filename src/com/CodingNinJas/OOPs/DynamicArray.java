package com.CodingNinJas.OOPs;

//Nice one
public class DynamicArray {
    int data[];
    int nextInt;

    public DynamicArray(){
        data = new int[5];
        nextInt=0;
    }

    public int size(){
        return nextInt;
    }

    public void add(int i){
        if(nextInt==data.length){
            restructure();
        }
        data[nextInt] = i;
        nextInt++;
    }

    public void set(int index, int ele){
        if(index>nextInt){
            return;
        }

        if(index<nextInt){
            data[index] = ele;
        }else{
            add(ele);
        }
    }

    public int get(int index){
        if(index>=nextInt){
            return -1;
        }
        return data[index];
    }

    public boolean isEmpty(){
        return nextInt==0;
    }

    public boolean isEelementPresent(int ele){
        for(int i=0;i<nextInt;i++){
            if(data[i]==ele){
                return true;
            }
        }
        return false;
    }

    public int getIndex(int ele){
        for(int i=0;i<data.length;i++){
            if(data[i]==ele){
                return i;
            }
        }

        return -1;
    }

    public int removeLast(){
        if(nextInt==0){
            System.out.println("Empty dynamic array");
            return -1;
        }
        nextInt--;
        int value =data[nextInt];
        data[nextInt] = 0;

        return  value;
    }

    private void restructure(){
        int temp[] = data;
        data = new int[data.length*2];

        for(int i =0;i<temp.length;i++){
            data[i] =temp[i];
        }
    }
}

package com.CodingNinJas.OOPs;

public class Polynomial {
    DynamicArray powerX;
    DynamicArray number;
    int length;

    public Polynomial(){
        powerX = new DynamicArray();
        number = new DynamicArray();
    }

    public void setCoefficient(int power, int number){

        if(!this.powerX.isEelementPresent(power)) {
            this.powerX.add(power);
            this.number.add(number);
            length++;
        }else{
            int index = this.number.getIndex(power);
            this.number.set(index,number);
        }
    }

    public void add(Polynomial p){
        int len = Math.max(p.length,this.length);
        for(int i=0;i<len;i++){
            if(this.powerX.get(i)==p.powerX.get(i)){
                this.number.set(i,this.number.get(i)+p.number.get(i));
            }else {
                setCoefficient(p.powerX.get(i),p.number.get(i));
            }
        }
    }

    public void print(){
        System.out.println();
        for(int i =0 ;i<length;i++){
            System.out.print(number.get(i)+"x^"+powerX.get(i)+" + ");
        }
    }
}

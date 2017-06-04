package com.lweizhou.arithmetic.dp;

public class DpCoin {

    public static void main(String[] args) {

        int[] values = new int[] {1, 3, 5};
        int valuesKinds = 3;
        int money = 11;
        int[] coinsUsed = new int[money + 1];
        coinsUsed[0] = 0;

        for (int cents = 1; cents <= money; cents++) {

            int minCoins = cents;
            //遍历每一种面值的硬币，看是否可作为找零的其中之一
            for(int kind = 0; kind < valuesKinds; kind++){
                //若当前面值的硬币小于当前的cents则分解问题并查表
                if(values[kind] <= cents){
                    int temp = coinsUsed[cents - values[kind]]  + 1;
                    if(temp < minCoins){
                        minCoins = temp;
                    }
                }
            }
            coinsUsed[cents] = minCoins;
            
            System.out.println("面值为 " + cents + " 的最小硬币数 ：" + coinsUsed[cents]);
            
        }



    }

}

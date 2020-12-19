package com.chapter1;

import java.util.Scanner;

// 문제 1_1 : 록 페스티벌
// 평균 비용을 최소화 하는 공연장 대여 일수를 구한다
public class prob1_1 {
    public static void main(String[] args) {
        int[] cost = new int[1000]; // 전체 일자별 가격
        int C;   // 테스트 캐이스
        int L;  // 대여할 수 있는 날의 수
        int N;  // 공연장을 대여 할 수 있는 날의 개수
        Scanner scan = new Scanner(System.in);
        C = scan.nextInt();
        for(int i = 0; i < C; i++){
            N = scan.nextInt();
            L = scan.nextInt();

            // 일자 가격 입력
            for(int j = 0; j < N; j++){
                cost[j] = scan.nextInt();
            }
            double minCost = Double.MAX_VALUE;
            // 최소 비용 검사
            for(int k = 0; k < N - ( L - 1 ); k++){
                int sum = 0;
                double average = 0;
                for(int m = k; m < k + L; m++){
                    sum = sum + cost[m];
                }
                average = sum / (double)L;

                if(average < minCost){
                    minCost = average;
                }
            }

            System.out.println(minCost);
        }

    }
}

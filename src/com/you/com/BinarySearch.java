package com.you.com;

//���ֲ��ҷ�

public class BinarySearch {
    public static int search(int[] number, int des) {
        int low = 0;
        int upper = number.length - 1;
        while (low <= upper) {
            int mid = (low + upper) / 2;
            if (number[mid] < des) low = mid + 1;
            else if (number[mid] > des) upper = mid - 1;
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] number = {
            1, 4, 2, 6, 7, 3, 9, 8
        };
        QuickSort.sort(number);
        int find = BinarySearch.search(number, 3);
        if (find != -1) System.out.println("�ҵ���ֵ������" + find);
        else System.out.println("�Ҳ�����ֵ");
    }
}
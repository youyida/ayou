
package com.you.com;
public class QuickSort {
 public static void main(String[] args) {
  int [] array = {49,38,65,97,76,13,27};
  quickSort(array, 0, array.length - 1);
  for (int i = 0; i < array.length; i++) {
   System.out.println(array[i]);
  }
 }
 /*�Ȱ�������Ϊ����ԭ��д���㷨����д����չ���㷨������{49,38,65,97,76,13,27}
  * */
 public static void quickSort(int[]n ,int left,int right){
  int pivot;
  if (left < right) {
   //pivot��Ϊ���ᣬ��֮С��Ԫ�����󣬽�֮���Ԫ������
   pivot = partition(n, left, right);
   //����������ݹ���ÿ�������ֱ��˳����ȫ��ȷ
   quickSort(n, left, pivot - 1);
   quickSort(n, pivot + 1, right);
  }
 }

 public static int partition(int[]n ,int left,int right){
  int pivotkey = n[left];
  //����ѡ������Զ���䣬�������м䣬ǰС���
  while (left < right) {
   while (left < right && n[right] >= pivotkey) --right;
   //��������С��Ԫ���Ƶ��Ͷˣ���ʱrightλ�൱�ڿգ��ȴ���λ��pivotkey���������
   n[left] = n[right];
   while (left < right && n[left] <= pivotkey) ++left;
   //����������Ԫ���Ƶ��߶ˣ���ʱleftλ�൱�ڿգ��ȴ���λ��pivotkeyС��������
   n[right] = n[left];
  }
  //��left == right�����һ�˿������򣬴�ʱleftλ�൱�ڿգ��ȴ�pivotkey����
  n[left] = pivotkey;
  return left;
 }
}

package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static util.Util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания:");
        int var = scanner.nextInt();
        switch (var) {
            case 0:
                int[] arrayRandom=createArrayRandom();
                System.out.println("Введите номер максимума:");
                int k=scanner.nextInt();
                System.out.println(Arrays.toString(arrayRandom));
                int Kmax=nextMax(arrayRandom, k);
                Arrays.sort(arrayRandom);
                System.out.println((Arrays.toString(arrayRandom)));
                System.out.println(Kmax);
                break;
            case 2:
                System.out.println("Введите а и б и размер массива:");
                int a=scanner.nextInt();
                int b=scanner.nextInt();
                int c=scanner.nextInt();
                int[] arrayfillRandom=fillRandom(a,b,c);
                System.out.println(Arrays.toString(arrayfillRandom));
                break;
            case 5:
                int[] arrayRandom5=createArrayRandom();
                System.out.println(Arrays.toString(arrayRandom5));
                int[] arrayIsEven5= arrayIsEven(arrayRandom5);
                System.out.println(Arrays.toString(arrayIsEven5));
                break;
            case 7:
                int[] arrayRandom7=createArrayRandom();
                String arrayMax=greatPrev(arrayRandom7);
                System.out.println(arrayMax);
                break;
            case 14:
                System.out.println("Введите x:");
                int x=scanner.nextInt();
                int[] arrayRandom14=createArrayRandom();
                System.out.println(Arrays.toString(arrayRandom14));
                int minNumNearest=nearest1(arrayRandom14, x);
                System.out.println(minNumNearest);
                int[] arrayNearest=nearest2(arrayRandom14, x);
                System.out.println(Arrays.toString(arrayNearest));
                ArrayList<Integer> arrayNearestList=nearest3(arrayRandom14, x);
                System.out.println(arrayNearestList);
                break;
            case 141:
                int[] arrayRandom141=createArrayRandom();
                System.out.println(Arrays.toString(arrayRandom141));
                int[] number=nearest141(arrayRandom141);
                System.out.println(Arrays.toString(number));
                break;
            case 21:
                System.out.println("Введите к:");
                boolean kkk=scanner.nextBoolean();
                int[] arrayRandom21=createArrayRandom();
                shift(arrayRandom21,kkk);
                break;
            case 22:
                System.out.println("Введите к:");
                int kMod=scanner.nextInt();
                int[] arrayRandom22=createArrayRandom();
                shift1(arrayRandom22,kMod);
                break;
            case 23:
                int[] arrayRandom23=createArrayRandom();
                System.out.println(Arrays.toString(arrayRandom23));
                int coupie=countEqualPairs(arrayRandom23);
                System.out.println(coupie);
                break;
            case 24:
                int[] arrayRandom24=createArrayRandom();
                System.out.println(Arrays.toString(arrayRandom24));
                int coupieff=countDifferent(arrayRandom24);
                Arrays.sort(arrayRandom24);
                System.out.println(Arrays.toString(arrayRandom24));
                System.out.println(coupieff);
                break;

            case 25:
                int[] arrayRandom25=createArrayRandom();
                System.out.println(Arrays.toString(arrayRandom25));
                Integer kMax=kMaxArray(arrayRandom25); // null или нет
                if (kMax!=null) {
                    int kMaximum = (arrayRandom25.length + 1) / 2;
                    int Kmax25 = nextMax(arrayRandom25, kMaximum);
                    Arrays.sort(arrayRandom25);
                    System.out.println(Arrays.toString(arrayRandom25));
                    System.out.println(Kmax25);
                }
                break;
            case 26:
                int[] arrayRandom26=createArrayRandom();
                System.out.println(Arrays.toString(arrayRandom26));
                ArrayList<Integer> uniqList=unique(arrayRandom26);
                System.out.println(uniqList);
                break;
            case 27:
                int[] arrayRandom27=createArrayRandom();
                System.out.println(Arrays.toString(arrayRandom27));
                int numberF=frequent(arrayRandom27);
                System.out.println(numberF);
                break;
            case 271:
                int[] arrayRandom271=createArrayRandom();
                System.out.println(Arrays.toString(arrayRandom271));
                int[] numberFr=frequent1(arrayRandom271);
                System.out.println(Arrays.toString(numberFr));
                break;
            case 272:
                int[] arrayRandom272=createArrayRandom();
                System.out.println(Arrays.toString(arrayRandom272));
                ArrayList<Integer> numberFr2=frequent2(arrayRandom272);
                System.out.println(numberFr2);
                break;
            case 28:
                int[] sum=kBonachi();
                System.out.println(Arrays.toString(sum));
                break;
            case 30:
                int[] arrayRandom29=createArrayRandom();
                int[] arrayR=Arrays.copyOf(arrayRandom29, arrayRandom29.length);
                boolean eq=equalss(arrayRandom29, arrayR);
                System.out.println(eq);
                break;
            case 32:
                int[] arrayRandom31=createArrayRandom();
                System.out.println(Arrays.toString(arrayRandom31));
                System.out.println("Введите длинну массива куда скопировать:");
                int length=scanner.nextInt();
                int[] copyOfArray=copyOf(arrayRandom31, length);
                System.out.println(Arrays.toString(copyOfArray));
                break;
            case 33:
                System.out.println("Введите размер массива");
                int n=scanner.nextInt();
                int[] array33=new int[n];
                int[] array3=fillPrimeRandom(array33);
                System.out.println(Arrays.toString(array3));
                break;
            case 39:
                int[] arrayRandom39=createArrayRandom();
                System.out.println(Arrays.toString(arrayRandom39));
                int[] array39=equalItems(arrayRandom39);
                System.out.println(Arrays.toString(array39));
                break;
            case 391:
                int[] arrayRandom391=createArrayRandom();
                System.out.println(Arrays.toString(arrayRandom391));
                ArrayList<Integer> array391=equalItems1(arrayRandom391);
                System.out.println(array391);
                break;

            case 40:
                String[] array1={"35","eeee", "fff","%$#", "ooo", "35", "fff", "iii"};
                String[] arrayCon=group(array1);
                System.out.println(Arrays.toString(arrayCon));
                break;
            case 401:
                String[] array2={"35","eeee", "fff","%$#", "ooo", "3", "fff", "iii"};
                ArrayList<String> arrayCon1=group1(array2);
                System.out.println(arrayCon1);
                break;
            case 50:// Сколько слов в строке
                String s="hfhtghsrt htrhrthrthtrh kykiyitktyi jutr jytr re";
                int xSt=HowMany(s);
                System.out.println(xSt);
                break;

        }
    }
}

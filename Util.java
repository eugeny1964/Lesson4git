package util;

import com.google.gson.Gson;

import java.util.*;

import static java.lang.System.*;

public class Util {

    public static String toStringGson(int[] y) {
        return new Gson().toJson(y);
    }


    public static int[] createArrayRandom() {
        Scanner scanner = new Scanner(in);
        out.println("Введите размер массива:");
        int dimensionOfArray = scanner.nextInt();
        int[] arrayRandom = new int[dimensionOfArray];
        Random random = new Random();
        for (int i = 0; i < dimensionOfArray; i++) {
            arrayRandom[i] = random.nextInt(15);
        }
        return arrayRandom;
    }

    public static int nextMax(int[] o, int k) {
        int nextMax = Integer.MAX_VALUE;
        for (int j = 1; j <= k; j++) {
            int max = 0;
            for (int value : o) {
                if (max < value && value < nextMax) {
                    max = value;
                }
            }
            nextMax = max;
        }
        return nextMax;
    }

    public static int[] fillRandom(int a, int b, int c) {
        int[] arr2 = new int[c];
        for (int i = 0; i < c; i++) {
            arr2[i] = getRandomNumber(a, b);
        }
        return arr2;
    }

    public static int getRandomNumber(int a, int b) {
        Random random = new Random();
        return a + random.nextInt(b - a);
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static int[] arrayIsEven(int[] o) {
        int count = 0;
        for (int i = 0; i < o.length; i++) {
            if (isEven(o[i])) {
                o[count] = o[i];
                count += 1;
            }
        }
        int[] o1 = new int[count];
        arraycopy(o, 0, o1, 0, o1.length);
        return o1;
    }

    public static String greatPrev(int[] o) {
        out.println(Arrays.toString(o));
        int count = 0;
        for (int i = 0; i < o.length - 1; i++) {
            if (o[i + 1] > o[i]) {
                o[count] = o[i + 1];
                count += 1;
            }
        }
        int[] o1 = new int[count];
        arraycopy(o, 0, o1, 0, count);
        return toStringGson(o1);
    }

    public static int nearest1(int[] o, int x) {
        int min = Integer.MAX_VALUE;
        int minElement = 0;
        for (int value : o) {
            if (Math.abs(x - value) < min) {
                min = Math.abs(x - value);
                minElement = value;
            }
        }
        return minElement;
    }

    public static int[] nearest2(int[] o, int x) {
        int min = Integer.MAX_VALUE;
        for (int value : o) {
            if (Math.abs(x - value) < min) {
                min = Math.abs(x - value);
            }
        }
        int[] newArray = new int[o.length - 1];
        int j = 0;
        for (int value : o) {
            if (Math.abs(x - value) == min) {
                newArray[j] = value;
                j += 1;
            }
        }
        int[] newArray1 = new int[j];
        arraycopy(newArray, 0, newArray1, 0, j);
        return newArray1;
    }

    public static ArrayList<Integer> nearest3(int[] o, int x) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        int min = Integer.MAX_VALUE;
        for (int value : o) {
            if (Math.abs(x - value) < min) {
                min = Math.abs(x - value);
            }
        }
        for (int value : o) {
            if (Math.abs(x - value) == min) {
                newList.add(value);
            }
        }
        return newList;
    }

    public static int[] nearest141(int[] o) {
        int min = Integer.MAX_VALUE;
        int[] arr = new int[2];
        for (int i = 0; i < o.length - 1; i++) {
            for (int j = 0; j < o.length - 1; j++) {
                if (Math.abs(o[i + 1] - o[i]) < min && i != j) {
                    min = o[i + 1];
                    arr[0] = o[i];
                    arr[1] = o[i + 1];
                }

            }
        }
        return arr;
    }

    public static void shift(int[] o, boolean k) {
        out.println(Arrays.toString(o));
        int element;
        if (k) {
            element = o[o.length - 1];
            arraycopy(o, 0, o, 1, o.length - 1);
            o[0] = element;
        } else {
            element = o[0];
            arraycopy(o, 1, o, 0, o.length - 1);
            o[o.length - 1] = element;
        }
        out.println(Arrays.toString(o));
    }

    public static void shift1(int[] o, int k) {
        out.println(Arrays.toString(o));
        int element;
        if (k > 0) {
            for (int j = 0; j < k; j++) {
                element = o[o.length - 1];
                for (int i = o.length - 1; i > 0; i--) {
                    o[i] = o[i - 1];
                }
                o[0] = element;
            }
        } else {
            for (int j = 0; j < Math.abs(k); j++) {
                element = o[0];
                for (int i = 0; i < o.length - 1; i++) {
                    o[i] = o[i + 1];
                }
                o[o.length - 1] = element;
            }
        }
        out.println(Arrays.toString(o));
    }

    public static Integer kMaxArray(int[] o) {
        Integer n = 5;
        if (o.length % 2 != 0) {
            for (int i = 0; i < o.length; i++) {
                for (int j = 0; j < o.length; j++) {
                    if (o[j] == o[i] && i != j) {
                        n = null;
                    }
                }
                if (n == null) {
                    break;
                }
            }
        } else {
            n = null;
        }
        return n;
    }

    public static ArrayList<Integer> unique(int[] o) {
        ArrayList<Integer> uniqList = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o.length; j++) {
                if (o[i] == o[j] && i != j) {
                    count += 1;
                }
            }
            if (count == 0) {
                uniqList.add(o[i]);
            }
            count = 0;
        }
        return uniqList;
    }

    public static int frequent(int[] o) {
        int numberF = 0;
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < o.length; i++) {
            for (int j = i; j < o.length; j++) {
                if (o[i] == o[j] && i != j) {
                    count += 1;
                }
            }
            if (count > count1) {
                count1 = count;
                numberF = o[i];
            }
            count = 0;
        }
        return numberF;
    }

    public static int[] frequent1(int[] o) {
        int count = 0;
        int[] numberF = new int[o.length];
        for (int i = 0; i < o.length; i++) {
            for (int j = i; j < o.length; j++) {
                if (o[i] == o[j] && i != j) {
                    count += 1;
                }
            }
            numberF[i] = count;
            count = 0;
        }
        int max = 0;
        for (int i = 0; i < o.length; i++) {
            if (numberF[i] > max) {
                max = numberF[i];
            }
        }
        for (int i = 0; i < o.length; i++) {
            if (numberF[i] == max) {
                count += 1;
            }
        }
        int j = 0;
        int[] rez = new int[count];
        for (int i = 0; i < o.length; i++) {
            if (numberF[i] == max) {
                rez[j] = o[i];
                j += 1;
            }
        }
        return rez;
    }

    public static ArrayList<Integer> frequent2(int[] o) {
        int count = 0;
        int[] numberF = new int[o.length];
        for (int i = 0; i < o.length; i++) {
            for (int j = i; j < o.length; j++) {//считаем совпадающие элементы
                if (o[i] == o[j] && i != j) {
                    count += 1;
                }
            }
            numberF[i] = count;
            count = 0;
        }
        int max = 0;
        for (int i = 0; i < o.length; i++) {
            if (numberF[i] > max) {              //находим максимум повторений
                max = numberF[i];
            }
        }
        for (int i = 0; i < o.length; i++) {
            if (numberF[i] == max) {              // количество максимумов
                count += 1;
            }
        }
        int j = 0;
        ArrayList<Integer> rezList = new ArrayList<Integer>();
        for (int i = 0; i < o.length; i++) {
            if (numberF[i] == max) {
                rezList.add(o[i]);
                j += 1;
            }
        }
        return rezList;
    }

    public static int countEqualPairs(int[] o) {
        int count = 0;
        List<Object> list = new ArrayList<Object>();
        for (int value : o) {
            list.add(value);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j) && i != j && list.get(i) != "m" && list.get(j) != "m") {
                    list.set(i, "m");
                    list.set(j, "m");
                    count += 1;
                }
            }
        }
        return count;
    }

    public static int countDifferent(int[] o) {
        int count = countEqualPairs(o);
        return o.length - count * 2;
    }

    public static boolean equalss(int[] o, int[] o1) {
        boolean x = true;
        for (int i = 0; i < o.length; i++) {
            if (o[i] != o1[i]) {
                x = false;
                break;
            }
        }
        return x;
    }

    public static int[] copyOf(int[] o, int length) {
        int[] o1 = new int[length];
        if (o.length <= o1.length) {
            arraycopy(o, 0, o1, 0, o.length);
        } else {
            o1 = Arrays.copyOf(o, o1.length);
        }
        return o1;
    }

    public static int[] fillPrimeRandom(int[] o) {
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int x = random.nextInt(100);
            if (isPrime(x)) {
                o[count] = x;
                count += 1;
            }
            if (count == o.length) break;
        }
        return o;
    }

    public static boolean isPrime(int x) {
        boolean primt = true;
        for (int i = 2; i <9; i++) {
            if (x%i==0 && x!=i){
                primt=false;
                break;
            }
        }
        return primt;
    }

    public static String[] group(String[] o) {
        int count = 0;
        for (int i = 0; i < o.length; i++) {
            for (int j = i; j < o.length; j++) {
                if (o[i].equals(o[j]) && i != j) {
                    o[count] = o[i] + " " + o[j];
                    count += 1;
                }
            }
        }
        String[] arrayCon = new String[count];
        arraycopy(o, 0, arrayCon, 0, count);
        return arrayCon;
    }

    public static ArrayList<String> group1(String[] o) {
        int count = 0;
        ArrayList<String> arrayCon = new ArrayList<String>();
        for (int i = 0; i < o.length; i++) {
            for (int j = i; j < o.length; j++) {
                if (o[i].equals(o[j]) && i != j) {
                    arrayCon.add(o[i] + " " + o[j]);
                    count += 1;
                }
            }
        }
        return arrayCon;
    }

    public static int[] equalItems(int[] o) {
        int count = countEqualPairs(o);
        int[] arrEll = new int[count];
        int count1 = 0;
        for (int i = 0; i < o.length; i++) {
            for (int j = i; j < o.length; j++) {
                if (o[i] == o[j] && i != j && o[i] != Integer.MAX_VALUE && o[j] != Integer.MAX_VALUE) {
                    arrEll[count1] = o[i];
                    o[i] = o[j] = Integer.MAX_VALUE;
                    count1 += 1;
                }
            }
        }
        return arrEll;
    }

    public static ArrayList<Integer> equalItems1(int[] o) {
        int count = countEqualPairs(o);
        ArrayList<Integer> arrEll = new ArrayList<Integer>();
        for (int i = 0; i < o.length; i++) {
            for (int j = i; j < o.length; j++) {
                if (o[i] == o[j] && i != j && o[i] != Integer.MAX_VALUE && o[j] != Integer.MAX_VALUE) {
                    arrEll.add(o[i]);
                    o[i] = o[j] = Integer.MAX_VALUE;
                }
            }
        }
        return arrEll;
    }

    public static int[] kBonachi() {
        Scanner scanner = new Scanner(in);
        out.println("Введите K и N:");
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arrFib = new int[n];
        for (int i = 0; i < n; i++) {
            if (i <= k - 1) {
                arrFib[i] = 1;
            } else {
                for (int j = i - k; j < i; j++) {
                    arrFib[i] = arrFib[i] + arrFib[j];
                }
            }
        }
        return arrFib;
    }

public static int HowMany(String s){
    int count=0;
    if (s.length()!=0){
    for (int i = 0; i <s.length() ; i++) {
        if (s.charAt(i)==' '){
            count+=1;
        }
    }
}
return count;
}

}

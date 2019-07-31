import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class Solution {

    //字符串反转1
    public String stringBuiler(String s) {
        StringBuilder stringBuilder = new StringBuilder(s.length());
        for (int i = s.length() - 1; i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }

    //字符串反转2
    public String stringreverse(String s) {
        char[] chars = s.toCharArray();
        char[] s2 = chars;
        for (int i = chars.length - 1; i > 0; i--) {
            s2[chars.length - i - 1] = chars[i];
        }
        return new String(s2);
    }

    //机器人能否返回原点
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            if ('U' == moves.charAt(i)) {
                y++;
            }
            if ('D' == moves.charAt(i)) {
                y--;
            }
            if ('R' == moves.charAt(i)) {
                x++;
            }
            if ('L' == moves.charAt(i)) {
                x--;
            }
        }
        return x == 0 && y == 0;
    }

    //二叉树最大深度
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return 1 + (left > right ? left : right);
        }
    }

/*  //
  public List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> list = new ArrayList();
    int b=0;
    for(int i = left ; i<=right;i++){
      int count = 0;
      int a=i;
      while(i>1){
        i/=10;
        count++;
      }
      for(int j = count-1;j>=0;j--){
        if(a%(int) (a/Math.pow(10,j))==0) b=0;
        else b=1;
      }
      if(b==0) list.add(a);
    }
    return list;
  }*/

    //宝石与石头 注意教义
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == J.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }

/*  public int numJewelsInStones(String J, String S) {
    int count = 0;
    for(int i = 0; i < J.length();i++){
      for(int j = 0;j < S.length();j++){
        if((S.charAt(j))==J.charAt(i)){
          count++;
        }
      }
    }
    return count;
  }*/

    //转换成小写字母
    //实现tolowCase函数
    public String toLowerCase(String str) {

        char[] s = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] > 'A' && s[i] < 'Z') {
                s[i] += 32;
            }
        }
        return new String(s);
    }

    /**
     * Nim游戏 你和你的朋友,两个人一起玩游戏:桌子上有一堆石头,每次你们轮流拿到1-3块石头.拿掉最后一块石头的人,就是获胜者.你为先手.
     * 你们是聪明人,每一步都是最优解.编写一个函数,来判断是否可以在给定石头数量的情况下赢得游戏.
     */
    public boolean canWinNim(int n) {
        if (0 != n % 4) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。 你可以返回满足此条件的任何数组作为答案。 输入：[3,1,2,4] 输出：[2,4,3,1]
     * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
     */
    public int[] sortArrrayByParity(int[] A) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        int[] a = new int[A.length];
        int b = 0;
        for (int i = 0; i < A.length; i++) {
            if (0 == A[i] % 2) {
                even.add(A[i]);
            } else {
                odd.add(A[i]);
            }
        }
        even.addAll(odd);

        for (int i : even) {
            a[b] = (int) i;
            System.out.println(i);
            b++;
        }
        return a;
    }

    public int[] sortArrayByParity1(int[] A) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            if (0 != A[i] % 2) {
                a.add(A[i]);
            } else {
                b.add(A[i]);
            }
        }
        a.addAll(b);
        int count = 0;
        for (int i : a) {
            A[count] = i;
            count++;
        }
        return A;
    }


    /**
     * 我们把符合下列属性的数组 A 称作山脉： A.length >= 3 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] >
     * A[i+1] > ... > A[A.length - 1] 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] >
     * ... > A[A.length - 1] 的 i 的值。
     * <p>
     * 输入：[0,1,0] 输出：1
     * <p>
     * 输入：[0,2,1,0] 输出：1
     */
    public int peakIndexInMountainArray(int[] A) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > A[i + 1]) {
                result = i;
                break;
            }
        }
        return result;
    }

    /**
     * 最大分组位置
     */

    public List<List<Integer>> largeGrouPosiotions(String S) {
        S = S + '.';
        char[] s = S.toCharArray();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        int x = 0;
        int y = 0;
        int tab = 0;
        for (int i = 0; i <= s.length - 2; i++) {
            if (s[i] == s[i + 1] && s[i + 1] == s[i + 2] && tab == 0) {
                x = i;
                list1.add(i);
                tab = 1;
            }
            if (i >= 2) {
                if (s[i - 1] == s[i] && s[i - 1] == s[i - 2] && s[i + 1] != s[i]) {
                    y = i;
                    list1.add(i);
                    tab = tab - 1;
                }
            }
            if (2 == list1.size()) {
                list.add(Arrays.asList(list1.get(0), list1.get(1)));
                list1.clear();
            }
        }
        return list;
    }

    /**
     * 隐藏个人信息
     */
    public String maskPII(String S) {
        String res;
        res = S.toLowerCase();
        String num = "";
        if (Character.isDigit(res.charAt(S.length() - 1)) || Character
                .isDigit(res.charAt(S.length() - 3)) || Character.isDigit(res.charAt(S.length() - 4))
                || Character.isDigit(res.charAt(S.length() - 2))) {
            for (int i = 0; i < res.length(); i++) {
                if (Character.isDigit(res.charAt(i))) {
                    num = num + res.charAt(i);
                }
            }
            num = num.substring(0, num.length() - 4).replaceAll("\\d", "*") + num
                    .substring(num.length() - 4, num.length());
            String n1 = "", n2 = "";
            n2 = num.substring(num.length() - 10, num.length());
            n1 = num.substring(0, num.length() - 10);
            n1 = "+" + n1 + "-";
            n2 = n2.substring(0, 3) + "-" + n2.substring(3, 6) + "-" + n2.substring(6, 10);
            if (num.length() == 10) {
                num = n2;
            } else {
                num = n1 + n2;
            }
            return num;
        } else {
            char[] a = res.toCharArray();
            String str1 = "", str2 = "", name1;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == '@') {
                    str1 = res.substring(0, i);
                    System.out.println("str1--->" + str1);
                    str2 = res.substring(i, a.length);
                    System.out.println("str2--->" + str2);
                    break;
                }
            }
            name1 = str1.charAt(0) + "*****" + str1.charAt(str1.length() - 1);
            res = name1 + str2;
            return res;
        }
    }

    /**
     * 数字的补数
     */
    public int findComplement(int num) {
        int n = 0;
        int i = 0;
        while (num != 0) {
            if (num % 2 == 1) {
            } else {
                n += Math.pow(2, i);
            }
            i++;
            num = num / 2;
        }
        return n;
    }

    /**
     * 最接近原点的k个点
     */
    public int[][] kClosest(int[][] points, int K) {
        int[] temp = new int[2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length - 1; j++) {
                if (Math.pow(points[j + 1][0], 2) + Math.pow(points[j + 1][1], 2)
                        < Math.pow(points[j][0], 2) + Math.pow(points[j][1], 2)) {
                    temp[0] = points[j][0];
                    temp[1] = points[j][1];
                    points[j][0] = points[j + 1][0];
                    points[j][1] = points[j + 1][1];
                    points[j + 1][0] = temp[0];
                    points[j + 1][1] = temp[1];
                }
            }
        }
        int[][] result = new int[K][2];
        for (int i = 0; i <= K - 1; i++) {
            result[i][0] = points[i][0];
            result[i][1] = points[i][1];
        }
        return result;
    }

    /**
     * 快乐数
     */
    public boolean isHappy(int n) {

        String n1 = String.valueOf(n);
        System.out.println("n1 = " + n1);
        if ("ok".equals(sumGG(n1))) {
            return true;
        } else {
            return false;
        }
    }

    public String sumGG(String s) {
        System.out.println("s = " + s);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int x = Integer.valueOf(s.charAt(i)) - 48;
            System.out.println(x);
            sum = x * x + sum;
            System.out.println(sum);
        }
        if (sum == 1) {
            return "ok";
        } else if (sum == 4) {
            return "cont";
        } else {
            return sumGG(String.valueOf(sum));
        }
    }

    /**
     * 两个数组的交集
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> temp = new ArrayList<>();
        int s = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    temp.add(nums2[j]);
                    s = s + 1;
                }
            }
        }
        int[] result2 = new int[temp.toArray().length];
        int t = 0;
        for (int i = 0; i < temp.toArray().length; i++) {
            boolean isTrue = true;
            for (int j = i + 1; j < temp.toArray().length; j++) {
                if (temp.get(i).equals(temp.get(j))) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                result2[t] = temp.get(i);
                ++t;
            }
        }
        for (int i : result2) {
            System.out.println("i = " + i);
        }
        int[] result3 = new int[t];
        for (int i = 0; i < t; i++) {
            result3[i] = result2[i];
        }
        return result3;
    }

    /**
     * 两个数组的交集 利用HashSet去重
     */
    public int[] intersectionHashSet(int[] nums1, int[] nums2) {
        Set<Integer> numberList1 = new HashSet<>();
        Set<Integer> temp = new HashSet<>();
        for (int i : nums1) {
            numberList1.add(i);
        }

        for (int i : nums2) {
            if (numberList1.contains(i)) {
                temp.add(i);
            }
        }
        int n = 0;
        int[] result = new int[temp.size()];
        for (Integer i : temp) {
            result[n] = i;
            n++;
        }
        return result;
    }

    /**
     * 重复N次的元素
     * !!!!!!!!!!!!!!太慢了!!!!
     */
    public int repeatedNTimes(int[] A) {
        int N = (A.length) / 2;
        int result = 0;
        Set<Integer> single = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            single.add(A[i]);
        }
        for (Integer i : single) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (i.equals(A[j])) {
                    count++;
                }
            }
            if (count == N) {
                result = i;
            }
        }
        return result;
    }

    /**
     * 唯一摩尔斯密码词
     */
    public int uniqueMorseRepresentations(String[] words) {
        String[] mark = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] word = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Map<String, String> keyValue = new HashMap<>();
        Set<String> quchong = new HashSet<>();
        for (int i = 0; i < mark.length; i++) {
            keyValue.put(word[i], mark[i]);
        }
        for (int i = 0; i < words.length; i++) {
            char[] temp = words[i].toCharArray();
            String s = "";
            for (int j = 0; j < temp.length; j++) {
                s = s + keyValue.get(String.valueOf(temp[j]));
            }
            words[i] = s;
            quchong.add(words[i]);
        }
        return quchong.size();
    }

    /**
     * 合并两个有序数组
     * 排序时使用了冒泡排序
     * 还可使用java自带的Arrays.sort Api排序
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        int temp = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int x = 0; x < nums1.length - 1; x++) {
                if (nums1[x] >= nums1[x + 1]) {
                    temp = nums1[x];
                    nums1[x] = nums1[x + 1];
                    nums1[x + 1] = temp;
                }
            }
        }
        //Arrays.sort(nums1);
        for (int i : nums1) {
            System.out.println(i);
        }
    }

    /**
     * 存在重复元素
     * 使用hashset去重之后对比前后数组的长度
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i : nums) {
            numbers.add(i);
        }
        if (numbers.size() == nums.length) {
            return false;
        } else {
            return true;
        }
    }

    //数组的相对排序
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map temp = new HashMap();
        for (int i : arr2){
            temp.put(i,i);
        }
        List<Integer> a = new ArrayList<>();
        for (int i : arr2){
            for (int x = 0;x < arr1.length ; x++){
                if (i == arr1[x]){
                   a.add(i);
                }
            }
        }
        List<Integer> b = new ArrayList<>();
        for (int i =0 ; i< arr1.length; i++){
            if(!temp.containsKey(arr1[i])){
                b.add(arr1[i]);
            }
        }
        Collections.sort(b);
        for (Integer i : b){
            a.add(i);
        }
        int []result = new int[a.size()];

        for (int y = 0 ;y <a.size();y++){
            result[y] = a.get(y);
        }
        return result;
    }
}
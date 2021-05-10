public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        int len = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, len - 1);
    }

    private void permute(String str, int len, int r) {
        if (len == r)
            System.out.println(str);
        else {
            for (int i = len; i <= r; i++) {
                str = swap(str, len, i);
                permute(str, len + 1, r);
                str = swap(str, len, i);
            }
        }
    }

    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
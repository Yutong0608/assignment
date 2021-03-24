package main;

public class BinaryReversal {
    public static int binaryReversalProcessor(String str) {
        int input = Integer.valueOf(str);
        String bit = Integer.toBinaryString(input);
        char[] origArr = bit.toCharArray();
        char[] array = new char[8];
        int limit = 0;
        int origLength = origArr.length;
        if (origLength >= 8) {
            while (limit < 8) {
                array[limit] = origArr[limit];
                limit++;
            }
        } else {
            limit = 8 - origLength;
            int i = 0;
            while (limit < 8) {
                array[limit] = origArr[i];
                limit++;
                i++;
            }
        }

        for (int head = 0, end = array.length - 1; head < end; head++, end--) {
            swap(array, head, end);
        }
        String s = new String(array, 0, array.length);
        int result = binaryToInteger(s);
        return result;
    }

    private static void swap(char[] array, int a, int b) {
        char temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static int binaryToInteger(String binary) {
        char[] numbers = binary.toCharArray();
        int result = 0;
        for(int i=numbers.length - 1; i>=0; i--)
            if(numbers[i]=='1')
                result += Math.pow(2, (numbers.length-i - 1));
        return result;
    }
}

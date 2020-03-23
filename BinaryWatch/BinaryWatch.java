import java.util.ArrayList;
import java.util.List;

/*
A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).

Each LED represents a zero or one, with the least significant bit on the right.

Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.

hours: 1 2 4 8 
minutes: 1 2 4 8 16 32
Input: n = 1
Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
*/

class BinaryWatch{
    static String[] lights = {"0h", "1h", "2h", "4h", "8h", "0", "1", "2", "4", "8", "16", "32"};

    public static List<String> readBinaryWatch1(int num) {
        List<String> times = new ArrayList<>();
        for (int h=0; h<12; h++)
            for (int m=0; m<60; m++)
                if (Integer.bitCount(h * 64 + m) == num)
                    times.add(String.format("%d:%02d", h, m));
        return times;        
    }

    public static void main(String[] args) {
        List<String> answer = readBinaryWatch1(2);
        for(int i = 0; i < answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }
}
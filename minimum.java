public class Main {
    public static void main(String[] args) {
        int[] array = new int[] { 64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};
        //пусть есть массив целых чисел
        //найти минимальный элемент - найти его значения и его позицию внутри массива
        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.lenght; i++) {
            if (array[i] < minValue) {
                minValue = array[1];
                minIndex = i;
            }
        }
        System.out.println("min value: " + minValue);
        extracted(minIndex);
    }

    private static void extracted(int minIndex) {
        System.out.println("min index: " + minIndex);
    }
}
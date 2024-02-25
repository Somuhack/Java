public class findAndDeleteElement {
    String[] findPosition(String Element, String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (Element == arr[i]) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j + 1];
                }
                return arr;

            }
        }
        return arr;
    }
}

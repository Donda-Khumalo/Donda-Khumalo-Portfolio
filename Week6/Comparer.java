public class Comparer {
    public String compareFirst (String first, String second) {

        if (first.compareTo(second) > 0) {
            return second;
        } else if (first.compareTo(second) < 0) {
            return first;
        } else {
            return null;
        }
    }
    public String compareSecond (String first, String second) {
        if (first.compareTo(second) < 0) {
            return second;
        } else if (first.compareTo(second) > 0) {
            return first;
        } else {
            return null;
        }
    }
    public String orderThree (String first, String second, String third, String get) {
        String one;
        String two;
        String three;
        if (first.compareTo(second) > 0) {
            one = second;
            two = first;
        } else if (first.compareTo(second) > 0) {
            one = first;
            two = second;
        } else {
            one = first;
            two = second;
        }
        if (third.compareTo(two) < 0) {
            three = third;
        } else if (third.compareTo(two) > 0) {
            if (second.compareTo(one) < 0) {
                three = two;
                two = one;
                one = third;
            } if (second.compareTo(one) > 0) {
                three = two;
                two = third;
            } else {
                three = third;
            }
        } else {
            three = third;
        }

        if (get.equals("one")) {
            return one;
        } else if (get.equals("two")) {
            return two;
        } else if (get.equals("three")) {
            if (three.equals(null)) {
                return null;
            } else {
                return three;
            }

        } else {
            return null;
        }

    }

}
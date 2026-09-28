class BuilderEx {
    public static void main(String[] args) {

        StringBuilder sc = new StringBuilder("Raj");

        System.out.println(sc);

        sc.insert(0, 'S');
        System.out.println(sc);

        sc.insert(2, 'a');
        System.out.println(sc); // SRaaj

        System.out.println(sc.charAt(2)); // a

        sc.delete(2, 3);
        System.out.println(sc); // SRaj

        for (int i = sc.length() - 1; i >= 0; i--) {
            System.out.println(sc.charAt(i));
        }

        // Reverse StringBuilder
        for (int i = 0; i < sc.length() / 2; i++) {

            int start = i;
            int end = sc.length() - 1 - i;

            char front = sc.charAt(start);
            char back = sc.charAt(end);

            sc.setCharAt(start, back);
            sc.setCharAt(end, front);
        }

        System.out.println(sc);
    }
}
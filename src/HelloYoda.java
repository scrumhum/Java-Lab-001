public class HelloYoda {
    /**
     * Returns a String containing a Yoda ASCII art and quote.
     *
     * @return Yoda Face and Quote as a String.
     */
    static String yoda() {
        return """
                          .--.                  Try not.
                ::\\`--._,'.::.`._.--'/::     Do or do not.
                ::::.  ` __::__ '  .::::    There is no try.
                ::::::-:.`'..`'.:-::::::
                ::::::::\\ `--' /::::::::              -Yoda""";
    }

    public static void main(String[] args) {
        System.out.println(yoda());
    }
}

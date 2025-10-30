public class Runner {
    public static void main(String[] args){
        int int1 = 4;
        double avg1 = StringySpells.aveLen("dog","aplus");
        System.out.println("Average 1: " + avg1);
        double avg2 = StringySpells.aveLen("ap","pluscat");
        System.out.println("Average 2: " + avg2);

        String middle1 = StringySpells.middleFinder("catgiraffe");
        System.out.println("Middle 1: " + middle1);

        String abeta = StringySpells.alphaOmega("aplus", "dog");
        System.out.println("Alpha: " + abeta);

        String flipper = StringySpells.flipper("compsci","supercool");
        System.out.println("Flipper: " + flipper);

        String abg = StringySpells.subtractive("lolipop", int1);
        System.out.println("subtractive:" + abg);




    }
}

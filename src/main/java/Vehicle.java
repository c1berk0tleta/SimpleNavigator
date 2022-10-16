import java.util.Random;

public class Vehicle extends Thread {
    int avgSP;
    Random random = new Random();

    public void run (int km ) throws InterruptedException {
        int p = 0, t = 0, time;
        float sp = 1, r;

        for (int dist = km * 1000; dist > 0; dist -= r) {
            sp += random.nextInt(10);

            while (sp > 60) {
                  sp -= 1;
                }
            p += sp;
            t++;
            avgSP = p / t;

            r = (float) (sp * 0.28);
            time = (int) (dist / (sp * 0.28));

            System.out.println("Speed: " + sp + " km/h");
            System.out.println("Average speed: " + avgSP + " km/h");
            System.out.println("Left to go: " + dist / 1000 + " km");
            System.out.println("Time to arrival: " + time + " sec");
            System.out.println(t);
            System.out.println();

            Thread.sleep(1000);

            }
        }

}




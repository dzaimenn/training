package dzaimenn.planet;

class Planet implements Runnable {
    private String name;
    private int distance;
    private Thread thread;

    public Planet(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public void run() {
        travel();
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this, name);
            thread.start();
        }
    }

    public void join() throws InterruptedException {
        if (thread != null) {
            thread.join();
        }
    }

    public void interrupt() {
        if (thread != null) {
            thread.interrupt();
        }
    }

    private void travel() {
        try {
            System.out.println(name + " is starting its journey.");
            for (int i = 1; i <= distance; i++) {
                System.out.println(name + " has traveled " + i + " light years.");
                Thread.sleep(1000); // Simulate travel time
            }
            System.out.println(name + " has reached its destination.");
        } catch (InterruptedException e) {
            System.out.println(name + " has been interrupted.");
        }
    }

}
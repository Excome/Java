package polymorphism;

public class Main {

    public static void main(String[] args) {
	    Bird sw = new Swallow();
	    Bird st = new Strauss();
	    Bird pn = new Penguin();
	    Bird [] b = {sw, st, pn};
        for (Bird br : b) {
            polyMoves(br);
        }
        Bird brAray[] = new Bird[9];
        Swallow createSwallow = new Swallow();
        Strauss createStrauss = new Strauss();
        Penguin createPenguin = new Penguin();
        for(int i = 0; i < 9; i = i + 3) {
            brAray[i] = createSwallow.createBird();
            brAray[i+1] = createStrauss.createBird();
            brAray[i+2] = createPenguin.createBird();
        }
        System.out.println("==========================");
        for(Bird br : brAray) {
            polyMoves(br);
        }

    }
    static void polyMoves(Bird br) {
        br.move();
    }
}

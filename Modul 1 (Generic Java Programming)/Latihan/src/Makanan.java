public class Makanan extends Hidangan {
    @Override
    public String diSantap() {
        return this.getNamaHidangan() + " dimakan";
    }
}

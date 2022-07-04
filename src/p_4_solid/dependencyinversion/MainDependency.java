package p_4_solid.dependencyinversion;

public class MainDependency {
    public static void main(String[] args) {
        PNG png = new PNG();
        JPG jpg = new JPG();

        Filigran pngFiligran = new Filigran();
        Filigran jpgFiligran = new Filigran();

        FiligranManager.call(png, pngFiligran);
        FiligranManager.call(jpg, jpgFiligran);
    }
}

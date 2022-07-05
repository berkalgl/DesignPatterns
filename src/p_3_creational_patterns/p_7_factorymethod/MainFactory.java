package p_5_creational_patterns.p_7_factorymethod;

public class MainFactory {
    public static void main(String[] args) {

        try
        {
            Document doc = DocumentFactory.createDocument(EDocumentType.PDF);
            System.out.println(doc.documentType());
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

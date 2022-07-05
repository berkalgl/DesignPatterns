package p_3_creational_patterns.p_7_factorymethod;

public class DocumentFactory {
    public static Document createDocument( EDocumentType type) throws Exception
    {
        if ( type.equals(EDocumentType.PDF))
            return new PDF();
        else if ( type.equals(EDocumentType.WORD))
            return new Word();

        throw new RuntimeException("Not Found");
    }
}

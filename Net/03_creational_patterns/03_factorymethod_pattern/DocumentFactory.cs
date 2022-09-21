namespace _03_factorymethod_pattern
{
    public enum DocumentTypes
    {
        Word,Pdf
    }

    public class DocumentFactory
    {
        public static IDocument CreateDocument(DocumentTypes documentType)
        {
            switch(documentType)
            {
                case DocumentTypes.Word:
                    return new Word();
                case DocumentTypes.Pdf:
                    return new PDF();
            }

            throw new Exception("There is no type of a object");
        }
    }
}


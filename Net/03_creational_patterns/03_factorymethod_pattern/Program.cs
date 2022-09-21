namespace _03_factorymethod_pattern
{
    public class Program
    {
        public static void Main(string[] args)
        {
            try
            {
                IDocument doc = DocumentFactory.CreateDocument(DocumentTypes.Word);
                Console.WriteLine(doc.DocumentType());
            }
            catch(Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}
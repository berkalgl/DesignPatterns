namespace _03_factorymethod_pattern
{
    public class PDF : IDocument
    {
        public string DocumentType()
        {
            return "This is a PDF Doc";
        }
    }
}


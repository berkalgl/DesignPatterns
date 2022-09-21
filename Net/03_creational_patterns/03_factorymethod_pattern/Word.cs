namespace _03_factorymethod_pattern
{
    public class Word : IDocument
    {
        public string DocumentType()
        {
            return "This is a Word Document";
        }
    }
}


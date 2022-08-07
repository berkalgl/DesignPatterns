public class Product
{
    public string title { get; set; }

    public override string ToString()
    {
        return "Product {" + "title='" + title + '\'' + "}";
    }
}
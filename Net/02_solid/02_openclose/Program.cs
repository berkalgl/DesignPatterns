// See https://aka.ms/new-console-template for more information
MysqlDatabase mysql = new MysqlDatabase();
OracleDatabase oracle = new OracleDatabase();

Product p1 = new Product();
p1.title = "TV";
Product p2 = new Product();
p2.title = "Tablet";

BasketManager.manager(mysql, p1);
BasketManager.manager(oracle, p2);

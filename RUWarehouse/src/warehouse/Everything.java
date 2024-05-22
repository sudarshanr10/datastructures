package warehouse;

/*
 * Use this class to put it all together.
 */ 
public class Everything {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);
        Warehouse w = new Warehouse();
        int size = StdIn.readInt();
        for(int i=0; i<size; i++)
        {
            String queryType = StdIn.readString(); 
            if(queryType.equals("add"))
            {
                int day = StdIn.readInt();
                int productID = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();
                w.addProduct(productID, name, stock, day, demand);
            }
            if(queryType.equals("restock"))
            {
                int productID = StdIn.readInt();
                int amount = StdIn.readInt();    
                w.restockProduct(productID, amount);            
            }
            if(queryType.equals("purchase"))
            {
                int day = StdIn.readInt();
                int productID = StdIn.readInt();
                int amount = StdIn.readInt();
                w.purchaseProduct(productID, day, amount);
            }
            if(queryType.equals("delete"))
            {
                int productID = StdIn.readInt();
                w.deleteProduct(productID);
            }
        }
        StdOut.println(w);
    }
}

import java.util.*;
public class InventoryManagementOOPS {
	static Scanner sc=new Scanner(System.in);
	public static void main(String argts[]) {
		product p=new product();
		int n;
		int id;
		String name;
		int quantity;
		int cost;
		String spec;
		int q;
		int i=0;
		 product prod[]=new product[100];
		while(true) {
			System.out.print("choose one \n1.Add Products\n2.Product List\n3.Product count\n4.Product Details\n5.Edit Product\n6.Add Product Quantities\n7.Delete Product Quanties\n8.Exit\n");
			n=sc.nextInt();
			switch(n) {
			case 1:
				System.out.print("Enter Product Id : ");
				id=sc.nextInt();
				System.out.print("\nEnter Product Name : ");
				name=sc.next();
				System.out.print("\nEnter Product Quantity : ");
				quantity=sc.nextInt();
				System.out.print("\nEnter Product Specification : ");
				spec=sc.next();
				System.out.print("\nEnter Product Cost : ");
				cost=sc.nextInt();
				prod[i]=new product();
				p.addProduct(id, name, quantity, spec, cost,prod,i);
				i+=1;
				break;
			case 2:
				p.getList(prod,i);
				break;
			case 3:
                System.out.print("\nEnter product Id : ");
				id=sc.nextInt();
				p.count(id,i,prod);
				break;
			case 4:
				System.out.print("\nEnter product Id : ");
				id=sc.nextInt();
				p.getDetails(id,prod,i);
				break;
			case 5:
				int c;
				System.out.print("\nchoose one\n1.cost\n2.specification\n");
				c=sc.nextInt();
				System.out.print("\nEnter Product Id : ");
				id=sc.nextInt();
				p.editProduct(id,c,prod,i);
				break;
			case 6:
				System.out.print("\nEnter Product Id : ");
				id=sc.nextInt();
				System.out.print("\nEnter Product Quantity need to be Added: ");
				q=sc.nextInt();
				p.addQuantity(id, q,prod,i);
				break;
			case 7:
				System.out.print("\nEnter Product Id : ");
				id=sc.nextInt();
				System.out.print("\nEnter Product Quantity need to be Deleted: ");
				q=sc.nextInt();
				p.deleteQuantity(id, q,prod,i);
				break;
			case 8:
				break;

			}
			if(n==8) {
				break;
			}
		}
		
	}

}
class product{
	static Scanner sc=new Scanner(System.in);
	int product_id;
	String product_name;
	int product_quantity;
	String product_specification;
	int product_cost;
	
	public void addProduct(int id,String name,int quan,String spec,int cost,product[] prod,int i) {
		prod[i].product_id=id;
		prod[i].product_name=name;
		prod[i].product_quantity=quan;
		prod[i].product_specification=spec;
		prod[i].product_cost=cost;
	}
	public void getList(product[] prod,int i){
		System.out.println("Product_Id \t\t Name \t\t Quantity\t\tSpecification\t\tCost");
		for(int j=0;j<i;j++) {
			System.out.println(prod[j].product_id+"\t\t\t"+prod[j].product_name+"\t\t"+prod[j].product_quantity+"\t\t\t"+prod[j].product_specification+"\t\t\t"+prod[j].product_cost);
		}
		
	}
	
	public void count(int id,int i,product[] prod) {
        for(int j=0;j<i;j++) {
			if(prod[j].product_id==id) {
                System.out.println("Quantity available are "+prod[j].product_quantity);
				return ;
			}
		}
		System.out.println("\ninvalid product id");
	}
	public void getDetails(int id,product[] prod,int i) {
		for(int j=0;j<i;j++) {
			if(prod[j].product_id==id) {
				System.out.println("Product Id : "+prod[j].product_id+"\nProduct Name : "+prod[j].product_name+"\nProduct Quantity : "+prod[j].product_quantity+"\nproduct Specification : "+prod[j].product_specification+"\nproduct Cost : "+prod[j].product_cost);
			}
		}
	}
	public void addQuantity(int id,int q,product[] prod,int i) {
		for(int j=0;j<i;j++) {
			if(prod[j].product_id==id) {
				prod[j].product_quantity+=q;
				return ;
			}
		}
		System.out.println("\ninvalid product id");
		
	}
	public void deleteQuantity(int id,int q,product[] prod,int i) {
		for(int j=0;j<i;j++) {
			if(prod[j].product_id==id) {
				prod[j].product_quantity-=q;
				return ;
			}
		}
		System.out.println("\ninvalid product id");
		
	}
	public void editProduct(int id,int s,product[] prod,int i) {
		for(int j=0;j<i;j++) {
			if(prod[j].product_id==id) {
				if(s==1) {
					System.out.print("\nEnter cost : ");
					prod[j].product_cost=sc.nextInt();
					return;
				}
				else if(s==2) {
					System.out.print("\nEnter Specification : ");
					prod[j].product_specification=sc.next();
					return;
				}
			}
		}
		System.out.println("invalid product id");
	}
	
}


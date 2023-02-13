import java.util.*;
public class InventoryManagementArrays {
	static Scanner sc=new Scanner(System.in);
        static int product_id[]=new int[100];
		static String product_name[]=new String[100];
		static int product_quantity[]=new int[100];
		static String product_specification[]=new String[100];
		static int product_cost[]=new int[100];
	public static void addProduct(int id,String name,int quan,String spec,int cost,int i) {
		product_id[i]=id;
		product_name[i]=name;
		product_quantity[i]=quan;
		product_specification[i]=spec;
		product_cost[i]=cost;
	}
	public static void getList(int i){
		System.out.println("Product_Id \t\t Name \t\t Quantity\t\tSpecification\t\tCost");
		for(int j=0;j<i;j++) {
			System.out.println(product_id[j]+"\t\t\t"+product_name[j]+"\t\t"+product_quantity[j]+"\t\t\t"+product_specification[j]+"\t\t\t"+product_cost[j]);
		}
		
	}
	
	public static void count(int id,int i) {
        for(int j=0;j<i;j++) {
			if(product_id[j]==id) {
				System.out.println("Quantity available are "+product_quantity[j]);
                return;
			}
		}
        System.out.println("\ninvalid product id");
	}
	public static void getDetails(int id,int i) {
		for(int j=0;j<i;j++) {
			if(product_id[j]==id) {
				System.out.println("Product Id : "+product_id[j]+"\nProduct Name : "+product_name[j]+"\nProduct Quantity : "+product_quantity[j]+"\nproduct Specification : "+product_specification[j]+"\nproduct Cost : "+product_cost[j]);
                return;
			}
		}
        System.out.println("\ninvalid product id");
	}
	public static void addQuantity(int id,int q,int i) {
		for(int j=0;j<i;j++) {
			if(product_id[j]==id) {
				product_quantity[j]+=q;
				return ;
			}
		}
		System.out.println("\ninvalid product id");
		
	}
	public static void deleteQuantity(int id,int q,int i) {
		for(int j=0;j<i;j++) {
			if(product_id[j]==id) {
				product_quantity[j]-=q;
				return ;
			}
		}
		System.out.println("\ninvalid product id");
		
	}
	public static void editProduct(int id,int s,int i) {
		for(int j=0;j<i;j++) {
			if(product_id[j]==id) {
				if(s==1) {
					System.out.print("\nEnter cost : ");
					product_cost[j]=sc.nextInt();
					return;
				}
				else if(s==2) {
					System.out.print("\nEnter Specification : ");
					product_specification[j]=sc.next();
					return;
				}
			}
		}
		System.out.println("invalid product id");
	}
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
				addProduct(id, name, quantity, spec, cost,i);
				i+=1;
				break;
			case 2:
				getList(i);
				break;
			case 3:
                System.out.print("\nEnter product Id : ");
				id=sc.nextInt();
				count(id,i);
				break;
			case 4:
				System.out.print("\nEnter product Id : ");
				id=sc.nextInt();
				getDetails(id,i);
				break;
			case 5:
				int c;
				System.out.print("\nchoose one\n1.cost\n2.specification\n");
				c=sc.nextInt();
				System.out.print("\nEnter Product Id : ");
				id=sc.nextInt();
				editProduct(id,c,i);
				break;
			case 6:
				System.out.print("\nEnter Product Id : ");
				id=sc.nextInt();
				System.out.print("\nEnter Product Quantity need to be Added: ");
				q=sc.nextInt();
				addQuantity(id, q,i);
				break;
			case 7:
				System.out.print("\nEnter Product Id : ");
				id=sc.nextInt();
				System.out.print("\nEnter Product Quantity need to be Deleted: ");
				q=sc.nextInt();
				deleteQuantity(id, q,i);
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


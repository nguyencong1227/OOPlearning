public class sortnumber {
        public static void main (String [] args) {
			int[] a = { 13, 7, 6, 45, 21, 9, 101, 102 };
			//for(int i=0; i<a.length; i++) a[i] = Integer.parseInt(args[i]);

			for(int i=0; i<a.length; i++) System.out.print(a[i] + " ");
			System.out.println();

			//Sort
			int tmp; 
			double total = 0;
			double age;
			for (int i=0; i<a.length - 1; i++)
				for (int j = i+1; j<a.length; j++){
					if(a[i]>a[j]){
						tmp = a[i];
						a[i] = a[j];
						a[j] = tmp;
					}
				}
			
			for(int i=0;i<a.length; i++) System.out.print(a[i] + " ");
			System.out.println();

			for(int i=0;i<a.length; i++){
				total += a[i];
			}
			age = total / a.length;
			System.out.print("average: " + age);
		}
}


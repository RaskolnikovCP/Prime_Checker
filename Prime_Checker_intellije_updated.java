	public static int PrimeChecker(int num) {
		// code goes here

		String str = String.valueOf(num);
		int n = str.length();
		ClassName nn = new ClassName();
		boolean isPrime = nn.permute(str, 0, n-1);

		if(isPrime){
			num = 1;
		}
		else {
			num = 0;
		}

		return num;

	}

	public static void main (String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(PrimeChecker(Integer.parseInt(s.nextLine())));
	}

	public boolean permute(String str, int l, int r){

		int n = 0;
		boolean isPrime = true;
		if(l==r){
			n = Integer.parseInt(str);
			if(n <= 0){
				System.out.println("number is not prime " + n);
				isPrime = false;
			}
			for(int j = 2; j < n; j++){
				if(n % j == 0){
					isPrime = false;
				}
			}
			System.out.println("str: " + str);
		}
		else{
			for(int i = l; i <= r; i++){
				str = swap(str,l,i);
				permute(str,l+1,r);
				str = swap(str,l,i);
			}
		}

		return isPrime;

	}

	public String swap(String a, int i, int j){
		char temp;
		char[] charArr = a.toCharArray();
		temp = charArr[i];
		charArr[i] = charArr[j];
		charArr[j] = temp;
		return String.valueOf(charArr);
	}

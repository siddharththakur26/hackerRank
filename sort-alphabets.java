String[] arr = {"A", "c" ,"C", "a","B"};
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length-i-1;j++){	
        if((int) arr[j].toLowerCase().charAt(0) >= (int) arr[j+1].toLowerCase().charAt(0)){
                String t = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = t;
        }
    }	
}
System.out.println(Arrays.toString(arr));

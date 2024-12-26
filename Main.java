public int[] getUniqueElements(int[] arr1,int[] arr2){
    Set<Integer> set = new HashSet<>();

    for(int num : arr1){
        set.add(num);
    }
    for(int num : arr2){
        set.add(num);
    }
    int[] result = new int[set.size()];
    int index = 0;

    for(int num : set){
        result[index] = num;
        index++;
    }
    return result;
}
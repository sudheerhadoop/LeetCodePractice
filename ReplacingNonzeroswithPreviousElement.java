System.out.println("replacing zeros with last non zero element");
int[] array2 = {1,2,4,0,0,5,7,8,0,0,4,0};

for(int i=0;i<array2.length;i++) {
    if (array2[i] == 0) {
        //System.out.print(array2[i - 1]);
        array2[i] = array2[i-1];
        System.out.print(array2[i]);
    } else {
        System.out.print(array2[i]);
    }
}

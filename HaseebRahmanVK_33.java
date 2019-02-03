class Diamond {
    public static void printDiamond(int l){
        for (int i=1; i<=l; i++) {
            for (int j=0; j<(2*l-1-i); j++)
                System.out.print(" ");
            for (int j=0; j<(2*i-1); j++)
                System.out.print("1");
            System.out.println();
        }

        for (int i=1; i<=l-1; i++) {
            for (int j=0; j<l-1-i; j++)
                System.out.print(" ");
            for (int j=0; j<l; j++)
                System.out.print("1");
            for (int j=0; j<(2*i-1); j++)
                System.out.print(" ");
            for (int j=0; j<l; j++)
                System.out.print("1");
            System.out.println();
        }

        for (int i=1; i<=l-2; i++) {
            for (int j=0; j<i; j++)
                System.out.print(" ");
            for (int j=0; j<l; j++)
                System.out.print("1");
            for (int j=0; j<((2*l-3)-2*i); j++)
                System.out.print(" ");
            for (int j=0; j<l; j++)
                System.out.print("1");
            System.out.println();
        }
        for (int i=1; i<=l; i++) {
            for (int j=0; j<l-2+i; j++)
                System.out.print(" ");
            for (int j=0; j<((2*l+1)-2*i); j++)
                System.out.print("1");
            System.out.println();
        }
    }
    public static void main(String[] args){
        printDiamond(11);
    }
}

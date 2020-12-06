class Scratch {
    public static void main(String[] args) {
        char[] text ="ala 4256 kosx".toCharArray();
        z4(text);
    }
    public static void z4(char[] tab){
        int[] cnt =new int[tab.length];
        boolean[] spaceBlok =new boolean[tab.length];
        for(int i=0; i<tab.length; i++){
            for(int j=i; j< tab.length; j++){
                if(tab[i]==tab[j] && i!=j){
                    spaceBlok[j]=true;
                    cnt[i]++;
                }
            }
        }
        for(int i=0; i<tab.length; i++){
            if(spaceBlok[i]!=true){
                System.out.println(tab[i]+" wystepuje "+(cnt[i]+1)+" razy");
            }
        }
    }
}
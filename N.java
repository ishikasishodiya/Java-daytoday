public class N {

    public static void main(String[] args) throws Exception {
        String str = "abcdef";
        StringBuffer strBuf = new StringBuffer(str);
        doPerm(strBuf,0);
    }

    private static void doPerm(StringBuffer str, int index){

        if(index == str.length())
            System.out.println(str);            
        else { //recursively solve this by placing all other chars at current first pos
            doPerm(str, index+1);
            for (int i = index+1; i < str.length(); i++) {//start swapping all other chars with current first char
                swap(str,index, i);
                doPerm(str, index+1);
                swap(str,i, index);//restore back my string buffer
            }
        }
    }

    private  static void swap(StringBuffer str, int pos1, int pos2){
        char t1 = str.charAt(pos1);
        str.setCharAt(pos1, str.charAt(pos2));
        str.setCharAt(pos2, t1);
    }
}   
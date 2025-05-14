
class PrimitiveDataType{
    public static void main(String[] args){
       byte a = 127;
       short b = 9999;
       int c = 999999999;
       long d = 999999999999999999l;
       char ch = 'a';
       float e = 4.6789777777777777777777777799999999999999f; // ----------> 4.678978
       double f = 4.678977777777723456773656729847382298463729473672894863245638493287346; // 4.678977777777724
       
       System.out.println(e);
       System.out.println(f);
    }
}
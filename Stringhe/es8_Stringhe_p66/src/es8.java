public static String ripetitoreCaratteri(char c, int n){
    String s = "";
    for (int i = 0; i < n; i++) {
        s+=c;
    }
    return s;
}
void main() {
    System.out.println(ripetitoreCaratteri('e',5));
}

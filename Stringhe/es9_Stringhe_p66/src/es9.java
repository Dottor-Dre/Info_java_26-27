public static String StrignheUnite(String s1, String s2){
    String unite = "";
    for (int i = 0; i < s1.length(); i++) {
        if (i < s2.length()){
            unite += s1.charAt(i);
            unite += s2.charAt(i);
        } else {
            unite += s1.charAt(i);
        }
    }
    return unite;
}

void main() {
    System.out.println(StrignheUnite("cuffie", "pasta"));
}

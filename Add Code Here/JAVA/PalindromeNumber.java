class Solution {
public boolean isPalindrome(int x) {
String num=Integer.toString(x);
int count=0;
for(int i=0; i<num.length(); i++){
if(num.charAt(i)==num.charAt((num.length()-1)-i)){
count++;
}
}
if(count==num.length()){
return true ;
}else{
return false;
}

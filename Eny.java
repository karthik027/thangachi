import java.util.*;
import java.io.*;
public class Eny
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s=br.readLine();
int a=s.length();
char[] b=s.toCharArray();
for(int i=0;i<(a-1);i++)
{
if((b[i]=='a')||(b[i]=='A'))
{
int k=(int) b[i];
int n=k+25;
char h=(char) n;
System.out.println(h);
}
else
{
int e=(int) b[i];
int f=e-1;
char g=(char) f;
System.out.println(g);
}
}
for(int i=a-1;i<=(a-1);i++)
{
System.out.println(b[i]);
}
}
}

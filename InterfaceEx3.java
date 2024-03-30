interface Client
{
void webdesign();
void webdevelop();
}
abstract class RajTech implements Client
{
public void webdesign()
{
System.out.println("Green, top menu, three dot button");
}
}
class SamTech extends RajTech
{
public void webdevelop()
{
System.out.println("HTML, CSS, JavaScript");
}
}

class InterfaceEx3
{
public static void main(String args[])
{
SamTech st=new SamTech();
st.webdesign();
st.webdevelop();
}
}

/*
O/P:
Green, top menu, three dot button
HTML, CSS, JavaScript
*/
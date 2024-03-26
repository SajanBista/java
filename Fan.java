class Fan{
int fanId;
String fanName;
String fanType;

Fan( int fanId,String fanName,String fanType){
this.fanId=fanId;
this.fanName=fanName;
this.fanType=fanType;
}
void printFanId(){
System.out.println( "Fan ID:" +fanId);
}
public static void main( String[] args){

Fan myFan= new Fan(1,"Myfan","ceiling");
myFan.printFanId();



}



}
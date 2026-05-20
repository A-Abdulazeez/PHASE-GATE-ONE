public class FacebookLikingSystem{
public static String likingSystem(String [] people){

int result = people.length;
if (people.length == 0){
return "no one likes this";
}
else if ( people.length == 1){
return String.format("%s likes  likes this", people[0]) ;
}
else if ( people.length == 2){
return String.format("%s, %s likes  likes this", people[0], people[1] );
}
else if ( people.length == 3){
return String.format("%s, %s, %s likes  likes this", people[0],people[1],people[2]);
}
else{
int remaining = people.length - 2
return String.format("%s, %s ,%d likes  likes this", people[0],people[1],remaining);
}

}
}

import java.util.*;
public class Main14{
public static void main(String[] args){
    String role="admin";
	//except for long can use short byte int
	switch(role){
		case "admin":
		System.out.println("You are admin");
		break;
		case "moderator":
		System.out.println("You are moderator");
		break;
		default:
		System.out.println("You are guest");
	}
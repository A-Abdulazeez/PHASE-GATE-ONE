import java.util.Scanner;

public class MiniParking {
public static int[] carSlots(int cars) {
int[] carSlot = new int[20];

for (int index = 0; index < cars; index++) {

if (index >= carSlot.length) {
System.out.println("Parking lot is full");
break;
}

if (carSlot[index] == 0) {
carSlot[index] = 1;
System.out.println("Car parked in slot " + (index + 1));
}
}
return carSlot;
}
}

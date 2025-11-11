public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String currentTime = args[0];
        int inputMinutes = Integer.parseInt(args[1]);

        String currentTimeArr[] = currentTime.split(":");
        int currentHour = Integer.parseInt(currentTimeArr[0]);
        int currentMinutes = Integer.parseInt(currentTimeArr[1]);
        
        int totalMin = (currentHour * 60) + currentMinutes + inputMinutes;
        int totalHours = totalMin / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMin - (totalHours * 60);

        if(newHours < 10 && newMinutes > 10){
            System.out.println("0" + newHours + ":" + newMinutes);
        }
        else if(newMinutes < 10 && newHours > 10){
            System.out.println(newHours + ":" + "0" + newMinutes);
        }
        else if(newHours < 10 && newMinutes < 10){
            System.out.println("0" + newHours + ":" + "0" + newMinutes);
        }
        else{
            System.out.println(newHours + ":" + newMinutes);
        }
        System.out.println("newMinutes "+ newMinutes);
        System.out.println("newHours "+ newHours);
    }
}

import java.util.Scanner;

public class DisneyWorlds{
    public static void main(String args[]){
        //vars
        Scanner scan = new Scanner(System.in);
        double userNorthSouth = 0, userEastWest = 0;
        double[] northSouths = new double[5], eastWests = new double[5];
        String[] names = new String[5];
        String regionS = "";
        int region = 0;
        
        //input
        System.out.println("Where is your location?");
        System.out.println("Enter NW for North and West");
        System.out.println("Enter NE for North and East");
        System.out.println("Enter SW for South and West");
        System.out.println("Enter SE for South and East");
        try{
            regionS = scan.nextLine();
        }catch(Exception e){
            System.out.println("Invalid input!");
        }
        if(regionS.equalsIgnoreCase("nw")){
            region = 0;
        }
        else if(regionS.equalsIgnoreCase("ne")){
            region = 1;
        }
        else if(regionS.equalsIgnoreCase("sw")){
            region = 2;
        }
        else if(regionS.equalsIgnoreCase("se")){
            region = 3;
        }
        else{
            System.out.println("Invalid Region! Assuming NorthWest!");
        }
        System.out.println("What is your North/South Coordinate? : ");
        try{
            userNorthSouth = scan.nextDouble();
            if(region >= 2){ //if in the south
                userNorthSouth = -userNorthSouth;
            }
        }catch(Exception e){
            System.out.println("Invalid input!");
        }
        System.out.println("What is your East/West Coordinate? : ");
        try{
            userEastWest = scan.nextDouble();
            if(region == 0 || region == 2){ //if in the south
                userEastWest = -userEastWest;
            }
        }catch(Exception e){
            System.out.println("Invalid input!");
        }
        
        //populate array
        northSouths[0] = 28.3852;
        eastWests[0] = -81.5639;
        names[0] = "Disney World, Florida";
        northSouths[1] = 48.8722;
        eastWests[1] = 2.7758;
        names[1] = "Disneyland, Paris";
        northSouths[2] = 35.6329;
        eastWests[2] = 139.8804;
        names[2] = "Disneyland, Tokyo";
        northSouths[3] = 22.3130;
        eastWests[3] = 114.0413;
        names[3] = "Disneyland, Hong Kong";
        northSouths[4] = 33.8121;
        eastWests[4] = -117.9190;
        names[4] = "Disneyland, California";
        
        //find closest
        String closestName = "";
        double closestDist = 10000;
        for(int i = 0; i < 5; i ++){
            double dist = Math.sqrt(Math.pow(Math.abs(userNorthSouth - northSouths[i]),2) + Math.pow(Math.abs(userEastWest - eastWests[i]),2));
            if(dist < closestDist){
                closestDist = dist;
                closestName = names[i];
            }
        }
        
        //output
        System.out.println("The closest Disney Park to " + userNorthSouth + " , " + userEastWest + " is :");
        System.out.println(closestName);
    }
}
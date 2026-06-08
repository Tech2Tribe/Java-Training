/*this code is to help find the estimated area enclocsesd by four cities, i am to find the gps location for Atlanta Georgia:
Orlando,Florida; Savannah Georgia and Charlotte North Carolina.*/
package MathematicalFunctionscharactersandStrings$chapter4;
public class estimateAreas {
    public static void main (String[] args){
        //locations of the four cities
       //Gps location for Atlanta Georgia
       double latitude1 = 33.749;
       double longitude1 = -84.388;
       
       //Gps location for Orlando florida
       double latitude2 = 28.538;
       double longitude2 = -81.379;
       
       //Gps location for Savannah Georgia
       double latitude3 = 32.083;
       double longitude3 = -81.850;
       
       //Gps location for Charlotte, North Carolina
       double latitude4 = 35.227;
       double longitude4 = -80.843;
       
       //define the radius
       double radius = 6371.01;
       
       //now using the formula from (greatCircleDistance) to compute the distance between two cities
       //convert the longitude and latitude to radians
       double x1 = Math.toRadians(latitude1);
       double y1 = Math.toRadians(longitude1);
       
       double x2 = Math.toRadians(latitude2);
       double y2 = Math.toRadians(longitude2);
       
       double x3 = Math.toRadians(latitude3);
       double y3 = Math.toRadians(longitude3);
       
       double x4 = Math.toRadians(latitude4);
       double y4 = Math.toRadians(longitude4);
       
       //Distance between AtlantaGeorgia and Orlando Florida 
       double distance1 = radius * Math.acos(((Math.sin(x1) * Math.sin(x2)) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
        
       //Distance between Orlando Florida and SavannahGeorgia 
       double distance2 = radius * Math.acos(((Math.sin(x2) * Math.sin(x3)) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3)));
       
       //Distance between SavannahGeorgia and North Carolina
       double distance3 = radius * Math.acos(((Math.sin(x3) * Math.sin(x4)) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4)));
       
       //Distance between  North Carolina and AtlantaGeorgia
      double distance4 = radius * Math.acos(((Math.sin(x4) * Math.sin(x1)) + Math.cos(x4) * Math.cos(x1) * Math.cos(y4 - y1)));
      
      //first of calculating the side of the triangle
      double side1 = (distance1 + distance2 + distance3)/ 2;
      double side2 = (distance1 + distance3 + distance4) / 2;
      
      double Area1 = Math.sqrt((side1 * (side1 - distance1)) * (side1 - distance2) *  (side1 - distance3) );
      double Area2 = Math.sqrt((side2 * (side2 - distance1)) * (side2 - distance3) *  (side2 - distance4) );
     
      //calculate the estimated area enclosed by this four cities
      double estimatedArea = Area1 + Area2;
      
      //display result
        System.out.printf(" the area enclosed by this four cities is %4.5f \n " , estimatedArea);
       
    }
    
}

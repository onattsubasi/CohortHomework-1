package models;

import java.util.ArrayList;
import java.util.List;

public class BuildingManager {
    private List<Building> buildingList;

    public BuildingManager() {
        buildingList = new ArrayList<>();
    
    }

    public synchronized Building createBuilding(String name, String address, String buildingType, int area, int yearOld, int price, int numberOfRooms, int numberOfFloors, int numberOfHalls, int numberOfBathrooms){
        Building tempBuilding = null;
        
        if(buildingType.equals("Villa")){
            tempBuilding = new Villa(name, address, buildingType, area, yearOld, price, numberOfRooms, numberOfFloors, numberOfHalls, numberOfBathrooms);

        } else if(buildingType.equals("SummerCottage")){
            tempBuilding = new SummerCottage(name, address, buildingType, area, yearOld, price, numberOfRooms, numberOfFloors, numberOfHalls, numberOfBathrooms);
        
        } else if(buildingType.equals("House")){
            tempBuilding = new House(name, address, buildingType, area, yearOld, price, numberOfRooms, numberOfFloors, numberOfHalls, numberOfBathrooms);
        
        } else {
            throw new IllegalArgumentException("Invalid building type: " + buildingType);
        
        }
        
        buildingList.add(tempBuilding);
        return tempBuilding;
    
    }

    public void printBuildings(){
        System.out.println("Bina Listesi:");
        for(Building building : buildingList){
            System.out.println(building.toString());
        
        }
    
    }
    public void printBuildings(List<Building> buildingList){
        System.out.println(buildingList.getFirst().getBuildingType().toString() + " Listesi:");
        for(Building building : buildingList){
            System.out.println(building.toString());
            
        }
        
    }
    // toplam fiyati hesaplar
    public int getTotalPrice(){
        int totalPrice = 0;
        for(Building building : buildingList){
            totalPrice += building.getPrice();
        
        }
        return totalPrice;
    
    }
    // ayni türdeki binalarin toplam fiyatini hesaplar
    public int getTotalPrice(String buildingType){
        int totalPrice = 0;
        for(Building building : buildingList){
            if(building.getBuildingType().equals(buildingType)){
                totalPrice += building.getPrice();
            
            }
        
        }
        return totalPrice;
    
    }
    /// toplam alan hesaplar
    public int getTotalArea(){
        int totalArea = 0;
        for(Building building : buildingList){
            totalArea += building.getArea();
        
        }
        return totalArea;
    
    }
    // ayni türdeki binalarin toplam alanini hesaplar
    public int getTotalArea(String buildingType){
        int totalArea = 0;
        for(Building building : buildingList){
            if(building.getBuildingType().equals(buildingType)){
                totalArea += building.getArea();
            
            }
        
        }
        return totalArea;
    
    }
    // toplam fiyatlarin ortalamasini hesaplar
    public int getAveragePrice(){
        return getTotalPrice() / buildingList.size();
    
    }
    // ayni türdeki binalarin fiyatlarinin ortalamasini hesaplar
    public int getAveragePrice(String buildingType){
        int total = getTotalPrice(buildingType);
        int count = 0;
        for(Building building : buildingList){
            if(building.getBuildingType().equals(buildingType)){
                count++;
            
            }
        
        }
        return total / count;
    
    }
    // toplam alanin ortalamasini hesaplar
    public int getAverageArea(){
        return getTotalArea() / buildingList.size();
    
    }
    // ayni türdeki binalarin toplam alanin ortalamasini hesaplar
    public int getAverageArea(String buildingType){
        int total = getTotalArea(buildingType);
        int count = 0;
        for(Building building : buildingList){
            if(building.getBuildingType().equals(buildingType)){
                count++;
            
            }
        
        }
        return total / count;
    
    }

    public List<Building> getBuildingList(){
        return buildingList;
    
    }

    // Oda ve salon sayisina göre filtreleme yapar
    public List<Building> filterBuildingList(int numberOfRooms, int numberOfHalls){
        List<Building> filteredList = new ArrayList<>();
        for(Building building : buildingList){
            if(building.getNumberOfRooms() == numberOfRooms && building.getNumberOfHalls() == numberOfHalls){
                filteredList.add(building);

            }
            
        }

        return filteredList;
    }

    public List<Building> filterBuildingListByType(String buildingType){
        List<Building> filteredList = new ArrayList<>();
        for(Building building : buildingList){
            if(building.getBuildingType().equals(buildingType)){
                filteredList.add(building);

            }
            
        }
        return filteredList;
    }
}


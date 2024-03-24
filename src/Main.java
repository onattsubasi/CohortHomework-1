import models.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
    
        BuildingManager buildingManager = new BuildingManager();
        Building House1 = buildingManager.createBuilding("House1","adress1234", "House", 100, 10, 100000, 5, 2, 1, 2);
        Building House2 = buildingManager.createBuilding("House2","adress1235", "House", 120, 7, 150000, 4, 2, 1, 2);
        Building House3 = buildingManager.createBuilding("House3","adress1236", "House", 130, 8, 160000, 4, 2, 1, 2);

        Building Villa1 = buildingManager.createBuilding("Villa1","adress1236", "Villa", 200, 5, 200000, 6, 3, 2, 3);
        Building Villa2 = buildingManager.createBuilding("Villa2","adress1237", "Villa", 250, 3, 250000, 7, 3, 2, 3);
        Building Villa3 = buildingManager.createBuilding("Villa3","adress1238", "Villa", 300, 4, 300000, 8, 3, 2, 3);

        Building SummerCottage1 = buildingManager.createBuilding("SummerCottage1","adress1238", "SummerCottage", 150, 15, 50000, 3, 1, 1, 1);
        Building SummerCottage2 = buildingManager.createBuilding("SummerCottage2","adress1239", "SummerCottage", 180, 20, 60000, 4, 1, 1, 1);
        Building SummerCottage3 = buildingManager.createBuilding("SummerCottage3","adress1240", "SummerCottage", 200, 25, 70000, 5, 1, 1, 1);
        
        // evlerin toplam fiyati
        System.out.println("Evlerin toplam fiyati:" + " " + buildingManager.getTotalPrice("House"));

        // villalarin toplam fiyati
        System.out.println("Villalarin toplam fiyati:" + " " + buildingManager.getTotalPrice("Villa"));

        // yazliklarin toplam fiyati
        System.out.println("Yazliklarin toplam fiyati:" + " " + (buildingManager.getTotalPrice("SummerCottage")));

        // toplam fiyati yazdir
        System.out.println("Binalarin toplam fiyati:" + " " + buildingManager.getTotalPrice());

        // evlerin ortalama metrekaresi
        System.out.println("Evlerin ortalama metrekaresi:" + " " + buildingManager.getAverageArea("House"));

        // villalarin ortalama metrekaresi
        System.out.println("Villalarin ortalama metrekaresi:" + " " + buildingManager.getAverageArea("Villa"));

        // yazliklarin ortalama metrekaresi
        System.out.println("Yazliklarin ortalama metrekaresi:" + " " + buildingManager.getAverageArea("SummerCottage"));

        // ortalama metrekare
        System.out.println("Binalarin ortalama metrekaresi:" + "\n"  + buildingManager.getAverageArea());

        // oda ve salon sayisina gore filtreleme
        System.out.println(buildingManager.filterBuildingList(4,1));
        
        // bina listesini yazdir
        buildingManager.printBuildings();
        
        // ev listesi yazdir
        buildingManager.printBuildings(buildingManager.filterBuildingListByType("House"));

        // villa listesi yazdir
        buildingManager.printBuildings(buildingManager.filterBuildingListByType("Villa"));

        // yazlik listesi yazdir
        buildingManager.printBuildings(buildingManager.filterBuildingListByType("SummerCottage"));


    }
}

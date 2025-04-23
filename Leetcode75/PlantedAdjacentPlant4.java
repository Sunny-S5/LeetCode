
public class PlantedAdjacentPlant4 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean isPlanted = false;
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i]==0){
            boolean left=i==0 || flowerbed[i-1]==0;
            boolean right=i==flowerbed.length-1 ||flowerbed[i+1]==0;
            if(left && right ){
                flowerbed[i]=1;
                count++;
            }
        }
        }
        if (count == n) {
            isPlanted = true;
            return isPlanted;
        }
        return isPlanted;
    }

    public static void main(String[] args) {
        PlantedAdjacentPlant4 obj = new PlantedAdjacentPlant4();
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        boolean isPlanted = false;
        isPlanted = obj.canPlaceFlowers(flowerbed, n);
        System.out.println("values is: " + isPlanted);
    }
}


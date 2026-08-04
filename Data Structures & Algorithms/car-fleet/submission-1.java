class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=speed.length;
        Car[] cars= new Car[n];
        for(int i=0;i<n;i++){
            double time = (double)(target - position[i]) / speed[i];
            cars[i]= new Car(position[i], time);
        }

        Arrays.sort(cars,(a,b)->b.pos-a.pos);

        int fleets = 0;
        double lastTime = 0;

        for (Car car : cars) {
            if (car.time > lastTime) {
                fleets++;
                lastTime = car.time;
            }
        }
        return fleets;
    }

    public class Car{
        int pos;
        double time;
        Car(int pos , double time){
            this.pos=pos;
            this.time=time;                             
        }
    }
}

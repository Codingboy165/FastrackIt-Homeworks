package ExercitiulExtra;

import java.util.*;

public class CarShop {
    public static void main(String[] args) {
        Car bugattiViron = new Car("Bugatti Viron", 1, 10000, 5000);
        Car mercedes = new Car("Mercedes", 5, 14000, 3000);
        Car ferrari = new Car("Ferrari", 2, 15000, 4000);
        Car ferrari2 = new Car("Ferrariss", 3, 15000, 2000);
        Car mercedes3 = new Car("Mercedes", 5, 444000, 15000);
        Car mercedes4 = new Car("Mercedes class A", 5, 14000, 2314);
        List<Car> cars = List.of(bugattiViron, ferrari, mercedes, ferrari2, mercedes3, mercedes4);
        System.out.println(mapNameNumbers(cars));
        System.out.println(mapNameSumKilometers(cars));
        System.out.println(makeAMapForKmRangeGroup(cars));
        System.out.println(makeAMapForPriceRangeGroup(cars));
    }

    public static Map<String, Integer> mapNameNumbers(List<Car> cars) {
        Map<String, Integer> result = new HashMap<>();
        List<String> extractTheNames = new ArrayList<>();
        int i = 0;
        for (Car car : cars) {
            extractTheNames.add(car.name());
        }

        for (Car car : cars) {
            int k = Collections.frequency(extractTheNames, car.name());
            result.put(car.name(), k);
        }
        return result;
        // Un alt rezultat dar nu prea inteleg ce e streamul .... :
        // return cars.stream().collect(Collectors.groupingBy(Record::toString,Collectors.counting()));
    }

    public static Map<String, Integer> mapNameSumKilometers(List<Car> cars) {
        Map<String, Integer> result = new HashMap<>();
        List<String> extractTheNames = new ArrayList<>();

        int i = 0;
        int sum = 0;

        for (Car car : cars) {
            if (extractTheNames.size() == 0) {
                extractTheNames.add(car.name());
            } else {
                if (extractTheNames.contains(car.name())) {
                } else {
                    extractTheNames.add(car.name());
                }
            }
        }

        for (i = 0; i < extractTheNames.size(); i++) {
            for (Car car : cars) {
                if (car.name() == extractTheNames.get(i)) {
                    sum += car.km();
                    result.put(car.name(), sum);
                }
            }
            sum = 0;
        }
        return result;
    }

    public static Map<String, List<Car>> makeAMapForKmRangeGroup(List<Car> cars) {
        Map<String, List<Car>> result = new TreeMap<>();
        String range1 = "0-2999";
        String range2 = "3000-4999";
        String range3 = "5000-10000";
        String range4 = "The car is old";
        for (Car car : cars) {
            if (car.km() >= KmRange.RANGE1.getStart() && car.km() <= KmRange.RANGE1.getEnd()) {
                result.putIfAbsent(range1, new ArrayList<>());
                result.get(range1).add(car);
            } else if (car.km() >= KmRange.RANGE2.getStart() && car.km() <= KmRange.RANGE2.getEnd()) {
                result.putIfAbsent(range2, new ArrayList<>());
                result.get(range2).add(car);
            } else if (car.km() >= KmRange.RANGE3.getStart() && car.km() <= KmRange.RANGE3.getEnd()) {
                result.putIfAbsent(range3, new ArrayList<>());
                result.get(range3).add(car);
            } else {
                result.putIfAbsent(range4, new ArrayList<>());
                result.get(range4).add(car);
            }
        }
            return result;
    }

    public static Map<String, List<Car>> makeAMapForPriceRangeGroup(List<Car> cars) {
        Map<String, List<Car>> result = new TreeMap<>();
        String range1 = "0-999 euro";
        String range2 = "1000-2999 euro";
        String range3 = "3000-9999";
        String range4 = "The car is expensive";
        for (Car car : cars) {
            if (car.price() >= PriceRange.RANGE1.getStart() && car.price() <= PriceRange.RANGE1.getEnd()) {
                result.putIfAbsent(range1, new ArrayList<>());
                result.get(range1).add(car);
            } else if (car.price() >= PriceRange.RANGE2.getStart() && car.price() <= PriceRange.RANGE2.getEnd()) {
                result.putIfAbsent(range2, new ArrayList<>());
                result.get(range2).add(car);
            } else if (car.price() >= PriceRange.RANGE3.getStart() && car.price() <= PriceRange.RANGE3.getEnd()) {
                result.putIfAbsent(range3, new ArrayList<>());
                result.get(range3).add(car);
            } else {
                result.putIfAbsent(range4, new ArrayList<>());
                result.get(range4).add(car);
            }
        }
        return result;
    }
}


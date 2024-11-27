public class BonusMilesService {
    public int calculate(int price) {
        int RubInMiles = 20; // 1 миля за каждые 20 рублей в стоимости билета
        int calculate;
        calculate = price / RubInMiles;

        return calculate;
    }
}

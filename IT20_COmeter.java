public class IT20_COmeter {
    public static void main(String[] args) {
        String [][] Cars = {
            {"Toyota Camry","Honda Accord","Ford Mustang"},
            {"Chevrolet Malibu","BMW 3 Series","Audi A4"},
            {"Nissan Altima","Hyundai Sonata","Tesla Model 3"},
        };
        
        for (int i = 0;i<Cars.length;i++){
            for (int j = 0;j<Cars[i].length;j++){
                System.out.print(Cars[i][j] + " ");
            }
            System.out.println();
        }
    }
}
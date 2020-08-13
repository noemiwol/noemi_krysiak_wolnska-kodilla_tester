public class Notebook {
    int weight;
    int price;
    int year;

        public Notebook (int weight, int price,int year){
            this.weight = weight;
            this.price = price;
            this.year = year;
        }

        public void checkPrice(){
            if(this.price < 600){
                System.out.println("This notebook is cheap");
            }
            else if(this.price >= 600 && this.price <= 1000 ) {
                System.out.println("The price is good");
            }
            else if (this.price > 1000 ){
                System.out.println("This notebook is expensive.");
            }
        }

        public void checkWeight(){
            if(this.weight < 600){
                System.out.println("This notebook is light");
            }
            else if(this.weight >= 600 && this.weight <= 1200 ) {
                System.out.println("This notebook is not too heav");
            }
            else if (this.weight > 1200 ){
                System.out.println("This notebook is very heavy.");
            }

        }

        public void checkYearPrice(){
            if(this.price < 600 && this.year <= 2010){
                System.out.println("The notebook is old and cheap");
            }
            else if(this.price >= 600 && this.price <= 1000 && this.year >= 2014 && this.year <= 2018){
                System.out.println("The notebook is not too old and price is good");
            }
            else if(this.price > 1000 && this.year >= 2018){
                System.out.println("This notebook is the best.");
            }
        }
}

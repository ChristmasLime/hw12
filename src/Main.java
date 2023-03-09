public class Main {
    public static void splitOffers(){
        System.out.println("########################");
    }
    public static void main(String[] args) {

splitOffers();
       Author Alexander = new Author("Александр"," Пушкин");
        Book kingSalnan = new Book("О Царе Солтане", Alexander, 1831);
        kingSalnan.setYearPrint(1832);
        System.out.println("Автор: "+Alexander.getName()+Alexander.getLastName()+"\nКнига: "+kingSalnan.getNameBook() +"\nГод издания: "+kingSalnan.getYearPrint()+" год.");
splitOffers();
        Author Ivan = new Author("Иван", " Крылов");
        Book fable = new Book("Басни Крылова", Ivan, 1808);
        fable.setYearPrint(1844);
        System.out.println("Автор: "+Ivan.getName()+Ivan.getLastName()+"\nКнига: "+fable.getNameBook()+"\nГод издания: "+fable.getYearPrint()+" год.");
splitOffers();


    }
}
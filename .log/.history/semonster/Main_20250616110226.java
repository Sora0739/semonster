public class Main {
  public static void main(String[] args) {
    System.out.println("Hello SEMonster");

    Player player = new Player();
    player.drawMonsters();
    player.showDeck();
    Monster monster = new Monster();
    System.out.println(monster);
  }
}

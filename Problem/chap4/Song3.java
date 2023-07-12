public class Song3 {
    String title, artist, country;
    int year;

    Song3() { title = ""; artist = ""; country = ""; year = 0; }
    Song3(String title, String artist, String country, int year) {
        this.title = title; this.year = year; this.country = country; this.artist = artist;
    }

    public void show() {
        System.out.println(year + "년 " + country + " 국적의 " + artist + "가 부른 " + title);
    }

    public static void main(String[] args) {
        Song3 DancingQueen = new Song3("Dancing Queen", "ABBA", "스웨덴", 1978);
        DancingQueen.show();
    }
}

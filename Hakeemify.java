public class Hakeemify {
    protected String songName;
    protected String songArtist;
    protected String songLength;
    protected String songDescription;

    public Hakeemify(String songName, String songArtist, String songLength, String songDecription){

        this.songName = songName;
        this.songArtist = songArtist;
        this.songLength = songLength;
        this.songDescription = songDecription;

    }

    public void playSong(){
        System.out.println("     ");
        System.out.println("\033[0;1m"+songName);
        System.out.println(songArtist);
        System.out.println("     ");
        System.out.println("\033[0;1m"+"============> "+songLength);
        System.out.println("     ");
        System.out.println("Description: "+songDescription);
        System.out.println("     ");
    }

}

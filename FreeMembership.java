public class FreeMembership extends Hakeemify{
        public FreeMembership(String songName, String songArtist, String songLength,  String songDescription){
            super(songName, songArtist, songLength, songDescription);
        }

        public void playSong(){
            System.out.println("     ");
            System.out.println("\033[0;1m"+songName);
            System.out.println("     ");
            System.out.println("\033[0;1m"+"============> "+songLength);
            System.out.println("     ");
        }
}

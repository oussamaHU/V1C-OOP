package practicum2b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class VoetbalclubTest {
    @Test
    public void ClubNaam(){
        Voetbalclub club = new Voetbalclub("");
        assertEquals("FC", "");
    }
    @Test
    public void TestPuntensaldo(){
        Voetbalclub club = new Voetbalclub("testClub");
        club.verwerkResultaat('w');
        club.verwerkResultaat('g');
        club.verwerkResultaat('v');


        club.verwerkResultaat('p');
        club.verwerkResultaat('f');
        club.verwerkResultaat('f');
        assertEquals("testClub 3 1 1 1 4",club.toString());

    }


}
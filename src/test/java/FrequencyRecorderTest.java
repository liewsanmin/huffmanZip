import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import java.util.*;
import static org.junit.Assert.*;

public class FrequencyRecorderTest {
    HashMap<Character, Integer> expectedMap = new HashMap<>();

    @Before
    public void init() {
        expectedMap.put('a', 2);
        expectedMap.put('b', 2);
    }

    @Test
    public void mapHappyCase() {
        HashMap<Character, Integer> hm = new HashMap<>();
        frequencyRecorder fR = new frequencyRecorder();
        hm = fR.record("aabb");

        assertEquals(hm.get('a'), expectedMap.get('a'));
        assertEquals(hm.get('b'), expectedMap.get('a'));
    }

    @Test(expected = RuntimeException.class)
    public void nullInput(){
        frequencyRecorder fR = new frequencyRecorder();
		HashMap<Character, Integer> nullMap = new HashMap<>();
        nullMap = fR.record(null);
    }


    @Test(expected = RuntimeException.class)
    public void emptyInput(){
        frequencyRecorder fR = new frequencyRecorder();
		HashMap<Character, Integer> emptyMap = new HashMap<>();
        emptyMap = fR.record("");
    }

}

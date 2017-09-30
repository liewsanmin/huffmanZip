import org.junit.Test;
import org.junit.Before;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class frequencyRecorderTest {
    @Mock frequencyRecorder fR;
    HashMap<Character, Integer> map = new HashMap<>();

    @Before
    public void init() {
        map.put('a', 2);
        map.put('b', 2);
    }

    @Test
    public void mapHappyCase() {
        HashMap<Character, Integer> hm = new HashMap<>();
        frequencyRecorder fR = new frequencyRecorder();
        hm = fR.record("aabb");

        assertEquals(hm.get('a'), (Integer)2);
        assertEquals(hm.get('b'), (Integer)2);
    }

    @Test(expected = RuntimeException.class)
    public void nullInput(){
        frequencyRecorder fR = new frequencyRecorder();
        map = fR.record(null);
    }


    @Test(expected = RuntimeException.class)
    public void emptyInput(){
        frequencyRecorder fR = new frequencyRecorder();
        map = fR.record("");
    }

}

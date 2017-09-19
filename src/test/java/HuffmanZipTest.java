import org.junit.Test;
import org.junit.Before;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class HuffmanZipTest {

    @Mock Node mockNode;
    @Mock Node mockOtherNode;
    
    @Before
    public void init() {
        when(mockNode.getValue()).thenReturn('c');
        when(mockNode.getFrequency()).thenReturn(4);
        when(mockOtherNode.getValue()).thenReturn('y');
        when(mockOtherNode.getFrequency()).thenReturn(2);
    }

    @Test
    public void NodeBuilderHappyCase() {
        Node node = new NodeBuilder().withValue('c')
                                     .withFrequency(4)
                                     .build();
        assertEquals(node.getValue(), mockNode.getValue());
        assertEquals(node.getFrequency(), mockNode.getFrequency());
        assertNotEquals(node.getValue(), mockOtherNode.getValue());
        assertNotEquals(node.getFrequency(), mockOtherNode.getFrequency());
    }

}


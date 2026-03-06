import org.example.tinhTong;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestTong {
    tinhTong math=new tinhTong();
    @Test
    void test(){
        assertEquals(4,math.sumTon(3));
        assertEquals(1,math.sumTon(1));
        assertEquals(9,math.sumTon(5));
    }


}

import org.example.SanPham;
import org.example.SanPhamService;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;


public class TestSanPham {


        SanPhamService service = new SanPhamService();

    @Test
    public void test() {
        SanPham sp=new SanPham("hh","hoa",2025,150F,12,"hoa tuoi");
        service.sua(sp,"hh","hoa hong",2025,150F,12,"hoa tuoi");
        Assertions.assertEquals("hoa hong",sp.getTen());
    }
    @Test
    public void test2() {
        SanPham sp=new SanPham("hh","hoa",2025,150F,12,"hoa tuoi");

        Assertions.assertThrows(IllegalArgumentException.class, ()->service.sua(sp,"hh","",2025,150F,12,"hoa tuoi"));
    }
}

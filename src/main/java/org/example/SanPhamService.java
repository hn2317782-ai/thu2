package org.example;

public class SanPhamService {
  public  void sua(SanPham sanPham, String ma,
     String ten,
    int namBaoHanh,
 float gia,
     int soLuong,
    String danhMuc) {
        if (sanPham == null) {
            throw new IllegalArgumentException("san pham k dc null");
        }
        if (ma == null || ma.trim().isEmpty()) {
            throw new IllegalArgumentException("ma k dc null");
        }
        if (ten == null || ten.trim().isEmpty()) {
            throw new IllegalArgumentException("ten k dc null");
        }
        if (namBaoHanh < 0) {
            throw new IllegalArgumentException("namBaoHanh phai lon hơn 0");
        }
        if (gia < 0) {
            throw new IllegalArgumentException("gia k dc nho hon 0");
        }
        if (soLuong < 0) {
            throw new IllegalArgumentException("soLuong k dc nho hon 0");
        }
        if (danhMuc == null || danhMuc.trim().isEmpty()) {
            throw new IllegalArgumentException("danhMuc k dc null");
        }
        sanPham.setMa(ma);
        sanPham.setTen(ten);
        sanPham.setNamBaoHanh(namBaoHanh);
        sanPham.setGia(gia);
        sanPham.setSoLuong(soLuong);
        sanPham.setDanhMuc(danhMuc);
    }
}

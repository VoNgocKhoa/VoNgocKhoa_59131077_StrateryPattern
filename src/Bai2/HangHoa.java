/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author long
 */
public class HangHoa 
{
    String TenHH;
    int Gia;
    String MoTa;
    
    public HangHoa(String tenHH, int gia, String moTa) 
    {
        this.TenHH = TenHH;
        this.Gia = Gia;
        this.MoTa = MoTa;
    }
    
    public int getGia() 
    {
        return Gia;
    }
    
    public String ThongTinHangHoa() {
        return "Tên hàng hóa: "  +  this.TenHH+ ",  Giá: "  +  this.Gia + ", Mô tả: "  +  this.MoTa;
    }
}

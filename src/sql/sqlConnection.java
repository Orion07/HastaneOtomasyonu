package sql;
import static forms.girisFrame.jTabbedPane1;
import forms.hastaFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public final class sqlConnection {
public Connection con;
private final String url = "jdbc:mysql://localhost:3306/";
private final String dbName = "hastane";
private final String driver = "com.mysql.jdbc.Driver";
private final String userName = "root";
private final String password = "";
public sqlConnection()
{
    baglan();
}
public void baglan()
{
    try {
        Class.forName(driver).newInstance();
        con = DriverManager.getConnection(url+dbName,userName,password);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
    }
    
}
public void baglantiKapat()
{
    try {
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(sqlConnection.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public void tableGetir(String sql,JTable jtbl)
{
//baglan();
try {
PreparedStatement preparedStatement = con.prepareStatement(sql);
ResultSet rs = preparedStatement.executeQuery();
//rs.next();
//JOptionPane.showMessageDialog(null,rs.getObject(2).toString());
jtbl.setModel(resultSetTableModel(rs));
} 
catch (SQLException e) 
{
System.out.println(e.getMessage());
}
}
public void updateQuery(String query)
{
try {
PreparedStatement ps = con.prepareStatement(query);
ps.executeUpdate();
} 
catch (SQLException e) 
{
JOptionPane.showMessageDialog(null,e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
}    
}
public void openForm(String id)
{
JFrame jf = new hastaFrame();
jf.setTitle(id);
jf.setVisible(true);
}
public int girisYap(String id,String password)
{
try {
PreparedStatement ps = con.prepareStatement("SELECT onay FROM uyelik where id = ? and password = ?");
ps.setString(1, id);
ps.setString(2, password);
ResultSet rs = ps.executeQuery();
rs.next();
int onay = rs.getInt("onay");
ps = con.prepareStatement("UPDATE uyelik SET son_giris = ? WHERE id = ? and password = ?");
DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
Calendar cal = Calendar.getInstance();      
ps.setString(1,dateFormat.format(cal.getTime()));
ps.setString(2, id);
ps.setString(3, password);

            switch (onay)
            {
                case 0:
                    JOptionPane.showMessageDialog(null, "Uyeligin Onaylanmasi gerekiyor!","Hata",JOptionPane.ERROR_MESSAGE);
                    break; 
                case 1:
                    JOptionPane.showMessageDialog(null, "Giris Basarili Hosgeldiniz","Bilgi",JOptionPane.INFORMATION_MESSAGE);
                    ps.executeUpdate();
                    openForm(id);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Yonetici Girisi","Bilgi",JOptionPane.INFORMATION_MESSAGE);
                    ps.executeUpdate();
                    openForm(id);
                    break;
            }
return onay;
} 
catch (SQLException e) 
{
JOptionPane.showMessageDialog(null,e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
}
return -1;
}
public void uyeOl(String id)
{
    try 
    {
        String sorgu = "SELECT * FROM kullanici where kAd = ?";
        PreparedStatement ps = con.prepareStatement(sorgu);
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        if(rs.next() == false)
        {
            JOptionPane.showMessageDialog(null, "Eklendi");
        } else {
            JOptionPane.showMessageDialog(null, "Bu kişi zaten mevcut");
        }
    }
    catch(Exception ex)
    {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
    }
}
public void uyelikAl(String id,String password)
{
try {
String sql = "SELECT onay FROM uyelik where id = ? and password = ?";
PreparedStatement ps = con.prepareStatement(sql);
ps.setString(1, id);
ps.setString(2, password);
ResultSet rs = ps.executeQuery();
if(rs.next() == false)
{
ps = con.prepareStatement("INSERT INTO uyelik VALUES(?,?,0,?,?)");
DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
Calendar cal = Calendar.getInstance();      
String tarih = dateFormat.format(cal.getTime());
ps.setString(1, id);
ps.setString(2, password);
ps.setString(3, tarih);
ps.setString(4, tarih);
ps.executeUpdate();
JOptionPane.showMessageDialog(null, "Uyeliginiz Olusturuldu Lutfen Onaylatin!","Bilgi",JOptionPane.INFORMATION_MESSAGE);
jTabbedPane1.setSelectedIndex(2);
}
else{
JOptionPane.showMessageDialog(null, "Boyle Bir Uyelik Mevcut!","Bilgi",JOptionPane.INFORMATION_MESSAGE);
}
}
catch (SQLException e) 
{
JOptionPane.showMessageDialog(null, e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
}
}
public void uyelikOnayla(String adminID,String adminPW,String id,String password)
{
try {
String sql = "SELECT onay FROM uyelik where id = ? and password = ?";
PreparedStatement ps = con.prepareStatement(sql);
ps.setString(1, adminID);
ps.setString(2, adminPW);
ResultSet rs = ps.executeQuery();
rs.next();
int onay = rs.getInt("onay");
if(onay == 2)
{
ps = con.prepareStatement("UPDATE uyelik SET onay = 1 WHERE id = ? and password = ?");
ps.setString(1, id);
ps.setString(2, password);
int rss = ps.executeUpdate();
System.out.println(rss);
if(rss == 1)
{
JOptionPane.showMessageDialog(null, "Uyeliginiz Onaylandi Giris Yapabilirsiniz!","Bilgi",JOptionPane.INFORMATION_MESSAGE);
jTabbedPane1.setSelectedIndex(0);
}else{
JOptionPane.showMessageDialog(null,"Lutfen Bilgilerinizi Kontrol Edin", "Hata", JOptionPane.ERROR_MESSAGE);
}
}

}
catch(SQLException e)
{
JOptionPane.showMessageDialog(null,e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
}
}
public boolean hastaKayit(long tc,String ad,String soyad,String dogumyeri,int dogumyili,String kurum)
{
    try {
        PreparedStatement ps = con.prepareStatement("INSERT INTO hasta_bilgi VALUES(?,?,?,?,?,?)");
        ps.setLong(1, tc);
        ps.setString(2, ad);
        ps.setString(3, soyad);
        ps.setString(4, dogumyeri);
        ps.setInt(5, dogumyili);
        ps.setString(6, kurum);
        int rs = ps.executeUpdate();
        if(rs == 1) return true;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
    }
  return false;
}
public boolean kayitGuncelle(long tc,String ad,String soyad,String dogumyeri,int dogumyili,String kurum)
{
    try {
        PreparedStatement ps = con.prepareStatement("UPDATE hasta_bilgi set hastaAdi = ?,hastaSoyadi = ?,dogumYeri = ?,dogumYili = ?,kurumu = ? where tcno = ?");
        ps.setString(1, ad);
        ps.setString(2, soyad);
        ps.setString(3, dogumyeri);
        ps.setInt(4, dogumyili);
        ps.setString(5, kurum);
        ps.setLong(6, tc);
        int rs = ps.executeUpdate();
        if(rs == 1) return true;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
    }
  return false;
}
public boolean tcGuncelle(long yeniTc,long eskiTc)
{
    try {
        PreparedStatement ps = con.prepareStatement("UPDATE hasta_bilgi SET tcno = ? where tcno = ?");
        ps.setLong(1, yeniTc);
        ps.setLong(2, eskiTc);
        int rs = ps.executeUpdate();
        if(rs == 1) return true;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
    }
  return false;
}

public void kayitSil(int tcno)
{
    try {
        PreparedStatement ps = con.prepareStatement("DELETE FROM hasta_bilgi WHERE tcno = ?");
        ps.setInt(1, tcno);
        int rs = ps.executeUpdate();
        if(rs == 1){
        JOptionPane.showMessageDialog(null, "Kayit Basariyla Silindi","Bilgi",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        JOptionPane.showMessageDialog(null,"Kayit Silinemedi", "Hata", JOptionPane.ERROR_MESSAGE);
        }
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
    }    
}
public void kayitSil2(String isim,String soyisim)
{
    try{
        PreparedStatement ps = con.prepareStatement("DELETE FROM tablo_ismi WHERE isim = ? and soyisim = ?");
        ps.setString(1, isim);
        ps.setString(2, soyisim);
        int rs = ps.executeUpdate();
        if(rs == 1){
        JOptionPane.showMessageDialog(null, "Kayit Basariyla Silindi","Bilgi",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        JOptionPane.showMessageDialog(null,"Kayit Silinemedi", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }   
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
    }
}
public boolean tahlilKayit(long tc,String tahlilAd,int tahlilKod,String tahlilTarih,int tahlilFiyat)
{
    try {
        PreparedStatement ps = con.prepareStatement("INSERT INTO tahliller values(NULL,?,?,?,?,?)");
        ps.setLong(1, tc);
        ps.setString(2, tahlilAd);
        ps.setInt(3, tahlilKod);
        ps.setString(4, tahlilTarih);
        ps.setInt(5, tahlilFiyat);
        int rs = ps.executeUpdate();
        System.out.println(ps.toString());
        if(rs == 1) return true;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
    }
  return false;
}
public boolean tahlilGuncelle(long tc,String tahlilAd,int tahlilKod,String tahlilTarih,int tahlilFiyat,int sirano)
{
    try {
        PreparedStatement ps = con.prepareStatement("UPDATE tahliller set tahlilAdi = ?,tahlilKodu = ?,tahlilTarihi = ?,tahlilFiyati = ? where tcno = ? and sirano = ?");
        ps.setString(1, tahlilAd);
        ps.setInt(2, tahlilKod);
        ps.setString(3, tahlilTarih);
        ps.setInt(4, tahlilFiyat);
        ps.setLong(5, tc);
        ps.setInt(6, sirano);
        System.out.println(ps.toString());
        int rs = ps.executeUpdate();
        if(rs == 1) return true;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
    }
  return false;
}
public void tahlilSil(int sirano)
{
    try {
        PreparedStatement ps = con.prepareStatement("DELETE FROM tahliller WHERE sirano = ?");
        ps.setInt(1, sirano);
        int rs = ps.executeUpdate();
        if(rs == 1){
        JOptionPane.showMessageDialog(null, "Kayit Basariyla Silindi","Bilgi",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        JOptionPane.showMessageDialog(null,"Kayit Silinemedi", "Hata", JOptionPane.ERROR_MESSAGE);
        }
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
    }    
}
public DefaultTableModel resultSetTableModel(ResultSet rs)
{
try{
    int columnCount = rs.getMetaData().getColumnCount();
    //System.out.println(rs.getMetaData());
    DefaultTableModel tableModel = new DefaultTableModel();
    ArrayList<String> al = new ArrayList();
    for(int i = 1;i<=columnCount;i++)
    {
        //tableModel.addColumn(rs.getMetaData().getColumnName(i));
        tableModel.addColumn(rs.getMetaData().getColumnLabel(i));
    }
    while(rs.next())
    {
        al.clear();
        for(int i = 1;i<=columnCount;i++)
        {
        al.add(rs.getObject(i).toString());
        }
        tableModel.addRow(al.toArray());
    }
    return tableModel;
}
catch(SQLException e){
JOptionPane.showMessageDialog(null,e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
}

return null;
}
public void test(JTable j)
{
    try {
        String sql = "SELECT * FROM tahliller";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        j.setModel(resultSetTableModel(rs));

    } catch (SQLException ex) {
        Logger.getLogger(sqlConnection.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}



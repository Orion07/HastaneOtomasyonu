/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import sql.sqlConnection;
public class hastaFrame extends javax.swing.JFrame {
sqlConnection sql = new sqlConnection();
private final String hasta_bilgi = "SELECT * FROM hasta_bilgi";
    public hastaFrame() {
        initComponents();
        setLocationRelativeTo(null);
        //createButtonGroup();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        soyad = new javax.swing.JTextField();
        tc = new javax.swing.JTextField();
        ad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ad1 = new javax.swing.JTextField();
        soyad1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tc1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        jMenuItem1.setText("Duzenle");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Sil");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);
        jPopupMenu1.add(jSeparator1);

        jMenuItem4.setText("Tahlil Islemleri");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem4);
        jPopupMenu1.add(jSeparator2);

        jMenu1.setText("Listele");

        jMenuItem6.setText("Tc ile Tahlil Listele");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Tahlil Fiyati En Yuksek 10 Kisiyi Listele");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Hasta & Tahlil Detay Listele");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("Kurum Tahlil Listele");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jPopupMenu1.add(jMenu1);

        jMenuItem5.setText("jMenuItem5");

        jMenuItem3.setText("TC Degistir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jPopupMenu1, org.jdesktop.beansbinding.ObjectProperty.create(), jTable1, org.jdesktop.beansbinding.BeanProperty.create("componentPopupMenu"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jLabel1.setText("Adi :");

        jLabel2.setText("Soyadi :");

        jLabel3.setText("TC :");

        jLabel4.setText("Dogum Yeri :");

        jLabel5.setText("Dogum Yili :");

        jLabel6.setText("Kurumu :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Aksaray ", "Amasya", "Ankara", "Antalya", "Ardahan", "Artvin ", "Aydın ", "Balıkesir", "Bartın ", "Batman", "Bayburt ", "Bilecik ", "Bingöl", "Bitlis", "Bolu", "Burdur ", "Bursa", "Çanakkale", "Çankırı  ", "Çorum", "Denizli", "Diyarbakır ", "Düzce", "Edirne ", "Elazığ ", "Erzincan ", "Erzurum ", "Eskişehir ", "Gaziantep ", "Giresun ", "Gümüşhane", "Hakkari ", "Hatay ", "Iğdır", "Isparta", "İstanbul ", "İzmir", "Kahramanmaraş", "Karabük ", "Karaman ", "Kars ", "Kastamonu ", "Kayseri ", "Kırıkkale ", "Kırklareli ", "Kırşehir", "Kilis", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa ", "Mardin ", "Mersin ", "Muğla ", "Muş ", "Nevşehir ", "Niğde", "Ordu ", "Osmaniye", "Rize ", "Sakarya ", "Samsun", "Siirt ", "Sinop ", "Sivas", "Şanlıurfa", "Şırnak", "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Uşak", "Van", "Yalova", "Yozgat", "Zonguldak" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SGK", "BAGKUR", "EMEKLI SANDIGI" }));

        jButton1.setText("Listele");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Kaydet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        soyad.setAutoscrolls(false);

        tc.setAutoscrolls(false);

        ad.setAutoscrolls(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(soyad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                .addGap(225, 225, 225)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );

        jTabbedPane1.addTab("Hasta Kayit", jPanel1);

        jLabel7.setText("Adi :");

        ad1.setAutoscrolls(false);

        soyad1.setAutoscrolls(false);

        jLabel8.setText("Soyadi :");

        tc1.setToolTipText("Sag Tiklayip Degistirebilirsiniz");
        tc1.setAutoscrolls(false);
        tc1.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jPopupMenu2, org.jdesktop.beansbinding.ObjectProperty.create(), tc1, org.jdesktop.beansbinding.BeanProperty.create("componentPopupMenu"));
        bindingGroup.addBinding(binding);

        jLabel9.setText("TC :");

        jLabel10.setText("Dogum Yeri :");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Aksaray ", "Amasya", "Ankara", "Antalya", "Ardahan", "Artvin ", "Aydın ", "Balıkesir", "Bartın ", "Batman", "Bayburt ", "Bilecik ", "Bingöl", "Bitlis", "Bolu", "Burdur ", "Bursa", "Çanakkale", "Çankırı  ", "Çorum", "Denizli", "Diyarbakır ", "Düzce", "Edirne ", "Elazığ ", "Erzincan ", "Erzurum ", "Eskişehir ", "Gaziantep ", "Giresun ", "Gümüşhane", "Hakkari ", "Hatay ", "Iğdır", "Isparta", "İstanbul ", "İzmir", "Kahramanmaraş", "Karabük ", "Karaman ", "Kars ", "Kastamonu ", "Kayseri ", "Kırıkkale ", "Kırklareli ", "Kırşehir", "Kilis", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa ", "Mardin ", "Mersin ", "Muğla ", "Muş ", "Nevşehir ", "Niğde", "Ordu ", "Osmaniye", "Rize ", "Sakarya ", "Samsun", "Siirt ", "Sinop ", "Sivas", "Şanlıurfa", "Şırnak", "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Uşak", "Van", "Yalova", "Yozgat", "Zonguldak" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));

        jLabel11.setText("Dogum Yili :");

        jLabel12.setText("Kurumu :");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SGK", "BAGKUR", "EMEKLI SANDIGI" }));

        jButton3.setText("Degistir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Listele");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ad1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(soyad1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tc1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                .addGap(225, 225, 225)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(soyad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );

        jTabbedPane1.addTab("Kayit Degistirme", jPanel2);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Ad");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Soyad");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Tc Kimlik No");

        jTextField1.setAutoscrolls(false);

        jButton5.setText("Listele");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButton2)
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButton3)))
                .addContainerGap(500, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Arama", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setComboBoxItemIndex(String str,JComboBox cmb)
    {
        int i;
        for(i=0;i<cmb.getItemCount();i++)
        {
            if(cmb.getItemAt(i).equals(str))
            {
                cmb.setSelectedIndex(i);
                return ;
            }
        }

    }
    public void setMenuItemEnabled(boolean a)
    {
        jMenuItem1.setEnabled(a);
        jMenuItem2.setEnabled(a);
        jMenuItem4.setEnabled(a);
        jMenuItem6.setEnabled(a);
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(null, "Cikmak Istediginize Eminmisiniz ?","Cikis", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
         sql.baglantiKapat();
         System.exit(0);
        }
        setDefaultCloseOperation(hastaFrame.DO_NOTHING_ON_CLOSE);
       
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        sql.tableGetir(hasta_bilgi,jTable1);
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      if(tc.getText().isEmpty() ||
         ad.getText().isEmpty() || 
         soyad.getText().isEmpty()){
      JOptionPane.showMessageDialog(null, "Boş Alanlari Doldurun Lütfen!","Hata",JOptionPane.ERROR_MESSAGE);
      }else{
       if(tc.getText().length()!=11){
           JOptionPane.showMessageDialog(null, "TC No 11 haneli olmalidir!","Hata",JOptionPane.ERROR_MESSAGE); 
           return;
       }
       long tcno = Long.parseLong(tc.getText());
        boolean sonuc = sql.hastaKayit(tcno,ad.getText(),soyad.getText(),
                    jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).toString(),
                    Integer.parseInt(jComboBox2.getItemAt(jComboBox2.getSelectedIndex()).toString()),
                    jComboBox3.getItemAt(jComboBox3.getSelectedIndex()).toString());
       if(sonuc == true){
       JOptionPane.showMessageDialog(null, "Kayit Basarili ","Bilgi",JOptionPane.INFORMATION_MESSAGE);
       sql.tableGetir(hasta_bilgi,jTable1);
       tc.setText("");
       ad.setText("");
       soyad.setText("");
       jComboBox1.setSelectedIndex(0);
       jComboBox2.setSelectedIndex(0);
       jComboBox3.setSelectedIndex(0);
       }
       else{
       JOptionPane.showMessageDialog(null, "Kayit Basarisiz ","Bilgi",JOptionPane.INFORMATION_MESSAGE);
       }
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       sql.tableGetir(hasta_bilgi,jTable1);
       setMenuItemEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
              if(tc1.getText().isEmpty() ||
         ad1.getText().isEmpty() || 
         soyad1.getText().isEmpty()){
      JOptionPane.showMessageDialog(null, "Boş Alanlari Doldurun Lütfen!","Hata",JOptionPane.ERROR_MESSAGE);
      }else{
       long tcno = Long.parseLong(tc1.getText());
        boolean sonuc = sql.kayitGuncelle(tcno,ad1.getText(),soyad1.getText(),
                    jComboBox4.getItemAt(jComboBox4.getSelectedIndex()).toString(),
                    Integer.parseInt(jComboBox5.getItemAt(jComboBox5.getSelectedIndex()).toString()),
                    jComboBox6.getItemAt(jComboBox6.getSelectedIndex()).toString());
       if(sonuc == true){
       JOptionPane.showMessageDialog(null, "Guncelleme Basarili ","Bilgi",JOptionPane.INFORMATION_MESSAGE);
       sql.tableGetir(hasta_bilgi,jTable1);
       tc1.setText("");
       ad1.setText("");
       soyad1.setText("");
       jComboBox4.setSelectedIndex(0);
       jComboBox5.setSelectedIndex(0);
       jComboBox6.setSelectedIndex(0);
       }
       else{
       JOptionPane.showMessageDialog(null, "Guncelleme Basarisiz ","Bilgi",JOptionPane.INFORMATION_MESSAGE);
       }
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        sql.tableGetir(hasta_bilgi,jTable1);
        setMenuItemEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       int row = jTable1.getSelectedRow();
       tc1.setText(jTable1.getValueAt(row,0).toString());
       ad1.setText(jTable1.getValueAt(row,1).toString());
       soyad1.setText(jTable1.getValueAt(row,2).toString());
       setComboBoxItemIndex(jTable1.getValueAt(row,3).toString(),jComboBox4);
       setComboBoxItemIndex(jTable1.getValueAt(row,4).toString(),jComboBox5);
       setComboBoxItemIndex(jTable1.getValueAt(row,5).toString(),jComboBox6);
       jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int row = jTable1.getSelectedRow();
        int tc = Integer.parseInt(jTable1.getValueAt(row,0).toString());
        sql.kayitSil(tc);
        sql.tableGetir(hasta_bilgi,jTable1);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(jRadioButton1.isSelected())
        {
            sql.tableGetir("SELECT * FROM hasta_bilgi WHERE hastaAdi = '" + jTextField1.getText()+"'",jTable1);
        }
        if(jRadioButton2.isSelected())
        {
            sql.tableGetir("SELECT * FROM hasta_bilgi WHERE hastaSoyadi = '" + jTextField1.getText()+"'",jTable1);
        }
        if(jRadioButton3.isSelected())
        {
            sql.tableGetir("SELECT * FROM hasta_bilgi WHERE tcno = " + jTextField1.getText(),jTable1);//WHERE tcno = '" + jTextField1.getText()+"'",jTable1);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       String strTc = JOptionPane.showInputDialog("Yeni TC Giriniz");
       String eskiTc = tc1.getText();
       if(strTc == null) return;
       if(strTc.length()!=11){
           JOptionPane.showMessageDialog(null, "TC No 11 haneli olmalidir!","Hata",JOptionPane.ERROR_MESSAGE); 
           return;
       }else{
           long yenitc = Long.parseLong(strTc);
           long eskitc = Long.parseLong(eskiTc);
           boolean sonuc =sql.tcGuncelle(yenitc,eskitc);
           
           if(sonuc == true){
               JOptionPane.showMessageDialog(null, "Guncelleme Basarili ","Bilgi",JOptionPane.INFORMATION_MESSAGE); 
               tc1.setText(strTc);
               sql.tableGetir(hasta_bilgi,jTable1);
           }
           else{
               JOptionPane.showMessageDialog(null, "Guncelleme Basarisiz ","Bilgi",JOptionPane.INFORMATION_MESSAGE);
           }
       }
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        tahlilFrame t = new tahlilFrame();
        int row = jTable1.getSelectedRow();
        t.setTc(jTable1.getValueAt(row,0).toString());
        t.setTitle(jTable1.getValueAt(row,1).toString()+ " " + jTable1.getValueAt(row,2).toString());
        t.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        String ilkTarih = JOptionPane.showInputDialog("Ilk Tarihi Giriniz.Ornek = 2014-05-30");
        if(ilkTarih == null) return;
        String ikinciTarih = JOptionPane.showInputDialog("Ikinci Tarihi Giriniz.Ornek = 2014-05-30");
        if(ikinciTarih == null) return;
        int row = jTable1.getSelectedRow();    
        sql.tableGetir("SELECT tahlilTarihi as TahlilTarihi,tahlilKodu as TahlilKodu,tahlilFiyati as TahlilFiyati FROM tahliller WHERE tcno = " + jTable1.getValueAt(row,0).toString()+ " and (tahlilTarihi > '"+ilkTarih+"' and tahlilTarihi < '"+ikinciTarih+"')", jTable1);
        setMenuItemEnabled(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        String ilkTarih = JOptionPane.showInputDialog("Ilk Tarihi Giriniz.Ornek = 2014-05-30");
        if(ilkTarih == null) return;
        String ikinciTarih = JOptionPane.showInputDialog("Ikinci Tarihi Giriniz.Ornek = 2014-05-30");
        if(ikinciTarih == null) return;
        String sqlSorgu = "SELECT concat(hb.hastaAdi,\" \",hb.hastaSoyadi) as AdSoyad,hb.tcno as HastaTCNo,hb.kurumu as Kurumu,sum(t.tahlilFiyati) as ToplamFiyat\n" +
                          "FROM tahliller t inner join hasta_bilgi hb on\n" +
                          "t.tcno = hb.tcno where t.tahlilTarihi > '"+ilkTarih+"' and t.tahlilTarihi < '"+ikinciTarih+"'\n" +
                          "group by t.tcno";
        sql.tableGetir(sqlSorgu, jTable1);
        setMenuItemEnabled(false);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        String sqlSorgu = "SELECT t.tahlilTarihi as TahlilTarihi,concat(hb.hastaAdi,\" \",hb.hastaSoyadi) as HastaAdSoyad,hb.tcno as HastaTCNo,t.tahlilKodu as TahlilKod\n" +
                          "FROM tahliller t inner join hasta_bilgi hb on "+ 
                          "t.tcno = hb.tcno order by t.tahlilTarihi";
        sql.tableGetir(sqlSorgu, jTable1);
        setMenuItemEnabled(false);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        String ilkTarih = JOptionPane.showInputDialog("Ilk Tarihi Giriniz.Ornek = 2014-05-30");
        if(ilkTarih == null) return;
        String ikinciTarih = JOptionPane.showInputDialog("Ikinci Tarihi Giriniz.Ornek = 2014-05-30");
        if(ikinciTarih == null) return;
        String sqlSorgu = "SELECT hb.kurumu as Kurumu,count(*) as TahlilAdedi,sum(t.tahlilFiyati) as TahlilFiyatToplami\n" +
                          "FROM hasta_bilgi hb inner join tahliller t on t.tcno = hb.tcno where t.tahlilTarihi > '"+ilkTarih+"' and t.tahlilTarihi < '"+ikinciTarih+"' group by hb.kurumu";
        sql.tableGetir(sqlSorgu, jTable1);
       setMenuItemEnabled(false);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hastaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        //</editor-fold>

            try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());// tasarimdaki stil
    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
        
    } 
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new hastaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad;
    private javax.swing.JTextField ad1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField soyad;
    private javax.swing.JTextField soyad1;
    private javax.swing.JTextField tc;
    private javax.swing.JTextField tc1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

package MyCurrencyConverter;

import javax.swing.JOptionPane;

import javax.swing.JFrame;



public class MyCurrencyConverter extends JFrame {

String[] currencyUnits = {          //for units
"units",
"Afghani",
"Argentine Peso",
"Australian Dollar",
"Taka",
"Brazilian Real",
"Yuen Renminbi",
"Canadian Dollar",
"Egyptian Pound",
"Finlandian Euro",
"Forint",
"Irelandian Euro",
"Iranian Rial",
"Italian Euro",
"Indonesian Rupiah",
"Indian Rupee",
"Yen",
"Kuwaiti Dinar",
"Kenyan Shilling",
"Libyan Dinar",
"Malaysian Ringgit",
"Moroccan Dirham",
"Nepalese Rupee",
"Netherlandian Euro",
"New Zealand Dollar",
"Norwegian Krone",
"Nigerian Naira",
"Rial Omani",
"Philippine Pisco",
"Pakistani Rupee",
"Qatari Rial",
"Russian Ruble",
"Saudi Real",
"Serbian Dinar",
"Rand",
"Sri Lanka Rupee",
"Swiss Franc",
"Swedish Krona",
"Turkish Lira",
"UAE Dirham",
"Us Dollar",
"Pound Sterling",
"Dong",
"Zimbabwe Dollar",
};
    
double Taka = 137.28;          //for converting into pounds
double Us_Dollar = 1.31;
double Nigerian_Naira = 476.57;
double Brazilian_Real = 5.47;
double Canadian_Dollar = 1.71;
double Kenyan_Shilling = 132.53;
double Indonesian_Rupiah = 19554.94;
double Indian_Rupee = 95.21;
double Philippine_Pisco= 71.17;
double Pakistani_Rupee = 162.74;
double Afghani = 85.61;
double Argentine_Peso = 438.20;
double Australian_Dollar = 1.91;
double Yuen_Renminbi = 8.98;
double Egyptian_Pound = 38.34;
double Finlandian_Euro = 1.14;
double Forint = 432.73;
double Irelandian_Euro = 1.14;
double Iranian_Rial = 52646.35;
double Italian_Euro = 1.14;
double Yen = 186.79;
double Kuwaiti_Dinar = 0.38;
double Libyan_Dinar = 6.01;
double Malaysian_Ringgit = 5.82;
double Moroccan_Dirham = 12.57;
double Nepalese_Rupee = 165.14;
double Netherlandian_Euro = 1.14;
double New_Zealand_Dollar = 2.08;
double Norwegian_Krone = 13.45;
double Rial_Omani = 0.48;
double Qatari_Rial = 4.54;
double Russian_Ruble = 111.30;
double Saudi_Real = 4.67;
double Serbian_Dinar = 133.70;
double Rand = 22.85;
double Sri_Lanka_Rupee = 406.63;
double Swiss_Franc = 1.10;
double Swedish_Krona = 13.20;
double Turkish_Lira = 35.73;
double UAE_Dirham = 4.58;
double Pound_Sterling = 1.00;
double Dong = 30226.89;
double Zimbabwe_Dollar = 1.31;



   
    public MyCurrencyConverter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        secondCountry = new javax.swing.JComboBox<>();
        firstCountry = new javax.swing.JComboBox<>();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstCurrencyUnit = new javax.swing.JLabel();
        secondCurrencyUnit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jLabel2.setBackground(new java.awt.Color(102, 255, 204));
        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Currency Converter");
        jLabel2.setMaximumSize(new java.awt.Dimension(480, 59));
        jLabel2.setPreferredSize(new java.awt.Dimension(480, 59));

        secondCountry.setBackground(new java.awt.Color(204, 204, 255));
        secondCountry.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        secondCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "Afganistan", "Argentina", "Australia", "Bangladesh", "Brazil", "China", "Canada", "Egypt", "Finland", "Hungary", "Ireland", "Iran", "Italy", "Indonesia", "India", "Japan", "Kuwait", "Kenyan", "Libya", "Malaysia", "Morocco", "Nepal", "Netherlands", "New Zealand", "Norway", "Nigeria", "Oman", "Philippine", "Pakistan", "Qatar", "Russsian Federation", "Saudi Arabia", "Serbia", "South Africa", "Sri Lanka", "Switzerland", "Sweden", "Turkey", "United Arab Emirates", "USA", "United Kingdom", "Viet Nam", "Zimbabwe" }));
        secondCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondCountryItemStateChanged(evt);
            }
        });
        secondCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondCountryActionPerformed(evt);
            }
        });

        firstCountry.setBackground(new java.awt.Color(204, 204, 255));
        firstCountry.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        firstCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "Afganistan", "Argentina", "Australia", "Bangladesh", "Brazil", "China", "Canada", "Egypt", "Finland", "Hungary", "Ireland", "Iran", "Italy", "Indonesia", "India", "Japan", "Kuwait", "Kenyan", "Libya", "Malaysia", "Morocco", "Nepal", "Netherlands", "New Zealand", "Norway", "Nigeria", "Oman", "Philippine", "Pakistan", "Qatar", "Russsian Federation", "Saudi Arabia", "Serbia", "South Africa", "Sri Lanka", "Switzerland", "Sweden", "Turkey", "United Arab Emirates", "USA", "United Kingdom", "Viet Nam", "Zimbabwe" }));
        firstCountry.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0)));
        firstCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstCountryItemStateChanged(evt);
            }
        });
        firstCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstCountryActionPerformed(evt);
            }
        });

        t2.setBackground(new java.awt.Color(204, 204, 255));
        t2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t1.setBackground(new java.awt.Color(204, 204, 255));
        t1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("To Currency Of");

        firstCurrencyUnit.setBackground(new java.awt.Color(255, 255, 255));
        firstCurrencyUnit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstCurrencyUnit.setForeground(new java.awt.Color(204, 204, 0));
        firstCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstCurrencyUnit.setText("units");

        secondCurrencyUnit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        secondCurrencyUnit.setForeground(new java.awt.Color(204, 204, 0));
        secondCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondCurrencyUnit.setText("units");

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 0));
        jLabel6.setText("From Currency Of");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstCountry, 0, 313, Short.MAX_VALUE)
                    .addComponent(t1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t2)
                    .addComponent(secondCountry, 0, 313, Short.MAX_VALUE)
                    .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(210, 210, 210)
                .addComponent(jButton3)
                .addGap(155, 155, 155))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void secondCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondCountryActionPerformed
      
    }//GEN-LAST:event_secondCountryActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        System.exit(0);  //exit/terminates the jvm/currently running program

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        firstCountry.setSelectedIndex(0);
        secondCountry.setSelectedIndex(0); //reset
        t1.setText(null);
        t2.setText(null);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstCountryItemStateChanged
       
       int position = firstCountry.getSelectedIndex();
        
        firstCurrencyUnit.setText(currencyUnits[position]);   //From country unit
        
        
        
    }//GEN-LAST:event_firstCountryItemStateChanged

    private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secondCountryItemStateChanged
        
         int position = secondCountry.getSelectedIndex();
        
       secondCurrencyUnit.setText(currencyUnits[position]);    //To country unit
        
    }//GEN-LAST:event_secondCountryItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        //convert currency 
        
        if(firstCountry.getSelectedIndex()==0 || secondCountry.getSelectedIndex()==0 || t1.getText().equals("")){
            
           JOptionPane.showMessageDialog(null,
                    "You must select 'both countries' and must input the 'amount'","Error Message",
            
                    JOptionPane.INFORMATION_MESSAGE
            
            );
                    return;
        }
        
        double amountToChange = Double.parseDouble(t1.getText());
        
        double amountInPounds = 0.0;
        
        double amountChanged = 0.0;
        
        switch(firstCountry.getSelectedItem().toString())
        
        {
            
            case "Bangladesh": amountInPounds = amountToChange / Taka;break;
            case "USA": amountInPounds = amountToChange / Us_Dollar;break;
            case "Nigeria": amountInPounds = amountToChange / Nigerian_Naira;break;
            case "Brazil": amountInPounds = amountToChange / Brazilian_Real;break;
            case "Canada": amountInPounds = amountToChange / Canadian_Dollar;break;
            case "Kenyan": amountInPounds = amountToChange / Kenyan_Shilling;break;
            case "Indonesia": amountInPounds = amountToChange / Indonesian_Rupiah;break;
            case "India": amountInPounds = amountToChange / Indian_Rupee;break;
            case "Philippine": amountInPounds = amountToChange /Philippine_Pisco;break;
            case "Pakistan": amountInPounds = amountToChange / Pakistani_Rupee;break;
            case "Afganistan": amountInPounds = amountToChange / Afghani;break;
            case "Argentina": amountInPounds = amountToChange / Argentine_Peso;break;
            case "Australia": amountInPounds = amountToChange / Australian_Dollar;break;
            case "China": amountInPounds = amountToChange / Yuen_Renminbi;break;
            case "Egypt": amountInPounds = amountToChange / Egyptian_Pound;break;
            case "Finland": amountInPounds = amountToChange / Finlandian_Euro;break;
            case "Hungary": amountInPounds = amountToChange / Forint;break;
            case "Ireland": amountInPounds = amountToChange / Irelandian_Euro;break;
            case "Iran": amountInPounds = amountToChange / Iranian_Rial;break;
            case "Italy": amountInPounds = amountToChange / Italian_Euro;break;
            case "Japan": amountInPounds = amountToChange / Yen;break;
            case "Kuwait": amountInPounds = amountToChange / Kuwaiti_Dinar;break;
            case "Libya": amountInPounds = amountToChange / Libyan_Dinar;break;
            case "Malaysia": amountInPounds = amountToChange / Malaysian_Ringgit;break;
            case "Morocco": amountInPounds = amountToChange / Moroccan_Dirham;break;
            case "Nepal": amountInPounds = amountToChange / Nepalese_Rupee;break;
            case "Netherlands": amountInPounds = amountToChange / Netherlandian_Euro;break;
            case "New Zealand": amountInPounds = amountToChange / New_Zealand_Dollar;break;
            case "Norway": amountInPounds = amountToChange / Norwegian_Krone;break;
            case "Oman": amountInPounds = amountToChange / Rial_Omani;break;
            case "Qatar": amountInPounds = amountToChange / Qatari_Rial;break;
            case "Russsian Federation": amountInPounds = amountToChange / Russian_Ruble;break;
            case "saudi Arabia": amountInPounds = amountToChange / Saudi_Real;break;
            case "Serbia": amountInPounds = amountToChange / Serbian_Dinar ;break;
            case "South Africa": amountInPounds = amountToChange / Rand;break;
            case "Sri Lanka": amountInPounds = amountToChange / Sri_Lanka_Rupee;break;
            case "Switzerland": amountInPounds = amountToChange / Swiss_Franc;break;
            case "Sweden": amountInPounds = amountToChange / Swedish_Krona;break;
            case "Turkey": amountInPounds = amountToChange / Turkish_Lira;break;
            case "United Arab Emirates": amountInPounds = amountToChange / UAE_Dirham;break;
            case "United Kingdom": amountInPounds = amountToChange / Pound_Sterling;break;
            case "Viet Nam": amountInPounds = amountToChange / Dong;break;
            case "Zimbabwe": amountInPounds = amountToChange / Zimbabwe_Dollar;break;
           
            default: amountInPounds = 0.0;
            
            
            
        }
       
        switch(secondCountry.getSelectedItem().toString())
        {
            
            case "Bangladesh": amountChanged = amountInPounds * Taka;break;
            case "USA": amountChanged = amountInPounds * Us_Dollar;break;
            case "Nigeria": amountChanged = amountInPounds * Nigerian_Naira;break;
            case "Brazil": amountChanged = amountInPounds * Brazilian_Real;break;
            case "Canada": amountChanged = amountInPounds * Canadian_Dollar;break;
            case "Kenyan": amountChanged = amountInPounds * Kenyan_Shilling;break;
            case "Indonesia": amountChanged = amountInPounds * Indonesian_Rupiah;break;
            case "India": amountChanged = amountInPounds * Indian_Rupee;break;
            case "Philippine": amountChanged = amountInPounds * Philippine_Pisco;break;
            case "Pakistan": amountChanged = amountInPounds * Pakistani_Rupee;break;
            case "Afganistan": amountChanged = amountInPounds * Afghani;break;
            case "Argentina": amountChanged = amountInPounds * Argentine_Peso;break;
            case "Australia": amountChanged = amountInPounds * Australian_Dollar;break;
            case "China": amountChanged = amountInPounds * Yuen_Renminbi;break;
            case "Egypt": amountChanged = amountInPounds * Egyptian_Pound;break;
            case "Finland": amountChanged = amountInPounds * Finlandian_Euro;break;
            case "Hungary": amountChanged = amountInPounds * Forint;break;
            case "Ireland": amountChanged = amountInPounds * Irelandian_Euro;break;
            case "Iran": amountChanged = amountInPounds * Iranian_Rial;break;
            case "Italy": amountChanged = amountInPounds * Italian_Euro;break;
            case "Japan": amountChanged = amountInPounds * Yen;break;
            case "Kuwait": amountChanged = amountInPounds * Kuwaiti_Dinar;break;
            case "Libya": amountChanged = amountInPounds * Libyan_Dinar ;break;
            case "Malaysia": amountChanged = amountInPounds * Malaysian_Ringgit;break;
            case "Morocco": amountChanged = amountInPounds * Moroccan_Dirham ;break;
            case "Nepal": amountChanged = amountInPounds * Nepalese_Rupee;break;
            case "Netherlands": amountChanged = amountInPounds * Netherlandian_Euro;break;
            case "New Zealand": amountChanged = amountInPounds * New_Zealand_Dollar;break;
            case "Norway": amountChanged = amountInPounds * Norwegian_Krone;break;
            case "Oman": amountChanged = amountInPounds * Rial_Omani;break;
            case "Qatar": amountChanged = amountInPounds * Qatari_Rial;break;
            case "Russsian Federation": amountChanged = amountInPounds * Russian_Ruble;break;
            case "saudi Arabia": amountChanged = amountInPounds * Saudi_Real;break;
            case "Serbia": amountChanged = amountInPounds * Serbian_Dinar;break;
            case "South Africa": amountChanged = amountInPounds * Rand;break;
            case "Sri Lanka": amountChanged = amountInPounds * Sri_Lanka_Rupee;break;
            case "Switzerland": amountChanged = amountInPounds * Swiss_Franc;break;
            case "Sweden": amountChanged = amountInPounds * Swedish_Krona;break;
            case "Turkey": amountChanged = amountInPounds * Turkish_Lira;break;
            case "United Arab Emirates": amountChanged = amountInPounds * UAE_Dirham;break;
            case "United Kingdom": amountChanged = amountInPounds * Pound_Sterling;break;
            case "Viet Nam": amountChanged = amountInPounds * Dong;break;
            case "Zimbabwe": amountChanged = amountInPounds * Zimbabwe_Dollar;break;
            default: amountChanged = amountInPounds * 0.0;
        }
        
        String value = String.format("%.2f", amountChanged);
        t2.setText(value);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void firstCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstCountryActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

   
    
    public static void main(String args[]) {
     
       
        java.awt.EventQueue.invokeLater(() -> {
            new MyCurrencyConverter().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> firstCountry;
    private javax.swing.JLabel firstCurrencyUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> secondCountry;
    private javax.swing.JLabel secondCurrencyUnit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}

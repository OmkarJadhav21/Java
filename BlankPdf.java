1import com.itextpdf.text.*;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BlankPdf implements ActionListener {

    JFrame frame;
    JLabel lab_name,lab_company,lab_pin;
    JTextField tf_name,tf_company,tf_pin;
    JButton btn_submit,btn_clear;
    String name,company,pin;

    public BlankPdf(){
        frame=new JFrame("Form");

        lab_name=new JLabel("Enter Name:");
        lab_company=new JLabel("Company Name:");
        lab_pin=new JLabel("Pincode:");


        tf_name=new JTextField();
        tf_company=new JTextField();
        tf_pin=new JTextField();


        btn_submit=new JButton("Submit");
        btn_clear=new JButton("Clear");

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn_submit.addActionListener(this);


        lab_name.setBounds(10, 10, 170, 20);
        lab_company.setBounds(10, 30, 170, 20);
        lab_pin.setBounds(10, 50, 170, 20);



        tf_name.setBounds(170, 10, 300, 20);
        tf_company.setBounds(170, 30, 300, 20);
        tf_pin.setBounds(170, 50, 300, 20);

        btn_submit.setBounds(140, 220, 100, 20);
        btn_clear.setBounds(250, 220, 100, 20);

        frame.add(lab_name);
        frame.add(lab_company);
        frame.add(lab_pin);


        frame.add(tf_name);
        frame.add(tf_company);
        frame.add(tf_pin);


        frame.add(btn_submit);
        frame.add(btn_clear);

        frame.setSize(500, 300);
        frame.setVisible(true);


    }
void Getdata(){
        name=tf_name.getText();
        company=tf_company.getText();
        pin=tf_pin.getText();

        JOptionPane.showMessageDialog(null,"Data Printed Successfully");

//    int qty_convert=Integer.parseInt(qty);
//    amt_convert=Integer.toString(amount);
}

void GeneratePdf(){
    Font blueFont = FontFactory.getFont(FontFactory.COURIER, 24, Font.BOLD, new CMYKColor(0, 0, 0, 255));
    Font bold_small = FontFactory.getFont(FontFactory.COURIER, 13, Font.BOLD, new CMYKColor(0, 0, 0, 255));
    Font vsmall = FontFactory.getFont(FontFactory.COURIER, 12, Font.NORMAL, new CMYKColor(0, 0, 0, 255));
    Font red= FontFactory.getFont(FontFactory.COURIER, 8, Font.BOLD, new CMYKColor(0, 255, 0, 0));

    Document document=new Document();

    try {
        PdfWriter writer=PdfWriter.getInstance(document,new FileOutputStream("Bill.pdf"));
        document.open();
        document.add(new Paragraph("Xtantransh PVT LTd.",blueFont));
        document.add(new Paragraph("Address:",bold_small));
        document.add(new Paragraph("Pune"));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("Your Billing Address is",bold_small));
        document.add(new Paragraph(name,vsmall));
        document.add(new Paragraph(company,vsmall));
        document.add(new Paragraph(pin,vsmall));

        document.close();
        writer.close();
    } catch (DocumentException e) {
        e.printStackTrace();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

}
void Insertdata() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Billing","root","") ;
    Statement st=con.createStatement();
    
}



    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Getdata();
        GeneratePdf();
        try {
            Insertdata();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        validateForm();
//       if(validateForm()){
//
//       }
//        getUserData();
//        try {
//            gereratePdf();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        }

    }

    public static void main(String[] args) {
        BlankPdf bp=new BlankPdf();
    }


}


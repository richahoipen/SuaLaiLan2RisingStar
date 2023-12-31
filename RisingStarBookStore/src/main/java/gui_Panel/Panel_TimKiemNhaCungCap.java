package gui_Panel;

import com.raven.swing.icon.GoogleMaterialDesignIcons;
import com.raven.swing.icon.IconFontSwing;
import com.toedter.calendar.JDateChooser;

import customEntities.Custom_Button;
import customEntities.Custom_ColorPicker;
import customEntities.Custom_ComboBox;
import customEntities.Custom_Function;
import customEntities.Custom_ImageIcon;
import customEntities.Custom_JLabel;
import customEntities.Custom_Table;
import dataBase_DAO.DataBase_NhaCungCap;
import entities.NhaCungCap;
import gui_Dialog.Message;
import gui_Frame_Running.Frame_Chinh;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.GridLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class Panel_TimKiemNhaCungCap extends JPanel implements ActionListener, MouseListener
{
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JPanel pn_TK_NCC,pn_Table_DSNV;
	private Custom_JLabel picture_Logo;
	private JLabel lbl_Title_TK_NCC,lbl_Title_DSNCC;
	private JLabel lbl_MaNCC,lbl_TenNCC,lbl_Email,lbl_DiaChi,lbl_SoDienThoai;
	private Custom_ComboBox cbo_MaNCC,cbo_HoTen,cbo_DiaChi,cbo_Email,cbo_SoDienThoai;
	private JFormattedTextField ftf_NgaySinh;
	private BufferedImage bfi_ChonNgay;
	private Custom_Button btn_TimKiem,btn_XoaTrang;
	private JScrollPane scr_DSNV;
	private Custom_Table tbl_DSNCC;
	private DefaultTableModel dtm_NCC;
	private DataBase_NhaCungCap sqlNhaCungCap=new DataBase_NhaCungCap();
    // End of variables declaration//GEN-END:variables
    public Panel_TimKiemNhaCungCap() {
        initComponents();
        setOpaque(false);
    }



    private void showMessage(String message) {
        Message obj = new Message(Frame_Chinh.getFrames()[0], true);
        obj.showMessage(message);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	lbl_Title_TK_NCC = new JLabel("Tìm kiếm nhà cung cấp");
    	lbl_Title_TK_NCC.setVerticalAlignment(SwingConstants.TOP);
		lbl_Title_TK_NCC.setForeground(new Color(0, 0, 255));
		lbl_Title_TK_NCC.setFont(new Font("SansSerif", Font.BOLD, 12));
		lbl_Title_TK_NCC.setBounds(30,100,2500,50);
		
    	pn_TK_NCC = new JPanel();
		pn_TK_NCC.setIgnoreRepaint(true);
		pn_TK_NCC.setBackground(Color.white);
		pn_TK_NCC.setBorder(new LineBorder(Custom_ColorPicker.lightgrey_D9D9D9, 3));
		
		lbl_MaNCC = new JLabel("Mã nhà cung cấp:");
		lbl_MaNCC.setForeground(Color.black);
		lbl_MaNCC.setFont(new Font("Inter", Font.PLAIN, 14));
		
		lbl_TenNCC = new JLabel("Tên nhà cung cấp:");
		lbl_TenNCC.setForeground(Color.black);
		lbl_TenNCC.setFont(new Font("Inter", Font.PLAIN, 14));
		
		lbl_Email = new JLabel("Email:");
		lbl_Email.setForeground(Color.black);
		lbl_Email.setFont(new Font("Inter", Font.PLAIN, 14));

		lbl_DiaChi = new JLabel("Địa chỉ:");
		lbl_DiaChi.setForeground(Color.black);
		lbl_DiaChi.setFont(new Font("Inter", Font.PLAIN, 14));
		
		lbl_SoDienThoai = new JLabel("Số điện thoại:");
		lbl_SoDienThoai.setForeground(Color.black);
		lbl_SoDienThoai.setFont(new Font("Inter", Font.PLAIN, 14));
		
		cbo_MaNCC = new Custom_ComboBox();
		cbo_MaNCC.setForeground(Color.black);
		cbo_MaNCC.setBackground(Custom_ColorPicker.lightgrey_D9D9D9);
		cbo_MaNCC.setOpaque(true);
		cbo_MaNCC.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		cbo_HoTen = new Custom_ComboBox();
		cbo_HoTen.setForeground(Color.black);
		cbo_HoTen.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		cbo_Email = new Custom_ComboBox();
		cbo_Email.setForeground(Color.black);
		cbo_Email.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		cbo_SoDienThoai = new Custom_ComboBox();
		cbo_SoDienThoai.setForeground(Color.black);
		cbo_SoDienThoai.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		cbo_DiaChi = new Custom_ComboBox();
		cbo_DiaChi.setForeground(Color.black);
		cbo_DiaChi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		lbl_Title_DSNCC = new JLabel("Danh sách nhà cung cấp");
		lbl_Title_DSNCC.setForeground(Color.BLUE);
		lbl_Title_DSNCC.setFont(new Font("SansSerif", Font.BOLD, 12));
		
		dtm_NCC = new DefaultTableModel(new String[] {"Mã nhà cung cấp","Tên nhà cung cấp","Số điện thoại","Email","Địa chỉ"},0);
		
		tbl_DSNCC = new Custom_Table(dtm_NCC);
		tbl_DSNCC.setColor_StripeBackground(Custom_ColorPicker.lightgrey_D9D9D9);
		tbl_DSNCC.setColor_Header_Foreground(Color.BLACK);
		//tbl_DSNV.setFont(new Font("Times New Roman", Font.PLAIN, 5));
		tbl_DSNCC.setColor_Header_Background(Custom_ColorPicker.lightgrey_D9D9D9);
		tbl_DSNCC.setColor_Border(Custom_ColorPicker.lightgrey_D9D9D9);
		tbl_DSNCC.align(3,new int[] {6,8,9,10,11});
		tbl_DSNCC.redrawn_Custom_Table();
		JScrollPane scr_DSNV = new JScrollPane(tbl_DSNCC);
		
		btn_TimKiem = new Custom_Button();
		btn_TimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_TimKiem.setText("Tìm kiếm");
		btn_TimKiem.setFont(new Font("Inner", Font.BOLD, 12));
		btn_TimKiem.setBuffered_Icon("src/main/images/view_image/Search.png");
		btn_TimKiem.resizeIcon(14, 14);
		btn_TimKiem.setOver(true);
		btn_TimKiem.setColor_Foreground(Color.black);
		btn_TimKiem.setColor_Hightlight(Custom_ColorPicker.snowwhite_F2F0EB);
		btn_TimKiem.setColor_Background(Custom_ColorPicker.snowwhite_F2F0EB);
		btn_TimKiem.setColor_Over(Custom_ColorPicker.lightgrey_D9D9D9);
		btn_TimKiem.setColor_Click(Color.black);
		btn_TimKiem.setColor_Clicked_Background(Custom_ColorPicker.lime_BFFF00);
		
		btn_XoaTrang = new Custom_Button();
		btn_XoaTrang.setText("Xóa trắng");
		btn_XoaTrang.setFont(new Font("Inner", Font.BOLD, 12));
		btn_XoaTrang.setBuffered_Icon("src/main/images/view_image/Refresh.png");
		btn_XoaTrang.resizeIcon(14, 14);
		btn_XoaTrang.setOver(true);
		btn_XoaTrang.setColor_Foreground(Color.black);
		btn_XoaTrang.setColor_Hightlight(Custom_ColorPicker.snowwhite_F2F0EB);
		btn_XoaTrang.setColor_Background(Custom_ColorPicker.snowwhite_F2F0EB);
		btn_XoaTrang.setColor_Over(Custom_ColorPicker.lightgrey_D9D9D9);
		btn_XoaTrang.setColor_Click(Color.black);
		btn_XoaTrang.setColor_Clicked_Background(Custom_ColorPicker.lime_BFFF00);
		
		GroupLayout layout = new GroupLayout(this);
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addGap(1)
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(pn_TK_NCC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lbl_Title_TK_NCC))
								.addComponent(scr_DSNV, GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)))
						.addComponent(lbl_Title_DSNCC))
					.addContainerGap())
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addComponent(lbl_Title_TK_NCC)
					.addGap(1)
					.addComponent(pn_TK_NCC, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbl_Title_DSNCC)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scr_DSNV, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
					.addGap(0))
		);
        this.setLayout(layout);
        
        GroupLayout gl_pn_TK_NCC = new GroupLayout(pn_TK_NCC);
        gl_pn_TK_NCC.setHorizontalGroup(
        	gl_pn_TK_NCC.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pn_TK_NCC.createSequentialGroup()
        			.addGap(59)
        			.addGroup(gl_pn_TK_NCC.createParallelGroup(Alignment.LEADING)
        				.addComponent(lbl_MaNCC)
        				.addComponent(lbl_TenNCC, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_pn_TK_NCC.createParallelGroup(Alignment.LEADING)
        				.addComponent(cbo_MaNCC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(cbo_HoTen, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_pn_TK_NCC.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(lbl_Email)
        				.addComponent(lbl_DiaChi))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_pn_TK_NCC.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_pn_TK_NCC.createSequentialGroup()
        					.addComponent(cbo_Email, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        					.addGroup(gl_pn_TK_NCC.createParallelGroup(Alignment.TRAILING)
        						.addGroup(gl_pn_TK_NCC.createSequentialGroup()
        							.addGap(11)
        							.addComponent(lbl_SoDienThoai, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
        							.addComponent(cbo_SoDienThoai, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        						.addGroup(gl_pn_TK_NCC.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(btn_XoaTrang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(btn_TimKiem, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))))
        				.addComponent(cbo_DiaChi, GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
        			.addGap(62))
        );
        gl_pn_TK_NCC.setVerticalGroup(
        	gl_pn_TK_NCC.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pn_TK_NCC.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_pn_TK_NCC.createParallelGroup(Alignment.LEADING)
        				.addComponent(cbo_MaNCC, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbl_MaNCC)
        				.addComponent(cbo_SoDienThoai, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbl_SoDienThoai, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        				.addComponent(cbo_Email, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbl_Email, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
        			.addGap(7)
        			.addGroup(gl_pn_TK_NCC.createParallelGroup(Alignment.LEADING)
        				.addComponent(lbl_TenNCC)
        				.addComponent(cbo_HoTen, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbl_DiaChi)
        				.addComponent(cbo_DiaChi, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_pn_TK_NCC.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btn_TimKiem, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btn_XoaTrang, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gl_pn_TK_NCC.linkSize(SwingConstants.VERTICAL, new Component[] {cbo_MaNCC, cbo_HoTen, cbo_Email, cbo_SoDienThoai, cbo_DiaChi});
        gl_pn_TK_NCC.linkSize(SwingConstants.VERTICAL, new Component[] {lbl_Email, lbl_DiaChi, lbl_SoDienThoai});
        gl_pn_TK_NCC.linkSize(SwingConstants.VERTICAL, new Component[] {btn_TimKiem, btn_XoaTrang});
        gl_pn_TK_NCC.linkSize(SwingConstants.HORIZONTAL, new Component[] {lbl_Email, lbl_DiaChi, lbl_SoDienThoai});
        gl_pn_TK_NCC.linkSize(SwingConstants.HORIZONTAL, new Component[] {btn_TimKiem, btn_XoaTrang});
        pn_TK_NCC.setLayout(gl_pn_TK_NCC);
        addAction();
        addDataComboBox();
       
    }
    private void addAction()
    {
    	btn_XoaTrang.addActionListener(this);
    	btn_TimKiem.addActionListener(this);
    	sqlNhaCungCap.xuatDanhSachNhaCungCap(dtm_NCC);
    	//đẩy lên combobox
    	cbo_MaNCC.addActionListener(this);
    	cbo_HoTen.addActionListener(this);
    	cbo_DiaChi.addActionListener(this);
    	cbo_Email.addActionListener(this);
    	cbo_SoDienThoai.addActionListener(this);
    	tbl_DSNCC.addMouseListener(this);
    	
    }
    private void addDataComboBox()
    {
    	cbo_MaNCC.addItem("Chọn");
    	sqlNhaCungCap.dayComboBoxMaNCC(cbo_MaNCC);
    	cbo_DiaChi.addItem("Chọn");
    	sqlNhaCungCap.dayComboBoxDiaChi(cbo_DiaChi);
    	cbo_HoTen.addItem("Chọn");
    	sqlNhaCungCap.dayComboBoxTenNCC(cbo_HoTen);
    	cbo_SoDienThoai.addItem("Chọn");
    	sqlNhaCungCap.dayComboBoxSoDienThoai(cbo_SoDienThoai);
    	cbo_Email.addItem("Chọn");
    	sqlNhaCungCap.dayComboBoxEmail(cbo_Email);
    }
    /*
     * int row=tbl_DSKH.getSelectedRow();
		String maKH=tbl_DSKH.getValueAt(row, 0).toString();
		String tenKH=tbl_DSKH.getValueAt(row, 1).toString();
		String sdt=tbl_DSKH.getValueAt(row, 2).toString();
		String gioiTinh=tbl_DSKH.getValueAt(row, 3).toString();
		String diaChi=tbl_DSKH.getValueAt(row, 4).toString();	
		cbo_MaKH.setSelectedItem(maKH);
		cbo_HoTen.setSelectedItem(tenKH);
		cbo_GioiTinh.setSelectedItem(gioiTinh);
		cbo_DiaChi.setSelectedItem(diaChi);
		cbo_SoDienThoai.setSelectedItem(sdt);
     */

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int row=tbl_DSNCC.getSelectedRow();
		String maNCC=tbl_DSNCC.getValueAt(row, 0).toString();
		String tenNCC=tbl_DSNCC.getValueAt(row, 1).toString();
		String soDienThoai=tbl_DSNCC.getValueAt(row, 2).toString();
		String email=tbl_DSNCC.getValueAt(row, 3).toString();
		String diaChi=tbl_DSNCC.getValueAt(row, 4).toString();
		cbo_MaNCC.setSelectedItem(maNCC);
		cbo_HoTen.setSelectedItem(tenNCC);
		cbo_SoDienThoai.setSelectedItem(soDienThoai);
		cbo_DiaChi.setSelectedItem(diaChi);
		cbo_Email.setSelectedItem(email);
	}
	private void timKiem()
	{
		String maNCC=(String) cbo_MaNCC.getSelectedItem();
		String tenNCC=(String) cbo_HoTen.getSelectedItem();
		String soDienThoai=(String) cbo_SoDienThoai.getSelectedItem();
		String email=(String) cbo_Email.getSelectedItem();
		String diaChi=(String) cbo_DiaChi.getSelectedItem();
		if(maNCC.equalsIgnoreCase("Chọn")&&
				tenNCC.equalsIgnoreCase("Chọn")&&
				soDienThoai.equalsIgnoreCase("Chọn")&&
				email.equalsIgnoreCase("Chọn")&&diaChi.equalsIgnoreCase("Chọn"))
					
		{
			UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 25));
	        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 25));
			JOptionPane.showMessageDialog(null, "Vui lòng chọn thông tin để tìm kiếm.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		}
		if(!maNCC.equalsIgnoreCase("Chọn")&&
				tenNCC.equalsIgnoreCase("Chọn")&&
				soDienThoai.equalsIgnoreCase("Chọn")&&
				email.equalsIgnoreCase("Chọn")&&diaChi.equalsIgnoreCase("Chọn"))
		{
			dtm_NCC.setRowCount(0);
			sqlNhaCungCap.timKiemTheoMaNCC(maNCC, dtm_NCC);
		}
		if(maNCC.equalsIgnoreCase("Chọn")&&
				!tenNCC.equalsIgnoreCase("Chọn")&&
				soDienThoai.equalsIgnoreCase("Chọn")&&
				email.equalsIgnoreCase("Chọn")&&diaChi.equalsIgnoreCase("Chọn"))
		{
			dtm_NCC.setRowCount(0);
			sqlNhaCungCap.timKiemTheoTenNCC(tenNCC, dtm_NCC);
		}
		if(maNCC.equalsIgnoreCase("Chọn")&&
				tenNCC.equalsIgnoreCase("Chọn")&&
				!soDienThoai.equalsIgnoreCase("Chọn")&&
				email.equalsIgnoreCase("Chọn")&&diaChi.equalsIgnoreCase("Chọn"))
		{
			dtm_NCC.setRowCount(0);
			sqlNhaCungCap.timKiemTheoSoDienThoaiNCC(soDienThoai, dtm_NCC);
		}
		if(maNCC.equalsIgnoreCase("Chọn")&&
				tenNCC.equalsIgnoreCase("Chọn")&&
				soDienThoai.equalsIgnoreCase("Chọn")&&
				!email.equalsIgnoreCase("Chọn")&&diaChi.equalsIgnoreCase("Chọn"))
		{
			dtm_NCC.setRowCount(0);
			sqlNhaCungCap.timKiemTheoEmail(email, dtm_NCC);
		}
		if(maNCC.equalsIgnoreCase("Chọn")&&
				tenNCC.equalsIgnoreCase("Chọn")&&
				soDienThoai.equalsIgnoreCase("Chọn")&&
				email.equalsIgnoreCase("Chọn")&&!diaChi.equalsIgnoreCase("Chọn"))
		{
			dtm_NCC.setRowCount(0);
			sqlNhaCungCap.timKiemTheoDiaChi(diaChi, dtm_NCC);
		}
		if(maNCC.equalsIgnoreCase("Chọn")&&
				!tenNCC.equalsIgnoreCase("Chọn")&&
				!soDienThoai.equalsIgnoreCase("Chọn")&&
				!email.equalsIgnoreCase("Chọn")&&!diaChi.equalsIgnoreCase("Chọn"))
		{
			dtm_NCC.setRowCount(0);
			NhaCungCap n=new NhaCungCap();
			n.setTenNCC(tenNCC);
			n.setSdtNCC(maNCC);
			n.setEmail(email);
			n.setDiaChi(diaChi);
			sqlNhaCungCap.timKiemTheoTieuChiKhacMaNCC(n, dtm_NCC);
		}
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	/*
	 * cbo_MaKH.setSelectedItem("Chọn");
		cbo_HoTen.setSelectedItem("Chọn");
		cbo_SoDienThoai.setSelectedItem("Chọn");
		cbo_GioiTinh.setSelectedItem("Chọn");
		cbo_DiaChi.setSelectedItem("Chọn");
		dtm_KH.setRowCount(0);
		sqlKhachHang.xuatDanhSachKhachHang(dtm_KH);
	 */
	private void resetComboBox()
	{
		cbo_MaNCC.setSelectedItem("Chọn");
		cbo_HoTen.setSelectedItem("Chọn");
		cbo_SoDienThoai.setSelectedItem("Chọn");
		cbo_DiaChi.setSelectedItem("Chọn");
		cbo_Email.setSelectedItem("Chọn");
		dtm_NCC.setRowCount(0);
		sqlNhaCungCap.xuatDanhSachNhaCungCap(dtm_NCC);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o=e.getSource();
		if(o.equals(btn_XoaTrang))
		{
			resetComboBox();
		}
		if(o.equals(btn_TimKiem))
		{
			timKiem();
		}
		
	}
    
}

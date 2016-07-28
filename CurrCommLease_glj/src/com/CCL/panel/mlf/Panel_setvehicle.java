/*
 * Panel_setvehicle.java
 *
 * Created on __DATE__, __TIME__
 */

package com.CCL.panel.mlf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


import com.CCL.Dao.BicycleDao;
import com.CCL.Dao.impl.BicycleDaoImpl;
import com.CCL.beans.Bicycle;

/**
 *
 * @author  __USER__
 */
public class Panel_setvehicle extends javax.swing.JPanel {

	private BicycleDao bdao;

	public Panel_setvehicle() {
	
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		bdao=new BicycleDaoImpl();
		lbl_management = new javax.swing.JLabel();
		lbl_behiclecode = new javax.swing.JLabel();
		lbl_tip = new javax.swing.JLabel();
		btn_Vehicle_search = new javax.swing.JButton();
		txt_id = new javax.swing.JTextField();
		btn_vrhicle_add = new javax.swing.JButton();
		btn_vehicle_print = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		tab_vehicleinfo = new javax.swing.JTable(){  //设置表格单元格不可编辑
			
			@Override
			public boolean isCellEditable(int row, int column) { 			
				return false;
			}		
		};
		setTableDate(bdao.queryAll());
		tab_vehicleinfo.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int count=e.getClickCount();
				if(count==2)
				{
					doubleClick_mouseClicked(e);
				}
				
			}
		});
		tab_vehicleinfo.getTableHeader().setReorderingAllowed(false); //不可整列移动
		tab_vehicleinfo.getTableHeader().setResizingAllowed(false); //不可拉动表格 
		lbl_management.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 18));
		lbl_management.setText("\u8f66\u8f86\u4fe1\u606f\u7ba1\u7406");

		lbl_behiclecode.setText("\u8f66\u8f86\u7f16\u53f7:");

		lbl_tip.setText("\u53cc\u51fb\u53ef\u67e5\u770b\u660e\u7ec6");

		btn_Vehicle_search.setText("\u67e5\u8be2");

		btn_Vehicle_search.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				btnsearch_ActionPerformed(e);
			}
			
		});
		btn_vrhicle_add.setText("\u6dfb\u52a0");
		btn_vrhicle_add.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				btnadd_ActionPerformed(e);
			}
			
		});
		
		btn_vehicle_print.setText("\u6253\u5370");

		jScrollPane1.setViewportView(tab_vehicleinfo);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(313,
																		313,
																		313)
																.addComponent(
																		lbl_management))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(60, 60,
																		60)
																.addComponent(
																		lbl_behiclecode)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		txt_id,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		138,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(27, 27,
																		27)
																.addComponent(
																		btn_Vehicle_search)
																.addGap(44, 44,
																		44)
																.addComponent(
																		btn_vrhicle_add)
																.addGap(43, 43,
																		43)
																.addComponent(
																		btn_vehicle_print)
																.addGap(39, 39,
																		39)
																.addComponent(
																		lbl_tip)))
								.addContainerGap(180, Short.MAX_VALUE))
				.addComponent(jScrollPane1,
						javax.swing.GroupLayout.DEFAULT_SIZE, 842,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(27, 27, 27)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		lbl_management)
																.addGap(18, 18,
																		18)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						lbl_behiclecode)
																				.addComponent(
																						txt_id,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						btn_Vehicle_search)
																				.addComponent(
																						btn_vrhicle_add)
																				.addComponent(
																						btn_vehicle_print)))
												.addComponent(lbl_tip))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										428, Short.MAX_VALUE)));
	}// </editor-fold>
	protected void btnadd_ActionPerformed(MouseEvent e) {
		VehucleaddDialog veh=new VehucleaddDialog(null,"自行车信息",true,this);
		
	}

	protected void doubleClick_mouseClicked(MouseEvent e) {
		int row=tab_vehicleinfo.getSelectedRow();
		int col=0;
		Bicycle biy=(Bicycle)tab_vehicleinfo.getValueAt(row, col);
		VehicleInfoDialog cif=new VehicleInfoDialog(null,"自行车信息",true,this,biy);
	
	}

	//GEN-END:initComponents

	protected void btnsearch_ActionPerformed(MouseEvent e) {
		if(this.txt_id.getText().length()==0)
		{
			setTableDate(bdao.queryAll());
		}
		else
		{
		int id=Integer.valueOf(this.txt_id.getText().trim());
		Bicycle search_bicycle= new Bicycle();
		search_bicycle=null;
		search_bicycle=bdao.get(id);
		
		if(search_bicycle==null)
		{
			JOptionPane.showMessageDialog(null, "无这ID车辆信息");
			tab_vehicleinfo.removeAll();
//			JOptionPane.showMessageDialog(null, "");
		}
		else {
		 List<Bicycle> list=new ArrayList<Bicycle>();
		 Bicycle b=new Bicycle();
		 b.setId(search_bicycle.getId());
		 b.setBicycleState(search_bicycle.getBicycleState());
		 b.setType(search_bicycle.getType());
		 b.setName(search_bicycle.getName());
		 b.setDescript(search_bicycle.getDescript());
		 b.setPrice(search_bicycle.getPrice());
		 b.setFactory(search_bicycle.getFactory());
		 list.add(b);
		 tab_vehicleinfo.removeAll();
		 setTableDate(list);
		}
		}
	}

	public void setTableDate(List<Bicycle> list) {
		Vector<String> title = new Vector<String>();
		title.add("ID");
		title.add("状态");
		title.add("类型");
		title.add("名称");
		title.add("描述");
		title.add("价格");
		title.add("厂商");

		Vector<Vector> date = new Vector<Vector>();
		Vector row = null;

		for (Bicycle b : list) {
			row = new Vector();
			row.add(b);
			row.add(b.getBicycleState());
			row.add(b.getType());
			row.add(b.getName());
			row.add(b.getDescript());
			row.add(b.getPrice());
			row.add(b.getFactory());
			date.add(row);
		}
		this.tab_vehicleinfo.setModel(new DefaultTableModel(date, title));
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton btn_Vehicle_search;
	private javax.swing.JButton btn_vehicle_print;
	private javax.swing.JButton btn_vrhicle_add;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel lbl_behiclecode;
	private javax.swing.JLabel lbl_management;
	private javax.swing.JLabel lbl_tip;
	private javax.swing.JTable tab_vehicleinfo;
	private javax.swing.JTextField txt_id;
	// End of variables declaration//GEN-END:variables

	public BicycleDao getBdao() {
		return bdao;
	}

	public void setBdao(BicycleDao bdao) {
		this.bdao = bdao;
	}

	public javax.swing.JButton getBtn_Vehicle_search() {
		return btn_Vehicle_search;
	}

	public void setBtn_Vehicle_search(javax.swing.JButton btn_Vehicle_search) {
		this.btn_Vehicle_search = btn_Vehicle_search;
	}

	public javax.swing.JButton getBtn_vehicle_print() {
		return btn_vehicle_print;
	}

	public void setBtn_vehicle_print(javax.swing.JButton btn_vehicle_print) {
		this.btn_vehicle_print = btn_vehicle_print;
	}

	public javax.swing.JButton getBtn_vrhicle_add() {
		return btn_vrhicle_add;
	}

	public void setBtn_vrhicle_add(javax.swing.JButton btn_vrhicle_add) {
		this.btn_vrhicle_add = btn_vrhicle_add;
	}

	public javax.swing.JScrollPane getjScrollPane1() {
		return jScrollPane1;
	}

	public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
		this.jScrollPane1 = jScrollPane1;
	}

	public javax.swing.JLabel getLbl_behiclecode() {
		return lbl_behiclecode;
	}

	public void setLbl_behiclecode(javax.swing.JLabel lbl_behiclecode) {
		this.lbl_behiclecode = lbl_behiclecode;
	}

	public javax.swing.JLabel getLbl_management() {
		return lbl_management;
	}

	public void setLbl_management(javax.swing.JLabel lbl_management) {
		this.lbl_management = lbl_management;
	}

	public javax.swing.JLabel getLbl_tip() {
		return lbl_tip;
	}

	public void setLbl_tip(javax.swing.JLabel lbl_tip) {
		this.lbl_tip = lbl_tip;
	}

	public javax.swing.JTable getTab_vehicleinfo() {
		return tab_vehicleinfo;
	}

	public void setTab_vehicleinfo(javax.swing.JTable tab_vehicleinfo) {
		this.tab_vehicleinfo = tab_vehicleinfo;
	}

	public javax.swing.JTextField getTxt_id() {
		return txt_id;
	}

	public void setTxt_id(javax.swing.JTextField txt_id) {
		this.txt_id = txt_id;
	}

}
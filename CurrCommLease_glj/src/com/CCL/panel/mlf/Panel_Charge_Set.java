package com.CCL.panel.mlf;



public class Panel_Charge_Set extends javax.swing.JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Creates new form panel_Chargeset */
	public Panel_Charge_Set() {
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

		btn_addcharge = new javax.swing.JButton();
		btn_delcharge = new javax.swing.JButton();
		btn_savecharge = new javax.swing.JButton();
		btn_searcharge = new javax.swing.JButton();
		btn_returncharge = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		tab_chargeset = new javax.swing.JTable();

		btn_addcharge.setText("\u65b0\u589e");

		btn_delcharge.setText("\u5220\u9664");
		

		btn_savecharge.setText("\u4fdd\u5b58");

		btn_searcharge.setText("\u67e5\u8be2");

		btn_returncharge.setText("\u8fd4\u56de");

		tab_chargeset.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null } }, new String[] {
						"序号", "项目名称", "费用计算方式", "单位", "单价", "是否参与折扣" }) {
			Class[] types = new Class[] { java.lang.Integer.class,
					java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.Float.class,
					java.lang.Boolean.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jScrollPane1.setViewportView(tab_chargeset);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup().addGap(31, 31, 31)
								.addComponent(btn_addcharge).addGap(18, 18, 18)
								.addComponent(btn_delcharge).addGap(18, 18, 18)
								.addComponent(btn_savecharge)
								.addGap(18, 18, 18)
								.addComponent(btn_searcharge)
								.addGap(91, 91, 91)
								.addComponent(btn_returncharge)
								.addContainerGap(281, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										730, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(btn_addcharge)
												.addComponent(btn_delcharge)
												.addComponent(btn_savecharge)
												.addComponent(btn_searcharge)
												.addComponent(btn_returncharge))
								.addGap(18, 18, 18)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										410, Short.MAX_VALUE)));
	}// </editor-fold>
	//GEN-END:initComponents



	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton btn_addcharge;
	private javax.swing.JButton btn_delcharge;
	private javax.swing.JButton btn_returncharge;
	private javax.swing.JButton btn_savecharge;
	private javax.swing.JButton btn_searcharge;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable tab_chargeset;
	// End of variables declaration//GEN-END:variables

}
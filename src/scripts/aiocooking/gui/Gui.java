package scripts.aiocooking.gui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.tribot.api2007.Player;
import org.tribot.api2007.types.RSTile;
import org.tribot.util.Util;

import scripts.aiocooking.Main;
import scripts.aiocooking.enums.Food;
import scripts.aiocooking.taskframework.TaskSet;
import scripts.aiocooking.utils.Vars;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moham
 */
@SuppressWarnings("serial")
public class Gui extends javax.swing.JFrame {

	private RSTile walk_Bank_Tile;
	private RSTile walk_Cook_Tile;
	private RSTile first_Bank_Tile;
	private RSTile second_Bank_Tile;
	private RSTile first_Cook_Tile;
	private RSTile second_Cook_Tile;
	public static Properties prop = new Properties();
	public static File path;
	Main script;
	TaskSet taskset;

	public Gui(Main script, TaskSet taskset) {
		this.taskset = taskset;
		this.script = script;
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		cook_Item_Combo = new javax.swing.JComboBox<>();
		set_First_Bank_Area_Tile = new javax.swing.JButton();
		first_Bank_Area_Tile_Textfield = new javax.swing.JTextField();
		set_Second_Bank_Area_Tile_Btn = new javax.swing.JButton();
		second_Bank_Area_Tile_Textfield = new javax.swing.JTextField();
		set_Bank_Walk_Tile_Btn = new javax.swing.JButton();
		bank_Walk_Tile_Textfield = new javax.swing.JTextField();
		set_Cook_Area_Walk_Tile_Btn = new javax.swing.JButton();
		cook_Walk_Tile_Textfield = new javax.swing.JTextField();
		set_First_Cook_Area_Tile_Btn = new javax.swing.JButton();
		first_Cook_Area_Tile_Textfield = new javax.swing.JTextField();
		set_Second_Cook_Area_Tile_Btn = new javax.swing.JButton();
		second_Cook_Area_Tile_Textfield = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		preset_Textfield = new javax.swing.JTextField();
		save_Btn = new javax.swing.JButton();
		load_Btn = new javax.swing.JButton();
		start_Btn = new javax.swing.JButton();

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
		jLabel1.setText("C#2Bot AIO COOkER");

		jLabel2.setText("Select Item:");

		cook_Item_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meat", "Shrimp", "Chicken",
				"Sardine", "Herring", "Trout", "Pike", "Salmon", "Tuna", "Lobster", "Swordfish" }));

		set_First_Bank_Area_Tile.setText("Set First Bank Tile");
		set_First_Bank_Area_Tile.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				set_First_Bank_Area_TileActionPerformed(evt);
			}
		});

		first_Bank_Area_Tile_Textfield.setEnabled(false);

		set_Second_Bank_Area_Tile_Btn.setText("Set Second Bank Tile");
		set_Second_Bank_Area_Tile_Btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				set_Second_Bank_Area_Tile_BtnActionPerformed(evt);
			}
		});

		second_Bank_Area_Tile_Textfield.setEnabled(false);

		set_Bank_Walk_Tile_Btn.setText("Set Bank Walk Tile");
		set_Bank_Walk_Tile_Btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				set_Bank_Walk_Tile_BtnActionPerformed(evt);
			}
		});

		bank_Walk_Tile_Textfield.setEnabled(false);

		set_Cook_Area_Walk_Tile_Btn.setText("Set Cook Walk Tile");
		set_Cook_Area_Walk_Tile_Btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				set_Cook_Area_Walk_Tile_BtnActionPerformed(evt);
			}
		});

		cook_Walk_Tile_Textfield.setEnabled(false);

		set_First_Cook_Area_Tile_Btn.setText("Set First Cook Tile");
		set_First_Cook_Area_Tile_Btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				set_First_Cook_Area_Tile_BtnActionPerformed(evt);
			}
		});

		first_Cook_Area_Tile_Textfield.setEnabled(false);

		set_Second_Cook_Area_Tile_Btn.setText("Set Second Cook Tile");
		set_Second_Cook_Area_Tile_Btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				set_Second_Cook_Area_Tile_BtnActionPerformed(evt);
			}
		});

		second_Cook_Area_Tile_Textfield.setEnabled(false);

		jLabel3.setText("Preset:");

		preset_Textfield.setText("Preset");

		save_Btn.setText("Save");
		save_Btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				save_BtnActionPerformed(evt);
			}
		});

		load_Btn.setText("Load");
		load_Btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				load_BtnActionPerformed(evt);
			}
		});

		start_Btn.setText("Start Script");
		start_Btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				start_BtnActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(cook_Item_Combo, javax.swing.GroupLayout.PREFERRED_SIZE,
														119, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2))
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel3).addGap(640, 640, 640))
												.addGroup(jPanel1Layout.createSequentialGroup().addGap(6, 6, 6)
														.addComponent(preset_Textfield,
																javax.swing.GroupLayout.DEFAULT_SIZE, 155,
																Short.MAX_VALUE)
														.addGap(520, 520, 520))))
								.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(set_Bank_Walk_Tile_Btn, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(set_Cook_Area_Walk_Tile_Btn, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(jPanel1Layout.createSequentialGroup().addGap(4, 4, 4)
														.addComponent(bank_Walk_Tile_Textfield,
																javax.swing.GroupLayout.PREFERRED_SIZE, 155,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(set_First_Bank_Area_Tile,
																javax.swing.GroupLayout.PREFERRED_SIZE, 129,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(first_Bank_Area_Tile_Textfield,
																javax.swing.GroupLayout.PREFERRED_SIZE, 117,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(set_Second_Bank_Area_Tile_Btn,
																javax.swing.GroupLayout.PREFERRED_SIZE, 133,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(second_Bank_Area_Tile_Textfield,
																javax.swing.GroupLayout.PREFERRED_SIZE, 119,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(cook_Walk_Tile_Textfield,
																javax.swing.GroupLayout.PREFERRED_SIZE, 153,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(save_Btn,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addComponent(set_First_Cook_Area_Tile_Btn,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129, Short.MAX_VALUE)
																		.addGap(2, 2, 2)))
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addGap(4, 4, 4)
																		.addComponent(first_Cook_Area_Tile_Textfield,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				117,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(load_Btn,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addComponent(set_Second_Cook_Area_Tile_Btn,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				133,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(second_Cook_Area_Tile_Textfield,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				119,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
																.addComponent(start_Btn,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 258,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addContainerGap())))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup()
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel1).addGap(203, 203, 203)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(set_First_Bank_Area_Tile, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(first_Bank_Area_Tile_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(set_Second_Bank_Area_Tile_Btn)
								.addComponent(second_Bank_Area_Tile_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(set_Bank_Walk_Tile_Btn).addComponent(bank_Walk_Tile_Textfield,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(15, 15, 15)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(set_First_Cook_Area_Tile_Btn, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(first_Cook_Area_Tile_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(set_Second_Cook_Area_Tile_Btn)
								.addComponent(second_Cook_Area_Tile_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(set_Cook_Area_Walk_Tile_Btn).addComponent(cook_Walk_Tile_Textfield,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(jLabel2))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(cook_Item_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(preset_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(save_Btn).addComponent(load_Btn).addComponent(start_Btn))
						.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>

	private void set_Bank_Walk_Tile_BtnActionPerformed(java.awt.event.ActionEvent evt) {
		this.walk_Bank_Tile = Player.getPosition();
		this.bank_Walk_Tile_Textfield.setText(String.valueOf(Player.getPosition()));
	}

	private void set_First_Bank_Area_TileActionPerformed(java.awt.event.ActionEvent evt) {
		this.first_Bank_Tile = Player.getPosition();
		this.first_Bank_Area_Tile_Textfield.setText(String.valueOf(Player.getPosition()));
	}

	private void set_Second_Bank_Area_Tile_BtnActionPerformed(java.awt.event.ActionEvent evt) {
		this.second_Bank_Tile = Player.getPosition();
		this.second_Bank_Area_Tile_Textfield.setText(String.valueOf(Player.getPosition()));

	}

	private void set_Cook_Area_Walk_Tile_BtnActionPerformed(java.awt.event.ActionEvent evt) {
		this.walk_Cook_Tile = Player.getPosition();
		this.cook_Walk_Tile_Textfield.setText(String.valueOf(Player.getPosition()));
	}

	private void set_First_Cook_Area_Tile_BtnActionPerformed(java.awt.event.ActionEvent evt) {
		this.first_Cook_Tile = Player.getPosition();
		this.first_Cook_Area_Tile_Textfield.setText(String.valueOf(Player.getPosition()));

	}

	private void set_Second_Cook_Area_Tile_BtnActionPerformed(java.awt.event.ActionEvent evt) {
		this.second_Cook_Tile = Player.getPosition();
		this.second_Cook_Area_Tile_Textfield.setText(String.valueOf(Player.getPosition()));
	}

	private void save_BtnActionPerformed(java.awt.event.ActionEvent evt) {
		path = new File(Util.getWorkingDirectory().getAbsolutePath(),
				"C#AIOCooker" + " " + this.preset_Textfield.getText() + " settings.ini");
		try {
			prop.clear();
			prop.put("food", String.valueOf(this.cook_Item_Combo.getSelectedItem()).toString());
			prop.put("bank_walk_tile_x", String.valueOf(this.walk_Bank_Tile.getX()));
			prop.put("bank_walk_tile_y", String.valueOf(this.walk_Bank_Tile.getY()));

			prop.put("cook_walk_tile_x", String.valueOf(this.walk_Cook_Tile.getX()));
			prop.put("cook_walk_tile_y", String.valueOf(this.walk_Cook_Tile.getY()));

			prop.put("first_bank_tile_x", String.valueOf(this.first_Bank_Tile.getX()));
			prop.put("first_bank_tile_y", String.valueOf(this.first_Bank_Tile.getY()));

			prop.put("second_bank_tile_x", String.valueOf(this.second_Bank_Tile.getX()));
			prop.put("second_bank_tile_y", String.valueOf(this.second_Bank_Tile.getY()));

			prop.put("first_cook_tile_x", String.valueOf(this.first_Cook_Tile.getX()));
			prop.put("first_cook_tile_y", String.valueOf(this.first_Cook_Tile.getY()));

			prop.put("second_cook_tile_x", String.valueOf(this.second_Cook_Tile.getX()));
			prop.put("second_cook_tile_y", String.valueOf(this.second_Cook_Tile.getY()));

			prop.store(new FileOutputStream(path), "GUI Settings");
		} catch (Exception e1) {
			System.out.print("Unable to save settings");
		}
	}

	private void load_BtnActionPerformed(java.awt.event.ActionEvent evt) {
		path = new File(Util.getWorkingDirectory().getAbsolutePath(),
				"C#AIOCooker" + " " + this.preset_Textfield.getText() + " settings.ini");

		try {
			if (path.exists()) {

				prop.load(new FileInputStream(path));
				String food = prop.getProperty("food");
				this.cook_Item_Combo.setSelectedItem(food);
				Vars.food = food;
				this.walk_Bank_Tile = new RSTile(Integer.parseInt(prop.getProperty("bank_walk_tile_x")),
						Integer.parseInt(prop.getProperty("bank_walk_tile_y")));
				this.walk_Cook_Tile = new RSTile(Integer.parseInt(prop.getProperty("cook_walk_tile_x")),
						Integer.parseInt(prop.getProperty("cook_walk_tile_y")));
				this.first_Bank_Tile = new RSTile(Integer.parseInt(prop.getProperty("first_bank_tile_x")),
						Integer.parseInt(prop.getProperty("first_bank_tile_y")));
				this.second_Bank_Tile = new RSTile(Integer.parseInt(prop.getProperty("second_bank_tile_x")),
						Integer.parseInt(prop.getProperty("second_bank_tile_y")));
				this.first_Cook_Tile = new RSTile(Integer.parseInt(prop.getProperty("first_cook_tile_x")),
						Integer.parseInt(prop.getProperty("first_cook_tile_y")));
				this.second_Cook_Tile = new RSTile(Integer.parseInt(prop.getProperty("second_cook_tile_x")),
						Integer.parseInt(prop.getProperty("second_cook_tile_y")));
				
				this.bank_Walk_Tile_Textfield.setText(String.valueOf(walk_Bank_Tile));
				this.cook_Walk_Tile_Textfield.setText(String.valueOf(walk_Cook_Tile));
				this.first_Bank_Area_Tile_Textfield.setText(String.valueOf(first_Bank_Tile));
				this.second_Bank_Area_Tile_Textfield.setText(String.valueOf(second_Bank_Tile));
				this.first_Cook_Area_Tile_Textfield.setText(String.valueOf(first_Cook_Tile));
				this.second_Cook_Area_Tile_Textfield.setText(String.valueOf(second_Cook_Tile));

			}

		} catch (Exception e2) {
			System.out.print("Unable to load settings");
		}
	}

	private void start_BtnActionPerformed(java.awt.event.ActionEvent evt) {
		synchronized (script) {
			script.notify();
		}
		Vars.bank_Walk_Tile = this.walk_Bank_Tile;
		Vars.cook_Walk_Tile = this.walk_Cook_Tile;
		Vars.first_Bank_Area_tile = this.first_Bank_Tile;
		Vars.second_Bank_Area_tile = this.second_Bank_Tile;
		Vars.first_Cook_Area_Tile = this.first_Cook_Tile;
		Vars.second_Cook_Area_Tile = this.second_Cook_Tile;
		if (this.cook_Item_Combo.getSelectedIndex() == 0){
			Vars.food = Food.MEAT.getName();
		}
		if (this.cook_Item_Combo.getSelectedIndex() == 1){
			Vars.food = Food.SHRIMP.getName();
		}
		if (this.cook_Item_Combo.getSelectedIndex() == 2){
			Vars.food = Food.CHICKEN.getName();
		}
		if (this.cook_Item_Combo.getSelectedIndex() == 3){
			Vars.food = Food.SARDINE.getName();
		}
		if (this.cook_Item_Combo.getSelectedIndex() == 4){
			Vars.food = Food.HERRING.getName();
		}
		if (this.cook_Item_Combo.getSelectedIndex() == 5){
			Vars.food = Food.TROUT.getName();
		}
		if (this.cook_Item_Combo.getSelectedIndex() == 6){
			Vars.food = Food.PIKE.getName();
		}
		if (this.cook_Item_Combo.getSelectedIndex() == 7){
			Vars.food = Food.SALMON.getName();
		}
		if (this.cook_Item_Combo.getSelectedIndex() == 8){
			Vars.food = Food.TUNA.getName();
		}
		if (this.cook_Item_Combo.getSelectedIndex() == 9){
			Vars.food = Food.LOBSTER.getName();
		}
		if (this.cook_Item_Combo.getSelectedIndex() == 10){
			Vars.food = Food.SWORDFISH.getName();
		}
		this.dispose();
		this.setVisible(false);
		Vars.start = true;
	}

	// Variables declaration - do not modify
	private javax.swing.JTextField bank_Walk_Tile_Textfield;
	private javax.swing.JComboBox<String> cook_Item_Combo;
	private javax.swing.JTextField first_Bank_Area_Tile_Textfield;
	private javax.swing.JTextField first_Cook_Area_Tile_Textfield;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField cook_Walk_Tile_Textfield;
	private javax.swing.JButton load_Btn;
	private javax.swing.JTextField preset_Textfield;
	private javax.swing.JButton save_Btn;
	private javax.swing.JTextField second_Bank_Area_Tile_Textfield;
	private javax.swing.JTextField second_Cook_Area_Tile_Textfield;
	private javax.swing.JButton set_Bank_Walk_Tile_Btn;
	private javax.swing.JButton set_Cook_Area_Walk_Tile_Btn;
	private javax.swing.JButton set_First_Bank_Area_Tile;
	private javax.swing.JButton set_First_Cook_Area_Tile_Btn;
	private javax.swing.JButton set_Second_Bank_Area_Tile_Btn;
	private javax.swing.JButton set_Second_Cook_Area_Tile_Btn;
	private javax.swing.JButton start_Btn;
	// End of variables declaration
}

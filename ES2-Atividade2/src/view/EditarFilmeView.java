package view;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import model.Filme;
import dao.FilmeDao;

public class EditarFilmeView extends JFrame {

	private static final long serialVersionUID = 1L;

	
	public EditarFilmeView() {
		
		AbstractTableModel tableModel = new AbstractTableModel() {
			private static final long serialVersionUID = 1L;

			@Override
			public Object getValueAt(int arg0, int arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getRowCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getColumnCount() {
				// TODO Auto-generated method stub
				return 0;
			}
		};

		//tableModel.setData(getValor());
		//tableModel.setEditableDefault(true);

		JTable table = new JTable(tableModel);
		JFrame frame = new JFrame("ObjectTableModel");
		JScrollPane pane = new JScrollPane();
		pane.setViewportView(table);
		pane.setPreferredSize(new Dimension(400, 200));
		frame.add(pane);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public List<Filme> getValor() {
		FilmeDao filmeDao = new FilmeDao();
		filmeDao.conectar();
		Collection<Filme> filmeCol = filmeDao.select();
		List<Filme> list = new ArrayList<Filme>();

		for (Filme filme : filmeCol) {
			list.add(filme);
		}

		filmeDao.desconectar();
		
		return list;
	}

}

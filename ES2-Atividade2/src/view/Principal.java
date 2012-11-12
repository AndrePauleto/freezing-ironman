package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton btnCadastrar;
	private JButton btnEditar;
	private JButton btnSair;
	private JPanel opcoes;
	private JPanel panel;

	public Principal() {
		montaTela();
		botaoCadastrar();
		botaoEditar();
		botaoSair();
	}

	private void montaTela() {

		btnCadastrar = new JButton("Cadastrar");
		this.getRootPane().setDefaultButton(btnCadastrar);

		btnEditar = new JButton("Editar");
		btnSair = new JButton("Sair");

		opcoes = new JPanel(new GridLayout(2, 1));
		opcoes.setBorder(new TitledBorder("Opções"));

		panel = new JPanel();

		opcoes.add(btnCadastrar);
		opcoes.add(btnEditar);
		panel.add(btnSair);
		add(opcoes, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);

		btnCadastrar.addActionListener(new AbstractAction() {
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		setTitle("Filmes - Principal");
	}

	private void botaoCadastrar() {
		btnCadastrar.addActionListener(new AbstractAction() {
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				CadastrarFilmeView cadastrarFilmeView = new CadastrarFilmeView();
				cadastrarFilmeView.setSize(550, 340);
				cadastrarFilmeView.setVisible(true);

			}
		});

	}

	private void botaoEditar() {
		btnEditar.addActionListener(new AbstractAction() {
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Action editar
			}
		});

	}

	private void botaoSair() {
		btnEditar.addActionListener(new AbstractAction() {
			private static final long serialVersionUID = 1L;
			//FIXME: Ainda não está funcionando.
			@Override
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null,
						"Deseja sair do programa", "Info Sys",
						JOptionPane.YES_NO_OPTION) == 0) {
					dispose();
				}
			}
		});

	}

	public static void main(String[] args) {
		try {
			Principal frame = new Principal();
			frame.setSize(200, 180);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}

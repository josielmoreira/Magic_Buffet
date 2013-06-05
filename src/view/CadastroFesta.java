/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.Festa;
import controler.Localizacao;
import controler.Pacote;
import controler.Pessoa;
import controler.Tema;
import entidadesDAO.FestaDAO;
import entidadesDAO.LocalizacaoDAO;
import entidadesDAO.PacoteDAO;
import entidadesDAO.PessoaDAO;
import entidadesDAO.TemaDAO;
import java.rmi.server.UID;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author andreza
 */
public final class CadastroFesta extends javax.swing.JFrame {

    
    
    public void prencherOpcoesTema(){
        TemaDAO temas = new TemaDAO();
        ArrayList<Tema> tema;
        tema = temas.buscarTema();
        String[] themes = new String[tema.size()];
        
        for (int i = 0; i < tema.size(); i++) {
            themes[i] = tema.get(i).getTnome();
        }
        
        DefaultComboBoxModel  model = new DefaultComboBoxModel(themes);
        itensTema.setModel(model);
    }
    
        
    
    public void prencherOpcoesPacote(){
        PacoteDAO pacotes = new PacoteDAO();
        ArrayList<Pacote> pacote;
        pacote = pacotes.buscarPacote();
        String[] packages = new String[pacote.size()];
        
        for (int i = 0; i < pacote.size(); i++) {
            packages[i] = pacote.get(i).getPacoteNome();
        }
        
        DefaultComboBoxModel  model = new DefaultComboBoxModel(packages);
        itensPacote.setModel(model);
        
    }
    
    
    public CadastroFesta() {
        initComponents();
        prencherOpcoesTema();
        prencherOpcoesPacote();
        textoBairro.setEnabled(false);
        textoCEP.setEnabled(false);
        textoCidade.setEnabled(false);
        textoRua.setEnabled(false);
        textoNumero.setEnabled(false);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        textocpf = new javax.swing.JTextField();
        textoNome = new javax.swing.JTextField();
        checarCPF = new javax.swing.JButton();
        buscarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        itensTema = new javax.swing.JComboBox();
        itensPacote = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        botaoCriarPacote = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        localExterno = new javax.swing.JRadioButton();
        UsarEndereco = new javax.swing.JRadioButton();
        Buffet = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        textoRua = new javax.swing.JTextField();
        textoBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textoNumero = new javax.swing.JTextField();
        textoCEP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JButton();
        textoCidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        estilo = new javax.swing.JComboBox();
        botaoChecar = new javax.swing.JButton();
        datainicio = new com.toedter.calendar.JDateChooser();
        datafim = new com.toedter.calendar.JDateChooser();
        horaSpin = new com.toedter.components.JSpinField();
        minutosSpin = new com.toedter.components.JSpinField();
        botaoCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        qntConvidados = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        checarCPF.setText("Checar CPF");
        checarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checarCPFActionPerformed(evt);
            }
        });

        buscarCliente.setText("Buscar Cliente");
        buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF");

        jLabel3.setText("Nome");

        jLabel4.setText("Tema");

        jLabel5.setText("Pacote");

        botaoCriarPacote.setText("Criar Novo Pacote");
        botaoCriarPacote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarPacoteActionPerformed(evt);
            }
        });

        jLabel6.setText("Data Inico");

        jLabel7.setText("Data FIm");

        jLabel8.setText("Hora Inicial");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel9.setText("Estilo");

        buttonGroup1.add(localExterno);
        localExterno.setText("Local Externo");
        localExterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localExternoActionPerformed(evt);
            }
        });

        buttonGroup1.add(UsarEndereco);
        UsarEndereco.setText("Usar Endereço do cliente");
        UsarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsarEnderecoActionPerformed(evt);
            }
        });

        buttonGroup1.add(Buffet);
        Buffet.setText("Buffet");
        Buffet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuffetActionPerformed(evt);
            }
        });

        jLabel10.setText("Rua");

        textoRua.setEditable(false);

        jLabel11.setText("Bairro");

        jLabel12.setText("Nº");

        jLabel13.setText("CEP");

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        jLabel14.setText("Cidade");

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLabel15.setText("Cadastro de uma nova Festa");

        estilo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Provençal", "Normal" }));

        botaoChecar.setText("Checar Data");
        botaoChecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoChecarActionPerformed(evt);
            }
        });

        horaSpin.setMaximum(23);
        horaSpin.setMinimum(0);

        minutosSpin.setMaximum(59);
        minutosSpin.setMinimum(0);

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Quant. Convidados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jSeparator2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(localExterno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Buffet)
                        .addGap(34, 34, 34)
                        .addComponent(UsarEndereco))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoRua, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(textoCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                            .addComponent(textoBairro))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textoCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                            .addComponent(textoNumero)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(7, 7, 7)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(3, 3, 3))))
                                        .addComponent(jLabel8)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(horaSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(minutosSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                                    .addComponent(jLabel1))
                                                .addComponent(estilo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addComponent(qntConvidados, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(datafim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(datainicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(itensPacote, javax.swing.GroupLayout.Alignment.LEADING, 0, 235, Short.MAX_VALUE)
                                                .addComponent(itensTema, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(botaoChecar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(botaoCriarPacote))))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addComponent(textocpf, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(checarCPF)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(buscarCliente))
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(442, 442, 442))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(botaoCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textocpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checarCPF)
                            .addComponent(buscarCliente)
                            .addComponent(jLabel2))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(itensTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itensPacote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(botaoCriarPacote))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoChecar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(datainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(datafim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(horaSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutosSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(qntConvidados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(estilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsarEndereco)
                    .addComponent(Buffet)
                    .addComponent(localExterno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(textoRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(textoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(textoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoSalvar)
                            .addComponent(botaoCancelar))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checarCPFActionPerformed
        String cpf = textocpf.getText();        
        Pessoa pessoa;
        PessoaDAO person = new PessoaDAO();
        pessoa = person.buscar(cpf, "CLIENTE");        
        if(pessoa.getPnome() != null){            
            textoNome.setText(pessoa.getPnome());
            textoNome.setEnabled(true);
        }
        else {
            JOptionPane.showMessageDialog(this, "CPF nãõ encontrado, cadastre o cliente");
        }
        
    }//GEN-LAST:event_checarCPFActionPerformed

    private void buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteActionPerformed
        
        TelaBuscar tela = TelaBuscar.getInstance();
        tela.setVisible(true);
        
    }//GEN-LAST:event_buscarClienteActionPerformed

    private void botaoCriarPacoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarPacoteActionPerformed
        
        TelaCadastrarpacote tela = new TelaCadastrarpacote();
        tela.setVisible(true);                
    }//GEN-LAST:event_botaoCriarPacoteActionPerformed

    private void botaoChecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoChecarActionPerformed
        
        String meuPacote = itensPacote.getSelectedItem().toString();
        
        PacoteDAO pacote = new PacoteDAO();
        Pacote p = pacote.buscarPorNome(meuPacote);
        ArrayList<String> itensMeuPacote = p.getItensPacote();
        ArrayList<String> itensOk = new ArrayList<>();
        ArrayList<String> itensLocados = new ArrayList<>();
        
        FestaDAO festas = new FestaDAO();
        ArrayList<Festa> festa;                
        
        festa = festas.buscarFesta(datainicio.getDate()); //array de feestas em uma data
        
        if(festa == null){
            JOptionPane.showMessageDialog(this,"Data Disponível");            
        }
        
        else{
                for (int fest = 0; fest < festa.size(); fest++) {
                    Festa e_festa = festa.get(fest);
                    String f = e_festa.getPacote();
                    Pacote pak = pacote.buscarPorNome(f);
                    ArrayList<String> listaItens = pak.getItensPacote();
                    for (int itensPacotes = 0; itensPacotes < listaItens.size(); itensPacotes++) {
                            String it = itensMeuPacote.get(itensPacotes);
                        for (int i = 0; i < listaItens.size(); i++) {
                            if(listaItens.get(i).equalsIgnoreCase(it)){
                                itensLocados.add(it);
                            }
                            else {
                                itensOk.add(it);
                            }
                        }
                    }
   
                 }
                
                System.out.println("tamano" + itensLocados.size());
                
                for (int i = 0; i < itensLocados.size(); i++) {
                    
                    System.out.println(itensLocados.get(i));
            }
                
            }                                                       
    }//GEN-LAST:event_botaoChecarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        
        Festa festa = new Festa();
        FestaDAO festas = new FestaDAO();
        
        festa.setPacote(itensPacote.getSelectedItem().toString());
        festa.setTema(itensTema.getSelectedItem().toString());                           
        festa.setEstiloFesta(estilo.getSelectedItem().toString());
        festa.setPessoaCPF(textocpf.getText());
        festa.setQuantidadeConvidados(Integer.parseInt(qntConvidados.getText()));
        festa.setLocal(textoCEP.getText());
        
        
        Calendar d = datafim.getCalendar();                
        String data = d.get(Calendar.DAY_OF_MONTH) + "/" + (d.get(Calendar.MONTH)+1)
                       + "/" + d.get(Calendar.YEAR);
        festa.setDataFim(data);        
        Calendar dataInicial = datafim.getCalendar();                
        String datainit = dataInicial.get(Calendar.DAY_OF_MONTH) + "/" + 
                      (dataInicial.get(Calendar.MONTH) + 1) 
                        + "/" + dataInicial.get(Calendar.YEAR);
        
        if(data == null){
            data = datainit;
        }
        
        festa.setDataFim(data);
        festa.setDataInicio(datainit);
        
        
        
        int hora = horaSpin.getValue();
        int minuto = minutosSpin.getValue();        
        Time hour = new Time(hora, minuto, 0);                
        festa.setHoraInicio(hour);
        
        
        
        
        
        if(Buffet.isSelected()){            
            festa.setExterno(false);            
        } 
        else {
            if(UsarEndereco.isSelected() || localExterno.isSelected()){
                    festa.setExterno(true);
                    LocalizacaoDAO locais = new LocalizacaoDAO();
                    Localizacao local = new Localizacao();                           
                    local.setBairro(textoBairro.getText());
                    local.setCEP(textoCEP.getText());
                    local.setRua(textoRua.getText());
                    local.setNumero(Integer.parseInt(textoNumero.getText()));
                    local.setCidade(textoCidade.getText());                              
                    UID id = new UID();
                    local.setIdLocalizacao(id.toString());                                    
                      
                    locais.criar(local);
            }                
        }        
        
        JOptionPane.showMessageDialog(this,"Tem certeza que deseja salvar a festa?");
        festas.criar(festa); 
        JOptionPane.showMessageDialog(this,"Festa cadastrada");
        
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void localExternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localExternoActionPerformed
        textoBairro.setEditable(true);
        textoCEP.setEditable(true);
        textoRua.setEditable(true);
        textoCidade.setEditable(true);
        textoNumero.setEditable(true);
        textoBairro.setEnabled(true);
        textoCEP.setEnabled(true);
        textoRua.setEnabled(true);
        textoCidade.setEnabled(true);
        textoNumero.setEnabled(true); 
        textoBairro.setText("");
        textoCEP.setText("");
        textoRua.setText("");
        textoCidade.setText("");
        textoNumero.setText("");    
    }//GEN-LAST:event_localExternoActionPerformed

    private void BuffetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuffetActionPerformed
        textoBairro.setEnabled(false);
        textoCEP.setEnabled(false);
        textoRua.setEnabled(false);
        textoCidade.setEnabled(false);
        textoNumero.setEnabled(false);        
        textoBairro.setText("");
        textoCEP.setText("");
        textoRua.setText("");
        textoCidade.setText("");
        textoNumero.setText("");    
        
    }//GEN-LAST:event_BuffetActionPerformed

    private void UsarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsarEnderecoActionPerformed
        if(textocpf.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Digite o número do cpf de um cliente");
        }
        textoBairro.setEnabled(false);
        textoCEP.setEnabled(false);
        textoRua.setEnabled(false);
        textoCidade.setEnabled(false);
        textoNumero.setEnabled(false);           
        Pessoa pessoa;
        PessoaDAO pessoas = new PessoaDAO();
        pessoa = pessoas.buscar(textocpf.getText(), "CLIENTE");
                
        textoBairro.setText(pessoa.getBairro());
        textoCEP.setText(pessoa.getCep());
        textoRua.setText(pessoa.getRua());
        textoCidade.setText(pessoa.getCidade());
        textoNumero.setText(String.valueOf(pessoa.getNumero()));    
        
    }//GEN-LAST:event_UsarEnderecoActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
        TelaInicial tela = TelaInicial.getInstance();
        tela.setVisible(true);
    }//GEN-LAST:event_botaoCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroFesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFesta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Buffet;
    private javax.swing.JRadioButton UsarEndereco;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoChecar;
    private javax.swing.JButton botaoCriarPacote;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton buscarCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton checarCPF;
    private com.toedter.calendar.JDateChooser datafim;
    private com.toedter.calendar.JDateChooser datainicio;
    private javax.swing.JComboBox estilo;
    private com.toedter.components.JSpinField horaSpin;
    private javax.swing.JComboBox itensPacote;
    private javax.swing.JComboBox itensTema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton localExterno;
    private com.toedter.components.JSpinField minutosSpin;
    private javax.swing.JTextField qntConvidados;
    private javax.swing.JTextField textoBairro;
    private javax.swing.JTextField textoCEP;
    private javax.swing.JTextField textoCidade;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoNumero;
    private javax.swing.JTextField textoRua;
    private javax.swing.JTextField textocpf;
    // End of variables declaration//GEN-END:variables
}
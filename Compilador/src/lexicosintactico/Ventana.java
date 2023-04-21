package lexicosintactico;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {
 FileNameExtensionFilter filtro= new FileNameExtensionFilter("Archivos Word y txt","docx","txt");
    File f;
    JFileChooser j= new JFileChooser();
    String data1 [][]={};
   String cabecera1[]={"No."," Token "," Tipo"};
    String path;
    int cont=0;
    int errores;
    String mensajini="";
    String tipo="";
    public Ventana() {
        initComponents();
        
        
    }

   //lector de tokens
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        Error = new javax.swing.JEditorPane();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtATexto1 = new javax.swing.JEditorPane();
        Lineas = new javax.swing.JEditorPane();
        LineaError = new javax.swing.JEditorPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(153, 204, 255));

        tabla.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabla);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setText("Analisis Lexico");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Error.setEditable(false);
        Error.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        Error.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Error.setForeground(java.awt.Color.blue);
        jScrollPane5.setViewportView(Error);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setText("Analisis Semantico");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtATexto1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtATexto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtATexto1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtATexto1KeyReleased(evt);
            }
        });

        Lineas.setEditable(false);
        Lineas.setText("1");
        Lineas.setOpaque(false);

        LineaError.setEditable(false);
        LineaError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LineaError.setForeground(java.awt.Color.red);
        LineaError.setToolTipText("");
        LineaError.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(LineaError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Lineas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtATexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lineas, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
            .addComponent(LineaError)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtATexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Código");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Errores Sintácticos y Semánticos");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Analizador");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(705, 705, 705)
                        .addComponent(jButton1)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(492, 492, 492)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(429, 429, 429)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //creacion del token dentro de un boton
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HashMap <String,Integer> r = new HashMap<>();
        HashMap <String,Integer> op = new HashMap<>();
        HashMap <String,Integer> id = new HashMap<>();
        HashMap <String,Integer> deli = new HashMap<>();
        HashMap <String,Integer> num = new HashMap<>();
        LinkedList <String> texto = new LinkedList<>();
    
        r.put("BEGIN", 0);
        r.put("END", 0);
        r.put("WORD", 0);
        r.put("ALFA", 0);
        r.put("NUM", 0);
        r.put("DNUM", 0);
        r.put("BOOL", 0);
        r.put("LNUM", 0);
        r.put("TAKE", 0);
        r.put("SEND", 0);
        r.put("WHEN", 0);
        r.put("IT", 0);
        r.put("IS", 0);
        r.put("START", 0);
        r.put("STEP", 0);
        r.put("TO", 0);
        r.put("STOP", 0);
        r.put("SWHEN", 0);
        r.put("COMPLETE", 0);
        
        op.put("/", 0);
        op.put("*", 0);
        op.put("+", 0);
        op.put("-", 0);
        op.put("=", 0);
        op.put("^", 0);
        op.put("<", 0);
        op.put(">", 0);
        op.put("||", 0);
        op.put("&&", 0);
        
        deli.put("#", 0);
        deli.put(";", 0);
        deli.put("{", 0);
        deli.put("}", 0);
        deli.put(")", 0);
        deli.put(",", 0);
        deli.put("(",0);
        
        
         
        
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Token","Cantidad","Tipo"});
        
        StringTokenizer st = new StringTokenizer(txtATexto1.getText(),"{}();,\"=+-*/><||&&# \n\t",true);
        String token, text = "";
        while (st.hasMoreTokens()){
            token = st.nextToken();
            if(!" ".equals(token) && !"\n".equals(token) && !"\t".equals(token)){
                if (r.containsKey(token)) {
                    r.put(token, r.get(token)+1);            
                }else {
                    if (op.containsKey(token)) {
                        op.put(token, op.get(token)+1);            
                    }else {
                        if (deli.containsKey(token)){
                            deli.put(token, deli.get(token)+1);
                            if("#".equals(token)){
                                token = st.nextToken();
                                while (st.hasMoreTokens() && !"#".equals(token)){
                                    text += token;
                                    token = st.nextToken();
                                }
                                texto.add(text);
                                deli.put(token, deli.get(token)+1);
                                text = "";
                            }
                        }else {
                            if (id.containsKey(token)) {
                                id.put(token, id.get(token)+1); 
                            }else {
                                if(token.matches("([0-9]*)|([0-9]*.[0-9]+)")) {
                                    if (num.containsKey(token)) {
                                        num.put(token, num.get(token)+1);
                                    }else num.put(token, 1); 
                                }
                                else id.put(token, 1); 
                            }
                        }
                    }
                }
            }
        }
         
        Iterator<String> itr = r.keySet().iterator();
        while(itr.hasNext()){
            token = itr.next();
            if(r.get(token) > 0)model.addRow(new Object[]{token, r.get(token),"Palabra Reservada"});
        } 
        itr = op.keySet().iterator();
        while(itr.hasNext()){
            token = itr.next();
            if(op.get(token) > 0) model.addRow(new Object[]{token, op.get(token),"Operador"});
        } 
        itr = deli.keySet().iterator();
        while(itr.hasNext()){
            token = itr.next();
            if(deli.get(token) > 0) model.addRow(new Object[]{token, deli.get(token),"Delimitador"});
        } 
        itr = id.keySet().iterator();
        while(itr.hasNext()){
            token = itr.next();
            if(id.get(token) > 0) model.addRow(new Object[]{token, id.get(token),"Identificador"});
        } 
        itr = num.keySet().iterator();
        while(itr.hasNext()){
            token = itr.next();
            if(num.get(token) > 0) {
                if(token.matches("[0-9]+"))model.addRow(new Object[]{token, num.get(token),"Número"});
                if(token.matches("[0-9]+.[0-9]+"))model.addRow(new Object[]{token, num.get(token),"Número Decimal"});
            }
        }
        itr = texto.iterator();
        while(itr.hasNext()){
            model.addRow(new Object[]{itr.next(), "1","Texto"});
            
        }
        tabla.setModel(model);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //Creacion del Cup dentro del 2do boton
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        errores=0;
        LinkedList <String> ENT = new LinkedList<>();
        LinkedList <String> DEC = new LinkedList<>();
        LinkedList <String> TEXT = new LinkedList<>();
        LinkedList <String> TAKE = new LinkedList<>();
        
        String
                simbolo = "([=<>])",//lector de simbolos 
                id = "([(a-z)(A-Z)](\\w)*)",//lector de letras
                num = "((\\d)+)",//lector de numeros 
                dec = "((\\d)+(\\.)(\\d)+)",//lector de decimales
                text = "((((#)[.\\W\\w\\s]*(#))|("+id+"))((\\s)*(\\+)((\\s)*((#)[.\\W\\w\\s]*(#))|("+id+")))*)",//lector del texto para el samantico
                send = "((\\s)*SEND(\\s)*(\\()(\\s)*((((#)[.\\W\\w\\s]*(#))|("+id+"))((\\s)*(\\+)((\\s)*((#)[.\\W\\w\\s]*(#))|("+id+")))*)(\\s)*(\\))(\\s)*(;))",//variable que envia al lenguaje fuente 
                take = "((\\s)*TAKE(\\s)*(\\()(\\s)*((((#)[.\\W\\w\\s]*(#))|("+id+"))((\\s)*(\\+)((\\s)*((#)[.\\W\\w\\s]*(#))|("+id+")))*)(\\s)*(\\))(\\s)*(;))",//varibable que toma y lee los tokens
                operaciones = "(("+id+"|"+num+"|"+dec+")(\\s)*([+-/*](\\s)*("+id+"|"+num+"|"+dec+"))+)",//lector de operaciones 
                defVal = "((\\s)*"+id+"(\\s)*=(\\s)*("+id+"|"+text+"|"+operaciones+"|"+num+"|"+dec+")(\\s)*(;))",//lector de valor por defecto
                defValVar = "((\\s)*"+id+"(\\s)*=(\\s)*("+id+"|"+text+"|"+operaciones+"|"+num+"|"+dec+")(\\s)*)",//variable por defecto
                condicion = id+"(\\s)*"+simbolo+"(\\s)*("+id+"|"+num+"|"+dec+")((\\s)*([(&&)(||)](\\s)*"+id+"(\\s)*"+simbolo+"(\\s)*("+id+"|"+num+"|"+dec+")))*",//lector de condiciones
                var = "((\\s)*((NUM)|(DNUM)|(WORD))(\\b)(\\s)*("+id+"|"+defValVar+")((\\s)*(,(\\s)*("+id+"|"+defValVar+")))*(\\s)*(;))",//lector de variables (Tokens)
                inicio = "((\\s)*"+id+"(\\b)(\\s)*BEGIN(\\s)*(\\{)[.\\W\\w\\s]*(END(\\s)*(\\})(\\s)*)$)",//inicio
                inter = "((\\s)*"+id+"(\\b)(\\s)*BEGIN(\\s)*(\\{))",//punto intermedio del codigo
                fin = "((\\s)*END(\\s)*(\\})(\\s)*)",//final
                
               inicionum = "((\\s)*START(\\b)(\\s)*("+id+"|"+num+")(\\b)(\\s)*(=)*("+id+"|"+num+")(\\b)(\\s)*(STEP)(\\b)(\\s)*"+num+"(\\s)*[+-]?(\\s)*(\\b)(TO)(\\b)(\\s)*("+id+"|"+num+")(\\s)*(\\{))",//inicio para los numeros 
                inicioLet = "((\\s)*STOP(\\s)*(\\}))",//inicio para las letras 
                whenif = "((\\s)*WHEN(\\s)*(\\()(\\s)*"+condicion+"(\\s)*(\\))(\\s)*(\\{))",//if o else pero se usa when para cumplir una condicion
               whenC = "((\\s)*SWHEN(\\s)*(\\}))",//condicion 
                itCon = "((\\s)*IT(\\s)*(\\()(\\s)*"+condicion+"(\\s)*(\\))(\\s)*(\\{))",
                itCom = "((\\s)*COMPLETE(\\s)*(\\}))",
                entero = "[0-9]*",//lecotr de numeros enteros
                decimal = "[0-9]*.[0-9]+";//lector de decimales
        
                //lector lexico sintactico 
                LinkedList <Integer> error = new LinkedList<>();
                StringTokenizer st = new StringTokenizer(txtATexto1.getText(),";{}",true);
                String token = "", txt = "", e;
                int i = 1, mainE = 0, start = 0, when = 0, it = 0, eB = 0;
                Error.setText("");
                
                if(txtATexto1.getText().matches(inicio)) {
                    
                    while (st.hasMoreTokens()){
                        token = st.nextToken();
                        if(st.hasMoreTokens())token = token+st.nextToken();
                        if(token.matches("[.\\W\\w\\s]*(\\})") && st.countTokens() == 1){
                            String auxTok = st.nextToken();
                            token = token+(auxTok.substring(0,auxTok.indexOf("\n")));
                        }
                            StringTokenizer lin = new StringTokenizer(token,"\n",true);
                            while (lin.hasMoreTokens()){
                                e = lin.nextToken();
                                if("\n".equals(e)) i++;
                            }
                            
                            if(token.matches(inicionum)) start++;
                            if(token.matches(inicioLet)) start--;
                            if(token.matches(whenif)) when++;
                            if(token.matches(whenC)) when--;
                            if(token.matches(itCon)) it++;
                            if(token.matches(itCom)) it--;
                            if((st.hasMoreTokens() == false && (start > 0 || when > 0 || it > 0)) || (start < 0 || when < 0 || it < 0)) eB = 1;
                            
                            if((token.matches(send) || token.matches(take) || token.matches(var) || token.matches(defVal) || token.matches(inter) || token.matches(fin) || token.matches("(\\s)*(\\$)") || token.matches(inicionum) || token.matches(inicioLet) || token.matches(whenif) || token.matches(whenC) || token.matches(itCon) || token.matches(itCom)) && eB == 0){
                               if(token.matches(take)){
                                   
                               }
                                if(token.matches(var)){
                                    StringTokenizer stTipo = new StringTokenizer(token," ,;");
                                    String tipo = stTipo.nextToken();
                                    
                                    if(tipo.contains("NUM")){
                                        
                                        while(stTipo.hasMoreTokens()){
                                            tipo = stTipo.nextToken();
                                            
                                            if(ENT.contains(tipo) || DEC.contains(tipo) || TEXT.contains(tipo)|| TAKE.contains(tipo)){
                                                Error.setText("La Variable esta repetida ("+tipo+") "+i+": \n"
                                                               + "______________\n"+token);
                                                for(int j = 1; j <i; j++){
                                                    txt += "\n";
                                                }
                                                LineaError.setText(txt+" ¡!");
                                                errores=1;
                                                break;
                                            }
                                            
                                            ENT.add(tipo);
                                        }
                                    }
                                    if(tipo.contains("DNUM")){
                                        
                                        while(stTipo.hasMoreTokens()){
                                            tipo = stTipo.nextToken();
                                            
                                            if(ENT.contains(tipo) || DEC.contains(tipo) || TEXT.contains(tipo)|| TAKE.contains(tipo)){
                                                Error.setText("La Variable esta repetida ("+tipo+") "+i+": \n"
                                                               + "______________\n"+token);
                                                for(int j = 1; j <i; j++){
                                                    txt += "\n";
                                                }
                                                LineaError.setText(txt+" ¡!");
                                                 errores=1;
                                                break;
                                            }
                                            
                                            DEC.add(tipo);
                                        }
                                    }
                                    if(tipo.contains("TAKE")){
                                       
                                        
                                        while(stTipo.hasMoreTokens()){
                                            tipo = stTipo.nextToken();
                                            
                                            if(ENT.contains(tipo) || DEC.contains(tipo) || TEXT.contains(tipo)|| TAKE.contains(tipo)){
                                                Error.setText("La Variable esta repetida ("+tipo+") "+i+": \n"
                                                               + "______________\n"+token);
                                                for(int j = 1; j <i; j++){
                                                    txt += "\n";
                                                }
                                                LineaError.setText(txt+" ¡!");
                                                 errores=1;
                                                break;
                                            }
                                            
                                            TAKE.add(tipo);
                                        }
                                    }
                                    if(tipo.contains("WORD")){
                                       
                                        while(stTipo.hasMoreTokens()){
                                            tipo = stTipo.nextToken();
                                            
                                            if(ENT.contains(tipo) || DEC.contains(tipo) || TEXT.contains(tipo)|| TAKE.contains(tipo)){
                                                Error.setText("La variable esta repetida ("+tipo+") "+i+": \n"
                                                               + "______________\n"+token);
                                                for(int j = 1; j <i; j++){
                                                    txt += "\n";
                                                }
                                                LineaError.setText(txt+" ¡!");
                                                 errores=1;
                                                break;
                                            }
                                            
                                            TEXT.add(tipo);
                                        }
                                    }
                                }
                                if(token.matches(defVal)){
                                    StringTokenizer stComprobar = new StringTokenizer(token," \n\t=;");
                                    String ID = stComprobar.nextToken(), comprobar = "", tok = "";
                                    //System.out.print(ID);
                                    while(stComprobar.hasMoreTokens()){
                                            comprobar += stComprobar.nextToken();
                                        }
                                    
                                    if(ENT.contains(ID)){
                                        StringTokenizer stComprobarE = new StringTokenizer(comprobar,"+*/-");
                                        while(stComprobarE.hasMoreTokens()){
                                            tok = stComprobarE.nextToken();
                                            
                                            if(tok.matches(id)){
                                                if(ENT.contains(tok));
                                                else{
                                                    Error.setText("ERROR SEMÁNTICO ("+tok+") "+i+": \n"
                                                                    + "_________\n"+token);
                                                    for(int j = 1; j <i; j++){
                                                        txt += "\n";
                                                    }
                                                    LineaError.setText(txt+" ¡!");
                                                     errores=1;
                                                    break;
                                                }
                                            }
                                            else{
                                                if(tok.matches(entero));
                                                else{
                                                    Error.setText("ERROR SEMÁNTICO ("+tok+") "+i+": \n"
                                                                    + "_________\n"+token);
                                                    for(int j = 1; j <i; j++){
                                                        txt += "\n";
                                                    }
                                                    LineaError.setText(txt+" ¡!");
                                                     errores=1;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        if(DEC.contains(ID)){
                                            StringTokenizer stComprobarD = new StringTokenizer(comprobar,"+*/-");
                                            while(stComprobarD.hasMoreTokens()){
                                                tok = stComprobarD.nextToken();

                                                if(tok.matches(id)){
                                                    if(DEC.contains(tok));
                                                    else{
                                                        Error.setText("ERROR SEMÁNTICO ("+tok+") "+i+": \n"
                                                                        + "_____\n"+token);
                                                        for(int j = 1; j <i; j++){
                                                            txt += "\n";
                                                        }
                                                        LineaError.setText(txt+" ¡!");
                                                         errores=1;
                                                        break;
                                                    }
                                                }
                                                else{
                                                    if(tok.matches(decimal));
                                                    else{
                                                        Error.setText("ERROR SEMÁNTICO ("+tok+") "+i+": \n"
                                                                        + "_____\n"+token);
                                                        for(int j = 1; j <i; j++){
                                                            txt += "\n";
                                                        }
                                                        LineaError.setText(txt+" ¡!");
                                                         errores=1;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        else {
                                            if(TEXT.contains(ID)){
                                                   if(comprobar.matches("((((\")[.\\W\\w\\s]*(\"))|("+id+"))((\\s)*(\\+)((\\s)*((\")[.\\W\\w\\s]*(\"))|("+id+")))*)"));
                                                   else {
                                                       Error.setText("ERROR SEMÁNTICO "+i+": \n"
                                                                        + "_____\n"+token);
                                                        for(int j = 1; j <i; j++){
                                                            txt += "\n";
                                                        }
                                                        LineaError.setText(txt+" ¡!");
                                                         errores=1;
                                                        break;
                                                   }
                                            }
                                            else{
                                                Error.setText("Variable no declarada "+i+": \n"
                                                                + "_____________\n"+token);
                                                for(int j = 1; j <i; j++){
                                                   txt += "\n";
                                                }
                                                LineaError.setText(txt+" ¡!");
                                                 errores=1;
                                                break;
                                            } 
                                        }
                                    }     
                                }
                            }
                            
                            
                            else {
                                if(token.contains("SEND")){
                                    Error.setText("Error al declarar sentencia SEND; en la linea "+i+": \n"
                                                   + "\n"+token);
                                     errores=1;
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("NUM") || token.contains("DNUM") || token.contains("WORD")){
                                    Error.setText("Error en declaracion de variables; en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("TAKE")){
                                    Error.setText("Error en lectura de valor TAKE  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("STOP}")){
                                    
                                    Error.setText("Cierre de Ciclo START incorrecto  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("START")){
                                    
                                    Error.setText("Inicio de Ciclo START incorrecto  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("SWHEN")){
                                    Error.setText("Cierre de ciclo WHEN incorrecto en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                    break;
                                }
                                if(token.contains("WHEN")){
                                    Error.setText("Inicio de ciclo WHEN incorrecto en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("COMPLETE")){
                                    
                                    Error.setText("Cierre de condicion IT incorrecto en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("IT")){
                                   
                                    Error.setText("Inicio de IT incorrecto; en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                else {
                                    Error.setText("Sintaxis Erronea en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                            }
                            
                            
                    }
                    
                }
                   
                else {
                    st = new StringTokenizer(txtATexto1.getText(),";{}",true);
                    while (st.hasMoreTokens()){
                        token = st.nextToken();
                        if(st.hasMoreTokens())token = token+st.nextToken();
                        if(token.matches("[.\\W\\w\\s]*(\\})") && st.countTokens() == 1){
                            String auxTok = st.nextToken();
                            token = token+(auxTok.substring(0,auxTok.indexOf("\n")));
                        }
                            StringTokenizer lin = new StringTokenizer(token,"\n",true);
                            while (lin.hasMoreTokens()){
                                e = lin.nextToken();
                                if("\n".equals(e)) i++;
                            }
                            if(eB == 1) break;
                            if(token.matches(inicionum)) start++;
                            if(token.matches(inicioLet)) start--;
                            if(token.matches(whenif)) when++;
                            if(token.matches(whenC)) when--;
                            if(token.matches(itCon)) it++;
                            if(token.matches(itCom)) it--;
                            if((st.hasMoreTokens() == false && (start > 0 || when > 0 || it > 0)) || (start < 0 || when < 0 || it < 0)) eB = 1;
                            
                            if((token.matches(send) || token.matches(take) || token.matches(var) || token.matches(defVal) || token.matches(inter) || token.matches(fin) || token.matches("(\\s)*(\\$)") || token.matches(inicionum) || token.matches(inicioLet) || token.matches(whenif) || token.matches(whenC) || token.matches(itCon) || token.matches(itCom)) && eB == 0){
                                Error.setText("Compilado Exitosamente xD lml");
                                if(token.matches(fin)) eB = 1;
                            }
                             
                            else {
                                if(token.contains("SEND")){
                                    Error.setText("Error al declarar sentencia SEND  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("NUM") || token.contains("DNUM") || token.contains("WORD")){
                                    Error.setText("Error en declaracion de variables  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("TAKE")){
                                    Error.setText("Error en lectura de valor TAKE en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("STOP}")){
                                    Error.setText("Cierre de Ciclo START incorrecto en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("START")){
                                    Error.setText("Inicio de Ciclo START incorrecto  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("SWHEN")){
                                    Error.setText("Cierre de ciclo WHEN incorrecto  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("WHEN")){
                                    Error.setText("Inicio de ciclo WHEN incorrecto  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("COMPLETE")){
                                    Error.setText("Cierre de condicion IT incorrecto; en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("IT")){
                                    Error.setText("Inicio de IT incorrecto en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                else {
                                    Error.setText("Sintaxis Erronea en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                            }
                    }
                    if(mainE == 0) {
                        Error.setText("Cierre de Clase incorrecto en la Linea "+i+": \n"
                                       + "\n"+token);
                        for(int j = 1; j <1; j++){
                            txt += "\n";
                        }
                        LineaError.setText(txt+" ¡!");
                         errores=1;
                    }
                }    //lector de sintactico y semantico
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtATexto1.setText("");
        LineaError.setText("");
        Error.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtATexto1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtATexto1KeyPressed
        StringTokenizer st = new StringTokenizer(txtATexto1.getText(),"\n",true);
        String txt = "",token;
        LineaError.setText("");
        Error.setText("");
        cont = 1;

        while (st.hasMoreTokens()){
            token= st.nextToken();
            if("\n".equals(token)) cont++;
        }

        for(int i = 1; i <= cont; i++){
            txt += i+"\n";
        }
        Lineas.setText(txt);
    }//GEN-LAST:event_txtATexto1KeyPressed

    private void txtATexto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtATexto1KeyReleased
        StringTokenizer st = new StringTokenizer(txtATexto1.getText(),"\n",true);
        String txt = "",token;
        cont = 1;

        while (st.hasMoreTokens()){
            token= st.nextToken();
            if("\n".equals(token)) cont++;
        }

        for(int i = 1; i <= cont; i++){
            txt += i+"\n";
        }
        Lineas.setText(txt);
    }//GEN-LAST:event_txtATexto1KeyReleased

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }         
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane Error;
    private javax.swing.JEditorPane LineaError;
    private javax.swing.JEditorPane Lineas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable tabla;
    private javax.swing.JEditorPane txtATexto1;
    // End of variables declaration//GEN-END:variables
}

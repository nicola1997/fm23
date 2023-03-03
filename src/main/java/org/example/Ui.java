package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ui extends JFrame {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel panel;
    private JTextArea text5;

    Ui(Campionato c) {
        super("fm");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel panel = new JPanel(new BorderLayout());
        getContentPane().add(panel);

        JButton button1 = new JButton("classifica");
        JButton button2 = new JButton("button");
        JButton button3 = new JButton("simula");
        JButton button4 = new JButton("Next");
        JTextArea text5 = new JTextArea("Benvenuto. Sei pronto per una nuova sfida? \nVinci la stagione "+c.anno+" con la tua squadra.");

        panel.add(button1,BorderLayout.EAST);
        panel.add(button2,BorderLayout.NORTH);
        panel.add(button3,BorderLayout.SOUTH);
        panel.add(button4,BorderLayout.WEST);
        panel.add(text5,BorderLayout.CENTER);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(c.getCampionato().get(0).getPartite()==0){
                    text5.setText("Il campionato è appena iniziato. \nTermina il campionato "+c.anno+" per iniziare il prossimo.");
                }
                else {
                    c.stagioneSuccessiva();
                    text5.setText("Nuova stagione " + c.anno + " iniziata! Buona fortuna");
                    //System.out.println(c.getCampionato().get(0));

                }
            }
        });
button3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (c.getCampionato().get(0).getPartite() !=38 ) {
            int i = 0;
            int j = 0;
            while (i < c.squadre.size()) {
                j = 0;
                while (j < c.squadre.size()) {
                    if (j != i) {
                        c.match(c.getCampionato().get(i), c.getCampionato().get(j));
                    }
                    j++;
                }
                i++;
            }
            c.sort();
            text5.setText("Il campionato si è concluso.\nControlla la classifica.\n"+c.getCampionato().get(19).getNome()+" e' campione d'Italia.\n"+
                    c.getCampionato().get(0).getNome()+" peggior squadra della stagione totalizzando "+c.getCampionato().get(0).getPunti()+" punti.");

        }
        else {
            text5.setText("Inizia una nuova stagione. Clicca Next.");
        }
    }

});

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.sort();
                text5.setText(

                        c.getCampionato().get(19).getValore()+"$ "+c.getCampionato().get(19).getPunti()+" "+c.getCampionato().get(19).getVittorie()+" "+c.getCampionato().get(19).getPareggi()+" "+c.getCampionato().get(19).getSconfitte()+" "+c.getCampionato().get(19).getNome()+"\n"+
                         c.getCampionato().get(18).getValore()+"$ "+c.getCampionato().get(18).getPunti()+" "+c.getCampionato().get(18).getVittorie()+" "+c.getCampionato().get(18).getPareggi()+" "+c.getCampionato().get(18).getSconfitte()+" "+c.getCampionato().get(18).getNome()+"\n"+
                         c.getCampionato().get(17).getValore()+"$ "+c.getCampionato().get(17).getPunti()+" "+c.getCampionato().get(17).getVittorie()+" "+c.getCampionato().get(17).getPareggi()+" "+c.getCampionato().get(17).getSconfitte()+" "+c.getCampionato().get(17).getNome()+"\n"+
                         c.getCampionato().get(16).getValore()+"$ "+c.getCampionato().get(16).getPunti()+" "+c.getCampionato().get(16).getVittorie()+" "+c.getCampionato().get(16).getPareggi()+" "+c.getCampionato().get(16).getSconfitte()+" "+c.getCampionato().get(16).getNome()+"\n"+
                         c.getCampionato().get(15).getValore()+"$ "+c.getCampionato().get(15).getPunti()+" "+c.getCampionato().get(15).getVittorie()+" "+c.getCampionato().get(15).getPareggi()+" "+c.getCampionato().get(15).getSconfitte()+" "+c.getCampionato().get(15).getNome()+"\n"+
                         c.getCampionato().get(14).getValore()+"$ "+c.getCampionato().get(14).getPunti()+" "+c.getCampionato().get(14).getVittorie()+" "+c.getCampionato().get(14).getPareggi()+" "+c.getCampionato().get(14).getSconfitte()+" "+c.getCampionato().get(14).getNome()+"\n"+
                         c.getCampionato().get(13).getValore()+"$ "+c.getCampionato().get(13).getPunti()+" "+c.getCampionato().get(13).getVittorie()+" "+c.getCampionato().get(13).getPareggi()+" "+c.getCampionato().get(13).getSconfitte()+" "+c.getCampionato().get(13).getNome()+"\n"+
                         c.getCampionato().get(12).getValore()+"$ "+c.getCampionato().get(12).getPunti()+" "+c.getCampionato().get(12).getVittorie()+" "+c.getCampionato().get(12).getPareggi()+" "+c.getCampionato().get(12).getSconfitte()+" "+c.getCampionato().get(12).getNome()+"\n"+
                         c.getCampionato().get(11).getValore()+"$ "+c.getCampionato().get(11).getPunti()+" "+c.getCampionato().get(11).getVittorie()+" "+c.getCampionato().get(11).getPareggi()+" "+c.getCampionato().get(11).getSconfitte()+" "+c.getCampionato().get(11).getNome()+"\n"+
                         c.getCampionato().get(10).getValore()+"$ "+c.getCampionato().get(1).getPunti()+" "+c.getCampionato().get(10).getVittorie()+" "+c.getCampionato().get(10).getPareggi()+" "+c.getCampionato().get(10).getSconfitte()+" "+c.getCampionato().get(10).getNome()+"\n"+
                         c.getCampionato().get(9).getValore()+"$ "+c.getCampionato().get(9).getPunti()+" "+c.getCampionato().get(9).getVittorie()+" "+c.getCampionato().get(9).getPareggi()+" "+c.getCampionato().get(9).getSconfitte()+" "+c.getCampionato().get(9).getNome()+"\n"+
                         c.getCampionato().get(8).getValore()+"$ "+c.getCampionato().get(8).getPunti()+" "+c.getCampionato().get(8).getVittorie()+" "+c.getCampionato().get(8).getPareggi()+" "+c.getCampionato().get(8).getSconfitte()+" "+c.getCampionato().get(8).getNome()+"\n"+
                         c.getCampionato().get(7).getValore()+"$ "+c.getCampionato().get(7).getPunti()+" "+c.getCampionato().get(7).getVittorie()+" "+c.getCampionato().get(7).getPareggi()+" "+c.getCampionato().get(7).getSconfitte()+" "+c.getCampionato().get(7).getNome()+"\n"+
                         c.getCampionato().get(6).getValore()+"$ "+c.getCampionato().get(6).getPunti()+" "+c.getCampionato().get(6).getVittorie()+" "+c.getCampionato().get(6).getPareggi()+" "+c.getCampionato().get(6).getSconfitte()+" "+c.getCampionato().get(6).getNome()+"\n"+
                         c.getCampionato().get(5).getValore()+"$ "+c.getCampionato().get(5).getPunti()+" "+c.getCampionato().get(5).getVittorie()+" "+c.getCampionato().get(5).getPareggi()+" "+c.getCampionato().get(5).getSconfitte()+" "+c.getCampionato().get(5).getNome()+"\n"+
                         c.getCampionato().get(4).getValore()+"$ "+c.getCampionato().get(4).getPunti()+" "+c.getCampionato().get(4).getVittorie()+" "+c.getCampionato().get(4).getPareggi()+" "+c.getCampionato().get(4).getSconfitte()+" "+c.getCampionato().get(4).getNome()+"\n"+
                         c.getCampionato().get(3).getValore()+"$ "+c.getCampionato().get(3).getPunti()+" "+c.getCampionato().get(3).getVittorie()+" "+c.getCampionato().get(3).getPareggi()+" "+c.getCampionato().get(3).getSconfitte()+" "+c.getCampionato().get(3).getNome()+"\n"+
                         c.getCampionato().get(2).getValore()+"$ "+c.getCampionato().get(2).getPunti()+" "+c.getCampionato().get(2).getVittorie()+" "+c.getCampionato().get(2).getPareggi()+" "+c.getCampionato().get(2).getSconfitte()+" "+c.getCampionato().get(2).getNome()+"\n"+
                         c.getCampionato().get(1).getValore()+"$ "+c.getCampionato().get(1).getPunti()+" "+c.getCampionato().get(1).getVittorie()+" "+c.getCampionato().get(1).getPareggi()+" "+c.getCampionato().get(1).getSconfitte()+" "+c.getCampionato().get(1).getNome()+"\n"+
                         c.getCampionato().get(8).getValore()+"$ "+c.getCampionato().get(0).getPunti()+" "+c.getCampionato().get(0).getVittorie()+" "+c.getCampionato().get(0).getPareggi()+" "+c.getCampionato().get(0).getSconfitte()+" "+c.getCampionato().get(0).getNome()+"\n");

            }
        });

        setVisible(true);
    }


}




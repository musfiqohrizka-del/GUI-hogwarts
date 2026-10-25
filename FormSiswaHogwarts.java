import javax.swing.*;
import java.awt.*;

public class FormSiswaHogwarts {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hogwarts - Form Siswa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 10));

        JLabel labelNama = new JLabel("Nama Siswa:");
        JTextField fieldNama = new JTextField();

        JLabel labelKeluarga = new JLabel("Nama Keluarga:");
        JTextField fieldKeluarga = new JTextField();

        JLabel labelAsrama = new JLabel("Asrama Hogwarts:");
        String[] asrama = {
            "Gryffindor",
            "Slytherin",
            "Ravenclaw",
            "Hufflepuff"
        };
        JComboBox<String> pilihanAsrama =
                new JComboBox<>(asrama);

        JButton tombolDaftar = new JButton("Daftar");
        JButton tombolHapus = new JButton("Hapus");

        panel.add(labelNama);
        panel.add(fieldNama);
        panel.add(labelKeluarga);
        panel.add(fieldKeluarga);
        panel.add(labelAsrama);
        panel.add(pilihanAsrama);
        panel.add(tombolDaftar);
        panel.add(tombolHapus);

        tombolDaftar.addActionListener(e -> {
            String nama = fieldNama.getText();
            String keluarga = fieldKeluarga.getText();
            String rumah = (String) pilihanAsrama.getSelectedItem();

            JOptionPane.showMessageDialog(frame,
                    "Selamat datang di Hogwarts!\n\n"
                    + "Nama: " + nama + "\n"
                    + "Keluarga: " + keluarga + "\n"
                    + "Asrama: " + rumah,
                    "Data Siswa Hogwarts",
                    JOptionPane.INFORMATION_MESSAGE);
        });

        tombolHapus.addActionListener(e -> {
            fieldNama.setText("");
            fieldKeluarga.setText("");
            pilihanAsrama.setSelectedIndex(0);
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
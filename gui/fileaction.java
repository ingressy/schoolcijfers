package gui;

import obj.Schuljahr;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class fileaction {
    /**
     * @param frame need the main frame to create new windows
     * @param schuljahr need the array list
     */
    protected static void saveas(JFrame frame, List<Schuljahr> schuljahr) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Schoolcijfers Datei", "sij"));

        int result = fileChooser.showSaveDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION)  {
            File selectedFile = fileChooser.getSelectedFile();
            if (!selectedFile.getName().toLowerCase().endsWith(".sij")) {
                selectedFile = new File(selectedFile.getParentFile(), selectedFile.getName() + ".sij");
            }
            try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(selectedFile))) {
                OOS.writeObject(schuljahr);
            } catch (IOException exception) {
                exception.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Fehler beim speichern der Datei:"+ exception.getMessage(),"Fehler", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

package world;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Area extends JPanel {
    int areaSpacing = 110;
    int fieldSpacing = 11;
    private final String name;
    private ArrayList<Field> fields;

    public Area(int x, int y, String name) {
        this.setLocation(x, y);
        this.name = name;
        this.setSize(110, 110);
        this.setBackground(new Color(255, 255, 255));
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setLayout(null);

        initializeFields();
    }

    public void initializeFields() {
        fields = new ArrayList<>();
        char letter = 'J';
        int number = 1;
        for (int i = 0; i < areaSpacing; i += fieldSpacing) {

            for (int j = 0; j < areaSpacing; j += fieldSpacing) {
                fields.add(new Field(j, i, letter + "" + number));
                number++;
            }
            letter--;
            number = 1;
        }

        for (Field field : fields) this.add(field); //ading field to area
    }

    public ArrayList<Field> getFields() {
        return fields;
    }

    @Override
    public String getName() {
        return name;
    }
}

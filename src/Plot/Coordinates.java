//package Plot;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.ArrayList;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.JTable;
//import java.util.Comparator;
//public class Coordinates {
//    private double X;
//    private double Y;
//    private static List<Double> x = new ArrayList<>(Arrays.asList(2.0, 4.0, 6.0, 8.0, 9.0));
//    private static List<Double> y = new ArrayList<>(Arrays.asList(1.0, 3.0, 2.5, 4.5, 5.0));
//
//
//    public Coordinates(double X, double Y) {
//        this.X = X;
//        this.Y = Y;
//    }
//    public Coordinates(List<Double>X,List<Double>Y){
//        this.x=X;
//        this.y=Y;
//
//    }
//    public static List<Double> get_X() {
//        return x;
//    }
//
//    public static List<Double> get_Y() {
//        return y;
//    }
//    public double getX() {
//        return X;
//    }
//
//    public double getY() {
//        return Y;
//    }
//    public static void setX(List<Double> newX) {
//        x = newX;
//    }
//
//    public static void setY(List<Double> newY) {
//        y = newY;
//    }
//
//    public static void setCoordinatesData(JTable table, List<Double> x, List<Double> y) {
//        DefaultTableModel model = (DefaultTableModel) table.getModel();
//        //model.setRowCount(0); // Очищаем таблицу
//        for (int i = model.getRowCount()-1; i>=0;i--){
//            model.removeRow(i);
//        }
//        for (int i = 0; i < x.size(); i++) {
//            Object[] row = {x.get(i), y.get(i),"Изменить", "Удалить"};
//            model.addRow(row); // Добавляем строку в таблицу
//        }
//    }
//    public void SortCoordinatesByX(double x, double y) {
//        List<Double> X = Coordinates.get_X();
//        List<Double> Y = Coordinates.get_Y();
//        // Список для пар координат
//        List<Coordinates> coordinates = new ArrayList<>();
//        for (int i = 0; i < X.size(); i++) {
//            coordinates.add(new Coordinates(X.get(i), Y.get(i)));
//        }
//
//        // Добавление новых координат
//        coordinates.add(new Coordinates(x, y));
//
//        // Сортировка списка X по возрастанию
//        coordinates.sort(new Comparator<Coordinates>() {
//            @Override
//            public int compare(Coordinates c1, Coordinates c2) {
//                return Double.compare(c1.getX(), c2.getX());
//            }
//        });
//
//        // Перестройка списка Y на основе индексов после сортировки X
//        List<Double> sortedX = new ArrayList<>();
//        List<Double> sortedY = new ArrayList<>();
//        for (Coordinates c : coordinates) {
//            sortedX.add(c.getX());
//            sortedY.add(c.getY());
//        }
//
//        Coordinates.setX(sortedX);
//        Coordinates.setY(sortedY);
//    }
//}


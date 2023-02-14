package sample;

import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.NavigableMap;
import java.util.TreeMap;

public class EtudiantListe {
   /* ObservableList<Etudiant> etudiantListe = FXCollections.observableArrayList(
            new Etudiant("C001","Leclerc", "Albert", "Le 07-04-1999", "Marseille", "M"),
            new Etudiant("C002","Smith", "Lana", "Le 21-09-2002", "New York", "F"),
            new Etudiant("C003","Keïta", "Moussa", "Le 03-01-2001", "Bamako", "M")
    );*/

/*private static NavigableMap<String, Etudiant> etudiantListe = new TreeMap<String, Etudiant>();
    public static void initEtudiantListe(){
        etudiantListe.put("C001",new Etudiant("C001", "Leclerc","Albert", LocalDate.of(1999, 04, 07), "Marseille", "M");
        etudiantListe.put("C002",new Etudiant("C002", "Smith","Lana", LocalDate.of(2002, 09, 21), "New Yorl", "F");
        etudiantListe.put("C003",new Etudiant("C003", "Keïta","Moussa", LocalDate.of(2001, 01, 03), "Bamako", "M");
    }
    public static Etudiant getFirstEtud(){
        return etudiantListe.firstEntry().getValue();
    }
    public static Student getStudent(Integer CNE){
        return etudiantListe.get(CNE);
    }
    public static void addStudent(Integer CNE, Student student){
        if (!etudiantListe.containsKey(CNE)){
            etudiantListe.put(CNE, student);
        }else{
            System.out.println("CNE:" + CNE + " déjà existant");
        }
    }
    public static void updateStudent(Integer CNE, Student student){
        if (etudiantListe.containsKey(CNE)){
            etudiantListe.put(CNE, student);
        }
    }
    public static void deleteStudent(String CNE){
        if (etudiantListe.containsKey(CNE)){
            etudiantListe.remove(CNE);
        }
    }
    public static Student getNext(Integer CNE){
        if (etudiantListe.higherEntry(CNE) != null) {
            return etudiantListe.higherEntry(CNE).getValue();
        }
        return getStudent(CNE);
    }
    public static Student getPrevious(Integer CNE){
        if (etudiantListe.lowerEntry(CNE) != null) {
            return etudiantListe.lowerEntry(CNE).getValue();
        }
        return getStudent(CNE);
    }

    public static Map<Integer, Student> getStudentList() {
        return etudiantListe;
    }*/




}

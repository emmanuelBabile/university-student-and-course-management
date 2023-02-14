package sample;
import java.util.NavigableMap;
import java.util.TreeMap;

public class CoursListe {
    private static NavigableMap<String,Cours> coursListe = new TreeMap<String, Cours>();

    public static void initCoursListe() {
        coursListe.put("A0001", new Cours("A0001", "Info", 2, "1A", "CP"));
        coursListe.put("A0002", new Cours("A0002", "Maths", 2, "2A", "CI"));
        coursListe.put("A0003", new Cours("A0003", "Anglais", 2, "1a", "GLA"));
    }
    public static Cours getFirstCours(){
            return coursListe.firstEntry().getValue();
        }
    public static Cours getCours(String CodeCours){ return coursListe.get(CodeCours); }
    public static void ajouterCours(String CodeCours, Cours cours){
        if (!coursListe.containsKey(CodeCours)){
            coursListe.put(CodeCours, cours);
        }else{
             System.out.println("CodeCours:" + CodeCours + " déjà existant");
        }
    }
    public static void modifierCours(String CodeCours, Cours cours){
        if (coursListe.containsKey(CodeCours)){
            coursListe.put(CodeCours, cours);
        }
    }
    public static void supprimerCours(String CodeCours){
        if (coursListe.containsKey(CodeCours)){
            coursListe.remove(CodeCours);
        }
    }

}
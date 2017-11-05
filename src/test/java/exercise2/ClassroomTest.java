package exercise2;

import exercise1.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassroomTest {
    private Classroom classroom;
    private Set<String> availableCourses;

    @Before
    public void fillInClassroom() {
        availableCourses.add("sewing");
        availableCourses.add("fencing");
        availableCourses.add("archery");
        availableCourses.add("gardening");
        availableCourses.add("fighting");
        availableCourses.add("politics");
        availableCourses.add("running");
        availableCourses.add("");

        classroom = new Classroom();
        Set<Student> students = new HashSet<>();
        Student grandMaesterPycelle = new Student("Grand Maester Pycelle", "001001");
        addStudent(grandMaesterPycelle, students, classroom);
        Student merynTrant = new Student("Meryn Trant", "001002");
        addStudent(merynTrant, students, classroom);
        Student hodor = new Student("Hodor", "001003");
        addStudent(hodor, students, classroom);
        Student grenn = new Student("Grenn", "001004");
        addStudent(grenn, students, classroom);
        Student osha = new Student("Osha", "001005");
        addStudent(osha, students, classroom);
        Student rickonStark = new Student("Rickon Stark", "001006");
        addStudent(rickonStark, students, classroom);
        Student ros = new Student("Ros", "001007");
        addStudent(ros, students, classroom);
        Student gregorClegane = new Student("Gregor Clegane", "001008");
        addStudent(gregorClegane, students, classroom);
        Student janosSlynt = new Student("Janos Slynt", "001009");
        addStudent(janosSlynt, students, classroom);
        Student lancelLannister = new Student("Lancel Lannister", "001010");
        addStudent(lancelLannister, students, classroom);
        Student myrcellaBaratheon = new Student("Myrcella Baratheon", "001011");
        addStudent(myrcellaBaratheon, students, classroom);
        Student rodrikCassel = new Student("Rodrik Cassel", "001012");
        addStudent(rodrikCassel, students, classroom);
        Student maesterLuwin = new Student("Maester Luwin", "001013");
        addStudent(maesterLuwin, students, classroom);
        Student irri = new Student("Irri", "001014");
        addStudent(irri, students, classroom);
        Student doreah = new Student("Doreah", "001015");
        addStudent(doreah, students, classroom);
        Student kevanLannister = new Student("Kevan Lannister", "001016");
        addStudent(kevanLannister, students, classroom);
        Student barristanSelmy = new Student("Barristan Selmy", "001017");
        addStudent(barristanSelmy, students, classroom);
        Student rast = new Student("Rast", "001018");
        addStudent(rast, students, classroom);
        Student maesterAemon = new Student("Maester Aemon", "001019");
        addStudent(maesterAemon, students, classroom);
        Student pypar = new Student("Pypar", "001020");
        addStudent(pypar, students, classroom);
        Student alliserThorne = new Student("Alliser Thorne", "001021");
        addStudent(alliserThorne, students, classroom);
        Student othellYarwyck = new Student("Othell Yarwyck", "001022");
        addStudent(othellYarwyck, students, classroom);
        Student lorasTyrell = new Student("Loras Tyrell", "001023");
        addStudent(lorasTyrell, students, classroom);
        Student hotPie = new Student("Hot Pie", "001024");
        addStudent(hotPie, students, classroom);
        Student bericDondarrion = new Student("Beric Dondarrion", "001025");
        addStudent(bericDondarrion, students, classroom);
        Student podrickPayne = new Student("Podrick Payne", "001026");
        addStudent(podrickPayne, students, classroom);
        Student eddisonTollett = new Student("Eddison Tollett", "001027");
        addStudent(eddisonTollett, students, classroom);
        Student yaraGreyjoy = new Student("Yara Greyjoy", "001028");
        addStudent(yaraGreyjoy, students, classroom);
        Student selyseFlorent = new Student("Selyse Florent", "001029");
        addStudent(selyseFlorent, students, classroom);
        Student littleSam = new Student("Little Sam", "001030");
        addStudent(littleSam, students, classroom);
        Student greyWorm = new Student("Grey Worm", "001031");
        addStudent(greyWorm, students, classroom);
        Student qyburn = new Student("Qyburn", "001032");
        addStudent(qyburn, students, classroom);
        Student olennaTyrell = new Student("Olenna Tyrell", "001033");
        addStudent(olennaTyrell, students, classroom);
        Student shireenBaratheon = new Student("Shireen Baratheon", "001034");
        addStudent(shireenBaratheon, students, classroom);
        Student meeraReed = new Student("Meera Reed", "001035");
        addStudent(meeraReed, students, classroom);
        Student jojenReed = new Student("Jojen Reed", "001036");
        addStudent(jojenReed, students, classroom);
        Student thorosOfMyr = new Student("Thoros of Myr", "001037");
        addStudent(thorosOfMyr, students, classroom);
        Student olly = new Student("Olly", "001038");
        addStudent(olly, students, classroom);
        Student maceTyrell = new Student("Mace Tyrell", "001039");
        addStudent(maceTyrell, students, classroom);
        Student theWaif = new Student("The Waif", "001040");
        addStudent(theWaif, students, classroom);
        Student bowenMarsh = new Student("Bowen Marsh", "001041");
        addStudent(bowenMarsh, students, classroom);
    }

    private static void addStudent(Student grandMaesterPycelle, Set<Student> students, Classroom classroom) {
        classroom.addStudent(grandMaesterPycelle);
        students.add(grandMaesterPycelle);
    }

    @Test
    public double averageScore() {
        classroom.averageScore();
    }

    @Test
    public int countStudents() {
        return 0;
    }

    @Test
    public List<Student> topScorers(String course, int n) {
        return null;
    }

    @Test
    public List<Student> successfulStudents() {
        return null;
    }
}

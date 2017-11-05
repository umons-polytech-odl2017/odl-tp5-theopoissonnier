package exercise1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StudentTest {
    @Test
    public void constructor_with_valid_parameters() {
        Student student = new Student("Stannis Baratheon", "012345");
        assertThat(student.getName()).isEqualTo("Stannis Baratheon");
        assertThat(student.getRegistrationNumber()).isEqualTo("012345");
    }

    @Test
    public void constructor_with_null_name() {
        assertThatThrownBy(() -> new Student(null, "012335"))
            .isInstanceOf(NullPointerException.class);
    }

    @Test
    public void constructor_with_null_registration_number() {
        assertThatThrownBy(() -> new Student("Thyrion Lannister", null))
            .isInstanceOf(NullPointerException.class);
    }

    @Test
    public void setScore_with_less_than_0() {
        Student jonSnow = new Student("Jon Snow", "998877");
        assertThatThrownBy(() -> jonSnow.setScore("temperance", -5))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void setScore_with_more_than_20() {
        Student tywinLannister = new Student("Tywin Lannister", "002345");
        assertThatThrownBy(() -> tywinLannister.setScore("accountancy", 23))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void setScore_with_null_course() {
        Student gendry = new Student("Gendry", "225533");
        assertThatThrownBy(() -> gendry.setScore(null, 18))
            .isInstanceOf(NullPointerException.class);
    }

    @Test
    public void getScore_with_scored_course() {
        Student theonGreyjoy = new Student("Theon Greyjoy", "123654");
        theonGreyjoy.setScore("loyalty", 2);
        assertThat(theonGreyjoy.getScore("loyalty")).hasValue(2);
    }

    @Test
    public void getScore_with_unknown_course() {
        Student sansaStark = new Student("Sansa Stark", "425163");
        sansaStark.setScore("sewing", 20);
        assertThat(sansaStark.getScore("politics")).isEmpty();
    }

    @Test
    public void averageScore_with_many_courses() {
        Student daenarysTargaryen = new Student("Daenarys Targaryen", "028743");
        daenarysTargaryen.setScore("leadership", 18);

    }


    @Test
    public void averageScore_with_no_course() {
        Student lorasTyrell = new Student("Loras Tyrell", "102039");
        assertThat(lorasTyrell.averageScore()).isEqualTo(0.0);
    }

    @Test
    public void bestCourse() {
    }

    @Test
    public void bestScore() {
    }

    @Test
    public void worstCourse() {
    }

    @Test
    public void worstScore() {
    }

    @Test
    public void failedCourses() {
    }

    @Test
    public void isSuccessful() {
    }

    @Test
    public void attendedCourses() {
    }

    @Test
    public void getName() {
    }

    @Test
    public void getRegistrationNumber() {
    }

}

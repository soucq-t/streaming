package student;

import student.domain.Gender;
import student.domain.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;

public class StudentStatistics {

    private final Collection<Student> students;

    /**
     * Reads all students from given csv-File.
     * @param path the file
     * @throws IOException
     */
    public StudentStatistics(Path path) throws IOException {
        try(Stream<String> lines = Files.lines(path)
                                        .skip(1)){
           students=new TreeSet<>();
            lines.forEach(s -> {
                students.add(Student.of(s));
            });
        }
    }

    /**
     * Counts all students of given gender
     * @param gender the gender
     * @return number of students of the given gender
     */
    public long countGender(Gender gender) {
        Stream.of(students)
                .forEach(students1 -> );
        return 0;
    }

    /**
     * Returns all students classes sorted alphabetically.
     * @return all students classes sorted alphabetically
     */
    public SortedSet<String> getClasses() {
        return null;
    }

    /**
     * Returns a map containing the number students of each gender in a given class.
     * @param schoolClass the class
     * @return count of students of each gender
     */
    public Map<Gender, Long> getGenderCountForClass(String schoolClass) {
        return null;
    }

    /**
     * Returns all students whose second name contains the given sequence.
     * @param sequence the sequence to search for. Case sensitive
     * @return students named like %sequence%
     */
    public List<Student> getAllWithSecondNameLike(String sequence) {
        return null;
    }

    /**
     * Finds a student by number and class
     * @param number students number
     * @param schoolClass students class
     * @return the student or Optional.empty if no student matches criteria
     */
    public Optional<Student> findByNumberAndClass(int number, String schoolClass) {
        return null;
    }

    /**
     * Returns the student with the longest name.
     * @return any student whose name contains the highest number of letters in all names
     */
    public Student getStudentWithLongestName() {
        return null;
    }

    /**
     * Returns the most frequently found first names
     * @param count how many should be returned
     * @return the topX most frequent first names
     */
    public Set<String> getMostFrequentFirstNames(int count) {
        return null;
    }

    /**
     * Returns the number of students in each year.
     * @return count of students of each year
     */
    public Map<Integer, Long> countStudentsByYear() {
        return null;
    }
}

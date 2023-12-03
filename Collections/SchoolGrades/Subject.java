package main.CollectionsPractice.SchoolGrades;

import java.util.Random;

public enum Subject {

        MATH, LITERATURE, PHYSICS, CHEMISTRY, GEOGRAPHY, BIOLOGY;

        private static int nextSubject = 0;
        public static Subject getNextSubject() {
            Subject[] s = Subject.values();
            return s[nextSubject++];
        }
}

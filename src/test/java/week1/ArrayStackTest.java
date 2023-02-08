package week1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {
    ArrayStack a;
    @BeforeEach
    void setup(){
        a = new ArrayStack(2);
        a.push("1");
    }

    @Test
    @DisplayName("A value should be added to the arraystack")
    void push() {
        assertEquals("1", a.pop());
    }

    @Test
    @DisplayName("When a value is popped then we should expect the latest added val")
    void pop() {
        a.push("2");
        assertEquals("2", a.pop());
    }

    @Test
    void isEmpty() {
        assertFalse(a.isEmpty());
    }

    @Test
    @DisplayName("Return true when ArrayStack is true")
    void isFull() {
        assertTrue(a.isFull());
    }

    @Test
    void show() {

    }
}
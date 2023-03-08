package org.adventOfCode.day5.supplyStacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupplyStacksTest {
    @Test
    void two_stack_stack_with_one_create_and_stack2_empty_one_move(){
        Stacks stack1 = new Stacks(new Create("Z"));
        Stacks stack2 = new Stacks();

        stack1.moveTopTo(1, stack2);

        assertEquals(stack2.getTop().symbol(), "Z");
        assertNull(stack1.getTop());
    }

    @Test
    void stack1_with_two_creates_and_stack2_is_empty_one_move(){
        Stacks stack1 = new Stacks(new Create("A"), new Create("Z"));
        Stacks stack2 = new Stacks();

        stack1.moveTopTo(1, stack2);

        assertEquals(stack2.getTop().symbol(), "Z");
        assertEquals(stack1.getTop().symbol(), "A");
    }

    @Test
    void stack1_with_two_creates_and_stack2_is_empty_two_move(){
        Stacks stack1 = new Stacks(new Create("A"), new Create("Z"));
        Stacks stack2 = new Stacks();

        stack1.moveTopTo(2, stack2);

        assertEquals(stack2.getTop().symbol(), "A");
        assertNull(stack1.getTop());
    }

    @Test
    void stack1_with_two_creates_and_stack2_is_empty_three_move_should_throw_errors(){
        Stacks stack1 = new Stacks(new Create("A"), new Create("Z"));
        Stacks stack2 = new Stacks();

        assertThrows(RuntimeException.class, () -> stack1.moveTopTo(3, stack2), "can't move");
    }

    @Test
    void stack1_with_two_creates_and_stack2_with_one_create_one_move(){
        Stacks stack1 = new Stacks(new Create("A"), new Create("Z"));
        Stacks stack2 = new Stacks(new Create("B"));

        stack1.moveTopTo(1, stack2);

        assertEquals(stack2.getTop().symbol(), "Z");
        assertEquals(stack2.getSize(), 2);
        assertEquals(stack1.getTop().symbol(), "A");
    }
}


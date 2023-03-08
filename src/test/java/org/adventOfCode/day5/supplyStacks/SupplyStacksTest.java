package org.adventOfCode.day5.supplyStacks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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


    @Test
    void moves_list_for_list_stacks(){
        Stacks stack1 = new Stacks(new Create("Z"), new Create("N"));
        Stacks stack2 = new Stacks(new Create("M"), new Create("C"), new Create("D"));
        Stacks stack3 = new Stacks(new Create("P"));
        List<Stacks> stacks = Arrays.asList(stack1, stack2, stack3);
        Move move1 = new Move(1, 2, 1);
        Move move2 = new Move(3, 1, 3);
        Move move3 = new Move(2, 2, 1);
        Move move4 = new Move(1, 1, 2);
        SupplyStacks supplyStack = new SupplyStacks();

        String message = supplyStack.range(stacks, move1, move2, move3, move4);

        assertEquals("CMZ", message);
    }

    @Test
    void move_number_above_create_size_should_throw_errors(){
        Stacks stack1 = new Stacks(new Create("Z"), new Create("N"));
        Stacks stack2 = new Stacks(new Create("M"), new Create("C"), new Create("D"));
        Stacks stack3 = new Stacks(new Create("P"));
        List<Stacks> stacks = Arrays.asList(stack1, stack2, stack3);
        Move move1 = new Move(5, 2, 1);

        SupplyStacks supplyStack = new SupplyStacks();

        assertThrows(RuntimeException.class, () -> supplyStack.range(stacks, move1), "can't move");
    }

}


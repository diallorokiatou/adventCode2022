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


    @Test
    void toto(){
        Stacks stack1 = new Stacks(new Create("Z"), new Create("N"));
        Stacks stack2 = new Stacks(new Create("M"), new Create("C"), new Create("D"));
        Stacks stack3 = new Stacks(new Create("P"));
        Move move1 = new Move(1, 2, 1);
        Move move2 = new Move(3, 1, 3);
        Move move3 = new Move(2, 2, 1);
        Move move4 = new Move(1, 1, 2);

        String message = arrangement(stack1, stack2, stack3, move1, move2, move3, move4);

        assertEquals("CMZ", message);
    }

    private String arrangement(Stacks stack1, Stacks stack2, Stacks stack3, Move move1, Move move2, Move move3, Move move4) {
        stack2.moveTopTo(move1.number(), stack1);
        stack1.moveTopTo(move2.number(), stack3);
        stack2.moveTopTo(move3.number(), stack1);
        stack1.moveTopTo(move4.number(), stack2);

        return stack1.getTopSymbol() + stack2.getTopSymbol() + stack3.getTopSymbol();
    }
}


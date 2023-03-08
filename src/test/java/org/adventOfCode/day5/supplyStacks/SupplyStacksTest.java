package org.adventOfCode.day5.supplyStacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SupplyStacksTest {
    @Test
    void two_stack_stack_with_one_create_and_stack2_empty_one_move(){
        Stacks stack1 = new Stacks(1, new Create("Z"));
        Stacks stack2 = new Stacks(2);

        stack1.moveTop(stack2);

        assertEquals(stack2.getTop().symbol(), "Z");
        assertEquals(stack1.getTop(), null);
    }

    @Test
    void stack1_with_two_creates_and_stack2_is_empty_one_move(){
        Stacks stack1 = new Stacks(1, new Create("A"), new Create("Z"));
        Stacks stack2 = new Stacks(2);

        stack1.moveTop(stack2);

        assertEquals(stack2.getTop().symbol(), "Z");
        assertEquals(stack1.getTop().symbol(), "A");
    }


}


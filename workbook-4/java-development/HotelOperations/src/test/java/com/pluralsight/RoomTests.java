package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTests {
@Test
public void CheckIn_ShouldMake_IsAvailableFalse(){
    //arrange
    Room room = new Room(2,129, false,false);

// whats supposed to happen when room is checked in
    boolean expectedAvailability = false;

// act
    room.checkIn();

    //assert
    assertFalse(room.isAvailable());
    assertEquals(expectedAvailability,room.isAvailable());
}
@Test
    public void CheckIn_ShouldMake_OccupiedTrue(){
        //arrange
        Room room = new Room(2,129, true,true);

// whats supposed to happen when room is checked in
        boolean expectedGetOccupied = true;

// act
        room.checkIn();

        //assert
        assertFalse(room.isAvailable());
        assertEquals(expectedGetOccupied,room.getOccupied());
    }



@Test
    public void CheckOut_ShouldMake_OccupiedFalse(){

//arrange
    Room room = new Room (2,129,true,true);
//act
    room.checkOut();
// assert
    assertFalse(room.getOccupied());
}

@Test
    public void CheckOut_ShouldMakeIsAvailable_False(){
    //arrange
    Room room = new Room (2,129,false,true);

    // action
    room.checkOut();

    //assert
    assertFalse(room.isAvailable());
}

    @Test
    public void CleanRoom_ShouldMakeIsAvailable_True(){
        //arrange
        Room room = new Room (2,129,false,true);

        // action
        room.cleanRoom();

        //assert
        assertTrue(room.isAvailable());
    }

    @Test
    public void CleanRoom_ShouldMakeIsDirty_False(){
        //arrange
        Room room = new Room (2,129,false,true);

        // action
        room.cleanRoom();

        //assert
        assertFalse(room.getDirty());
    }




}
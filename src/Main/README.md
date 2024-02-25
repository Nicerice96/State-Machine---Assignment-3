# Pedestrian Crossing Simulation


------------------------------
# Included Files
`Main` - Creates an instance of the CrossWalkSimulation which is enough to start the state machine (no need or any other calls to start the CrossWalkSimulation)

`Context` - an __interface__ that forces any instance of a CrossWalk State machine to implement its methods `timeout()` and `pedestrianWaiting()`

`CrossWalkSimulation` - an implementation of a CrossWalk State machine which has some additional methods that are necessary for the state machine

`VehiclesEnabled` - the entry state into the traffic signal states

`GreenState` - turns the traffic signal light to green

`vehiclesGreenInt` - state which handles the event in which a pedestrian has requested to cross

`YellowState` - turns traffic signal light to yellow

`RedState` - turns traffic signal to red

`pedestriansWalkState` - turns the pedestrian walk light on for 15 seconds

`pedestrianFlashState` - flashes the pedestrian "do not walk" light 3 times is accordance to the requirements

--------------------------------------------

# How to Run?
- Simply run the `Main` Class, ensure that an instance of `CrossWalkSimulation` is created and that any "pedestrian" esque thread is started __BEFORE__ the instance of `CrossWalkSimulation` is created
- There exists a "sample" `Pedestrian` Class which periodically interrupts the State machine, this may be used to show that the state machine _CAN_ handle interrupts. To do this simply uncomment the line in `Main` where the Pedestrian thread is created and started. 
--------------------------------------------

# Potential Design Flaws:

- The first defect in the design is that the DONT_WALK signal flashes for a period of 2 seconds with one second on and one second off. This may confuse pedestrians as it does not conform to standard pedestrian crossing signals where the DONT_WALK signal typically remains steady when it's not safe to cross. The defect can be corrected by ensuring that the DONT_WALK signal remains steady when it's not safe to cross, and only starts flashing when the crossing period is about to end.


- The second error in the design is not explicitly handling the case where a pedestrian is waiting while the signal is in the vehiclesGreen or vehiclesGreenInt state. In these states, if a pedestrian starts waiting, the state machine does not transition to a state where it accommodates the pedestrian's request. This means that pedestrians might be left waiting indefinitely without a safe opportunity to cross. This error should be addressed by adding a transition to a state where pedestrians are given the walk signal when they start waiting while the traffic light is green.

----------------------------

MIT License
Copyright (c) 2024 [Zarif Khan]

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS," WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


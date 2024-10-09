# Dice game CDIO1 PROJECT DTU
This project focused on developing a two-player dice game in Java using object-oriented principles. The system consists of modular components, including classes for players, dice rolls, and game management. Key features include random dice generation, score management, and win conditions. Thorough testing ensured the system met performance and functional requirements. The result is a fully functional and efficient game that can be further enhanced with additional features in future iterations.

**diceReliability1000.java print output:
**
```
**- -- Sum Frequency ---
**Sum 2: 34 times (3,40%)
Sum 3: 57 times (5,70%)
Sum 4: 87 times (8,70%)
Sum 5: 96 times (9,60%)
Sum 6: 142 times (14,20%)
Sum 7: 168 times (16,80%)
Sum 8: 159 times (15,90%)
Sum 9: 97 times (9,70%)
Sum 10: 66 times (6,60%)
Sum 11: 64 times (6,40%)
Sum 12: 30 times (3,00%)
**- -- Double Value Frequency ---
**Double 1: 34 times (3,40%)
Double 2: 32 times (3,20%)
Double 3: 30 times (3,00%)
Double 4: 32 times (3,20%)
Double 5: 29 times (2,90%)
Double 6: 30 times (3,00%)
```


**msTest.java print output:
**
```
9
0 ms
```

This project successfully implemented a two-player dice game in Java, adhering to object-
oriented programming principles and the specified project requirements. Through the design
and development process, we created modular and maintainable classes such as
GameInitialization, Player, DiceRollMechanism, and DiceResult, each responsible for a specific part of the game’s functionality. 

The use of getter and setter methods in the Player class ensured proper encapsulation, while the random number generation in
the DiceRollMechanism class provided fairness and unpredictability to the dice rolls.
Performance considerations, such as ensuring dice rolls occurred within the 333-millisecond
limit, were met, confirming the efficiency of the implementation. We conducted thorough
testing to validate the correctness of the game’s logic, including verifying dice roll probabili-
ties and handling edge cases like tied scores. The results from 1000 dice rolls showed a close
match between the expected and actual frequencies, further affirming the reliability of the
random number generation.

The final product meets the initial objectives, providing a fully functional, responsive, and
fair two-player dice game. Future enhancements could involve extending the game with more
complex rules or adding a graphical user interface to improve user interaction

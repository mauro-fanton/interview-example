# Tortoise racing #

Two tortoises named A and B must run a race.
A starts with an average speed of 720 feet per hour.

Young B knows she runs faster than A, and furthermore has not finished her cabbage.
When she starts, she can see that A has a 70 feet lead but her speed is 850 feet per hour.

How long will it take B to catch A?


More generally:
given:
  two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0) 
  a lead g (integer > 0) 
  
race(720, 850, 70) => [0, 32, 18]
race(80, 91, 37)   => [3, 21, 49]

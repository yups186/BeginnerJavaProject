# BeginnerJavaProjects
I have now been learning Java for a short while, and have made my first three beginner java projects. They are quite simple - They utilize:

- Scanner class
- If, else and else If statements
- Logical operators
- For loops
- While Loops
- Methods
- 1D Arrays (2D Arrays soon)



There will be more projects to come soon!

Please feel free to tell me any improvements I can make.

How to run

Make sure you have Java installed.

Save Main.java in a folder.

Open your terminal or command prompt, navigate to the folder, and run:

javac NAMEOFJAVAPROJECTHERE.java

java NAMEOFJAVAPROJECTHERE


# For the Grades Project

Follow the prompts in the program to enter your subjects and grades.

Notes

The program supports up to 3 subjects for now.

It prints all the grades at the end.

# For the Banking App Project

Follow the prompts in the program to either:

- Find out your Balance
- Deposit Money
- Withdraw Money
- Exit

Notes

Using deposit or withdraw will dynamically update the original Balance (with the exception of if Withdrawing exceeds the original Balance, that somehow breaks the Balance value, I will try to fix this as soon as possible.)

# For the Quiz Game Project

Contains 3 questions with score tracking;

Notes

Code is a bit messy, could probably try utilise 2D Arrays instead. At the moment, it does not take into account casing or white spaces, however I will add that to the code in a later commit.

# For the Password Project

I made this after watching a minute of a video about encoding V hashing V encryption. It gave me a "Eureka" moment to try and make a password generator in Java, and it actually does work! It utilises the Random class to generate a unique number that can be paired to an index of the password array, that contains all the usable characters to make the password.

Notes

At the moment, only lower case letters, numbers and some common symbols are used. For next time, I will add upper case letters to further increase the strength of the password. It is also not really cryptographically secure, the Random class can be predictable, so for next time, I will use the SecureRandom class.

------------------------------------------------------------------------------------------------------------

UPDATE

The Password generator now has variable password lengths (more on that later). I have also now added validation to the Password generator. Alongside that, it also regenerates the password if it doesn't match the set parameters. This is a huge improvement to the original password generator, which could only generate 10 character passwords, however now - due to the validation and regeneration, each new password that doesn't match the criteria should have a unique length, due to the implementation of a while loop.

------------------------------------------------------------------------------------------------------------

Thank you for reading.
  


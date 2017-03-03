<b>
    <h1 align="center"> Task description (Creational Patterns) </h1>
</b>

Write an app that creates and tunes a Computer.
    
    Computer:
        - SystemBlock
        - Monitor
        - Keyboard
        - Mouse

Based on console input
        
        computerType=="chip"
        computerType=="expensive" 
        
the ComputerService.process() (not static) should create a computer with chip or expensive versions of computer parts. Then wire the parts together, install the OS and save the fully tuned computer to a file.

1. Invoke ComputerService.process() from main() after parsing user input.
2. Implement creation of a Computer in somewhere ComputerService.process() via FactoryMethod. (Show the implementation in a separate commit)
3. Refactor the code to use AbstractFactory instead of FactoryMethod.
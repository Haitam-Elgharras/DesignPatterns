# Decorator Pattern Overview
Decorator pattern is a structural pattern, and it is achieving a single objective of dynamically adding responsibilities to any object. In other words
the Decorator pattern allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class.


### Key Components:
1. **Component**: The base interface or abstract class defining the methods that will be implemented in the concrete components.
2. **Concrete Component**: The original object to which additional responsibilities can be attached.
3. **Decorator**: An abstract class that implements the same abstract class as the component and contains a reference to a component object so all the decorators know what they are decorating.
4. **Concrete Decorators**: Classes that extend the Decorator class and add responsibilities to the component.

### Dynamic Composition:
- Decorators can be stacked on top of each other, each adding new behavior.
- This allows for flexible and reusable code, as behaviors can be combined in various ways.

### Notes:
- The decorator extends the original class, allowing us to pass a decorated object to any method that expects an instance of the original class. Without extending the original class, chaining multiple decorators would not be possible.
- The decorator has a reference to the original component, so all the decorators know what they are decorating.

### UML Diagram
![Decorator Design Pattern](Decorator_UML_class_diagram.svg.png)
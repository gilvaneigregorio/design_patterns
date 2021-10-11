# Description
Simple factory simply generates an instance for client without exposing any instantiation logic to the client.

# Wikipedia says
In object-oriented programming (OOP), a factory is an object for creating other objects – formally a factory is a function or method that returns objects of a varying prototype or class from some method call, which is assumed to be "new".

# When to Use?
When creating an object is not just a few assignments and involves some logic, it makes sense to put it in a dedicated factory instead of repeating the same code everywhere.

# Use case
Creates a factory that will handle with how to create each pizza type, encapsulating the pizza new call and the create logic in the pizza factory.
# Primitive reference-type sideeffect example

A short example that should demonstrate that primitive reference types (``Boolean``, ``Integer``, etc) cannot be subjects of sideeffects.

Have a look at the [ReferenceOverridingConsumerTest](src/test/java/org/example/ReferenceOverridingConsumerTest.java).

You can run the tests yourself with the following command:

``mvnw test``

# Explanation

The primitive reference-types of Java are immutable, i.e. the value of the instance cannot be changed once it is constructed.
Overriding the reference of a variable does never have an effect on the calling context because those references are always passed by value to the function.

Side effects can therefore only be achieved by modifying the passed object through one of its methods which is not possible for primitive reference-types as they are immutable.
# Primitive referencetype sideeffect example

A short example that should demonstrate that primitive reference types (``Boolean``, ``Integer``, etc) cannot be subjects of sideeffects because they are immutable. Overriding their reference does not have any effect on the calling context.

Have a look at the [ReferenceOverridingConsumerTest](``src/main/test/java/org/example/ReferenceOverridingConsumerTest.java``).

You can run the tests yourself with the following command:

``mvnw test``
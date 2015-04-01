Lombok Hello World
-------------

Quick example of [Lombok](http://projectlombok.org/) features:
  

@AllArgsConstructor
--------------------------

  > Generates an all-args constructor. An all-args constructor requires one argument for every field in the class.
Complete documentation is found at the project lombok features page for @Constructor.

@Data
--------------------------
> @Data is a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together: In other words, @Data generates all the boilerplate that is normally associated with simple POJOs (Plain Old Java Objects) and beans: getters for all fields, setters for all non-final fields, and appropriate toString, equals and hashCode implementations that involve the fields of the class, and a constructor that initializes all final fields, as well as all non-final fields with no initializer that have been marked with @NonNull, in order to ensure the field is never null.

@ToString
--------------------------
> Any class definition may be annotated with @ToString to let lombok generate an implementation of the toString() method. By default, it'll print your class name, along with each field, in order, separated by commas.By setting the includeFieldNames parameter to true you can add some clarity (but also quite some length) to the output of the toString() method.By default, all non-static fields will be printed. If you want to skip some fields, you can name them in the exclude parameter; each named field will not be printed at all. Alternatively, you can specify exactly which fields you wish to be used by naming them in the of parameter.

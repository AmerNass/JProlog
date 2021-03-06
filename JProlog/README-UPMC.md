This is a piece of coursework that we have to submit at university as part
of the programming course "Conception des langages" you can find more 
information on my professor's (Basile STARYNKEVICH) web page :
http://starynkevitch.net/Basile/

Collaborators :
Amer Nasser el dine ( amer.nassereldine@gmail.com)
Ibtissam Tariqui (ibtissam.tariqui@gmail.com)
Alexis Deluze (a.deluze@gmail.com)

== NI503 - Languages Conception coursework

== Known limitations:
As you will see, we chose to complete the implementation of a Prolog interpreter, to implement 
more functionnalities. In the actual version, the only terms we can use are constants,
predicates and variables (so, for example, they didn't implement lists).
Furthermore there are no builtin predicates available, like, for example,
there's no less-than predicate ("<") available, no forall predicate, etc.
which means that you can only evaluate simple Prolog queries. They will,
however, work.

== Added Features
This Application was not fully working, there was a lot of bugs concerning the unification process.
For that we search for a algorithm which can do it with the simpliest way (Robinson algorithm).
In the other hand, the programmer didn't take in consideration that someone else can continue his work, so it was
so difficult to add new features ..
But at the end we succeded.
So, in this work we add the unification and the backtrack algorithm, Lists and predicates.
We did a lot of tests on unification algorithm and an exemple is given in this work

We were three on this project so we tried to add many features, and we obtains a very good result :
Lets start with the main features :
 ** changing the io methods to make parsing easier
 ** adding a Builtin class :
      This class contains a dictionary of all builtins i.e.
      Java based classes callable from Prolog.
      They should provide a constructor and an exec method.
 ** Adding Cons method ( list constructor) with all lists caracterstics
 ** Adding Var and NonVar classes to use OOP better
 ** Adding the backtrack feature : now we can press "; " button to obtains all solutions

== exemple running

To run this exemple you should run the JProlog.jar application
This jar file is in the Release folder 
in this folder you can find two other files to test

With command line run the jar file:
    java -jar JProlog.jar

then charge the file family.pro :
    [family].

then you can make the test you want
All features are working

then you can test the predicates and see how the unification is working

== How to use / start the application:
Basically you just have to execute the main class, namely
"/JProlog/src/fr/upmc/CL/Jprolog/V2/prolog/Main.java". There are no
third party libraries required in order to compile this project, which
is why we thought it's okay if we just submit the source files without any
build files. However, the IntelliJ module file is included, in case you're
using IntelliJ as well.

The interpreter will give you a short introduction on how to use it
anyway, but basically it works like SWI Prolog. Using the square bracket
notation you can load files (note that everytime you load a file all
previously loaded rules will be dropped - it's a total refresh every
single time), using the normal query syntax you can execute queries,
and so on.

Just as SWI Prolog, this interpreter presents you with solutions one
after another. So unless you enter ';' you won't see any further
results.

Additionally I have included a set of test cases in the form of JUnit
tests. Any JUnit 4.x JAR file will be sufficient in order to execute
those tests and as most IDEs nowadays provide those library files
anyway I didn't include them in the archive file.


======================================================================================
Run with ant tool :

We made a build.xml file to make compiling and running our program easier.
To use ant builder you should have the correct package .. if ant was not installed 
use this command:
sudo apt-get -u install ant

In the JProlog folder you have many folders and files (src, Release, family.pro, build.xml ...)
just run these commands to test :
To build the project :
	ant -buildfile build.xml build

To run the project :
	ant -buildfile build.xml Main

========================================================================================
== Resources
There are basically just two parts in this application for which I searched
for information, unification and the backtracking evaluation approach. This
page (http://staff.science.uva.nl/~ulle/teaching/cs3aur-kings-2002/pdf/unification.pdf)
explains how the Robinson Unification algorithm works, which is basically
the algorithm that I've implemented, just more in terms of objects rather
than what this description states. 


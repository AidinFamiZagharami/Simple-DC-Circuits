# Simple-DC-Circuits
This Java application models and simulates simple DC resistive circuits composed of any number of resistors and DC voltage sources. The program reads user-defined circuit descriptions from standard input, supports interactive commands, and outputs a SPICE-compatible netlist.
Features
Custom circuit definition
Add resistors (r) and voltage sources (v) by specifying connected nodes and values.
Node-based modeling
Circuits are built from interconnected Node objects, ensuring accurate representation.
Polarity handling
Voltage sources store and respect their positive/negative orientation.
SPICE netlist generation
The spice command prints the current circuit in proper SPICE syntax with sequential component numbering.
Interactive commands
spice – Displays the circuit in SPICE netlist format.
end – Terminates the program gracefully with "All Done".
JUnit testing
Includes unit tests for validating Node behavior and other classes.

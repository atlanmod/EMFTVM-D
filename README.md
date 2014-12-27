#EMFTVM+

**EMFTVM+** is a fork of the official alt repository with an extension of the EMFTVM to support model transformation on the Cloud.

**EMFTVM+** has been successfully used in a prototype [tool](https://github.com/atlanmod/ATL_MR) for running ATL transformations on MapReduce.

## Extensions

We extended the ATL VM with a minimal set of functions, yet allowing the VM to run either in standalone or distributed mode.
In particular **EMFTVM+**  factorizes and exposes methods for launching independently small parts of input metamodel.
For instance the distributed VM exposes methods to perform the transformation of single model elements. 

ATL's tracing mechanism has also been extended with an additional data structure *TraceProperty*. It allows a fine-grained communication of transformation data between different cluster nodes.

These extensions had concerned mainly the following plugins: 

- **org.eclipse.m2m.atl.emftvm**
- **org.eclipse.m2m.atl.emftvm.trace**

# CLP-1 Problembook LaTeX source files
* The exercises for the CLP-1 text compile as a separate problembook.
* Each exercise is rendered in 4 different places
   * the question statement itself
   * a hint
   * an answer
   * a full solution
* In order to render the problems in this way we use the qhas.sty class file
* This allows us to write each question as 4 environments {question}{hint}{answer}{solution} which are then rendered in 4 different locations in the resulting pdf
* This makes heavy use of the newfile package which allows one to read/write chunks of latex to file during compilation.

      * DATA AREA OUTPUT                                        
       01  OUTPUT-AREA.                                          
           02 CREDIT-CARDS      OCCURS 5 TIMES.
               05  CARD-NUMBER            PIC X(16).
               05  CARD-TYPE              PIC X(16).
               05  CARD-LIMIT             PIC S9(4) COMP.
               05  CARD-USAGE             PIC S9(4) COMP.
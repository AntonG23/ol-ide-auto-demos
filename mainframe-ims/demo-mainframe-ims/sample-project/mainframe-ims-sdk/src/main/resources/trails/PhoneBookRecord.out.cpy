      *
      *    IMS PhoneBook Transaction (IVTNO) Sample
      *
      *********************************************************************/
      *                                                                   */
      * (c) Copyright IBM Corp. 2005                                      */
      * All Rights Reserved                                               */
      * Licensed Materials - Property of IBM                              */
      *                                                                   */
      * DISCLAIMER OF WARRANTIES.                                         */
      *                                                                   */
      * The following (enclosed) code is provided to you solely for the   */
      * purpose of assisting you in the development of your applications. */
      * The code is provided "AS IS." IBM MAKES NO WARRANTIES, EXPRESS OR */
      * IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF   */
      * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE, REGARDING   */
      * THE FUNCTION OR PERFORMANCE OF THIS CODE.                         */
      * IBM shall not be liable for any damages arising out of your use   */
      * of the generated code, even if they have been advised of the      */
      * possibility of such damages.                                      */
      *                                                                   */
      * DISTRIBUTION.                                                     */
      *                                                                   */
      * This generated code can be freely distributed, copied, altered,   */
      * and incorporated into other software, provided that:              */
      *   - It bears the above Copyright notice and DISCLAIMER intact     */
      *   - The software is not for resale                                */
      *                                                                   */
      *************  IMS PhoneBook Transaction (IVTCB) Sample *************/ 
      
        01 OUTPUT-MSG.
            02  OUT-MESSAGE     PICTURE X(40) VALUE SPACES.
            02  OUT-COMMAND     PIC X(8).                              
            02  OUT-LAST-NAME   PIC X(10).                       
            02  OUT-FIRST-NAME  PIC X(10).                       
            02  OUT-EXTENSION   PIC X(10).                       
            02  OUT-ZIP-CODE    PIC X(7).   
            02  OUT-SEGNO       PICTURE X(4) VALUE SPACES.
           
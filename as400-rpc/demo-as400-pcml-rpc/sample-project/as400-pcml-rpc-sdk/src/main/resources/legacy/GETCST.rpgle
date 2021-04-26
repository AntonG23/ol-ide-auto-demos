000100161113     FCSTMR     IF   E           K DISK                                                             
000200161113     d Cust_t        e ds                  extname(cstmr)                                           
000300161113     d                                     qualified                                                
000400161113     d                                     based(Template_only)                                     
000500161113     dGETCST           pr                  extpgm('GETCST')                                         
000600161113     d  CustomerId                         like(cust_t.cid)                                         
000700161113     d                                     const                                                    
000800161113     d  FirstName                          like(cust_t.cfirst)                                      
000900161113     d  LastName                           like(cust_t.clast)                                       
001000161113     d  Address                            like(cust_t.caddr1)                                      
001100161113     d  Credit                             like(cust_t.ccredt)                                      
001200161113     d  Discount                           like(cust_t.cdct  )                                      
001300161113     d  Balance                            like(cust_t.cbal )                                       
001400161113     d  Phone                              like(cust_t.cphone)                                      
001500161113     d  status                       10                                                             
001600161113     dGETCST           pi                                                                           
001700161113     d  CustomerId                         like(cust_t.cid)                                         
001800161113     d                                     const                                                    
001900161113     d  FirstName                          like(cust_t.cfirst)                                      
002000161113     d  LastName                           like(cust_t.clast)                                       
002100161113     d  Address                            like(cust_t.caddr1)                                      
002200161113     d  Credit                             like(cust_t.ccredt)                                      
002300161113     d  Discount                           like(cust_t.cdct  )                                      
002400161113     d  Balance                            like(cust_t.cbal )                                       
002500161113     d  Phone                              like(cust_t.cphone)                                      
002600161113     d  status                       10                                                             
002700161113     c     CustomerId    chain     cstmr                                                            
002800161113     c                   if        not %found                                                       
002900161113     c                   eval      status = 'Not found'                                             
003000161113     c                   else                                                                       
003100161113     c                   eval      status = 'OK'                                                    
003200161113     c                   eval      lastName = clast                                                 
003300161113     c                   eval      FirstName = cfirst                                               
003400161113     c                   eval      credit = ccredt                                                  
003500161113     c                   eval      address = caddr1                                                 
003600161113     c                   eval      discount = cdct                                                  
003700161113     c                   eval      balance = cbal                                                   
003800161113     c                   eval      phone = cphone                                                   
003900161113     c                   endif                                                                      
004000161113     c                   seton                                        lr                            

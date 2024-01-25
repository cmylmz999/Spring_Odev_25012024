## BUGTA KALMIS OLAN 8080 PORTUNU OLDURMEK
netstat -ano | find "8080" -> ayakta görünen portu bulmak için kullanılır.


taskkill /F /PID 12345 -> 12345 yerine ilk komutu yazdıktan sonra LISTENING'in sağında gelen numara yazılır.

ÖRN;
netstat -ano | find "8080"

TCP    0.0.0.0:8080           0.0.0.0:0              LISTENING       2612

TCP    [::]:8080              [::]:0                 LISTENING       2612

taskkill /F /PID 2612

Bunu yaptığınızda dolu görünen portun ölmüş olması lazım.
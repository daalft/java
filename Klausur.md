Klausur
=======
Schreiben Sie eine Klasse `Student`. Ein `Student` hat ein Feld `Name` und ein Feld `Note`.

Schreiben Sie eine Klasse `Note`. Eine `Note` enthält eine numerische,sowieso eine textuelle Note. (z.B. 3, genügend).

Schreiben Sie eine Klasse `Studentenverzeichnis`. 
Das Verzeichnis verfügt über zwei Listen:
* eine Liste der Grösse 5 (Angenommen)
* eine Liste der Grösse 10 (Warteliste)

Das Verzeichnis verfügt über eine Methode `public void add (Student s)`. Wenn die Liste "Angenommen" nicht voll ist, 
wird der Student zu dieser Liste hinzugefügt. Ist die Liste "Angenommen" voll:
* wenn der hinzuzufügende Student eine schlechtere Note als alle Studenten der Liste hat, wird er auf die 
Warteliste gesetzt
* wenn der hinzuzufügende Student eine bessere Note als der schlechteste Student der Liste hat, wird der hinzuzufügende Student
der Liste "Angenommen" hinzugefügt und der schlechtere Student auf die Warteliste gesetzt

Wenn die Warteliste voll ist, wird der Student nicht aufgenommen.

Geben Sie in allen 3 Fällen (angenommen/Warteliste/abgelehnt) eine passende Meldung aus.

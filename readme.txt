

Cilj ovog projekta je kreiranje kompajlera za jezik Mikrojava (izmišljeni jezik koji predstavlja uprošćenu javu). Izrada je podeljena na 4 faze, leksičku analizu, sintaksnu analizu, semantičku analizu i generisanje koda. Nakon završene sve 4 faze, očekuje se da kompajler prevodi kod tačno po određenim pravilima.

Opis komandi za generisanje Java koda alatima
Generisanje Java koda se može obaviti kroz build.xml fajl ili kroz komandnu liniju terminala. Ispod su navedene komande za terminal.
Za generisanje leksera se koristi komanda:
java -jar lib/JFlex.jar -d src/rs/ac/bg/etf/pp1/ spec/mjlexer.lex
Za generisanje parsera se koristi komanda:
	java -jar lib/cup_v10k.jar -destdir src/rs/ac/bg/etf/pp1 -ast src.rs.ac.bg.etf.pp1.ast    -parser MJParser -buildtree spec/mjparser.cup
Nakon generisanja parsera, se pokreće Compiler.java kako bi se generisao kod, a izvršni kod se nalazi u fajlu test/program.obj
Za pokretanje koda se koristi komanda:
java -cp lib/mj-runtime-1.1.jar rs.etf.pp1.mj.runtime.Run test/program.obj
Za prikaz izgenerisanog bajtkoda se koristi komanda:
java -cp lib/mj-runtime-1.1.jar rs.etf.pp1.mj.runtime.disasm test/program.obj

Alati
1.	AST-CUP - Construction of useful parsers sa AST proširenjem. Služi za generisanje klasa za sintaksno stablo parsiranja.
2.	JFlex - Biblioteka za generisanje leksičkih analizatora
3.	mj-runtime - Virtuelna mašina za mikrojavu
4.	Log4J – Biblioteka za izveštavanje o izvršavanju programa.
5.	symboltable – JAR arhiva sa klasama neophodnim za generisanje tabele simbola


Test primeri
Osim test primera koji se nalaze na sajtu, priloženi su i test primeri koji dodatno testiraju sve funkcionalnosti kompajlera. Dodatni testovi uključuju detaljnije testiranje petlji, enum-a, kao i pozivanja funkcija.

Novouvedene klase
Sym – klasa generisana AST CUP alatom koja sadrži sve terminale i celobrojne vrednosti koje ih predstavljaju.
Compiler – Klasa koja služi za pokretanje .mj fajlova. Radi sve 4 faze i generiše .obj fajl.
SemanticAnalyzer – Klasa koja proširuje VisitorAdaptor i implementira visit metode. Služi za implementaciju semantičke provere.
CodeGenerator – Klasa koja takođe proširuje VisitorAdaptor i implementira visit metode. Vrši obilazak stabla i tom prilikom generiše bajtkod. 

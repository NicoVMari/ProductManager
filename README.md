# Progetto di Laboratorio: Descrizione Generale

Questo progetto di laboratorio si concentra sul ciclo di vita del software, articolato in diverse fasi principali: Specifica, Progettazione, Implementazione, Collaudo e Manutenzione. Ogni fase richiede una collaborazione attiva tra i gruppi di lavoro coinvolti.

## Specifica

Durante la fase di Specifica, l'obiettivo è definire il dominio del sistema. Questo viene fatto attraverso la modellazione del dominio utilizzando un diagramma delle classi, che rappresenta le entità principali e le loro relazioni. Da questo dominio emergono i requisiti funzionali del sistema, che vengono modellati tramite un diagramma dei casi d'uso. Ogni caso d'uso rappresenta un requisito funzionale del sistema e gli attori coinvolti rappresentano i diversi tipi di utenti. Parallelamente, vengono identificati e definiti i requisiti non funzionali, espressi in linguaggio naturale.

## Progettazione

Nella fase di Progettazione, si procede con la strutturazione del sistema. Vengono modellati i sottosistemi, i componenti e le interfacce utilizzando diagrammi appositi (diagramma dei componenti, diagramma delle classi, diagramma di package). Si adotta uno stile di controllo Call-Return (top-down), dove l'interfaccia utente invoca il gestore che a sua volta interagisce con il database. La fase di Progettazione include anche la modellazione del deployment del sistema e la rappresentazione del comportamento del sistema attraverso diagrammi di attività e di sequenza.

## Implementazione e Collaudo

Dopo la fase di Progettazione, si passa all'Implementazione, dove il sistema viene effettivamente realizzato seguendo i diagrammi e le specifiche definite nella fase precedente. Il codice Java viene scritto e integrato con gli altri componenti del sistema. Successivamente, si procede con il Collaudo, che include la definizione dei test-case utilizzando JUnit per il testing automatico delle singole operazioni e dei requisiti nel loro complesso, prima e dopo l'integrazione nel sistema.

## Utilizzo di GitLab

Tutto il lavoro viene gestito tramite GitLab, utilizzando repository dedicati all'interno del gruppo di lavoro designato. È importante caricare esclusivamente diagrammi UML e file sorgente compilabile, evitando di includere file eseguibili o altri tipi di documenti non pertinenti.

## Strumenti Utilizzati

Durante tutto il processo, sono impiegati strumenti come Visual Paradigm per la modellazione UML e Gradle come strumento di compilazione, testing ed esecuzione del codice.

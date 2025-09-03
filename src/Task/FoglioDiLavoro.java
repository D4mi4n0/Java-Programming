package Task;

public class FoglioDiLavoro {

    private Task[] task;
    private int numTask;

    public FoglioDiLavoro(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Il numero di task non può essere negativo");
        }
        task = new Task[n];
        numTask = 0;
    }

    public void aggiungiTask(Task t) {
        if (t == null || numTask >= task.length) {
            throw new IllegalArgumentException("Il task non può essere null o superiore al numero massimo di task");
        }
        task[numTask] = t;
        numTask++;
    }

    public int numeroTask() {
        return numTask;
    }

    public int spaziLiberi() {
        // Basta sottrarre il numero attuale di task al numero massimo di task
        return task.length - numTask;
    }

    public double durataTotale() {
        double durataTotale = 0;
        for (int i = 0; i < numTask; i++) {
            durataTotale = durataTotale + task[i].getDurata();
        }
        return durataTotale;
    }

    public int numeroTask(int progetto) {
        int count = 0;
        // Itero sulle task e conto solo quelle che hanno un progetto uguale al parametro
        for (int i = 0; i < numTask; i++) {
            if (task[i].getProgetto() == progetto) {
                count++;
            }
        }
        return count;
    }

    public double durata(int id) {
        double durataTotale = 0;
        // Itero sulle task e sommo solo quelle che hanno un id uguale al parametro
        for (int i = 0; i < numTask; i++) {
            if (task[i].getId() == id) {
                durataTotale = durataTotale + task[i].getDurata();
            }
        }
        return durataTotale;
    }

    public double durataMedia(int id) {
        double durataTotale = 0;
        // Itero sulle task e sommo solo quelle che hanno un id uguale al parametro
        for (int i = 0; i < numTask; i++) {
            if (task[i].getId() == id) {
                durataTotale = durataTotale + task[i].getDurata();
            }
        }
        return durataTotale / numeroTask(id);
    }

}
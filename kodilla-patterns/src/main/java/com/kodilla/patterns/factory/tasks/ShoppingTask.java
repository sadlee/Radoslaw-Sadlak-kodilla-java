package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    private Boolean taskexecuted;


    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    //Metoda isTaskExecuted powinna zwracać wartość flagi typu boolean (trzeba utworzyć dodatkową zmienną).
    //Wartość flagi powinna być zmieniana w w metodzie executeTask()
    //Po dodaniu flagi w klasach dziedziczących po Task, sprawdź czy wartość flagi jest zmieniana
    //po wykonaniu metody executeTask()
    // Metoda executeTask powinna być typu void. Flaga taskExecuted powinna znajdować się w klasie
    // - zmienna w klasie

    @Override
    public void executeTask() {
        System.out.println("Buy " + quantity + " " + whatToBuy);
        taskexecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(taskexecuted) return true;
        else return false;
    }
}
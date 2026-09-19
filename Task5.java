class AIExperiment {

    String experimentName;

    int completedEpochs;

    int targetEpochs;


    void runEpochs(int epochs) {

        completedEpochs =
                completedEpochs + epochs;
    }


    void runEpochs(int epochs, int bonusEpochs) {

        int totalEpochs =
                epochs + bonusEpochs;

        completedEpochs =
                completedEpochs + totalEpochs;
    }


    int remainingEpochs() {

        int remaining =
                targetEpochs - completedEpochs;

        return remaining;
    }


    String status() {

        return "Experiment: "
                + experimentName
                + ", Completed: "
                + completedEpochs
                + ", Target: "
                + targetEpochs
                + ", Remaining: "
                + remainingEpochs();
    }
}
public class Task5{

    static void addHelperEpoch(AIExperiment experiment) {

        experiment.completedEpochs =
                experiment.completedEpochs + 1;
    }


    public static void main(String[] args) {

        AIExperiment experiment1 =
                new AIExperiment();

        AIExperiment experiment2 =
                new AIExperiment();


        // -------------------------------
        // Assign values
        // -------------------------------

        experiment1.experimentName =
                "Image Classification";

        experiment1.completedEpochs = 10;

        experiment1.targetEpochs = 20;


        experiment2.experimentName =
                "Chatbot Training";

        experiment2.completedEpochs = 5;

        experiment2.targetEpochs = 15;


        // -------------------------------
        // Initial state
        // -------------------------------

        System.out.println("Initial state:");

        System.out.println(
                experiment1.status());

        System.out.println(
                experiment2.status());


        // -------------------------------
        // Use first overload
        // -------------------------------

        // Prediction:
        // 10 + 3 = 13

        experiment1.runEpochs(3);


        // -------------------------------
        // Use second overload
        // -------------------------------

        // Prediction:
        // 5 + 2 + 2 = 9

        experiment2.runEpochs(2, 2);


        System.out.println(
                "\nAfter runEpochs calls:");

        System.out.println(
                experiment1.status());

        System.out.println(
                experiment2.status());


        // -------------------------------
        // Remaining epochs
        // -------------------------------

        System.out.println(
                "\nRemaining epochs:");

        System.out.println(
                experiment1.experimentName
                + ": "
                + experiment1.remainingEpochs());

        System.out.println(
                experiment2.experimentName
                + ": "
                + experiment2.remainingEpochs());


        // -------------------------------
        // Helper method
        // -------------------------------

        // Prediction:
        // experiment1 becomes 14

        addHelperEpoch(experiment1);


        System.out.println(
                "\nAfter helper method:");

        System.out.println(
                experiment1.status());

        System.out.println(
                experiment2.status());
    }
}
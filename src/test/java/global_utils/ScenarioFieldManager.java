package global_utils;

import global_objects.ScenarioFieldHolder;

import java.util.HashMap;

/**
 * Manages the components required for each Scenario. The components are made available at every step of each scenario
 * by saving and accessing them using thread identifiers (threadID).
 * Because only one scenario is run per thread at any one time and a threadID is exclusive to each thread: We can save a
 * scenario's components against its threadID at its beginning and when this scenario finishes and the next scenario on
 * this thread starts, we can replace the components with those for the new scenario. This all means that we have
 * components for each scenario that are accessible from anywhere in the app when and only when this scenario is in the
 * foreground. Thus enabling multithreading.
 */
public class ScenarioFieldManager {
    private static HashMap<Long, ScenarioFieldHolder> threadToFieldHolderMap = new HashMap<>();

    public static synchronized ScenarioFieldHolder getFieldHolder(long threadID) {
        return threadToFieldHolderMap.get(threadID);
    }

    public static synchronized void removeFieldHolder(long threadID) {
        threadToFieldHolderMap.remove(threadID);
    }

    public static synchronized void addFieldHolder(long threadID, ScenarioFieldHolder scenarioFieldHolder) {
        threadToFieldHolderMap.put(threadID, scenarioFieldHolder);
    }

}
package seedu.command;

import seedu.ModuleManager;
import seedu.ScheduleManager;
import seedu.Storage;
import seedu.Ui;
import seedu.task.TaskList;

/**
 * Commands to execute edit the module's information. This may be implemented by setter functions.
 * TODO add code
 */
public class EditModuleCommand extends Command{
    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) {
    }

    @Override
    public void execute(ScheduleManager scheduleManager, ModuleManager moduleManager, Ui ui) {

    }
}

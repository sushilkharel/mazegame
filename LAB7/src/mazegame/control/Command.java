package mazegame.control;

import mazegame.entity.Player;

public interface Command {

	CommandResponse execute(ParsedInput validInput, Player thePlayer);

}

package vazkii.emotes.common;

import vazkii.emotes.common.network.PacketEmote;
import vazkii.emotes.common.network.PacketHandler;

public class CommonProxy {

	public void init() {
		PacketHandler.init();
	}
	
	public void handlePacket(PacketEmote message) {
		// NO-OP
	}
	
}

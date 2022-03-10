package x.KenKOfficial.Check.Listeners;

import org.bukkit.event.player.*;
import x.KenKOfficial.Check.Apis.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;

public class PlayerQuit implements Listener
{
    private static boolean I(final int IIlIlllllllllll) {
        return IIlIlllllllllll != 0;
    }
    
    @EventHandler
    public void onQuit(final PlayerQuitEvent lIIllllllllllll) {
        final Player IIIllllllllllll = lIIllllllllllll.getPlayer();
        if (I(API.sprawdzany.contains(IIIllllllllllll) ? 1 : 0)) {
            API.getLogout(IIIllllllllllll.getName());
        }
    }
}

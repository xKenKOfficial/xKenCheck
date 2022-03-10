package x.KenKOfficial.Check.Listeners;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.Check.Apis.*;
import x.KenKOfficial.Check.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import x.KenKOfficial.Check.Main.*;
import java.util.*;

public class PlayerCommandPreprocess implements Listener
{
    private static final /* synthetic */ String[] Illl;
    private static final /* synthetic */ String CANCEL_MESSAGE;
    private static final /* synthetic */ List<String> cancelCommands;
    private static final /* synthetic */ String PREFIX;
    private static final /* synthetic */ int[] llll;
    
    private static String llIlIl(final String lIlIIlIllIlllll, final String IIlIIlIllIlllll) {
        try {
            final SecretKeySpec IIIlIlIllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIlIIlIllIlllll.getBytes(StandardCharsets.UTF_8)), PlayerCommandPreprocess.llll[7]), "DES");
            final Cipher lllIIlIllIlllll = Cipher.getInstance("DES");
            lllIIlIllIlllll.init(PlayerCommandPreprocess.llll[2], IIIlIlIllIlllll);
            return new String(lllIIlIllIlllll.doFinal(Base64.getDecoder().decode(lIlIIlIllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIIlIllIlllll) {
            IllIIlIllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static String IIllIl(final String IllIlIIllIlllll, final String lIlIlIIllIlllll) {
        try {
            final SecretKeySpec llIllIIllIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIIllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlIllIIllIlllll = Cipher.getInstance("Blowfish");
            IlIllIIllIlllll.init(PlayerCommandPreprocess.llll[2], llIllIIllIlllll);
            return new String(IlIllIIllIlllll.doFinal(Base64.getDecoder().decode(IllIlIIllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIIllIlllll) {
            lIIllIIllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static void lIllIl() {
        (Illl = new String[PlayerCommandPreprocess.llll[6]])[PlayerCommandPreprocess.llll[0]] = llIlIl("8sCX6WrNdpc=", "LFuuM");
        PlayerCommandPreprocess.Illl[PlayerCommandPreprocess.llll[1]] = IIllIl("CoRoHYTMjHE=", "Trqca");
        PlayerCommandPreprocess.Illl[PlayerCommandPreprocess.llll[2]] = llIlIl("GvF8FsJ8AfA=", "bCRIo");
        PlayerCommandPreprocess.Illl[PlayerCommandPreprocess.llll[3]] = IIllIl("HMMrK1eaJkk=", "TDbEc");
        PlayerCommandPreprocess.Illl[PlayerCommandPreprocess.llll[4]] = IIllIl("NUOgnDJBF4j93YnxuqQ+4lz237aO9/1GBjssjIWixP4=", "VLbSQ");
        PlayerCommandPreprocess.Illl[PlayerCommandPreprocess.llll[5]] = llIlIl("YbOZyipZuRgJq0YkvMViMFejGsKdQKyCOSCHsxPv6VY=", "BXCtm");
    }
    
    @EventHandler
    public void onCommandExecute(final PlayerCommandPreprocessEvent lIIIllIllIlllll) {
        final Player llIIllIllIlllll = lIIIllIllIlllll.getPlayer();
        final String[] IlIIllIllIlllll = lIIIllIllIlllll.getMessage().split(PlayerCommandPreprocess.Illl[PlayerCommandPreprocess.llll[0]]);
        if (llllIl(API.sprawdzany.contains(llIIllIllIlllll) ? 1 : 0)) {
            final Exception IlllIlIllIlllll = (Exception)PlayerCommandPreprocess.cancelCommands.iterator();
            while (llllIl(((Iterator)IlllIlIllIlllll).hasNext() ? 1 : 0)) {
                final String IllIllIllIlllll = ((Iterator<String>)IlllIlIllIlllll).next();
                if (llllIl(IlIIllIllIlllll[PlayerCommandPreprocess.llll[0]].equalsIgnoreCase(String.valueOf(new StringBuilder().append(PlayerCommandPreprocess.Illl[PlayerCommandPreprocess.llll[1]]).append(IllIllIllIlllll))) ? 1 : 0)) {
                    lIIIllIllIlllll.setCancelled((boolean)(PlayerCommandPreprocess.llll[1] != 0));
                    llIIllIllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerCommandPreprocess.PREFIX).append(PlayerCommandPreprocess.Illl[PlayerCommandPreprocess.llll[2]]).append(PlayerCommandPreprocess.CANCEL_MESSAGE))));
                }
                "".length();
                if ((81 + 89 - 58 + 18 ^ 74 + 21 - 37 + 76) < ((19 + 6 + 50 + 56 ^ 97 + 80 - 163 + 134) & (8 + 123 + 3 + 21 ^ 80 + 109 - 147 + 98 ^ -" ".length()))) {
                    return;
                }
            }
        }
    }
    
    static {
        IlllIl();
        lIllIl();
        PREFIX = Main.getPlugin().getConfig().getString(PlayerCommandPreprocess.Illl[PlayerCommandPreprocess.llll[3]]);
        cancelCommands = Main.getPlugin().getConfig().getStringList(PlayerCommandPreprocess.Illl[PlayerCommandPreprocess.llll[4]]);
        CANCEL_MESSAGE = Main.getPlugin().getConfig().getString(PlayerCommandPreprocess.Illl[PlayerCommandPreprocess.llll[5]]);
    }
    
    private static void IlllIl() {
        (llll = new int[8])[0] = ((0x18 ^ 0x4B) & ~(0x54 ^ 0x7));
        PlayerCommandPreprocess.llll[1] = " ".length();
        PlayerCommandPreprocess.llll[2] = "  ".length();
        PlayerCommandPreprocess.llll[3] = "   ".length();
        PlayerCommandPreprocess.llll[4] = (0x26 ^ 0x2A ^ (0x53 ^ 0x5B));
        PlayerCommandPreprocess.llll[5] = (109 + 180 - 253 + 146 ^ 58 + 22 + 50 + 49);
        PlayerCommandPreprocess.llll[6] = (0x9A ^ 0x9C);
        PlayerCommandPreprocess.llll[7] = (0x71 ^ 0x79);
    }
    
    private static boolean llllIl(final int lIIIlIIllIlllll) {
        return lIIIlIIllIlllll != 0;
    }
}

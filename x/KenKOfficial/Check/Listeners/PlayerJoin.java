package x.KenKOfficial.Check.Listeners;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.Check.Main.*;
import x.KenKOfficial.Check.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import java.util.*;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ int[] lIIl;
    private static final /* synthetic */ String[] IIIl;
    
    private static String lllIl(final String IIIIIIIlIllllll, final String lIlllllIIllllll) {
        try {
            final SecretKeySpec llIIIIIlIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllllIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlIIIIIlIllllll = Cipher.getInstance("Blowfish");
            IlIIIIIlIllllll.init(PlayerJoin.lIIl[2], llIIIIIlIllllll);
            return new String(IlIIIIIlIllllll.doFinal(Base64.getDecoder().decode(IIIIIIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIIlIllllll) {
            lIIIIIIlIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IIlll(final int llIIlIlIIllllll, final int IlIIlIlIIllllll) {
        return llIIlIlIIllllll < IlIIlIlIIllllll;
    }
    
    private static void IlIll() {
        (lIIl = new int[14])[0] = ((0x69 ^ 0x5B) & ~(0x63 ^ 0x51));
        PlayerJoin.lIIl[1] = " ".length();
        PlayerJoin.lIIl[2] = "  ".length();
        PlayerJoin.lIIl[3] = "   ".length();
        PlayerJoin.lIIl[4] = (0x46 ^ 0x42);
        PlayerJoin.lIIl[5] = (0x36 ^ 0x33);
        PlayerJoin.lIIl[6] = (0x8E ^ 0x88);
        PlayerJoin.lIIl[7] = (0x4F ^ 0x23 ^ (0xD1 ^ 0xBA));
        PlayerJoin.lIIl[8] = (0x69 ^ 0x61);
        PlayerJoin.lIIl[9] = (0x79 ^ 0x70);
        PlayerJoin.lIIl[10] = (0x3B ^ 0x13 ^ (0x49 ^ 0x6B));
        PlayerJoin.lIIl[11] = (0xCE ^ 0xAC ^ (0x1A ^ 0x73));
        PlayerJoin.lIIl[12] = (0x72 ^ 0x41 ^ (0x62 ^ 0x5D));
        PlayerJoin.lIIl[13] = (30 + 18 + 95 + 15 ^ 46 + 12 - 13 + 102);
    }
    
    private static void lIIll() {
        (IIIl = new String[PlayerJoin.lIIl[13]])[PlayerJoin.lIIl[0]] = IllIl("AyMzPhkdEC83Fhw=", "sOFYp");
        PlayerJoin.IIIl[PlayerJoin.lIIl[1]] = lllIl("JqO3COq1v+QNp4p/tvd/jmQIt12KOCVo", "pbhaE");
        PlayerJoin.IIIl[PlayerJoin.lIIl[2]] = IIIll("SOxnwbE1YJgplwok6IyJwSyx26YnO+oPTKx4BwgOcBvbYIm87uTYTqOPLWottgqS", "tzLgh");
        PlayerJoin.IIIl[PlayerJoin.lIIl[3]] = lllIl("R6CVbWGk5BU=", "nnYOq");
        PlayerJoin.IIIl[PlayerJoin.lIIl[4]] = lllIl("aaCPFEuiln1s9WRb2UPQirkq7LMl/QSL", "KoGSa");
        PlayerJoin.IIIl[PlayerJoin.lIIl[5]] = IllIl("", "wIRbB");
        PlayerJoin.IIIl[PlayerJoin.lIIl[6]] = IIIll("dtkbL/feaAg0s6hXUwpyfn3PHE2to+mgXSdjyupR2W4=", "akNWu");
        PlayerJoin.IIIl[PlayerJoin.lIIl[7]] = IllIl("", "wgrKt");
        PlayerJoin.IIIl[PlayerJoin.lIIl[8]] = IIIll("I1opuGW2BJIdsJcSDrrMjVbKKQiUbJv4Lp0q56DDFPUWszJUCK5tAZo7mMHXRbDA", "wXsxN");
        PlayerJoin.IIIl[PlayerJoin.lIIl[9]] = IIIll("3cZ+0E0/OmQ=", "RngOL");
        PlayerJoin.IIIl[PlayerJoin.lIIl[10]] = IllIl("ZXJPDjkxIRkjOz81GyUzY2xCb3QnZUlhYnZ6Sn9gdyZWbz1lMxcrKGt0SH9odWI=", "ETxOR");
        PlayerJoin.IIIl[PlayerJoin.lIIl[11]] = IllIl("", "NiZHa");
        PlayerJoin.IIIl[PlayerJoin.lIIl[12]] = lllIl("7LSEo+8Lqxa3bdOUYGs7KA7yG4/ijRJIqwyiac99ZgxtqK724h/UsncDjLhKrEph", "NgtXj");
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent llIlIIIlIllllll) {
        final Player IlIlIIIlIllllll = llIlIIIlIllllll.getPlayer();
        if (llIll(Main.getPlugin().getConfig().getBoolean(PlayerJoin.IIIl[PlayerJoin.lIIl[0]]) ? 1 : 0) && llIll(IlIlIIIlIllllll.hasPermission(PlayerJoin.IIIl[PlayerJoin.lIIl[1]]) ? 1 : 0)) {
            IlIlIIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIIl[PlayerJoin.lIIl[2]]));
            IlIlIIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIIl[PlayerJoin.lIIl[3]]));
            IlIlIIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIIl[PlayerJoin.lIIl[4]]));
            IlIlIIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIIl[PlayerJoin.lIIl[5]]));
            IlIlIIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIIl[PlayerJoin.lIIl[6]]));
            IlIlIIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIIl[PlayerJoin.lIIl[7]]));
            IlIlIIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIIl[PlayerJoin.lIIl[8]]));
            IlIlIIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIIl[PlayerJoin.lIIl[9]]));
            IlIlIIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIIl[PlayerJoin.lIIl[10]]));
            IlIlIIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIIl[PlayerJoin.lIIl[11]]));
            IlIlIIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIIl[PlayerJoin.lIIl[12]]));
        }
    }
    
    private static String IIIll(final String llIllIlIIllllll, final String IlIllIlIIllllll) {
        try {
            final SecretKeySpec IllllIlIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIllIlIIllllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.lIIl[8]), "DES");
            final Cipher lIlllIlIIllllll = Cipher.getInstance("DES");
            lIlllIlIIllllll.init(PlayerJoin.lIIl[2], IllllIlIIllllll);
            return new String(lIlllIlIIllllll.doFinal(Base64.getDecoder().decode(llIllIlIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlllIlIIllllll) {
            IIlllIlIIllllll.printStackTrace();
            return null;
        }
    }
    
    private static String IllIl(String llIlIllIIllllll, final String llllIllIIllllll) {
        llIlIllIIllllll = new String(Base64.getDecoder().decode(llIlIllIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlllIllIIllllll = new StringBuilder();
        final char[] lIllIllIIllllll = llllIllIIllllll.toCharArray();
        int IIllIllIIllllll = PlayerJoin.lIIl[0];
        final long IllIIllIIllllll = (Object)llIlIllIIllllll.toCharArray();
        final long lIlIIllIIllllll = IllIIllIIllllll.length;
        float IIlIIllIIllllll = PlayerJoin.lIIl[0];
        while (IIlll((int)IIlIIllIIllllll, (int)lIlIIllIIllllll)) {
            final char lIIIlllIIllllll = IllIIllIIllllll[IIlIIllIIllllll];
            IlllIllIIllllll.append((char)(lIIIlllIIllllll ^ lIllIllIIllllll[IIllIllIIllllll % lIllIllIIllllll.length]));
            "".length();
            ++IIllIllIIllllll;
            ++IIlIIllIIllllll;
            "".length();
            if (((0xAC ^ 0xA7) & ~(0x57 ^ 0x5C)) > 0) {
                return null;
            }
        }
        return String.valueOf(IlllIllIIllllll);
    }
    
    private static boolean llIll(final int IIIIlIlIIllllll) {
        return IIIIlIlIIllllll != 0;
    }
    
    static {
        IlIll();
        lIIll();
    }
}

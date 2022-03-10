package x.KenKOfficial.Check.Commands;

import org.bukkit.command.*;
import x.KenKOfficial.Check.Utils.*;
import org.bukkit.entity.*;
import x.KenKOfficial.Check.Apis.*;
import org.bukkit.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import x.KenKOfficial.Check.Main.*;
import java.util.*;

public class SprSetCommand implements CommandExecutor
{
    private static final /* synthetic */ String jail_setup;
    private static final /* synthetic */ int[] lIll;
    private static final /* synthetic */ String brak_permisji;
    private static final /* synthetic */ String PREFIX;
    private static final /* synthetic */ String[] IIll;
    private static final /* synthetic */ String sprset_usage;
    private static final /* synthetic */ String spawn_setup;
    
    public boolean onCommand(final CommandSender IlIllllllIlllll, final Command lIlllllllIlllll, final String IIlllllllIlllll, final String[] llIllllllIlllll) {
        if (IIIlIl(IlIllllllIlllll.hasPermission(SprSetCommand.IIll[SprSetCommand.lIll[0]]) ? 1 : 0)) {
            IlIllllllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SprSetCommand.PREFIX).append(SprSetCommand.IIll[SprSetCommand.lIll[1]]).append(SprSetCommand.brak_permisji))));
            return SprSetCommand.lIll[0] != 0;
        }
        if (lIIlIl((IlIllllllIlllll instanceof Player) ? 1 : 0)) {
            if (IlIlIl(llIllllllIlllll.length, SprSetCommand.lIll[1])) {
                IlIllllllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SprSetCommand.PREFIX).append(SprSetCommand.IIll[SprSetCommand.lIll[2]]).append(SprSetCommand.sprset_usage))));
                return SprSetCommand.lIll[0] != 0;
            }
            if (lIIlIl(llIllllllIlllll[SprSetCommand.lIll[0]].equalsIgnoreCase(SprSetCommand.IIll[SprSetCommand.lIll[3]]) ? 1 : 0)) {
                API.setSpawn((Player)IlIllllllIlllll);
                IlIllllllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SprSetCommand.PREFIX).append(SprSetCommand.IIll[SprSetCommand.lIll[4]]).append(SprSetCommand.spawn_setup))));
                "".length();
                if (null != null) {
                    return ((0x71 ^ 0x26) & ~(0x17 ^ 0x40)) != 0x0;
                }
            }
            else if (lIIlIl(llIllllllIlllll[SprSetCommand.lIll[0]].equalsIgnoreCase(SprSetCommand.IIll[SprSetCommand.lIll[5]]) ? 1 : 0)) {
                API.setJail((Player)IlIllllllIlllll);
                IlIllllllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SprSetCommand.PREFIX).append(SprSetCommand.IIll[SprSetCommand.lIll[6]]).append(SprSetCommand.jail_setup))));
                "".length();
                if ("   ".length() == 0) {
                    return ((0x3A ^ 0x6C) & ~(0xE0 ^ 0xB6)) != 0x0;
                }
            }
            else {
                IlIllllllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SprSetCommand.PREFIX).append(SprSetCommand.IIll[SprSetCommand.lIll[7]]).append(SprSetCommand.sprset_usage))));
                "".length();
                if (-(0x12 ^ 0x0 ^ (0x7A ^ 0x6C)) >= 0) {
                    return ((149 + 73 - 166 + 124 ^ 3 + 73 + 21 + 32) & (0xDA ^ 0x83 ^ (0xAE ^ 0xC2) ^ -" ".length())) != 0x0;
                }
            }
        }
        else {
            IlIllllllIlllll.sendMessage(String.valueOf(new StringBuilder().append(ChatColor.DARK_RED).append(SprSetCommand.IIll[SprSetCommand.lIll[8]])));
        }
        return SprSetCommand.lIll[0] != 0;
    }
    
    private static boolean IIIlIl(final int llllllIllIlllll) {
        return llllllIllIlllll == 0;
    }
    
    private static boolean lIIlIl(final int lIIIIIlllIlllll) {
        return lIIIIIlllIlllll != 0;
    }
    
    private static boolean IlIlIl(final int IIlIIIlllIlllll, final int llIIIIlllIlllll) {
        return IIlIIIlllIlllll < llIIIIlllIlllll;
    }
    
    private static String llIIIl(final String lIIIlllllIlllll, final String IlllIllllIlllll) {
        try {
            final SecretKeySpec IIlIlllllIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlllIllllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIIlllllIlllll = Cipher.getInstance("Blowfish");
            llIIlllllIlllll.init(SprSetCommand.lIll[2], IIlIlllllIlllll);
            return new String(llIIlllllIlllll.doFinal(Base64.getDecoder().decode(lIIIlllllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIlllllIlllll) {
            IlIIlllllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIl(String llllIIlllIlllll, final String IlllIIlllIlllll) {
        llllIIlllIlllll = new String(Base64.getDecoder().decode(llllIIlllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlIIlIlllIlllll = new StringBuilder();
        final char[] lIIIlIlllIlllll = IlllIIlllIlllll.toCharArray();
        int IIIIlIlllIlllll = SprSetCommand.lIll[0];
        final float IlIlIIlllIlllll = (Object)llllIIlllIlllll.toCharArray();
        final short lIIlIIlllIlllll = (short)IlIlIIlllIlllll.length;
        char IIIlIIlllIlllll = (char)SprSetCommand.lIll[0];
        while (IlIlIl(IIIlIIlllIlllll, lIIlIIlllIlllll)) {
            final char lIlIlIlllIlllll = IlIlIIlllIlllll[IIIlIIlllIlllll];
            IlIIlIlllIlllll.append((char)(lIlIlIlllIlllll ^ lIIIlIlllIlllll[IIIIlIlllIlllll % lIIIlIlllIlllll.length]));
            "".length();
            ++IIIIlIlllIlllll;
            ++IIIlIIlllIlllll;
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(IlIIlIlllIlllll);
    }
    
    static {
        lllIIl();
        IllIIl();
        PREFIX = Main.getPlugin().getConfig().getString(SprSetCommand.IIll[SprSetCommand.lIll[9]]);
        brak_permisji = Main.getPlugin().getConfig().getString(SprSetCommand.IIll[SprSetCommand.lIll[10]]);
        sprset_usage = Main.getPlugin().getConfig().getString(SprSetCommand.IIll[SprSetCommand.lIll[11]]);
        spawn_setup = Main.getPlugin().getConfig().getString(SprSetCommand.IIll[SprSetCommand.lIll[12]]);
        jail_setup = Main.getPlugin().getConfig().getString(SprSetCommand.IIll[SprSetCommand.lIll[13]]);
    }
    
    private static void IllIIl() {
        (IIll = new String[SprSetCommand.lIll[14]])[SprSetCommand.lIll[0]] = llIIIl("D4lQUd//mJEfJrRGdYXUCuir8ay515fr", "mcSPE");
        SprSetCommand.IIll[SprSetCommand.lIll[1]] = llIIIl("dwCGp1TKfU8=", "ZDymK");
        SprSetCommand.IIll[SprSetCommand.lIll[2]] = llIIIl("wNY1oZtEkhw=", "fwFsN");
        SprSetCommand.IIll[SprSetCommand.lIll[3]] = llIIIl("MXGc9zoIt08=", "qoMQw");
        SprSetCommand.IIll[SprSetCommand.lIll[4]] = IIlIIl("JYoAbOgCz3E=", "cYDRM");
        SprSetCommand.IIll[SprSetCommand.lIll[5]] = llIIIl("S+6hMfgwFAc=", "WWVme");
        SprSetCommand.IIll[SprSetCommand.lIll[6]] = llIIIl("c72wkl0G/R8=", "UpjJK");
        SprSetCommand.IIll[SprSetCommand.lIll[7]] = lIlIIl("TA==", "leTEX");
        SprSetCommand.IIll[SprSetCommand.lIll[8]] = IIlIIl("b9T7D6wECRnwU+lxXH33TfFXRhxSb7ebDFOqg8kYTuDF/m85sAZYgg==", "FZPVv");
        SprSetCommand.IIll[SprSetCommand.lIll[9]] = llIIIl("myC28N1IHs4=", "gzhuK");
        SprSetCommand.IIll[SprSetCommand.lIll[10]] = llIIIl("ZHqQlygDYVMS+w9zFIKzdA==", "gkROU");
        SprSetCommand.IIll[SprSetCommand.lIll[11]] = IIlIIl("MME8hc4WBJOejvC/gpm5gg==", "AqIYQ");
        SprSetCommand.IIll[SprSetCommand.lIll[12]] = lIlIIl("Nzg3JD0bOzMnJjQ=", "DHVSS");
        SprSetCommand.IIll[SprSetCommand.lIll[13]] = IIlIIl("RsmqoGdQd60sYK1uFTd6bA==", "yNxzm");
    }
    
    private static String IIlIIl(final String IlIIIllllIlllll, final String llIIIllllIlllll) {
        try {
            final SecretKeySpec lllIIllllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIllllIlllll.getBytes(StandardCharsets.UTF_8)), SprSetCommand.lIll[8]), "DES");
            final Cipher IllIIllllIlllll = Cipher.getInstance("DES");
            IllIIllllIlllll.init(SprSetCommand.lIll[2], lllIIllllIlllll);
            return new String(IllIIllllIlllll.doFinal(Base64.getDecoder().decode(IlIIIllllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIllllIlllll) {
            lIlIIllllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIl() {
        (lIll = new int[15])[0] = ((0x19 ^ 0x25) & ~(0x89 ^ 0xB5));
        SprSetCommand.lIll[1] = " ".length();
        SprSetCommand.lIll[2] = "  ".length();
        SprSetCommand.lIll[3] = "   ".length();
        SprSetCommand.lIll[4] = (0x23 ^ 0x27);
        SprSetCommand.lIll[5] = (0x42 ^ 0x1D ^ (0xE6 ^ 0xBC));
        SprSetCommand.lIll[6] = (0xE1 ^ 0xAC ^ (0x21 ^ 0x6A));
        SprSetCommand.lIll[7] = (0x3C ^ 0x3B);
        SprSetCommand.lIll[8] = (0x23 ^ 0x2B);
        SprSetCommand.lIll[9] = (0x6A ^ 0x63);
        SprSetCommand.lIll[10] = (0x6 ^ 0xC);
        SprSetCommand.lIll[11] = (0x50 ^ 0xA ^ (0x68 ^ 0x39));
        SprSetCommand.lIll[12] = (0xBC ^ 0xB0);
        SprSetCommand.lIll[13] = (0xF0 ^ 0x87 ^ (0x64 ^ 0x1E));
        SprSetCommand.lIll[14] = (0x5D ^ 0x53);
    }
}

package x.KenKOfficial.Check.Commands;

import x.KenKOfficial.Check.Main.*;
import java.nio.charset.*;
import org.bukkit.command.*;
import x.KenKOfficial.Check.Utils.*;
import org.bukkit.entity.*;
import x.KenKOfficial.Check.Apis.*;
import org.bukkit.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class SprawdzCommand implements CommandExecutor
{
    private static final /* synthetic */ String PREFIX;
    private static final /* synthetic */ String[] ll;
    private static final /* synthetic */ String admin_gracz_czysty;
    private static final /* synthetic */ String spr_usage;
    private static final /* synthetic */ String gracz_czysty;
    private static final /* synthetic */ String offline_player;
    private static final /* synthetic */ int[] lIl;
    private static final /* synthetic */ String brak_permisji;
    private static final /* synthetic */ String admin_gracz_cheater;
    private static final /* synthetic */ String admin_message_check_player;
    
    private static boolean lIIl(final int IlIIIlIllllllll) {
        return IlIIIlIllllllll != 0;
    }
    
    private static boolean IIIl(final int IIIIIlIllllllll) {
        return IIIIIlIllllllll == 0;
    }
    
    private static boolean IlIl(final int lllIIlIllllllll, final int IllIIlIllllllll) {
        return lllIIlIllllllll < IllIIlIllllllll;
    }
    
    static {
        lll();
        Ill();
        PREFIX = Main.getPlugin().getConfig().getString(SprawdzCommand.ll[SprawdzCommand.lIl[20]]);
        brak_permisji = Main.getPlugin().getConfig().getString(SprawdzCommand.ll[SprawdzCommand.lIl[21]]);
        spr_usage = Main.getPlugin().getConfig().getString(SprawdzCommand.ll[SprawdzCommand.lIl[22]]);
        offline_player = Main.getPlugin().getConfig().getString(SprawdzCommand.ll[SprawdzCommand.lIl[23]]);
        admin_message_check_player = Main.getPlugin().getConfig().getString(SprawdzCommand.ll[SprawdzCommand.lIl[24]]);
        gracz_czysty = Main.getPlugin().getConfig().getString(SprawdzCommand.ll[SprawdzCommand.lIl[25]]);
        admin_gracz_czysty = Main.getPlugin().getConfig().getString(SprawdzCommand.ll[SprawdzCommand.lIl[26]]);
        admin_gracz_cheater = Main.getPlugin().getConfig().getString(SprawdzCommand.ll[SprawdzCommand.lIl[27]]);
    }
    
    private static boolean llIl(final Object IIlIIlIllllllll) {
        return IIlIIlIllllllll == null;
    }
    
    private static String ll(String llllllIllllllll, final String IlllllIllllllll) {
        llllllIllllllll = new String(Base64.getDecoder().decode(llllllIllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlIIIIlllllllll = new StringBuilder();
        final char[] lIIIIIlllllllll = IlllllIllllllll.toCharArray();
        int IIIIIIlllllllll = SprawdzCommand.lIl[0];
        final int IlIlllIllllllll = (Object)llllllIllllllll.toCharArray();
        final Exception lIIlllIllllllll = (Exception)IlIlllIllllllll.length;
        byte IIIlllIllllllll = (byte)SprawdzCommand.lIl[0];
        while (IlIl(IIIlllIllllllll, (int)lIIlllIllllllll)) {
            final char lIlIIIlllllllll = IlIlllIllllllll[IIIlllIllllllll];
            IlIIIIlllllllll.append((char)(lIlIIIlllllllll ^ lIIIIIlllllllll[IIIIIIlllllllll % lIIIIIlllllllll.length]));
            "".length();
            ++IIIIIIlllllllll;
            ++IIIlllIllllllll;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(IlIIIIlllllllll);
    }
    
    public boolean onCommand(final CommandSender lIlIIllllllllll, final Command IIlIIllllllllll, final String llIIIllllllllll, final String[] IlIIIllllllllll) {
        if (IIIl(lIlIIllllllllll.hasPermission(SprawdzCommand.ll[SprawdzCommand.lIl[0]]) ? 1 : 0)) {
            lIlIIllllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SprawdzCommand.PREFIX).append(SprawdzCommand.ll[SprawdzCommand.lIl[1]]).append(SprawdzCommand.brak_permisji))));
            return SprawdzCommand.lIl[0] != 0;
        }
        if (lIIl((lIlIIllllllllll instanceof Player) ? 1 : 0)) {
            if (IlIl(IlIIIllllllllll.length, SprawdzCommand.lIl[1])) {
                lIlIIllllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SprawdzCommand.PREFIX).append(SprawdzCommand.ll[SprawdzCommand.lIl[2]]).append(SprawdzCommand.spr_usage))));
                return SprawdzCommand.lIl[0] != 0;
            }
            final Player lllIIllllllllll = Bukkit.getPlayer(IlIIIllllllllll[SprawdzCommand.lIl[1]]);
            if (lIIl(IlIIIllllllllll[SprawdzCommand.lIl[0]].equalsIgnoreCase(SprawdzCommand.ll[SprawdzCommand.lIl[3]]) ? 1 : 0)) {
                if (llIl(lllIIllllllllll)) {
                    lIlIIllllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SprawdzCommand.PREFIX).append(SprawdzCommand.ll[SprawdzCommand.lIl[4]]).append(SprawdzCommand.offline_player))));
                    return SprawdzCommand.lIl[1] != 0;
                }
                final List<String> lIIlIllllllllll = (List<String>)Main.getPlugin().getConfig().getStringList(SprawdzCommand.ll[SprawdzCommand.lIl[5]]);
                String IIIlIllllllllll = SprawdzCommand.ll[SprawdzCommand.lIl[6]];
                int IlIlIllllllllll = SprawdzCommand.lIl[0];
                while (IlIl(IlIlIllllllllll, lIIlIllllllllll.size())) {
                    "".length();
                    IIIlIllllllllll = String.valueOf(lIIlIllllllllll.get(IlIlIllllllllll));
                    lllIIllllllllll.sendMessage(ChatUtil.fixColor(IIIlIllllllllll));
                    ++IlIlIllllllllll;
                    "".length();
                    if (((0x8B ^ 0x9F) & ~(0x80 ^ 0x94)) > 0) {
                        return ((0xB6 ^ 0x9C) & ~(0x62 ^ 0x48)) != 0x0;
                    }
                }
                API.getTeleportJail(lllIIllllllllll, (Player)lIlIIllllllllll);
                lIlIIllllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SprawdzCommand.PREFIX).append(SprawdzCommand.ll[SprawdzCommand.lIl[7]]).append(SprawdzCommand.admin_message_check_player.replace(SprawdzCommand.ll[SprawdzCommand.lIl[8]], lllIIllllllllll.getName())))));
                "".length();
                if (null != null) {
                    return ((0x8D ^ 0xA5) & ~(0x13 ^ 0x3B)) != 0x0;
                }
            }
            else if (lIIl(IlIIIllllllllll[SprawdzCommand.lIl[0]].equalsIgnoreCase(SprawdzCommand.ll[SprawdzCommand.lIl[9]]) ? 1 : 0)) {
                if (llIl(lllIIllllllllll)) {
                    lIlIIllllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SprawdzCommand.PREFIX).append(SprawdzCommand.ll[SprawdzCommand.lIl[10]]).append(SprawdzCommand.offline_player))));
                    return SprawdzCommand.lIl[1] != 0;
                }
                API.getTeleportSpawn(lllIIllllllllll, (Player)lIlIIllllllllll);
                lllIIllllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SprawdzCommand.PREFIX).append(SprawdzCommand.ll[SprawdzCommand.lIl[11]]).append(SprawdzCommand.gracz_czysty))));
                lIlIIllllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SprawdzCommand.PREFIX).append(SprawdzCommand.ll[SprawdzCommand.lIl[12]]).append(SprawdzCommand.admin_gracz_czysty.replace(SprawdzCommand.ll[SprawdzCommand.lIl[13]], lllIIllllllllll.getName())))));
                "".length();
                if (null != null) {
                    return ((142 + 155 - 212 + 90 ^ 63 + 53 + 38 + 7) & (118 + 60 - 124 + 127 ^ 124 + 140 - 150 + 73 ^ -" ".length())) != 0x0;
                }
            }
            else if (lIIl(IlIIIllllllllll[SprawdzCommand.lIl[0]].equalsIgnoreCase(SprawdzCommand.ll[SprawdzCommand.lIl[14]]) ? 1 : 0)) {
                if (llIl(lllIIllllllllll)) {
                    lIlIIllllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SprawdzCommand.PREFIX).append(SprawdzCommand.ll[SprawdzCommand.lIl[15]]).append(SprawdzCommand.offline_player))));
                    return SprawdzCommand.lIl[1] != 0;
                }
                API.getBan(lllIIllllllllll.getName(), (Player)lIlIIllllllllll);
                lIlIIllllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SprawdzCommand.PREFIX).append(SprawdzCommand.ll[SprawdzCommand.lIl[16]]).append(SprawdzCommand.admin_gracz_cheater.replace(SprawdzCommand.ll[SprawdzCommand.lIl[17]], lllIIllllllllll.getName())))));
                "".length();
                if ("  ".length() == 0) {
                    return ((0x74 ^ 0x7D ^ (0x39 ^ 0x28)) & (0x13 ^ 0x29 ^ (0x54 ^ 0x76) ^ -" ".length())) != 0x0;
                }
            }
            else {
                lIlIIllllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SprawdzCommand.PREFIX).append(SprawdzCommand.ll[SprawdzCommand.lIl[18]]).append(SprawdzCommand.spr_usage))));
            }
            "".length();
            if (null != null) {
                return ("   ".length() & ~"   ".length()) != 0x0;
            }
        }
        else {
            lIlIIllllllllll.sendMessage(String.valueOf(new StringBuilder().append(ChatColor.DARK_RED).append(SprawdzCommand.ll[SprawdzCommand.lIl[19]])));
        }
        return SprawdzCommand.lIl[0] != 0;
    }
    
    private static void lll() {
        (lIl = new int[29])[0] = ((0x37 ^ 0x13) & ~(0xAF ^ 0x8B));
        SprawdzCommand.lIl[1] = " ".length();
        SprawdzCommand.lIl[2] = "  ".length();
        SprawdzCommand.lIl[3] = "   ".length();
        SprawdzCommand.lIl[4] = (0x7B ^ 0x6A ^ (0x86 ^ 0x93));
        SprawdzCommand.lIl[5] = (0x4E ^ 0x4B);
        SprawdzCommand.lIl[6] = (0xA1 ^ 0xA7);
        SprawdzCommand.lIl[7] = (0x50 ^ 0x57);
        SprawdzCommand.lIl[8] = (0x99 ^ 0x91);
        SprawdzCommand.lIl[9] = (55 + 62 - 78 + 136 ^ 14 + 77 + 74 + 1);
        SprawdzCommand.lIl[10] = (0x69 ^ 0x63);
        SprawdzCommand.lIl[11] = (0x19 ^ 0x12);
        SprawdzCommand.lIl[12] = (0x64 ^ 0x68);
        SprawdzCommand.lIl[13] = (0xE0 ^ 0xC6 ^ (0x78 ^ 0x53));
        SprawdzCommand.lIl[14] = (0x82 ^ 0x8C);
        SprawdzCommand.lIl[15] = (0x6 ^ 0x9);
        SprawdzCommand.lIl[16] = (0x4C ^ 0x5C);
        SprawdzCommand.lIl[17] = (0x53 ^ 0x18 ^ (0x4A ^ 0x10));
        SprawdzCommand.lIl[18] = (162 + 166 - 223 + 70 ^ 101 + 46 - 30 + 72);
        SprawdzCommand.lIl[19] = (38 + 48 - 64 + 114 ^ 65 + 49 + 20 + 21);
        SprawdzCommand.lIl[20] = (11 + 132 - 34 + 81 ^ 40 + 76 - 114 + 168);
        SprawdzCommand.lIl[21] = (0xA1 ^ 0xB4);
        SprawdzCommand.lIl[22] = (0xBE ^ 0xA8);
        SprawdzCommand.lIl[23] = (0xA7 ^ 0xB0);
        SprawdzCommand.lIl[24] = (0x8 ^ 0x10);
        SprawdzCommand.lIl[25] = (79 + 129 - 80 + 45 ^ 4 + 28 + 72 + 76);
        SprawdzCommand.lIl[26] = (0x4A ^ 0x50);
        SprawdzCommand.lIl[27] = (0x7B ^ 0x6E ^ (0x96 ^ 0x98));
        SprawdzCommand.lIl[28] = (0x86 ^ 0x9A);
    }
    
    private static String l(final String IlIIlIlllllllll, final String lIIIlIlllllllll) {
        try {
            final SecretKeySpec lllIlIlllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlIlllllllll.getBytes(StandardCharsets.UTF_8)), SprawdzCommand.lIl[8]), "DES");
            final Cipher IllIlIlllllllll = Cipher.getInstance("DES");
            IllIlIlllllllll.init(SprawdzCommand.lIl[2], lllIlIlllllllll);
            return new String(IllIlIlllllllll.doFinal(Base64.getDecoder().decode(IlIIlIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIlllllllll) {
            lIlIlIlllllllll.printStackTrace();
            return null;
        }
    }
    
    private static void Ill() {
        (ll = new String[SprawdzCommand.lIl[28]])[SprawdzCommand.lIl[0]] = l("IMr6AiHK2oS/4kcl9cBrdazQTRLhTwao", "Ryccv");
        SprawdzCommand.ll[SprawdzCommand.lIl[1]] = ll("ZA==", "DEnGO");
        SprawdzCommand.ll[SprawdzCommand.lIl[2]] = ll("Vg==", "vaVJz");
        SprawdzCommand.ll[SprawdzCommand.lIl[3]] = ll("BBYvMDQ=", "cdNSN");
        SprawdzCommand.ll[SprawdzCommand.lIl[4]] = ll("Qw==", "cGAGj");
        SprawdzCommand.ll[SprawdzCommand.lIl[5]] = ll("FgckFjsuBjUHIAYRPxQvCCouGSAFHiRbNhgUIRosHgYmHA==", "quEuA");
        SprawdzCommand.ll[SprawdzCommand.lIl[6]] = IIl("jdEHRrsmt2A=", "iBwSc");
        SprawdzCommand.ll[SprawdzCommand.lIl[7]] = ll("bg==", "NWnxy");
        SprawdzCommand.ll[SprawdzCommand.lIl[8]] = ll("AwUYGwsiPw==", "xBJZH");
        SprawdzCommand.ll[SprawdzCommand.lIl[9]] = ll("Ny0ANB0t", "TWyGi");
        SprawdzCommand.ll[SprawdzCommand.lIl[10]] = l("HWbeV6Egyyg=", "ZsUjY");
        SprawdzCommand.ll[SprawdzCommand.lIl[11]] = ll("dw==", "WNqsB");
        SprawdzCommand.ll[SprawdzCommand.lIl[12]] = IIl("9RrsdFaQxic=", "MpSbB");
        SprawdzCommand.ll[SprawdzCommand.lIl[13]] = IIl("K3jbtSTNgdU=", "FBvXQ");
        SprawdzCommand.ll[SprawdzCommand.lIl[14]] = ll("Ih8kKDskBQ==", "AwAIO");
        SprawdzCommand.ll[SprawdzCommand.lIl[15]] = IIl("u7XEsDMoqjw=", "QGUHL");
        SprawdzCommand.ll[SprawdzCommand.lIl[16]] = IIl("sP9/MRN7Umk=", "lVTEQ");
        SprawdzCommand.ll[SprawdzCommand.lIl[17]] = ll("Kg00CyALNw==", "QJfJc");
        SprawdzCommand.ll[SprawdzCommand.lIl[18]] = l("RmkqPEAm2WE=", "KwJYY");
        SprawdzCommand.ll[SprawdzCommand.lIl[19]] = IIl("agTsXGZC4IraamvLBLEUW4XN79a+44UaGMoLVEnsst4YfbJAguk9CQ==", "jfPXQ");
        SprawdzCommand.ll[SprawdzCommand.lIl[20]] = ll("FzsvABAf", "gIJfy");
        SprawdzCommand.ll[SprawdzCommand.lIl[21]] = l("AnISNq1cEE3PvqoQkbTRdw==", "MwTuG");
        SprawdzCommand.ll[SprawdzCommand.lIl[22]] = IIl("Sdf9B38G+Z50pzpH8fmgHA==", "rNJha");
        SprawdzCommand.ll[SprawdzCommand.lIl[23]] = l("MUFJMk4QLvLdr6s848ZH6A==", "WrZcd");
        SprawdzCommand.ll[SprawdzCommand.lIl[24]] = l("LIDWdPT0gdEpTHK3ex2I8GunX/4arl7ICj61W1v3zIg=", "Hwcwz");
        SprawdzCommand.ll[SprawdzCommand.lIl[25]] = ll("DRU2BTE1ED4HLwUKOBUoNQQtHzgeHg==", "jgWfK");
        SprawdzCommand.ll[SprawdzCommand.lIl[26]] = IIl("MZILX1C3SuvutcsIUjdLCyU4uflDN3oHYvDTtfasMmc=", "pTWwj");
        SprawdzCommand.ll[SprawdzCommand.lIl[27]] = ll("JQksECAbACQKPSUKJCYtLAggDSs2", "DmAyN");
    }
    
    private static String IIl(final String lIllIlIllllllll, final String IIllIlIllllllll) {
        try {
            final SecretKeySpec IlIIllIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIllIlIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIIIllIllllllll = Cipher.getInstance("Blowfish");
            lIIIllIllllllll.init(SprawdzCommand.lIl[2], IlIIllIllllllll);
            return new String(lIIIllIllllllll.doFinal(Base64.getDecoder().decode(lIllIlIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIllIllllllll) {
            IIIIllIllllllll.printStackTrace();
            return null;
        }
    }
}

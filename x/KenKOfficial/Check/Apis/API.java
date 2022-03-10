package x.KenKOfficial.Check.Apis;

import org.bukkit.entity.*;
import x.KenKOfficial.Check.Files.*;
import x.KenKOfficial.Check.Main.*;
import x.KenKOfficial.Check.Utils.*;
import org.bukkit.command.*;
import org.bukkit.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class API
{
    private static final /* synthetic */ String[] Il;
    public static /* synthetic */ List<Player> sprawdzany;
    static /* synthetic */ CheckFile cf;
    private static final /* synthetic */ int[] IIl;
    
    public static void getBan(final String lllIIllIlllllll, final Player llIllIlIlllllll) {
        final String lIlIIllIlllllll = Main.getPlugin().getConfig().getString(API.Il[API.IIl[12]]);
        final String IIlIIllIlllllll = Main.getPlugin().getConfig().getString(API.Il[API.IIl[13]]);
        final Player llIIIllIlllllll = Bukkit.getPlayer(lllIIllIlllllll);
        if (lIll(API.sprawdzany.contains(llIIIllIlllllll) ? 1 : 0)) {
            API.sprawdzany.remove(llIIIllIlllllll);
            "".length();
            Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), ChatUtil.fixColor(IIlIIllIlllllll.replace(API.Il[API.IIl[14]], lllIIllIlllllll).replace(API.Il[API.IIl[15]], lIlIIllIlllllll)));
            "".length();
        }
        final double IlIIIllIlllllll = getBaseFile().getFile().getDouble(API.Il[API.IIl[16]]);
        final double lIIIIllIlllllll = getBaseFile().getFile().getDouble(API.Il[API.IIl[17]]);
        final double IIIIIllIlllllll = getBaseFile().getFile().getDouble(API.Il[API.IIl[18]]);
        final float lllllIlIlllllll = (float)getBaseFile().getFile().getInt(API.Il[API.IIl[19]]);
        final float IllllIlIlllllll = (float)getBaseFile().getFile().getInt(API.Il[API.IIl[20]]);
        final String lIlllIlIlllllll = getBaseFile().getFile().getString(API.Il[API.IIl[21]]);
        llIllIlIlllllll.teleport(new Location(Bukkit.getWorld(lIlllIlIlllllll), IlIIIllIlllllll, lIIIIllIlllllll, IIIIIllIlllllll, lllllIlIlllllll, IllllIlIlllllll));
        "".length();
    }
    
    private static String Il(final String IIIlIIIIlllllll, final String lllIIIIIlllllll) {
        try {
            final SecretKeySpec lIllIIIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIIIlllllll.getBytes(StandardCharsets.UTF_8)), API.IIl[8]), "DES");
            final Cipher IIllIIIIlllllll = Cipher.getInstance("DES");
            IIllIIIIlllllll.init(API.IIl[2], lIllIIIIlllllll);
            return new String(IIllIIIIlllllll.doFinal(Base64.getDecoder().decode(IIIlIIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIIIlllllll) {
            llIlIIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    public static void setJail(final Player lIIllllIlllllll) {
        final double lllllllIlllllll = lIIllllIlllllll.getLocation().getX();
        final double IllllllIlllllll = lIIllllIlllllll.getLocation().getY();
        final double lIlllllIlllllll = lIIllllIlllllll.getLocation().getZ();
        final float IIlllllIlllllll = lIIllllIlllllll.getLocation().getYaw();
        final float llIllllIlllllll = lIIllllIlllllll.getLocation().getPitch();
        final String IlIllllIlllllll = lIIllllIlllllll.getWorld().getName();
        getBaseFile().getFile().set(API.Il[API.IIl[6]], (Object)lllllllIlllllll);
        getBaseFile().getFile().set(API.Il[API.IIl[7]], (Object)IllllllIlllllll);
        getBaseFile().getFile().set(API.Il[API.IIl[8]], (Object)lIlllllIlllllll);
        getBaseFile().getFile().set(API.Il[API.IIl[9]], (Object)IIlllllIlllllll);
        getBaseFile().getFile().set(API.Il[API.IIl[10]], (Object)llIllllIlllllll);
        getBaseFile().getFile().set(API.Il[API.IIl[11]], (Object)IlIllllIlllllll);
        getBaseFile().saveData();
    }
    
    private static boolean llll(final int lIlllIllIllllll, final int IIlllIllIllllll) {
        return lIlllIllIllllll < IIlllIllIllllll;
    }
    
    public static void getTeleportJail(final Player lIIllIIIlllllll, final Player IIIIIlIIlllllll) {
        if (Illl(API.sprawdzany.contains(lIIllIIIlllllll) ? 1 : 0)) {
            API.sprawdzany.add(lIIllIIIlllllll);
            "".length();
        }
        final double lllllIIIlllllll = getBaseFile().getFile().getDouble(API.Il[API.IIl[32]]);
        final double IllllIIIlllllll = getBaseFile().getFile().getDouble(API.Il[API.IIl[33]]);
        final double lIlllIIIlllllll = getBaseFile().getFile().getDouble(API.Il[API.IIl[34]]);
        final float IIlllIIIlllllll = (float)getBaseFile().getFile().getInt(API.Il[API.IIl[35]]);
        final float llIllIIIlllllll = (float)getBaseFile().getFile().getInt(API.Il[API.IIl[36]]);
        final String IlIllIIIlllllll = getBaseFile().getFile().getString(API.Il[API.IIl[37]]);
        lIIllIIIlllllll.teleport(new Location(Bukkit.getWorld(IlIllIIIlllllll), lllllIIIlllllll, IllllIIIlllllll, lIlllIIIlllllll, IIlllIIIlllllll, llIllIIIlllllll));
        "".length();
        IIIIIlIIlllllll.teleport(new Location(Bukkit.getWorld(IlIllIIIlllllll), lllllIIIlllllll, IllllIIIlllllll, lIlllIIIlllllll, IIlllIIIlllllll, llIllIIIlllllll));
        "".length();
    }
    
    private static void IIll() {
        (IIl = new int[39])[0] = ((0xB ^ 0x6 ^ (0x32 ^ 0x2E)) & (123 + 54 - 56 + 26 ^ 104 + 37 - 42 + 31 ^ -" ".length()));
        API.IIl[1] = " ".length();
        API.IIl[2] = "  ".length();
        API.IIl[3] = "   ".length();
        API.IIl[4] = (0x95 ^ 0x91);
        API.IIl[5] = (0x34 ^ 0x31);
        API.IIl[6] = (109 + 69 - 105 + 116 ^ 103 + 77 - 57 + 64);
        API.IIl[7] = (0x96 ^ 0x8C ^ (0x9F ^ 0x82));
        API.IIl[8] = (0xB ^ 0x3);
        API.IIl[9] = (0x3 ^ 0xA);
        API.IIl[10] = (0xF4 ^ 0x96 ^ (0x22 ^ 0x4A));
        API.IIl[11] = (0xA0 ^ 0xAB);
        API.IIl[12] = (0xC1 ^ 0xB2 ^ 17 + 62 - 57 + 105);
        API.IIl[13] = (0x34 ^ 0x78 ^ (0xE8 ^ 0xA9));
        API.IIl[14] = (107 + 111 - 124 + 52 ^ 76 + 143 - 74 + 11);
        API.IIl[15] = (0x5A ^ 0x34 ^ (0x38 ^ 0x59));
        API.IIl[16] = (0x32 ^ 0x22);
        API.IIl[17] = (101 + 157 - 191 + 93 ^ 127 + 176 - 178 + 52);
        API.IIl[18] = (0xBC ^ 0x9F ^ (0x65 ^ 0x54));
        API.IIl[19] = (0x86 ^ 0x95);
        API.IIl[20] = (0xB0 ^ 0xA4);
        API.IIl[21] = (46 + 47 + 37 + 15 ^ 57 + 41 + 32 + 2);
        API.IIl[22] = (0xBE ^ 0xA8);
        API.IIl[23] = (61 + 94 - 119 + 124 ^ 37 + 150 - 43 + 39);
        API.IIl[24] = (0x32 ^ 0x2A);
        API.IIl[25] = (0x72 ^ 0x6B);
        API.IIl[26] = (0x3D ^ 0x32 ^ (0x4B ^ 0x5E));
        API.IIl[27] = (60 + 90 - 125 + 115 ^ 104 + 12 + 7 + 28);
        API.IIl[28] = (0x36 ^ 0x41 ^ (0x5A ^ 0x31));
        API.IIl[29] = (0xA8 ^ 0xB5);
        API.IIl[30] = (0x6C ^ 0x4 ^ (0x1A ^ 0x6C));
        API.IIl[31] = (0x48 ^ 0x57);
        API.IIl[32] = (0x45 ^ 0x26 ^ (0x70 ^ 0x33));
        API.IIl[33] = (0xB2 ^ 0x93);
        API.IIl[34] = (29 + 16 + 111 + 11 ^ 14 + 35 - 25 + 109);
        API.IIl[35] = (155 + 140 - 188 + 61 ^ 94 + 35 - 42 + 52);
        API.IIl[36] = (78 + 4 + 27 + 82 ^ 56 + 153 - 121 + 67);
        API.IIl[37] = (111 + 28 - 118 + 142 ^ 128 + 49 - 104 + 61);
        API.IIl[38] = (0x18 ^ 0x42 ^ (0xFB ^ 0x87));
    }
    
    static {
        IIll();
        lIl();
        API.sprawdzany = new ArrayList<Player>();
        API.cf = CheckFile.getInstance();
    }
    
    private static boolean Illl(final int IIIllIllIllllll) {
        return IIIllIllIllllll == 0;
    }
    
    public static void getLogout(final String lIlIIIlIlllllll) {
        final String IIIlIIlIlllllll = Main.getPlugin().getConfig().getString(API.Il[API.IIl[22]]);
        final String lllIIIlIlllllll = Main.getPlugin().getConfig().getString(API.Il[API.IIl[23]]);
        final Player IllIIIlIlllllll = Bukkit.getPlayer(lIlIIIlIlllllll);
        if (lIll(API.sprawdzany.contains(IllIIIlIlllllll) ? 1 : 0)) {
            API.sprawdzany.remove(IllIIIlIlllllll);
            "".length();
            Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), ChatUtil.fixColor(lllIIIlIlllllll.replace(API.Il[API.IIl[24]], lIlIIIlIlllllll).replace(API.Il[API.IIl[25]], IIIlIIlIlllllll)));
            "".length();
        }
    }
    
    private static String l(String lIlIllllIllllll, final String IIlIllllIllllll) {
        lIlIllllIllllll = new String(Base64.getDecoder().decode(lIlIllllIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIIlllllIllllll = new StringBuilder();
        final char[] lllIllllIllllll = IIlIllllIllllll.toCharArray();
        int IllIllllIllllll = API.IIl[0];
        final int IIIIllllIllllll = (Object)lIlIllllIllllll.toCharArray();
        final int llllIlllIllllll = IIIIllllIllllll.length;
        short IlllIlllIllllll = (short)API.IIl[0];
        while (llll(IlllIlllIllllll, llllIlllIllllll)) {
            final char llIlllllIllllll = IIIIllllIllllll[IlllIlllIllllll];
            IIIlllllIllllll.append((char)(llIlllllIllllll ^ lllIllllIllllll[IllIllllIllllll % lllIllllIllllll.length]));
            "".length();
            ++IllIllllIllllll;
            ++IlllIlllIllllll;
            "".length();
            if (((0xC4 ^ 0xAB ^ (0x9 ^ 0x2E)) & (0xE6 ^ 0xC2 ^ (0x3E ^ 0x52) ^ -" ".length())) > 0) {
                return null;
            }
        }
        return String.valueOf(IIIlllllIllllll);
    }
    
    private static boolean lIll(final int IlIllIllIllllll) {
        return IlIllIllIllllll != 0;
    }
    
    public static void setSpawn(final Player IlllIIIllllllll) {
        final double IIlIlIIllllllll = IlllIIIllllllll.getLocation().getX();
        final double llIIlIIllllllll = IlllIIIllllllll.getLocation().getY();
        final double IlIIlIIllllllll = IlllIIIllllllll.getLocation().getZ();
        final float lIIIlIIllllllll = IlllIIIllllllll.getLocation().getYaw();
        final float IIIIlIIllllllll = IlllIIIllllllll.getLocation().getPitch();
        final String llllIIIllllllll = IlllIIIllllllll.getWorld().getName();
        getBaseFile().getFile().set(API.Il[API.IIl[0]], (Object)IIlIlIIllllllll);
        getBaseFile().getFile().set(API.Il[API.IIl[1]], (Object)llIIlIIllllllll);
        getBaseFile().getFile().set(API.Il[API.IIl[2]], (Object)IlIIlIIllllllll);
        getBaseFile().getFile().set(API.Il[API.IIl[3]], (Object)lIIIlIIllllllll);
        getBaseFile().getFile().set(API.Il[API.IIl[4]], (Object)IIIIlIIllllllll);
        getBaseFile().getFile().set(API.Il[API.IIl[5]], (Object)llllIIIllllllll);
        getBaseFile().saveData();
    }
    
    public static void getTeleportSpawn(final Player lIIlllIIlllllll, final Player IIIIllIIlllllll) {
        if (lIll(API.sprawdzany.contains(lIIlllIIlllllll) ? 1 : 0)) {
            API.sprawdzany.remove(lIIlllIIlllllll);
            "".length();
        }
        final double lllIllIIlllllll = getBaseFile().getFile().getDouble(API.Il[API.IIl[26]]);
        final double IllIllIIlllllll = getBaseFile().getFile().getDouble(API.Il[API.IIl[27]]);
        final double lIlIllIIlllllll = getBaseFile().getFile().getDouble(API.Il[API.IIl[28]]);
        final float IIlIllIIlllllll = (float)getBaseFile().getFile().getInt(API.Il[API.IIl[29]]);
        final float llIIllIIlllllll = (float)getBaseFile().getFile().getInt(API.Il[API.IIl[30]]);
        final String IlIIllIIlllllll = getBaseFile().getFile().getString(API.Il[API.IIl[31]]);
        lIIlllIIlllllll.teleport(new Location(Bukkit.getWorld(IlIIllIIlllllll), lllIllIIlllllll, IllIllIIlllllll, lIlIllIIlllllll, IIlIllIIlllllll, llIIllIIlllllll));
        "".length();
        IIIIllIIlllllll.teleport(new Location(Bukkit.getWorld(IlIIllIIlllllll), lllIllIIlllllll, IllIllIIlllllll, lIlIllIIlllllll, IIlIllIIlllllll, llIIllIIlllllll));
        "".length();
    }
    
    public static CheckFile getBaseFile() {
        return API.cf;
    }
    
    public static void getBW(final Player llllIIlIlllllll, final Player IlllIIlIlllllll) {
    }
    
    public static List<Player> getSprawdzany() {
        return API.sprawdzany;
    }
    
    private static void lIl() {
        (Il = new String[API.IIl[38]])[API.IIl[0]] = l("BAU5PRoHFDwMRw8=", "wuKbi");
        API.Il[API.IIl[1]] = Il("LX4xi0I01yCrxGFwmf7QXQ==", "XRMAX");
        API.Il[API.IIl[2]] = ll("+vYXroR7ww1lfRlBW7HC2g==", "ptUXe");
        API.Il[API.IIl[3]] = l("ITELEQoiIA4gVysgDg==", "RAyNy");
        API.Il[API.IIl[4]] = ll("IIrv/oeQ5oAXPwkxVaPowQ==", "APzCH");
        API.Il[API.IIl[5]] = Il("4+4urOqGgQv8QvbZDSLpuQ==", "hOiey");
        API.Il[API.IIl[6]] = l("ByobJykVMwVWOw==", "tZixC");
        API.Il[API.IIl[7]] = Il("kP1AZsP1jM6wfe1F65mOAg==", "rKPNY");
        API.Il[API.IIl[8]] = Il("D2kPfAPM7FOYM8g08PIhTw==", "pTHVQ");
        API.Il[API.IIl[9]] = ll("B83M2AE+CrQwbR+LuTDGRw==", "UABms");
        API.Il[API.IIl[10]] = Il("4bBqURyfwN1m/+kaqNnWsQ==", "ChoBN");
        API.Il[API.IIl[11]] = ll("8cXfw3TxYtspoRa2LCOPiQ==", "CcBlJ");
        API.Il[API.IIl[12]] = ll("/6gE7inTV83Jzucz14FXz3P1iG4BTPw6", "JxyId");
        API.Il[API.IIl[13]] = Il("xwA6YGwNhE5QyqaQSyY9aIAqurzsxMdv", "CWnXV");
        API.Il[API.IIl[14]] = Il("zzMuJNbDoRk=", "QLHcW");
        API.Il[API.IIl[15]] = Il("5K0jzLFV4gA=", "KnjRJ");
        API.Il[API.IIl[16]] = Il("29tP+pB5Io1O2RebBaLyLg==", "XcGkl");
        API.Il[API.IIl[17]] = l("Jzk3LhUkKDIfSC0=", "TIEqf");
        API.Il[API.IIl[18]] = ll("XgchIPSYh8iQZMiB0o/5ww==", "LgNmc");
        API.Il[API.IIl[19]] = Il("lH2ieJgv/kchZEGgFVbdGA==", "FMQhD");
        API.Il[API.IIl[20]] = l("EjMwJwoRIjUWVxEqNhsR", "aCBxy");
        API.Il[API.IIl[21]] = Il("VNPbbwKuxwmnRYjihPPv/g==", "YrWgh");
        API.Il[API.IIl[22]] = Il("Y5WC+Nfp3pqaml3E8QcRuSCUBMpRLRsX", "QbXHt");
        API.Il[API.IIl[23]] = ll("Keyxt/bkQYnk4qlPG0HOEIdlWOMDv0JR", "cgigq");
        API.Il[API.IIl[24]] = Il("jFCoSNJ6ORE=", "qcJDv");
        API.Il[API.IIl[25]] = l("GDUdDj4nGA==", "ceRYq");
        API.Il[API.IIl[26]] = l("KiEnNgEpMCIHXCE=", "YQUir");
        API.Il[API.IIl[27]] = Il("SUSyRy6blE/S5paVech5Pg==", "DUWAS");
        API.Il[API.IIl[28]] = l("HTkYDwkeKB0+VBQ=", "nIjPz");
        API.Il[API.IIl[29]] = Il("IIUJmRYekH0TqcNTieXmqw==", "RJGrw");
        API.Il[API.IIl[30]] = l("FCk1JSsXODAUdhcwMxkw", "gYGzX");
        API.Il[API.IIl[31]] = Il("LoD4s/K71HdMj0kzYAZ/BA==", "obAye");
        API.Il[API.IIl[32]] = Il("HRd82MUTCVLa35VwLnYS/w==", "gPams");
        API.Il[API.IIl[33]] = Il("dtNAK5yQZhIaTnrZ7mKERA==", "URgXF");
        API.Il[API.IIl[34]] = Il("XITwO0Rv/r0sFWnVRxEYIQ==", "QWkDy");
        API.Il[API.IIl[35]] = Il("NUWvFvIZKadmo/QtXUTzng==", "VOKme");
        API.Il[API.IIl[36]] = l("ODMlLzkqKjteIyI3NBg=", "KCWpS");
        API.Il[API.IIl[37]] = ll("inpaXskAcHVTTPPN42Jzgw==", "USxHy");
    }
    
    private static String ll(final String llIIIlllIllllll, final String IIlIIlllIllllll) {
        try {
            final SecretKeySpec IIIlIlllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIlIIlllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllIIlllIllllll = Cipher.getInstance("Blowfish");
            lllIIlllIllllll.init(API.IIl[2], IIIlIlllIllllll);
            return new String(lllIIlllIllllll.doFinal(Base64.getDecoder().decode(llIIIlllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIIlllIllllll) {
            IllIIlllIllllll.printStackTrace();
            return null;
        }
    }
    
    public static void getPS(final Player lIIIlIlIlllllll, final Player IIIIlIlIlllllll) {
    }
}

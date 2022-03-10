package x.KenKOfficial.Check.Main;

import org.bukkit.plugin.java.*;
import x.KenKOfficial.Check.Apis.*;
import org.bukkit.plugin.*;
import org.bukkit.*;
import org.bukkit.event.*;
import x.KenKOfficial.Check.Listeners.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.command.*;
import x.KenKOfficial.Check.Commands.*;
import java.util.*;

public class Main extends JavaPlugin
{
    private static final /* synthetic */ int[] llIl;
    private static /* synthetic */ Main plugin;
    private static final /* synthetic */ String[] IlIl;
    
    private void registerFiles() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.IlIl[Main.llIl[16]]).append(this.getName())));
        API.getBaseFile().setup((Plugin)this);
    }
    
    private void registerListeners() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.IlIl[Main.llIl[15]]).append(this.getName())));
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerCommandPreprocess(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerQuit(), (Plugin)this);
    }
    
    private static String lllll(final String llIIllIIIllllll, final String IlIIllIIIllllll) {
        try {
            final SecretKeySpec IllIllIIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIIllIIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIlIllIIIllllll = Cipher.getInstance("Blowfish");
            lIlIllIIIllllll.init(Main.llIl[2], IllIllIIIllllll);
            return new String(lIlIllIIIllllll.doFinal(Base64.getDecoder().decode(llIIllIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIllIIIllllll) {
            IIlIllIIIllllll.printStackTrace();
            return null;
        }
    }
    
    private void registerCommands() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.IlIl[Main.llIl[12]]).append(this.getName())));
        this.getCommand(Main.IlIl[Main.llIl[13]]).setExecutor((CommandExecutor)new SprawdzCommand());
        this.getCommand(Main.IlIl[Main.llIl[14]]).setExecutor((CommandExecutor)new SprSetCommand());
    }
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerCommands();
        this.registerListeners();
        this.registerFiles();
        System.out.println(Main.IlIl[Main.llIl[0]]);
        System.out.println(Main.IlIl[Main.llIl[1]]);
        System.out.println(Main.IlIl[Main.llIl[2]]);
        System.out.println(Main.IlIl[Main.llIl[3]]);
        System.out.println(Main.IlIl[Main.llIl[4]]);
        System.out.println(Main.IlIl[Main.llIl[5]]);
    }
    
    private static void lIIIIl() {
        (llIl = new int[19])[0] = ((0xB7 ^ 0xA2) & ~(0x34 ^ 0x21));
        Main.llIl[1] = " ".length();
        Main.llIl[2] = "  ".length();
        Main.llIl[3] = "   ".length();
        Main.llIl[4] = (121 + 26 - 110 + 120 ^ 44 + 127 - 98 + 80);
        Main.llIl[5] = (0xA0 ^ 0xA5);
        Main.llIl[6] = (79 + 23 - 46 + 87 ^ 24 + 129 - 138 + 122);
        Main.llIl[7] = (44 + 104 + 32 + 15 ^ 13 + 30 + 152 + 1);
        Main.llIl[8] = (0xFE ^ 0x8E ^ (0x6 ^ 0x7E));
        Main.llIl[9] = (0x7D ^ 0x74);
        Main.llIl[10] = (0x2B ^ 0x11 ^ (0x70 ^ 0x40));
        Main.llIl[11] = (0x73 ^ 0x78);
        Main.llIl[12] = (0x86 ^ 0x8D ^ (0xA8 ^ 0xAF));
        Main.llIl[13] = (0x2E ^ 0x23);
        Main.llIl[14] = (0x76 ^ 0x1C ^ (0xFB ^ 0x9F));
        Main.llIl[15] = (0xBD ^ 0xB2);
        Main.llIl[16] = (0x48 ^ 0x58);
        Main.llIl[17] = (0x14 ^ 0x39 ^ (0x2 ^ 0x3E));
        Main.llIl[18] = (0x8E ^ 0x9C);
    }
    
    private static boolean IlIIIl(final int IllIIIIIIllllll, final int lIlIIIIIIllllll) {
        return IllIIIIIIllllll < lIlIIIIIIllllll;
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        this.saveFiles();
        System.out.println(Main.IlIl[Main.llIl[6]]);
        System.out.println(Main.IlIl[Main.llIl[7]]);
        System.out.println(Main.IlIl[Main.llIl[8]]);
        System.out.println(Main.IlIl[Main.llIl[9]]);
        System.out.println(Main.IlIl[Main.llIl[10]]);
        System.out.println(Main.IlIl[Main.llIl[11]]);
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
    
    private static void IIIIIl() {
        (IlIl = new String[Main.llIl[18]])[Main.llIl[0]] = lIlll("VEdNbWxUR01tbFRHTW1sVEdNbWxUR01tbFRHTW1sVEdNbWxUR01tbFRHTW1sVEdNbWxUR01tbFRHTW0=", "wdnNO");
        Main.IlIl[Main.llIl[1]] = Illll("riQIetceg5dsSzBfFr7xXA==", "KqzKs");
        Main.IlIl[Main.llIl[2]] = lllll("XeV1b3XLAfC03L6Za3NUbLBXNZDTHshA", "fsYPz");
        Main.IlIl[Main.llIl[3]] = lIlll("Myg2IxkdNCM0F1M=", "rCBZn");
        Main.IlIl[Main.llIl[4]] = lIlll("DiwuIwsvIik9ByEmZS8KPS4vL04tbSsrHDE+Py8ALShlOhwlOmUrGzAiNzkFLS4takNkFwQIPAsDDAUgAWw=", "DMEJn");
        Main.IlIl[Main.llIl[5]] = lIlll("TXR0d0xNdHR3TE10dHdMTXR0d0xNdHR3TE10dHdMTXR0d0xNdHR3TE10dHdMTXR0d0xNdHR3TE10dHc=", "nWWTo");
        Main.IlIl[Main.llIl[6]] = lIlll("TUhbbXlNSFtteU1IW215TUhbbXlNSFtteU1IW215TUhbbXlNSFtteU1IW215TUhbbXlNSFtteU1IW20=", "nkxNZ");
        Main.IlIl[Main.llIl[7]] = lIlll("LyUrIyU/Cy0m", "WnNMf");
        Main.IlIl[Main.llIl[8]] = Illll("IQLxx3PX7XJD4/ZD2elz/dF91CX9dcbT", "JkhRE");
        Main.IlIl[Main.llIl[9]] = lIlll("FBU9FTkkCTAbJTEePlU=", "PpGtR");
        Main.IlIl[Main.llIl[10]] = lIlll("KSAIGz0ILg8FMQYqQxc8GiIJF3gKYQ0TKhYyGRc2CiRDAioCNkMTLRcuEQEzCiILUnVDGyIwCiwPKj0WJmA=", "cAcrX");
        Main.IlIl[Main.llIl[11]] = lIlll("a3NRVWdrc1FVZ2tzUVVna3NRVWdrc1FVZ2tzUVVna3NRVWdrc1FVZ2tzUVVna3NRVWdrc1FVZ2tzUVU=", "HPrvD");
        Main.IlIl[Main.llIl[12]] = Illll("sbIF3XFMtA0p50Xs8rnXzXP3v/j+rxQGeRE0ykhQNQI=", "adIeZ");
        Main.IlIl[Main.llIl[13]] = Illll("545AtAoFBtU=", "zSDwh");
        Main.IlIl[Main.llIl[14]] = lIlll("KiIUCxct", "YRfxr");
        Main.IlIl[Main.llIl[15]] = Illll("YnPSskZ7oiXHxOqBWZjMWfr93Qu7csN730MuAb8AWzg=", "bHCJM");
        Main.IlIl[Main.llIl[16]] = lIlll("LSo0DCcAJTkGcBEnOQg/Fms7DD4HIjcWIgAoKQk+GCg4QypBOzwWNwglJVlw", "aKPcP");
        Main.IlIl[Main.llIl[17]] = lIlll("PxkcKzocDw0sIABYHC4gDhcbYiIKFgorLhAKDSEwDxYVISFFAkwyJRAfBSw8X1g=", "exlBI");
    }
    
    private static String Illll(final String IIllIIIIIllllll, final String lIllIIIIIllllll) {
        try {
            final SecretKeySpec lIIIlIIIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIIIIllllll.getBytes(StandardCharsets.UTF_8)), Main.llIl[8]), "DES");
            final Cipher IIIIlIIIIllllll = Cipher.getInstance("DES");
            IIIIlIIIIllllll.init(Main.llIl[2], lIIIlIIIIllllll);
            return new String(IIIIlIIIIllllll.doFinal(Base64.getDecoder().decode(IIllIIIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIIIIllllll) {
            llllIIIIIllllll.printStackTrace();
            return null;
        }
    }
    
    private void saveFiles() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.IlIl[Main.llIl[17]]).append(this.getName())));
        API.getBaseFile().saveData();
    }
    
    private static String lIlll(String IllllIIIIllllll, final String IlIIIlIIIllllll) {
        IllllIIIIllllll = (float)new String(Base64.getDecoder().decode(((String)IllllIIIIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIIIIlIIIllllll = new StringBuilder();
        final char[] IIIIIlIIIllllll = IlIIIlIIIllllll.toCharArray();
        int lllllIIIIllllll = Main.llIl[0];
        final boolean lIIllIIIIllllll = (Object)((String)IllllIIIIllllll).toCharArray();
        final Exception IIIllIIIIllllll = (Exception)lIIllIIIIllllll.length;
        short lllIlIIIIllllll = (short)Main.llIl[0];
        while (IlIIIl(lllIlIIIIllllll, (int)IIIllIIIIllllll)) {
            final char IIlIIlIIIllllll = lIIllIIIIllllll[lllIlIIIIllllll];
            lIIIIlIIIllllll.append((char)(IIlIIlIIIllllll ^ IIIIIlIIIllllll[lllllIIIIllllll % IIIIIlIIIllllll.length]));
            "".length();
            ++lllllIIIIllllll;
            ++lllIlIIIIllllll;
            "".length();
            if (((0x50 ^ 0x10) & ~(0xD6 ^ 0x96)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lIIIIlIIIllllll);
    }
    
    static {
        lIIIIl();
        IIIIIl();
    }
}

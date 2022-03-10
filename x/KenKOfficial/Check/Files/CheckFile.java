package x.KenKOfficial.Check.Files;

import org.bukkit.plugin.*;
import java.nio.charset.*;
import org.bukkit.configuration.file.*;
import org.bukkit.*;
import java.io.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class CheckFile
{
    private static final /* synthetic */ String[] Ill;
    private static final /* synthetic */ int[] lll;
    /* synthetic */ FileConfiguration data;
    public static /* synthetic */ File rfile;
    static /* synthetic */ CheckFile instance;
    
    private static String lIIIl(String lIlIIlIlIllllll, final String lllllIIlIllllll) {
        lIlIIlIlIllllll = new String(Base64.getDecoder().decode(lIlIIlIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llIIIlIlIllllll = new StringBuilder();
        final char[] IlIIIlIlIllllll = lllllIIlIllllll.toCharArray();
        int lIIIIlIlIllllll = CheckFile.lll[0];
        final char llIllIIlIllllll = (Object)lIlIIlIlIllllll.toCharArray();
        final long IlIllIIlIllllll = llIllIIlIllllll.length;
        String lIIllIIlIllllll = (String)CheckFile.lll[0];
        while (lIlIl((int)lIIllIIlIllllll, (int)IlIllIIlIllllll)) {
            final char IllIIlIlIllllll = llIllIIlIllllll[lIIllIIlIllllll];
            llIIIlIlIllllll.append((char)(IllIIlIlIllllll ^ IlIIIlIlIllllll[lIIIIlIlIllllll % IlIIIlIlIllllll.length]));
            "".length();
            ++lIIIIlIlIllllll;
            ++lIIllIIlIllllll;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llIIIlIlIllllll);
    }
    
    private static boolean IIlIl(final int IlIIlIIlIllllll) {
        return IlIIlIIlIllllll == 0;
    }
    
    public static CheckFile getInstance() {
        return CheckFile.instance;
    }
    
    private static boolean lIlIl(final int lIlIlIIlIllllll, final int IIlIlIIlIllllll) {
        return lIlIlIIlIllllll < IIlIlIIlIllllll;
    }
    
    static {
        llIIl();
        IlIIl();
        CheckFile.instance = new CheckFile();
    }
    
    public FileConfiguration getFile() {
        return this.data;
    }
    
    private static void llIIl() {
        (lll = new int[6])[0] = ((0xC1 ^ 0x82) & ~(0x55 ^ 0x16));
        CheckFile.lll[1] = " ".length();
        CheckFile.lll[2] = "  ".length();
        CheckFile.lll[3] = "   ".length();
        CheckFile.lll[4] = (0xC2 ^ 0xC6);
        CheckFile.lll[5] = (0xAE ^ 0xA6);
    }
    
    public void reloadData() {
        this.data = (FileConfiguration)YamlConfiguration.loadConfiguration(CheckFile.rfile);
    }
    
    public void saveData() {
        try {
            this.data.save(CheckFile.rfile);
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (IOException llIIIIllIllllll) {
            Bukkit.getServer().getLogger().severe(CheckFile.Ill[CheckFile.lll[3]]);
        }
    }
    
    public void setup(final Plugin IlllIIllIllllll) {
        if (IIlIl(IlllIIllIllllll.getDataFolder().exists() ? 1 : 0)) {
            IlllIIllIllllll.getDataFolder().mkdir();
            "".length();
        }
        final File lIllIIllIllllll = new File(String.valueOf(new StringBuilder().append(IlllIIllIllllll.getDataFolder()).append(File.separator).append(CheckFile.Ill[CheckFile.lll[0]])));
        CheckFile.rfile = new File(lIllIIllIllllll, String.valueOf(String.valueOf(new StringBuilder().append(String.valueOf(File.separatorChar)).append(CheckFile.Ill[CheckFile.lll[1]]))));
        if (IIlIl(CheckFile.rfile.exists() ? 1 : 0)) {
            try {
                lIllIIllIllllll.mkdirs();
                "".length();
                CheckFile.rfile.createNewFile();
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (IOException IIIIlIllIllllll) {
                Bukkit.getServer().getLogger().severe(CheckFile.Ill[CheckFile.lll[2]]);
            }
        }
        this.data = (FileConfiguration)YamlConfiguration.loadConfiguration(CheckFile.rfile);
    }
    
    private static void IlIIl() {
        (Ill = new String[CheckFile.lll[4]])[CheckFile.lll[0]] = IIIIl("P84ne18fNCs=", "YiHdH");
        CheckFile.Ill[CheckFile.lll[1]] = lIIIl("Jj4EFR86KB4dCX00HRg=", "SMpth");
        CheckFile.Ill[CheckFile.lll[2]] = IIIIl("FMtp2sFZwNzxrgO2yHmstv8dC4VMDwgNqu4rmjFc5N8GllkWUhGWY1EFEPnQK6El", "LytxC");
        CheckFile.Ill[CheckFile.lll[3]] = lIIIl("FC82YRI+Jz8uRykvNmEdOzY6MgY5ZiMtDjEzczQULickKAI0LzJvHjcq", "ZFSAg");
    }
    
    private static String IIIIl(final String lIlIllIlIllllll, final String IlIIllIlIllllll) {
        try {
            final SecretKeySpec IIIlllIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIIllIlIllllll.getBytes(StandardCharsets.UTF_8)), CheckFile.lll[5]), "DES");
            final Cipher lllIllIlIllllll = Cipher.getInstance("DES");
            lllIllIlIllllll.init(CheckFile.lll[2], IIIlllIlIllllll);
            return new String(lllIllIlIllllll.doFinal(Base64.getDecoder().decode(lIlIllIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIllIlIllllll) {
            IllIllIlIllllll.printStackTrace();
            return null;
        }
    }
}

package x.KenKOfficial.Check.Utils;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class ChatUtil
{
    private static final /* synthetic */ int[] lIIIl;
    private static final /* synthetic */ String[] IIIIl;
    
    private static void IIlIll() {
        (lIIIl = new int[9])[0] = ((0x32 ^ 0x11) & ~(0xBE ^ 0x9D));
        ChatUtil.lIIIl[1] = " ".length();
        ChatUtil.lIIIl[2] = "  ".length();
        ChatUtil.lIIIl[3] = "   ".length();
        ChatUtil.lIIIl[4] = (0xF6 ^ 0xA2 ^ (0x95 ^ 0xC5));
        ChatUtil.lIIIl[5] = (0x66 ^ 0x62 ^ " ".length());
        ChatUtil.lIIIl[6] = (0x34 ^ 0x6E ^ (0xDE ^ 0x82));
        ChatUtil.lIIIl[7] = (73 + 37 - 36 + 91 ^ 86 + 7 - 82 + 151);
        ChatUtil.lIIIl[8] = (117 + 59 - 49 + 0 ^ (0x57 ^ 0x20));
    }
    
    static {
        IIlIll();
        llIIll();
    }
    
    private static boolean lIlIll(final int IllIlIlIlIlllll, final int lIlIlIlIlIlllll) {
        return IllIlIlIlIlllll < lIlIlIlIlIlllll;
    }
    
    private static String IlIIll(String llIllllIlIlllll, final String IlIllllIlIlllll) {
        llIllllIlIlllll = new String(Base64.getDecoder().decode(llIllllIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IllllllIlIlllll = new StringBuilder();
        final char[] lIlllllIlIlllll = IlIllllIlIlllll.toCharArray();
        int IIlllllIlIlllll = ChatUtil.lIIIl[0];
        final int IllIlllIlIlllll = (Object)llIllllIlIlllll.toCharArray();
        final long lIlIlllIlIlllll = IllIlllIlIlllll.length;
        String IIlIlllIlIlllll = (String)ChatUtil.lIIIl[0];
        while (lIlIll((int)IIlIlllIlIlllll, (int)lIlIlllIlIlllll)) {
            final char lIIIIIIllIlllll = IllIlllIlIlllll[IIlIlllIlIlllll];
            IllllllIlIlllll.append((char)(lIIIIIIllIlllll ^ lIlllllIlIlllll[IIlllllIlIlllll % lIlllllIlIlllll.length]));
            "".length();
            ++IIlllllIlIlllll;
            ++IIlIlllIlIlllll;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(IllllllIlIlllll);
    }
    
    private static String IIIIll(final String llIlIllIlIlllll, final String IlIlIllIlIlllll) {
        try {
            final SecretKeySpec IlllIllIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIlIllIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIllIllIlIlllll = Cipher.getInstance("Blowfish");
            lIllIllIlIlllll.init(ChatUtil.lIIIl[2], IlllIllIlIlllll);
            return new String(lIllIllIlIlllll.doFinal(Base64.getDecoder().decode(llIlIllIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIllIllIlIlllll) {
            IIllIllIlIlllll.printStackTrace();
            return null;
        }
    }
    
    public static String fixColor(final String IIllIIIllIlllll) {
        return IIllIIIllIlllll.replaceAll(ChatUtil.IIIIl[ChatUtil.lIIIl[0]], ChatUtil.IIIIl[ChatUtil.lIIIl[1]]).replace(ChatUtil.IIIIl[ChatUtil.lIIIl[2]], ChatUtil.IIIIl[ChatUtil.lIIIl[3]]).replace(ChatUtil.IIIIl[ChatUtil.lIIIl[4]], ChatUtil.IIIIl[ChatUtil.lIIIl[5]]).replace(ChatUtil.IIIIl[ChatUtil.lIIIl[6]], ChatUtil.IIIIl[ChatUtil.lIIIl[7]]);
    }
    
    private static String lIIIll(final String IllllIlIlIlllll, final String llIllIlIlIlllll) {
        try {
            final SecretKeySpec lIIIIllIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIlIlIlllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.lIIIl[8]), "DES");
            final Cipher IIIIIllIlIlllll = Cipher.getInstance("DES");
            IIIIIllIlIlllll.init(ChatUtil.lIIIl[2], lIIIIllIlIlllll);
            return new String(IIIIIllIlIlllll.doFinal(Base64.getDecoder().decode(IllllIlIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIlIlIlllll) {
            lllllIlIlIlllll.printStackTrace();
            return null;
        }
    }
    
    private static void llIIll() {
        (IIIIl = new String[ChatUtil.lIIIl[8]])[ChatUtil.lIIIl[0]] = IIIIll("irVgM4Nh9/Y=", "lxGxH");
        ChatUtil.IIIIl[ChatUtil.lIIIl[1]] = lIIIll("Nn4iaqUTrCA=", "SCMkV");
        ChatUtil.IIIIl[ChatUtil.lIIIl[2]] = lIIIll("nWYvAr/iJ4A=", "VydkN");
        ChatUtil.IIIIl[ChatUtil.lIIIl[3]] = lIIIll("zAfwQaZcak8=", "vKReB");
        ChatUtil.IIIIl[ChatUtil.lIIIl[4]] = IlIIll("fUk=", "AuduS");
        ChatUtil.IIIIl[ChatUtil.lIIIl[5]] = IlIIll("w4M=", "hIDKO");
        ChatUtil.IIIIl[ChatUtil.lIIIl[6]] = IlIIll("DiEK", "uowAC");
        ChatUtil.IIIIl[ChatUtil.lIIIl[7]] = lIIIll("SOhx4D2gh5E=", "Pagpn");
    }
}

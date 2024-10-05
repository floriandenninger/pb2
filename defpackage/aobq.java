package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.cardboard.sdk.R;
import com.google.firebase.appindexing.internal.Thing;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aobq {
    public static volatile aych a;
    public static volatile aych b;
    public static volatile aych c;
    public static volatile aych d;
    public static volatile aych e;
    public static volatile aych f;
    public static volatile aych g;

    public static String A(int i) {
        return Integer.toString(i - 1);
    }

    public static /* synthetic */ void B(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static int C(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static void D(List list) {
        Set<anus> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                anuj anujVar = (anuj) it.next();
                anus anusVar = new anus(anujVar);
                for (Class cls : anujVar.a) {
                    anut anutVar = new anut(cls, !anujVar.c());
                    if (!hashMap.containsKey(anutVar)) {
                        hashMap.put(anutVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(anutVar);
                    if (set2.isEmpty() || anutVar.a) {
                        set2.add(anusVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                    }
                }
            } else {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (anus anusVar2 : (Set) it2.next()) {
                        for (anuu anuuVar : anusVar2.a.b) {
                            if (anuuVar.d() && (set = (Set) hashMap.get(new anut(anuuVar.a, anuuVar.e()))) != null) {
                                for (anus anusVar3 : set) {
                                    anusVar2.b.add(anusVar3);
                                    anusVar3.c.add(anusVar2);
                                }
                            }
                        }
                    }
                }
                HashSet<anus> hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (anus anusVar4 : hashSet) {
                    if (anusVar4.a()) {
                        hashSet2.add(anusVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    anus anusVar5 = (anus) hashSet2.iterator().next();
                    hashSet2.remove(anusVar5);
                    i++;
                    for (anus anusVar6 : anusVar5.b) {
                        anusVar6.c.remove(anusVar5);
                        if (anusVar6.a()) {
                            hashSet2.add(anusVar6);
                        }
                    }
                }
                if (i == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (anus anusVar7 : hashSet) {
                    if (!anusVar7.a() && !anusVar7.b.isEmpty()) {
                        arrayList.add(anusVar7.a);
                    }
                }
                throw new anuv(arrayList);
            }
        }
    }

    public static anum E(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (!anum.class.isAssignableFrom(cls)) {
                throw new anuz(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
            }
            return (anum) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e2) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str), e2);
            return null;
        } catch (IllegalAccessException e3) {
            throw new anuz(String.format("Could not instantiate %s.", str), e3);
        } catch (InstantiationException e4) {
            throw new anuz(String.format("Could not instantiate %s.", str), e4);
        } catch (NoSuchMethodException e5) {
            throw new anuz(String.format("Could not instantiate %s", str), e5);
        } catch (InvocationTargetException e6) {
            throw new anuz(String.format("Could not instantiate %s", str), e6);
        }
    }

    public static antq F(Status status, String str) {
        qip.an(status);
        String str2 = status.h;
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        switch (status.g) {
            case 17510:
                return new ants(str);
            case 17511:
                return new antt(str);
            case 17512:
            default:
                return new antq(str);
            case 17513:
                return new antr(str);
            case 17514:
                return new antp(str);
        }
    }

    public static final Thing.Metadata G(boolean z, int i, String str, Bundle bundle) {
        return new Thing.Metadata(z, i, str, bundle, null);
    }

    public static int H(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int I() {
        try {
            return Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return -1;
        }
    }

    public static BigInteger J(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static boolean K() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    public static byte[] L(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (length > i2) {
            throw new GeneralSecurityException("integer too large");
        }
        if (length == i2) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i];
        System.arraycopy(byteArray, 0, bArr, i - length, length);
        return bArr;
    }

    public static String M(int i) {
        int i2 = i - 1;
        return i2 != 2 ? i2 != 3 ? "SHA-512" : "SHA-384" : "SHA-256";
    }

    public static String N(int i) {
        String ag = aocz.ag(i);
        int i2 = anrp.a;
        StringBuilder sb = new StringBuilder(ag.length() + 9);
        sb.append(ag);
        sb.append("withECDSA");
        return sb.toString();
    }

    public static byte[] O(byte[] bArr, int i, int i2) {
        MessageDigest messageDigest = (MessageDigest) anqy.d.a(M(i2));
        int digestLength = messageDigest.getDigestLength();
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 <= (i - 1) / digestLength; i4++) {
            messageDigest.reset();
            messageDigest.update(bArr);
            messageDigest.update(L(BigInteger.valueOf(i4), 4));
            byte[] digest = messageDigest.digest();
            int length = digest.length;
            System.arraycopy(digest, 0, bArr2, i3, Math.min(length, i - i3));
            i3 += length;
        }
        return bArr2;
    }

    public static long P(byte[] bArr, int i, int i2) {
        return (Q(bArr, i) >> i2) & 67108863;
    }

    public static long Q(byte[] bArr, int i) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    public static void R(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static byte[] S(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            int digit = Character.digit(str.charAt(i2), 16);
            int digit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (digit != -1 && digit2 != -1) {
                bArr[i] = (byte) ((digit * 16) + digit2);
            } else {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
        }
        return bArr;
    }

    public static int T(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 6;
        }
        return 5;
    }

    public static int U(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int V(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 6;
    }

    public static int W(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int X(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 6;
    }

    public static int Y(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 0 : 4;
        }
        return 3;
    }

    public static int Z(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int aA(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int aB(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int aC(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static int aD(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 10) {
            return 11;
        }
        if (i == 20) {
            return 21;
        }
        if (i == 30) {
            return 31;
        }
        if (i != 80) {
            return i != 100 ? 0 : 101;
        }
        return 81;
    }

    public static int aE(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int aF(int i) {
        return i - 2;
    }

    public static /* synthetic */ String aG(int i) {
        switch (i) {
            case 1:
                return "UNRECOGNIZED";
            case 2:
                return "CODEC_INIT_REASON_UNKNOWN";
            case 3:
                return "CODEC_INIT_REASON_ROTATION_DEGREE";
            case 4:
                return "CODEC_INIT_REASON_COLOR_INFO";
            case 5:
                return "CODEC_INIT_REASON_MIME_TYPE";
            case 6:
                return "CODEC_INIT_REASON_DIMENSIONS";
            case 7:
                return "CODEC_INIT_REASON_CODEC_OPERATING_RATE";
            case 8:
                return "CODEC_INIT_REASON_MAX_WIDTH";
            case 9:
                return "CODEC_INIT_REASON_MAX_HEIGHT";
            case 10:
                return "CODEC_INIT_REASON_MAX_INPUT_SIZE";
            case 11:
                return "CODEC_INIT_REASON_FIRST_PLAYBACK";
            case 12:
                return "CODEC_INIT_REASON_ABRUPT_SPLICING";
            case 13:
                return "CODEC_INIT_REASON_BACKGROUND";
            case 14:
                return "CODEC_INIT_REASON_PREWARM";
            case 15:
                return "CODEC_INIT_REASON_TRACK_RENDERER_TYPE_SWITCH";
            case 16:
                return "CODEC_INIT_REASON_RESELECT_STREAMS";
            case 17:
                return "CODEC_INIT_REASON_DETACH_MEDIA_VIEW";
            case 18:
                return "CODEC_INIT_REASON_NULL_MEDIA_VIEW_SWITCH";
            case 19:
                return "CODEC_INIT_REASON_PLAYER_SWITCH";
            case 20:
                return "CODEC_INIT_REASON_PLAYER_RESET";
            case 21:
                return "CODEC_INIT_REASON_EXOPLAYER_OVERRIDE";
            case 22:
                return "CODEC_INIT_REASON_DRM_HD";
            case 23:
                return "CODEC_INIT_REASON_DRM_STOPPED";
            case 24:
                return "CODEC_INIT_REASON_STOP";
            case 25:
                return "CODEC_INIT_REASON_CODEC_NAME";
            case 26:
                return "CODEC_INIT_REASON_REUSE_DISABLED";
            case 27:
                return "CODEC_INIT_REASON_CONFIGURE_FAILED";
            case 28:
                return "CODEC_INIT_REASON_SET_OUTPUT_SURFACE_FAILED";
            case 29:
                return "CODEC_INIT_REASON_INITIALIZATION_DATA";
            case 30:
                return "CODEC_INIT_REASON_HDR";
            case 31:
                return "CODEC_INIT_REASON_COLOR_TRANSFER";
            default:
                return "null";
        }
    }

    public static int aH(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int aI(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int aJ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int aK(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int aL(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int aM(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int aN(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int aO(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static int aP(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int aQ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int aR(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int aS(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int aT(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int aU(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int aV(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int aW(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int aX(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int aY(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int aZ(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static int aa(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 5;
        }
        return 4;
    }

    public static void ab(anns annsVar) {
        annv annvVar = annsVar.b;
        if (annvVar == null) {
            annvVar = annv.a;
        }
        int X = X(annvVar.b);
        if (X == 0) {
            X = 1;
        }
        aocz.ar(ad(X));
        annv annvVar2 = annsVar.b;
        if (annvVar2 == null) {
            annvVar2 = annv.a;
        }
        int V = V(annvVar2.c);
        ac(V != 0 ? V : 1);
        int aa = aa(annsVar.d);
        if (aa == 0 || aa != 2) {
            annq annqVar = annsVar.c;
            if (annqVar == null) {
                annqVar = annq.a;
            }
            anod anodVar = annqVar.b;
            if (anodVar == null) {
                anodVar = anod.a;
            }
            ankk.h(anodVar);
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static String ac(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 2) {
            return "HmacSha384";
        }
        if (i2 == 3) {
            return "HmacSha256";
        }
        if (i2 == 4) {
            return "HmacSha512";
        }
        if (i2 == 5) {
            return "HmacSha224";
        }
        String num = Integer.toString(U(i));
        StringBuilder sb = new StringBuilder(num.length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(num);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    public static int ad(int i) {
        int i2 = i - 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        String num = Integer.toString(W(i));
        StringBuilder sb = new StringBuilder(num.length() + 20);
        sb.append("unknown curve type: ");
        sb.append(num);
        throw new GeneralSecurityException(sb.toString());
    }

    public static int ae(int i) {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                String num = Integer.toString(Z(i));
                StringBuilder sb = new StringBuilder(num.length() + 22);
                sb.append("unknown point format: ");
                sb.append(num);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return i3;
    }

    public static boolean af(int i) {
        Boolean bool;
        if (i - 1 == 0) {
            return !anlt.a();
        }
        if (anlt.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
                anlt.a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                bool = false;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static int ag(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int ah(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int ai(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 0;
        }
    }

    public static int aj(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int ak(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int al(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int am(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int an(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static int ao(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int ap(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int aq(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static int ar(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int as(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int at(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static int au(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int av(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int aw(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int ax(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int ay(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int az(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static /* synthetic */ String b(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static int bA(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static int bB(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bC(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bD(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bE(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bF(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int bG(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static int bH(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bI(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bJ(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int bK(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bL(int i) {
        return i - 2;
    }

    public static int bM(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static int bN(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bO(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bP(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bQ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bR(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bS(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bT(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bU(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static int bV(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bW(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bX(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    private static int bY(byte b2) {
        return b2 & 63;
    }

    private static boolean bZ(byte b2) {
        return b2 > -65;
    }

    public static int ba(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bb(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bc(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bd(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int be(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bf(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bg(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bh(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bi(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bj(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int bk(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bl(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bm(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int bn(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int bo(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bp(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static int bq(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int br(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bs(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int bt(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int bu(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bv(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bw(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bx(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        if (i == 6) {
            return 7;
        }
        switch (i) {
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            case 80:
                return 81;
            case 81:
                return 82;
            case 82:
                return 83;
            case 83:
                return 84;
            case 84:
                return 85;
            case 85:
                return 86;
            case 87:
                return 88;
            case 190:
                return 191;
            case 191:
                return 192;
            case 193:
                return 194;
            case 194:
                return 195;
            case 195:
                return 196;
            case 196:
                return 197;
            case 197:
                return 198;
            case 198:
                return 199;
            case 199:
                return 200;
            case 200:
                return 201;
            case 201:
                return 202;
            case 202:
                return 203;
            case 203:
                return 204;
            case 204:
                return 205;
            case 205:
                return 206;
            case 206:
                return 207;
            case 207:
                return 208;
            case 208:
                return 209;
            case 209:
                return 210;
            case 210:
                return 211;
            case 211:
                return 212;
            case 212:
                return 213;
            case 213:
                return 214;
            case 214:
                return 215;
            case 215:
                return 216;
            case 216:
                return 217;
            case 217:
                return 218;
            case 218:
                return 219;
            case 219:
                return 220;
            case 220:
                return 221;
            case 221:
                return 222;
            case 222:
                return 223;
            case 223:
                return 224;
            case 224:
                return 225;
            case 225:
                return 226;
            case 226:
                return 227;
            case 227:
                return 228;
            case 228:
                return 229;
            case 229:
                return 230;
            case 230:
                return 231;
            case 231:
                return 232;
            case 232:
                return 233;
            case 233:
                return 234;
            case 234:
                return 235;
            case 235:
                return 236;
            case 236:
                return 237;
            case 237:
                return 238;
            case 238:
                return 239;
            case 239:
                return 240;
            case 240:
                return 241;
            case 241:
                return 242;
            case 242:
                return 243;
            case 243:
                return 244;
            case 244:
                return 245;
            case 245:
                return 246;
            case 246:
                return 247;
            case 247:
                return 248;
            case 248:
                return 249;
            case 249:
                return 250;
            case 250:
                return 251;
            case 251:
                return 252;
            case 252:
                return 253;
            case 253:
                return 254;
            case 254:
                return PrivateKeyType.INVALID;
            case PrivateKeyType.INVALID /* 255 */:
                return 256;
            case 256:
                return 257;
            case 257:
                return 258;
            case 258:
                return 259;
            case 259:
                return 260;
            case 260:
                return 261;
            case 261:
                return 262;
            case 262:
                return 263;
            case 263:
                return 264;
            case 264:
                return 265;
            case 265:
                return 266;
            case 267:
                return 268;
            case 268:
                return 269;
            case 269:
                return 270;
            case 270:
                return 271;
            case 271:
                return 272;
            case 272:
                return 273;
            case 273:
                return 274;
            case 274:
                return 275;
            case 275:
                return 276;
            case 276:
                return 277;
            case 277:
                return 278;
            case 278:
                return 279;
            case 279:
                return 280;
            case 280:
                return 281;
            case 281:
                return 282;
            case 282:
                return 283;
            case 283:
                return 284;
            case 284:
                return 285;
            case 285:
                return 286;
            case 286:
                return 287;
            case 287:
                return 288;
            case 288:
                return 289;
            case 289:
                return 290;
            case 290:
                return 291;
            case 291:
                return 292;
            case 292:
                return 293;
            case 293:
                return 294;
            case 294:
                return 295;
            case 295:
                return 296;
            case 296:
                return 297;
            case 297:
                return 298;
            case 298:
                return 299;
            case 299:
                return 300;
            case 300:
                return 301;
            case 301:
                return 302;
            case 302:
                return 303;
            case 304:
                return 305;
            case 305:
                return 306;
            case 306:
                return 307;
            case 307:
                return 308;
            case 308:
                return 309;
            case 309:
                return 310;
            case 310:
                return 311;
            case 311:
                return 312;
            case 312:
                return 313;
            case 313:
                return 314;
            case 314:
                return 315;
            case 315:
                return 316;
            case 316:
                return 317;
            case 317:
                return 318;
            case 318:
                return 319;
            case 319:
                return 320;
            case 320:
                return 321;
            case 321:
                return 322;
            case 322:
                return 323;
            case 323:
                return 324;
            case 324:
                return 325;
            case 325:
                return 326;
            case 326:
                return 327;
            case 327:
                return 328;
            case 328:
                return 329;
            case 329:
                return 330;
            case 330:
                return 331;
            case 332:
                return 333;
            case 333:
                return 334;
            case 334:
                return 335;
            case 335:
                return 336;
            case 336:
                return 337;
            case 337:
                return 338;
            case 338:
                return 339;
            case 339:
                return 340;
            case 340:
                return 341;
            case 341:
                return 342;
            case 342:
                return 343;
            case 343:
                return 344;
            case 344:
                return 345;
            case 345:
                return 346;
            case 346:
                return 347;
            case 347:
                return 348;
            case 348:
                return 349;
            case 349:
                return 350;
            case 350:
                return 351;
            case 351:
                return 352;
            case 352:
                return 353;
            case 353:
                return 354;
            case 354:
                return 355;
            case 355:
                return 356;
            case 356:
                return 357;
            case 357:
                return 358;
            case 358:
                return 359;
            case 359:
                return 360;
            case 360:
                return 361;
            case 361:
                return 362;
            case 362:
                return 363;
            case 363:
                return 364;
            case 364:
                return 365;
            case 365:
                return 366;
            case 366:
                return 367;
            case 367:
                return 368;
            case 368:
                return 369;
            case 369:
                return 370;
            case 370:
                return 371;
            case 371:
                return 372;
            case 372:
                return 373;
            case 373:
                return 374;
            case 374:
                return 375;
            case 375:
                return 376;
            case 376:
                return 377;
            case 377:
                return 378;
            case 378:
                return 379;
            case 379:
                return 380;
            case 380:
                return 381;
            case 381:
                return 382;
            case 382:
                return 383;
            case 383:
                return 384;
            case 384:
                return 385;
            case 385:
                return 386;
            case 386:
                return 387;
            case 387:
                return 388;
            case 388:
                return 389;
            case 389:
                return 390;
            case 390:
                return 391;
            case 391:
                return 392;
            case 392:
                return 393;
            case 393:
                return 394;
            case 394:
                return 395;
            case 395:
                return 396;
            case 396:
                return 397;
            case 10070:
                return 10071;
            case 10111:
                return 10112;
            case 20031:
                return 20032;
            case 20032:
                return 20033;
            case 20033:
                return 20034;
            default:
                switch (i) {
                    case 89:
                        return 90;
                    case 90:
                        return 91;
                    case 91:
                        return 92;
                    case 92:
                        return 93;
                    case 93:
                        return 94;
                    case 94:
                        return 95;
                    case 95:
                        return 96;
                    case 96:
                        return 97;
                    case 97:
                        return 98;
                    case 98:
                        return 99;
                    case 99:
                        return 100;
                    case 100:
                        return 101;
                    case 101:
                        return 102;
                    default:
                        switch (i) {
                            case 103:
                                return 104;
                            case 104:
                                return 105;
                            case 105:
                                return 106;
                            case 106:
                                return 107;
                            default:
                                switch (i) {
                                    case 108:
                                        return 109;
                                    case 109:
                                        return 110;
                                    case 110:
                                        return 111;
                                    case 111:
                                        return 112;
                                    case 112:
                                        return 113;
                                    case 113:
                                        return 114;
                                    case 114:
                                        return 115;
                                    case 115:
                                        return 116;
                                    case 116:
                                        return 117;
                                    case 117:
                                        return 118;
                                    case 118:
                                        return 119;
                                    case 119:
                                        return 120;
                                    case 120:
                                        return 121;
                                    case 121:
                                        return 122;
                                    default:
                                        switch (i) {
                                            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                                                return R.styleable.AppCompatTheme_windowMinWidthMajor;
                                            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                                return R.styleable.AppCompatTheme_windowMinWidthMinor;
                                            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                                                return R.styleable.AppCompatTheme_windowNoTitle;
                                            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                                                return 127;
                                            case 127:
                                                return 128;
                                            case 128:
                                                return 129;
                                            case 129:
                                                return 130;
                                            case 130:
                                                return 131;
                                            case 131:
                                                return 132;
                                            case 132:
                                                return 133;
                                            case 133:
                                                return 134;
                                            case 134:
                                                return 135;
                                            case 135:
                                                return 136;
                                            case 136:
                                                return 137;
                                            case 137:
                                                return 138;
                                            case 138:
                                                return 139;
                                            case 139:
                                                return 140;
                                            case 140:
                                                return 141;
                                            case 141:
                                                return 142;
                                            case 142:
                                                return 143;
                                            case 143:
                                                return 144;
                                            case 144:
                                                return 145;
                                            case 145:
                                                return 146;
                                            case 146:
                                                return 147;
                                            case 147:
                                                return 148;
                                            case 148:
                                                return 149;
                                            case 149:
                                                return 150;
                                            case 150:
                                                return 151;
                                            case 151:
                                                return 152;
                                            case 152:
                                                return 153;
                                            case 153:
                                                return 154;
                                            case 154:
                                                return 155;
                                            case 155:
                                                return 156;
                                            case 156:
                                                return 157;
                                            case 157:
                                                return 158;
                                            case 158:
                                                return 159;
                                            default:
                                                switch (i) {
                                                    case 160:
                                                        return 161;
                                                    case 161:
                                                        return 162;
                                                    case 162:
                                                        return 163;
                                                    case 163:
                                                        return 164;
                                                    case 164:
                                                        return 165;
                                                    case 165:
                                                        return 166;
                                                    case 166:
                                                        return 167;
                                                    case 167:
                                                        return 168;
                                                    default:
                                                        switch (i) {
                                                            case 169:
                                                                return 170;
                                                            case 170:
                                                                return 171;
                                                            case 171:
                                                                return 172;
                                                            case 172:
                                                                return 173;
                                                            case 173:
                                                                return 174;
                                                            case 174:
                                                                return 175;
                                                            case 175:
                                                                return 176;
                                                            case 176:
                                                                return 177;
                                                            case 177:
                                                                return 178;
                                                            case 178:
                                                                return 179;
                                                            case 179:
                                                                return 180;
                                                            case 180:
                                                                return 181;
                                                            case 181:
                                                                return 182;
                                                            case 182:
                                                                return 183;
                                                            case 183:
                                                                return 184;
                                                            default:
                                                                switch (i) {
                                                                    case 185:
                                                                        return 186;
                                                                    case 186:
                                                                        return 187;
                                                                    case 187:
                                                                        return 188;
                                                                    case 188:
                                                                        return 189;
                                                                    default:
                                                                        return 0;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static int by(int i) {
        if (i == 0) {
            return 1;
        }
        switch (i) {
            case 20000:
                return 20001;
            case 20001:
                return 20002;
            case 20002:
                return 20003;
            case 20003:
                return 20004;
            case 20004:
                return 20005;
            case 20005:
                return 20006;
            case 20006:
                return 20007;
            case 20007:
                return 20008;
            case 20008:
                return 20009;
            case 20009:
                return 20010;
            case 20010:
                return 20011;
            case 20011:
                return 20012;
            case 20012:
                return 20013;
            case 20013:
                return 20014;
            case 20014:
                return 20015;
            case 20015:
                return 20016;
            case 20016:
                return 20017;
            case 20017:
                return 20018;
            case 20018:
                return 20019;
            case 20019:
                return 20020;
            default:
                switch (i) {
                    case 20024:
                        return 20025;
                    case 20025:
                        return 20026;
                    case 20026:
                        return 20027;
                    case 20027:
                        return 20028;
                    case 20028:
                        return 20029;
                    case 20029:
                        return 20030;
                    case 20030:
                        return 20031;
                    default:
                        return 0;
                }
        }
    }

    public static int bz(int i) {
        if (i == 0) {
            return 1;
        }
        switch (i) {
            case 10000:
                return 10001;
            case 10001:
                return 10002;
            case 10002:
                return 10003;
            case 10003:
                return 10004;
            case 10004:
                return 10005;
            case 10005:
                return 10006;
            case 10006:
                return 10007;
            case 10007:
                return 10008;
            case 10008:
                return 10009;
            case 10009:
                return 10010;
            case 10010:
                return 10011;
            case 10011:
                return 10012;
            case 10012:
                return 10013;
            case 10013:
                return 10014;
            case 10014:
                return 10015;
            case 10015:
                return 10016;
            case 10016:
                return 10017;
            case 10017:
                return 10018;
            case 10018:
                return 10019;
            case 10019:
                return 10020;
            case 10020:
                return 10021;
            case 10021:
                return 10022;
            case 10022:
                return 10023;
            case 10023:
                return 10024;
            case 10024:
                return 10025;
            case 10025:
                return 10026;
            case 10026:
                return 10027;
            case 10027:
                return 10028;
            case 10028:
                return 10029;
            case 10029:
                return 10030;
            case 10030:
                return 10031;
            case 10031:
                return 10032;
            case 10032:
                return 10033;
            case 10033:
                return 10034;
            case 10034:
                return 10035;
            case 10035:
                return 10036;
            case 10036:
                return 10037;
            default:
                switch (i) {
                    case 10038:
                        return 10039;
                    case 10039:
                        return 10040;
                    case 10040:
                        return 10041;
                    case 10041:
                        return 10042;
                    case 10042:
                        return 10043;
                    case 10043:
                        return 10044;
                    case 10044:
                        return 10045;
                    case 10045:
                        return 10046;
                    case 10046:
                        return 10047;
                    case 10047:
                        return 10048;
                    case 10048:
                        return 10049;
                    case 10049:
                        return 10050;
                    case 10050:
                        return 10051;
                    case 10051:
                        return 10052;
                    case 10052:
                        return 10053;
                    case 10053:
                        return 10054;
                    case 10054:
                        return 10055;
                    case 10055:
                        return 10056;
                    case 10056:
                        return 10057;
                    case 10057:
                        return 10058;
                    case 10058:
                        return 10059;
                    case 10059:
                        return 10060;
                    case 10060:
                        return 10061;
                    case 10061:
                        return 10062;
                    case 10062:
                        return 10063;
                    case 10063:
                        return 10064;
                    case 10064:
                        return 10065;
                    case 10065:
                        return 10066;
                    case 10066:
                        return 10067;
                    case 10067:
                        return 10068;
                    case 10068:
                        return 10069;
                    case 10069:
                        return 10070;
                    case 10070:
                        return 10071;
                    case 10071:
                        return 10072;
                    case 10072:
                        return 10073;
                    case 10073:
                        return 10074;
                    case 10074:
                        return 10075;
                    case 10075:
                        return 10076;
                    default:
                        switch (i) {
                            case 10077:
                                return 10078;
                            case 10078:
                                return 10079;
                            case 10079:
                                return 10080;
                            case 10080:
                                return 10081;
                            case 10081:
                                return 10082;
                            case 10082:
                                return 10083;
                            case 10083:
                                return 10084;
                            case 10084:
                                return 10085;
                            case 10085:
                                return 10086;
                            case 10086:
                                return 10087;
                            case 10087:
                                return 10088;
                            case 10088:
                                return 10089;
                            case 10089:
                                return 10090;
                            case 10090:
                                return 10091;
                            case 10091:
                                return 10092;
                            case 10092:
                                return 10093;
                            case 10093:
                                return 10094;
                            case 10094:
                                return 10095;
                            case 10095:
                                return 10096;
                            case 10096:
                                return 10097;
                            case 10097:
                                return 10098;
                            case 10098:
                                return 10099;
                            case 10099:
                                return 10100;
                            case 10100:
                                return 10101;
                            case 10101:
                                return 10102;
                            case 10102:
                                return 10103;
                            case 10103:
                                return 10104;
                            case 10104:
                                return 10105;
                            case 10105:
                                return 10106;
                            case 10106:
                                return 10107;
                            case 10107:
                                return 10108;
                            case 10108:
                                return 10109;
                            case 10109:
                                return 10110;
                            case 10110:
                                return 10111;
                            default:
                                switch (i) {
                                    case 10112:
                                        return 10113;
                                    case 10113:
                                        return 10114;
                                    case 10114:
                                        return 10115;
                                    default:
                                        return 0;
                                }
                        }
                }
        }
    }

    public static void c(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) {
        if (bZ(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || bZ(b4) || bZ(b5)) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        int bY = ((b2 & 7) << 18) | (bY(b3) << 12) | (bY(b4) << 6) | bY(b5);
        cArr[i] = (char) ((bY >>> 10) + 55232);
        cArr[i + 1] = (char) ((bY & 1023) + 56320);
    }

    public static void d(byte b2, char[] cArr, int i) {
        cArr[i] = (char) b2;
    }

    public static void f(byte b2, byte b3, char[] cArr, int i) {
        if (b2 >= -62) {
            if (bZ(b3)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i] = (char) (((b2 & 31) << 6) | bY(b3));
            return;
        }
        throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
    }

    public static boolean g(byte b2) {
        return b2 >= 0;
    }

    public static boolean h(byte b2) {
        return b2 < -16;
    }

    public static boolean i(byte b2) {
        return b2 < -32;
    }

    public static int j(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int k(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int l(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int m(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            default:
                switch (i) {
                    case 51:
                        return 52;
                    case 52:
                        return 53;
                    case 53:
                        return 54;
                    default:
                        return 0;
                }
        }
    }

    public static int n(String str, int i) {
        while (i < str.length() && str.charAt(i) != '-') {
            i++;
        }
        return i;
    }

    public static int o(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static String p(int i) {
        return Integer.toString(i - 1);
    }

    public static /* synthetic */ void q(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static int r(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int s(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int t(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 4 ? 0 : 5;
        }
        return 2;
    }

    public static String u(int i) {
        return Integer.toString(i - 1);
    }

    public static /* synthetic */ void v(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static int w(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static String x(int i) {
        return Integer.toString(i - 1);
    }

    public static /* synthetic */ void y(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static int z(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static void e(byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!bZ(b3)) {
            if (b2 == -32) {
                if (b3 >= -96) {
                    b2 = -32;
                }
            }
            if (b2 == -19) {
                if (b3 < -96) {
                    b2 = -19;
                }
            }
            if (!bZ(b4)) {
                cArr[i] = (char) (((b2 & 15) << 12) | (bY(b3) << 6) | bY(b4));
                return;
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }
}

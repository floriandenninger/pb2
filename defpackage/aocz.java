package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aocz {
    public static volatile aych a;
    public static volatile aych b;
    public static volatile aych c;
    public static aocz d;

    public static int A(byte[] bArr, int i, aony aonyVar, aolt aoltVar) {
        aolw aolwVar = (aolw) aonyVar;
        int M = M(bArr, i, aoltVar);
        int i2 = aoltVar.a + M;
        while (M < i2) {
            M = P(bArr, M, aoltVar);
            aolwVar.f(aoltVar.b != 0);
        }
        if (M == i2) {
            return M;
        }
        throw aoob.j();
    }

    public static int B(byte[] bArr, int i, aony aonyVar, aolt aoltVar) {
        aomr aomrVar = (aomr) aonyVar;
        int M = M(bArr, i, aoltVar);
        int i2 = aoltVar.a + M;
        while (M < i2) {
            aomrVar.f(t(bArr, M));
            M += 8;
        }
        if (M == i2) {
            return M;
        }
        throw aoob.j();
    }

    public static int C(byte[] bArr, int i, aony aonyVar, aolt aoltVar) {
        aonn aonnVar = (aonn) aonyVar;
        int M = M(bArr, i, aoltVar);
        int i2 = aoltVar.a + M;
        while (M < i2) {
            aonnVar.g(w(bArr, M));
            M += 4;
        }
        if (M == i2) {
            return M;
        }
        throw aoob.j();
    }

    public static int D(byte[] bArr, int i, aony aonyVar, aolt aoltVar) {
        aoon aoonVar = (aoon) aonyVar;
        int M = M(bArr, i, aoltVar);
        int i2 = aoltVar.a + M;
        while (M < i2) {
            aoonVar.f(R(bArr, M));
            M += 8;
        }
        if (M == i2) {
            return M;
        }
        throw aoob.j();
    }

    public static int E(byte[] bArr, int i, aony aonyVar, aolt aoltVar) {
        aonc aoncVar = (aonc) aonyVar;
        int M = M(bArr, i, aoltVar);
        int i2 = aoltVar.a + M;
        while (M < i2) {
            aoncVar.h(u(bArr, M));
            M += 4;
        }
        if (M == i2) {
            return M;
        }
        throw aoob.j();
    }

    public static int F(byte[] bArr, int i, aony aonyVar, aolt aoltVar) {
        aonn aonnVar = (aonn) aonyVar;
        int M = M(bArr, i, aoltVar);
        int i2 = aoltVar.a + M;
        while (M < i2) {
            M = M(bArr, M, aoltVar);
            aonnVar.g(aomk.J(aoltVar.a));
        }
        if (M == i2) {
            return M;
        }
        throw aoob.j();
    }

    public static int G(byte[] bArr, int i, aony aonyVar, aolt aoltVar) {
        aoon aoonVar = (aoon) aonyVar;
        int M = M(bArr, i, aoltVar);
        int i2 = aoltVar.a + M;
        while (M < i2) {
            M = P(bArr, M, aoltVar);
            aoonVar.f(aomk.L(aoltVar.b));
        }
        if (M == i2) {
            return M;
        }
        throw aoob.j();
    }

    public static int H(byte[] bArr, int i, aony aonyVar, aolt aoltVar) {
        aonn aonnVar = (aonn) aonyVar;
        int M = M(bArr, i, aoltVar);
        int i2 = aoltVar.a + M;
        while (M < i2) {
            M = M(bArr, M, aoltVar);
            aonnVar.g(aoltVar.a);
        }
        if (M == i2) {
            return M;
        }
        throw aoob.j();
    }

    public static int I(byte[] bArr, int i, aony aonyVar, aolt aoltVar) {
        aoon aoonVar = (aoon) aonyVar;
        int M = M(bArr, i, aoltVar);
        int i2 = aoltVar.a + M;
        while (M < i2) {
            M = P(bArr, M, aoltVar);
            aoonVar.f(aoltVar.b);
        }
        if (M == i2) {
            return M;
        }
        throw aoob.j();
    }

    public static int J(byte[] bArr, int i, aolt aoltVar) {
        int M = M(bArr, i, aoltVar);
        int i2 = aoltVar.a;
        if (i2 < 0) {
            throw aoob.f();
        }
        if (i2 == 0) {
            aoltVar.c = "";
            return M;
        }
        aoltVar.c = new String(bArr, M, i2, aonz.a);
        return M + i2;
    }

    public static int K(byte[] bArr, int i, aolt aoltVar) {
        int M = M(bArr, i, aoltVar);
        int i2 = aoltVar.a;
        if (i2 < 0) {
            throw aoob.f();
        }
        if (i2 == 0) {
            aoltVar.c = "";
            return M;
        }
        aoltVar.c = aoqm.g(bArr, M, i2);
        return M + i2;
    }

    public static int L(int i, byte[] bArr, int i2, int i3, aoqc aoqcVar, aolt aoltVar) {
        if (aoqp.a(i) == 0) {
            throw aoob.c();
        }
        int b2 = aoqp.b(i);
        if (b2 == 0) {
            int P = P(bArr, i2, aoltVar);
            aoqcVar.f(i, Long.valueOf(aoltVar.b));
            return P;
        }
        if (b2 == 1) {
            aoqcVar.f(i, Long.valueOf(R(bArr, i2)));
            return i2 + 8;
        }
        if (b2 == 2) {
            int M = M(bArr, i2, aoltVar);
            int i4 = aoltVar.a;
            if (i4 < 0) {
                throw aoob.f();
            }
            if (i4 > bArr.length - M) {
                throw aoob.j();
            }
            if (i4 == 0) {
                aoqcVar.f(i, aomf.b);
            } else {
                aoqcVar.f(i, aomf.y(bArr, M, i4));
            }
            return M + i4;
        }
        if (b2 != 3) {
            if (b2 == 5) {
                aoqcVar.f(i, Integer.valueOf(w(bArr, i2)));
                return i2 + 4;
            }
            throw aoob.c();
        }
        int i5 = (i & (-8)) | 4;
        aoqc c2 = aoqc.c();
        int i6 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int M2 = M(bArr, i2, aoltVar);
            int i7 = aoltVar.a;
            if (i7 == i5) {
                i6 = i7;
                i2 = M2;
                break;
            }
            i6 = i7;
            i2 = L(i7, bArr, M2, i3, c2, aoltVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw aoob.g();
        }
        aoqcVar.f(i, c2);
        return i2;
    }

    public static int M(byte[] bArr, int i, aolt aoltVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return N(b2, bArr, i2, aoltVar);
        }
        aoltVar.a = b2;
        return i2;
    }

    public static int N(int i, byte[] bArr, int i2, aolt aoltVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            aoltVar.a = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            aoltVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            aoltVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            aoltVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                aoltVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int O(int i, byte[] bArr, int i2, int i3, aony aonyVar, aolt aoltVar) {
        aonn aonnVar = (aonn) aonyVar;
        int M = M(bArr, i2, aoltVar);
        aonnVar.g(aoltVar.a);
        while (M < i3) {
            int M2 = M(bArr, M, aoltVar);
            if (i != aoltVar.a) {
                break;
            }
            M = M(bArr, M2, aoltVar);
            aonnVar.g(aoltVar.a);
        }
        return M;
    }

    public static int P(byte[] bArr, int i, aolt aoltVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            aoltVar.b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        aoltVar.b = j2;
        return i3;
    }

    public static int Q(int i, byte[] bArr, int i2, int i3, aolt aoltVar) {
        if (aoqp.a(i) == 0) {
            throw aoob.c();
        }
        int b2 = aoqp.b(i);
        if (b2 == 0) {
            return P(bArr, i2, aoltVar);
        }
        if (b2 == 1) {
            return i2 + 8;
        }
        if (b2 == 2) {
            return M(bArr, i2, aoltVar) + aoltVar.a;
        }
        if (b2 != 3) {
            if (b2 == 5) {
                return i2 + 4;
            }
            throw aoob.c();
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = M(bArr, i2, aoltVar);
            i5 = aoltVar.a;
            if (i5 == i4) {
                break;
            }
            i2 = Q(i5, bArr, i2, i3, aoltVar);
        }
        if (i2 > i3 || i5 != i4) {
            throw aoob.g();
        }
        return i2;
    }

    public static long R(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static anuj S(String str, String str2) {
        aoaf aoafVar = new aoaf(str, str2);
        anui a2 = anuj.a(aoaf.class);
        a2.a = 1;
        a2.c(new anuh(aoafVar, 1));
        return a2.a();
    }

    public static SharedPreferences T(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static String U(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    public static String V(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    public static String W(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    public static void X(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = new Bundle();
        String string = bundle.getString("google.c.a.c_id");
        if (string != null) {
            bundle2.putString("_nmid", string);
        }
        String U = U(bundle);
        if (U != null) {
            bundle2.putString("_nmn", U);
        }
        String V = V(bundle);
        if (!TextUtils.isEmpty(V)) {
            bundle2.putString("label", V);
        }
        String string2 = bundle.getString("google.c.a.m_c");
        if (!TextUtils.isEmpty(string2)) {
            bundle2.putString("message_channel", string2);
        }
        String W = W(bundle);
        if (W != null) {
            bundle2.putString("_nt", W);
        }
        String string3 = bundle.getString("google.c.a.ts");
        if (string3 != null) {
            try {
                bundle2.putInt("_nmt", Integer.parseInt(string3));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        String string4 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
        if (string4 != null) {
            try {
                bundle2.putInt("_ndt", Integer.parseInt(string4));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        String str2 = true != anyx.i(bundle) ? "data" : "display";
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle2.putString("_nmc", str2);
        }
        anti antiVar = (anti) antc.b().f(anti.class);
        if (antiVar != null) {
            antiVar.a(str, bundle2);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }

    public static boolean Y(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static boolean Z(Intent intent) {
        if (intent == null || Y(intent)) {
            return false;
        }
        return aa(intent.getExtras());
    }

    public static int a(int i) {
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

    public static void aB(anop anopVar) {
        int V = aobq.V(anopVar.b);
        if (V == 0) {
            V = 1;
        }
        aF(V);
    }

    public static void aC(anot anotVar) {
        int V = aobq.V(anotVar.b);
        if (V == 0) {
            V = 1;
        }
        aF(V);
        int V2 = aobq.V(anotVar.b);
        if (V2 == 0) {
            V2 = 1;
        }
        int V3 = aobq.V(anotVar.c);
        if (V2 != (V3 != 0 ? V3 : 1)) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        if (anotVar.d < 0) {
            throw new GeneralSecurityException("salt length is negative");
        }
    }

    public static int aD(int i) {
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
        String str = i != 1 ? i != 2 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? "null" : "CURVE25519" : "NIST_P521" : "NIST_P384" : "NIST_P256" : "UNKNOWN_CURVE" : "UNRECOGNIZED";
        throw new GeneralSecurityException(str.length() != 0 ? "unknown curve type: ".concat(str) : new String("unknown curve type: "));
    }

    public static int aE(int i) {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                String str = i != 2 ? i != 3 ? i != 4 ? "UNRECOGNIZED" : "DER" : "IEEE_P1363" : "UNKNOWN_ENCODING";
                throw new GeneralSecurityException(str.length() != 0 ? "unknown ECDSA encoding: ".concat(str) : new String("unknown ECDSA encoding: "));
            }
        }
        return i3;
    }

    public static int aF(int i) {
        String str;
        int i2 = i - 2;
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3) {
            return 3;
        }
        if (i2 == 4) {
            return 5;
        }
        switch (i) {
            case 2:
                str = "UNKNOWN_HASH";
                break;
            case 3:
                str = "SHA1";
                break;
            case 4:
                str = "SHA384";
                break;
            case 5:
                str = "SHA256";
                break;
            case 6:
                str = "SHA512";
                break;
            case 7:
                str = "SHA224";
                break;
            default:
                str = "UNRECOGNIZED";
                break;
        }
        throw new GeneralSecurityException(str.length() != 0 ? "unsupported hash type: ".concat(str) : new String("unsupported hash type: "));
    }

    public static int aG(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int aH(int i) {
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

    public static int aI(int i) {
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

    public static int aJ(int i) {
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

    public static int aK(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int aL(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int aM(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int aN(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
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

    public static int aP(int i) {
        if (i != 0) {
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int aQ(int i) {
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

    public static int aR(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 14) {
            return 15;
        }
        if (i != 16) {
            return i != 18 ? 0 : 19;
        }
        return 17;
    }

    public static int aS(int i) {
        if (i != 0) {
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int aT(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int aU(int i) {
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
            default:
                return 0;
        }
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
        if (i != 0) {
            return i != 1 ? 0 : 3;
        }
        return 2;
    }

    public static boolean aa(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    public static final void ab(dy dyVar, anyu anyuVar) {
        if (anyuVar != null) {
            try {
                rpt rptVar = anyuVar.b;
                qip.an(rptVar);
                Bitmap bitmap = (Bitmap) rqr.e(rptVar, 5L, TimeUnit.SECONDS);
                dyVar.n(bitmap);
                dw dwVar = new dw();
                dwVar.a = bitmap;
                dwVar.c(null);
                dyVar.s(dwVar);
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                anyuVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                String valueOf = String.valueOf(e.getCause());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Failed to download image: ");
                sb.append(valueOf);
                Log.w("FirebaseMessaging", sb.toString());
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                anyuVar.close();
            }
        }
    }

    public static int ac(int i) {
        return i - 1;
    }

    public static void ad(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void ae(Object obj) {
        obj.getClass();
    }

    public static void af(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static /* synthetic */ String ag(int i) {
        return i != 3 ? i != 4 ? "SHA512" : "SHA384" : "SHA256";
    }

    public static int ah(EllipticCurve ellipticCurve) {
        return (ai(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static BigInteger ai(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static KeyPair aj(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) anqy.f.a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static void ak(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger ai = ai(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(ai) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(ai) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(ai).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(ai))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    public static void al(ECPublicKey eCPublicKey) {
        ak(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    public static boolean am(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int length = bArr.length;
        if (length < 8 || bArr[0] != 48) {
            return false;
        }
        int i6 = bArr[1] & 255;
        if (i6 == 129) {
            i6 = bArr[2] & 255;
            if (i6 < 128) {
                return false;
            }
            i = 2;
        } else {
            if (i6 == 128 || i6 > 129) {
                return false;
            }
            i = 1;
        }
        if (i6 != (length - 1) - i || bArr[i + 1] != 2 || (i5 = (i4 = (i3 = i + 3) + (i2 = bArr[i + 2] & 255)) + 1) >= length || i2 == 0) {
            return false;
        }
        byte b2 = bArr[i3];
        if ((b2 & 255) >= 128) {
            return false;
        }
        if ((i2 > 1 && b2 == 0 && (bArr[i + 4] & 255) < 128) || bArr[i4] != 2) {
            return false;
        }
        int i7 = bArr[i5] & 255;
        if (i4 + 2 + i7 != length || i7 == 0) {
            return false;
        }
        byte b3 = bArr[i + 5 + i2];
        if ((b3 & 255) >= 128) {
            return false;
        }
        return i7 <= 1 || b3 != 0 || (bArr[(i + 6) + i2] & 255) >= 128;
    }

    public static byte[] an(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || bArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == length) {
            i = length - 1;
        }
        int i2 = (bArr[i] & 128) == 128 ? 1 : 0;
        int i3 = length - i;
        byte[] bArr2 = new byte[i3 + i2];
        System.arraycopy(bArr, i, bArr2, i2, i3);
        return bArr2;
    }

    public static KeyPair ao(int i) {
        return aj(ar(i));
    }

    public static ECPrivateKey ap(int i, byte[] bArr) {
        return (ECPrivateKey) ((KeyFactory) anqy.g.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), ar(i)));
    }

    public static ECPublicKey aq(int i, byte[] bArr, byte[] bArr2) {
        ECParameterSpec ar = ar(i);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        ak(eCPoint, ar.getCurve());
        return (ECPublicKey) ((KeyFactory) anqy.g.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, ar));
    }

    public static void as(long[] jArr, long[] jArr2, int i) {
        int i2 = -i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = (int) jArr[i3];
            jArr[i3] = ((((int) jArr2[i3]) ^ i4) & i2) ^ i4;
        }
    }

    public static final void at(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final boolean au(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length == bArr2.length) {
            int i = 0;
            for (int i2 = 0; i2 < bArr.length; i2++) {
                i |= bArr[i2] ^ bArr2[i2];
            }
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] av(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            int length = bArr2.length;
            if (i > Integer.MAX_VALUE - length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i += length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            int length2 = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i2, length2);
            i2 += length2;
        }
        return bArr3;
    }

    public static final byte[] aw(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length) {
            throw new IllegalArgumentException("The lengths of x and y should match.");
        }
        return ax(bArr, 0, bArr2, 0, length);
    }

    public static final byte[] ax(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    public static byte[] ay(byte[] bArr) {
        int length = bArr.length;
        if (length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 16);
        copyOf[length] = Byte.MIN_VALUE;
        return copyOf;
    }

    public static byte[] az(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b2 = bArr[i];
            byte b3 = (byte) ((b2 + b2) & 254);
            bArr2[i] = b3;
            if (i < 15) {
                bArr2[i] = (byte) (((bArr[i + 1] >> 7) & 1) | b3);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static int b(int i) {
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
            default:
                return 0;
        }
    }

    public static int ba(int i) {
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
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bd(int i) {
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
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
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
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bk(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bl(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bm(int i) {
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

    public static int bn(int i) {
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

    public static int bo(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    private static ECParameterSpec bp(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    public static int c(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 0 : 4;
        }
        return 3;
    }

    public static int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int e(int i) {
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

    public static int f(int i) {
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

    public static int g(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static final aoor h(Object obj) {
        return ((aoos) obj).a;
    }

    public static final int i(int i, Object obj, Object obj2) {
        aoot aootVar = (aoot) obj;
        aoos aoosVar = (aoos) obj2;
        int i2 = 0;
        if (!aootVar.isEmpty()) {
            for (Map.Entry entry : aootVar.entrySet()) {
                i2 += aomp.ac(i) + aomp.S(aoos.a(aoosVar.a, entry.getKey(), entry.getValue()));
            }
        }
        return i2;
    }

    public static final boolean j(Object obj) {
        return !((aoot) obj).b;
    }

    public static final Object k(Object obj, Object obj2) {
        aoot aootVar = (aoot) obj;
        aoot aootVar2 = (aoot) obj2;
        if (!aootVar2.isEmpty()) {
            if (!aootVar.b) {
                aootVar = aootVar.a();
            }
            aootVar.b();
            if (!aootVar2.isEmpty()) {
                aootVar.putAll(aootVar2);
            }
        }
        return aootVar;
    }

    public static final Object l() {
        return aoot.a.a();
    }

    public static int m(Map.Entry entry) {
        return ((aonj) entry.getKey()).b;
    }

    public static aomz n(Object obj) {
        return ((aonh) obj).l;
    }

    public static aomz o(Object obj) {
        return ((aonh) obj).d();
    }

    public static void p(aopl aoplVar, Object obj, aomw aomwVar, aomz aomzVar) {
        aonk aonkVar = (aonk) obj;
        aomzVar.n(aonkVar.d, aoplVar.t(aonkVar.c.getClass(), aomwVar));
    }

    public static void q(aomq aomqVar, Map.Entry entry) {
        aonj aonjVar = (aonj) entry.getKey();
        if (aonjVar.d) {
            aoqn aoqnVar = aoqn.DOUBLE;
            switch (aonjVar.c) {
                case DOUBLE:
                    aopr.D(aonjVar.b, (List) entry.getValue(), aomqVar, aonjVar.e);
                    return;
                case FLOAT:
                    aopr.H(aonjVar.b, (List) entry.getValue(), aomqVar, aonjVar.e);
                    return;
                case INT64:
                    aopr.K(aonjVar.b, (List) entry.getValue(), aomqVar, aonjVar.e);
                    return;
                case UINT64:
                    aopr.S(aonjVar.b, (List) entry.getValue(), aomqVar, aonjVar.e);
                    return;
                case INT32:
                    aopr.J(aonjVar.b, (List) entry.getValue(), aomqVar, aonjVar.e);
                    return;
                case FIXED64:
                    aopr.G(aonjVar.b, (List) entry.getValue(), aomqVar, aonjVar.e);
                    return;
                case FIXED32:
                    aopr.F(aonjVar.b, (List) entry.getValue(), aomqVar, aonjVar.e);
                    return;
                case BOOL:
                    aopr.B(aonjVar.b, (List) entry.getValue(), aomqVar, aonjVar.e);
                    return;
                case STRING:
                    aopr.Q(aonjVar.b, (List) entry.getValue(), aomqVar);
                    return;
                case GROUP:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    aopr.I(aonjVar.b, (List) entry.getValue(), aomqVar, aopi.a.a(list.get(0).getClass()));
                    return;
                case MESSAGE:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    aopr.L(aonjVar.b, (List) entry.getValue(), aomqVar, aopi.a.a(list2.get(0).getClass()));
                    return;
                case BYTES:
                    aopr.C(aonjVar.b, (List) entry.getValue(), aomqVar);
                    return;
                case UINT32:
                    aopr.R(aonjVar.b, (List) entry.getValue(), aomqVar, aonjVar.e);
                    return;
                case ENUM:
                    aopr.J(aonjVar.b, (List) entry.getValue(), aomqVar, aonjVar.e);
                    return;
                case SFIXED32:
                    aopr.M(aonjVar.b, (List) entry.getValue(), aomqVar, aonjVar.e);
                    return;
                case SFIXED64:
                    aopr.N(aonjVar.b, (List) entry.getValue(), aomqVar, aonjVar.e);
                    return;
                case SINT32:
                    aopr.O(aonjVar.b, (List) entry.getValue(), aomqVar, aonjVar.e);
                    return;
                case SINT64:
                    aopr.P(aonjVar.b, (List) entry.getValue(), aomqVar, aonjVar.e);
                    return;
                default:
                    return;
            }
        }
        aoqn aoqnVar2 = aoqn.DOUBLE;
        switch (aonjVar.c) {
            case DOUBLE:
                aomqVar.c(aonjVar.b, ((Double) entry.getValue()).doubleValue());
                return;
            case FLOAT:
                aomqVar.g(aonjVar.b, ((Float) entry.getValue()).floatValue());
                return;
            case INT64:
                aomqVar.j(aonjVar.b, ((Long) entry.getValue()).longValue());
                return;
            case UINT64:
                aomqVar.s(aonjVar.b, ((Long) entry.getValue()).longValue());
                return;
            case INT32:
                aomqVar.i(aonjVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case FIXED64:
                aomqVar.f(aonjVar.b, ((Long) entry.getValue()).longValue());
                return;
            case FIXED32:
                aomqVar.e(aonjVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case BOOL:
                aomqVar.a(aonjVar.b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case STRING:
                aomqVar.q(aonjVar.b, (String) entry.getValue());
                return;
            case GROUP:
                aomqVar.h(aonjVar.b, entry.getValue(), aopi.a.a(entry.getValue().getClass()));
                return;
            case MESSAGE:
                aomqVar.k(aonjVar.b, entry.getValue(), aopi.a.a(entry.getValue().getClass()));
                return;
            case BYTES:
                aomqVar.b(aonjVar.b, (aomf) entry.getValue());
                return;
            case UINT32:
                aomqVar.r(aonjVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case ENUM:
                aomqVar.i(aonjVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case SFIXED32:
                aomqVar.m(aonjVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case SFIXED64:
                aomqVar.n(aonjVar.b, ((Long) entry.getValue()).longValue());
                return;
            case SINT32:
                aomqVar.o(aonjVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case SINT64:
                aomqVar.p(aonjVar.b, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    public static final void r(Object obj) {
        n(obj).f();
    }

    public static final aomf s(aomp aompVar, byte[] bArr) {
        aompVar.an();
        return new aomd(bArr);
    }

    public static double t(byte[] bArr, int i) {
        return Double.longBitsToDouble(R(bArr, i));
    }

    public static float u(byte[] bArr, int i) {
        return Float.intBitsToFloat(w(bArr, i));
    }

    public static int v(byte[] bArr, int i, aolt aoltVar) {
        int M = M(bArr, i, aoltVar);
        int i2 = aoltVar.a;
        if (i2 < 0) {
            throw aoob.f();
        }
        if (i2 > bArr.length - M) {
            throw aoob.j();
        }
        if (i2 == 0) {
            aoltVar.c = aomf.b;
            return M;
        }
        aoltVar.c = aomf.y(bArr, M, i2);
        return M + i2;
    }

    public static int w(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int x(aopq aopqVar, byte[] bArr, int i, int i2, int i3, aolt aoltVar) {
        aopa aopaVar = (aopa) aopqVar;
        Object e = aopaVar.e();
        int c2 = aopaVar.c(e, bArr, i, i2, i3, aoltVar);
        aopaVar.f(e);
        aoltVar.c = e;
        return c2;
    }

    public static int y(aopq aopqVar, byte[] bArr, int i, int i2, aolt aoltVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = N(i4, bArr, i3, aoltVar);
            i4 = aoltVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw aoob.j();
        }
        Object e = aopqVar.e();
        int i6 = i4 + i5;
        aopqVar.i(e, bArr, i5, i6, aoltVar);
        aopqVar.f(e);
        aoltVar.c = e;
        return i6;
    }

    public static int z(aopq aopqVar, int i, byte[] bArr, int i2, int i3, aony aonyVar, aolt aoltVar) {
        int y = y(aopqVar, bArr, i2, i3, aoltVar);
        aonyVar.add(aoltVar.c);
        while (y < i3) {
            int M = M(bArr, y, aoltVar);
            if (i != aoltVar.a) {
                break;
            }
            y = y(aopqVar, bArr, M, i3, aoltVar);
            aonyVar.add(aoltVar.c);
        }
        return y;
    }

    public static void aA(annn annnVar) {
        int Y = aobq.Y(annnVar.d);
        if (Y == 0) {
            Y = 1;
        }
        int V = aobq.V(annnVar.b);
        if (V == 0) {
            V = 1;
        }
        int X = aobq.X(annnVar.c);
        if (X == 0) {
            X = 1;
        }
        int i = Y - 2;
        if (i != 1 && i != 2) {
            throw new GeneralSecurityException("unsupported signature encoding");
        }
        int i2 = X - 2;
        if (i2 == 2) {
            if (V != 5) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            }
        } else if (i2 == 3) {
            if (V != 4 && V != 6) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            }
        } else {
            if (i2 != 4) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            }
            if (V != 6) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            }
        }
    }

    public static ECParameterSpec ar(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return bp("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
        }
        if (i2 == 1) {
            return bp("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
        }
        return bp("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
    }
}

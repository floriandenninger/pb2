package defpackage;

import android.util.Log;
import android.view.View;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class jf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(View view) {
        return view.hasOnClickListeners();
    }

    public static int b(byte[] bArr) {
        bkx c = c(bArr);
        if (c == null) {
            return -1;
        }
        return c.b;
    }

    public static bkx c(byte[] bArr) {
        pth pthVar = new pth(bArr);
        if (pthVar.c < 32) {
            return null;
        }
        pthVar.G(0);
        if (pthVar.d() != pthVar.a() + 4 || pthVar.d() != 1886614376) {
            return null;
        }
        int f = bkk.f(pthVar.d());
        if (f > 1) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Unsupported pssh version: ");
            sb.append(f);
            Log.w("PsshAtomUtil", sb.toString());
            return null;
        }
        UUID uuid = new UUID(pthVar.o(), pthVar.o());
        if (f == 1) {
            pthVar.H(pthVar.l() * 16);
        }
        int l = pthVar.l();
        if (l != pthVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[l];
        pthVar.B(bArr2, 0, l);
        return new bkx(uuid, f, bArr2);
    }

    public static byte[] d(byte[] bArr, UUID uuid) {
        bkx c = c(bArr);
        if (c == null) {
            return null;
        }
        if (uuid.equals(c.a)) {
            return c.c;
        }
        String valueOf = String.valueOf(uuid);
        String valueOf2 = String.valueOf(c.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + String.valueOf(valueOf2).length());
        sb.append("UUID mismatch. Expected: ");
        sb.append(valueOf);
        sb.append(", got: ");
        sb.append(valueOf2);
        sb.append(".");
        Log.w("PsshAtomUtil", sb.toString());
        return null;
    }

    public static int e(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static bje f(pth pthVar, boolean z, boolean z2) {
        if (z) {
            g(3, pthVar, false);
        }
        pthVar.v((int) pthVar.n()).length();
        long n = pthVar.n();
        String[] strArr = new String[(int) n];
        for (int i = 0; i < n; i++) {
            String v = pthVar.v((int) pthVar.n());
            strArr[i] = v;
            v.length();
        }
        if (!z2 || (pthVar.i() & 1) != 0) {
            return new bje(strArr);
        }
        throw pnr.a("framing bit expected to be set", null);
    }

    public static boolean g(int i, pth pthVar, boolean z) {
        if (pthVar.a() < 7) {
            if (z) {
                return false;
            }
            int a = pthVar.a();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(a);
            throw pnr.a(sb.toString(), null);
        }
        if (pthVar.i() != i) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            throw pnr.a(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "), null);
        }
        if (pthVar.i() == 118 && pthVar.i() == 111 && pthVar.i() == 114 && pthVar.i() == 98 && pthVar.i() == 105 && pthVar.i() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw pnr.a("expected characters 'vorbis'", null);
    }
}

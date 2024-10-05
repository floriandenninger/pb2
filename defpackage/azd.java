package defpackage;

import android.media.MediaDrm;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azd {
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    public static void b(long j, pth pthVar, bjc[] bjcVarArr) {
        int i;
        while (true) {
            if (pthVar.a() <= 1) {
                return;
            }
            int d = d(pthVar);
            int d2 = d(pthVar);
            int i2 = pthVar.b + d2;
            if (d2 == -1 || d2 > pthVar.a()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i2 = pthVar.c;
            } else if (d == 4 && d2 >= 8) {
                int i3 = pthVar.i();
                int m = pthVar.m();
                if (m == 49) {
                    i = pthVar.d();
                    m = 49;
                } else {
                    i = 0;
                }
                int i4 = pthVar.i();
                if (m == 47) {
                    pthVar.H(1);
                    m = 47;
                }
                boolean z = i3 == 181 && (m == 49 || m == 47) && i4 == 3;
                if (m == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    c(j, pthVar, bjcVarArr);
                }
            }
            pthVar.G(i2);
        }
    }

    public static void c(long j, pth pthVar, bjc[] bjcVarArr) {
        int i = pthVar.i();
        if ((i & 64) != 0) {
            pthVar.H(1);
            int i2 = (i & 31) * 3;
            int i3 = pthVar.b;
            for (bjc bjcVar : bjcVarArr) {
                pthVar.G(i3);
                bjcVar.t(pthVar, i2);
                if (j != -9223372036854775807L) {
                    bjcVar.v(j, 1, i2, 0, null);
                }
            }
        }
    }

    private static int d(pth pthVar) {
        int i = 0;
        while (pthVar.a() != 0) {
            int i2 = pthVar.i();
            i += i2;
            if (i2 != 255) {
                return i;
            }
        }
        return -1;
    }
}

package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pgj {
    public static final byte[] a = {0, 0, 0, 1};
    private static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair a(byte[] bArr) {
        int i;
        int i2;
        pgw pgwVar = new pgw(bArr);
        int a2 = pgwVar.a(5);
        int a3 = pgwVar.a(4);
        if (a3 == 15) {
            i = pgwVar.a(24);
        } else {
            opn.i(a3 < 13);
            i = b[a3];
        }
        int a4 = pgwVar.a(4);
        if (a2 == 5 || a2 == 29) {
            int a5 = pgwVar.a(4);
            if (a5 == 15) {
                i2 = pgwVar.a(24);
            } else {
                opn.i(a5 < 13);
                i2 = b[a5];
            }
            i = i2;
            if (pgwVar.a(5) == 22) {
                a4 = pgwVar.a(4);
            }
        }
        int i3 = c[a4];
        opn.i(i3 != -1);
        return Pair.create(Integer.valueOf(i), Integer.valueOf(i3));
    }
}

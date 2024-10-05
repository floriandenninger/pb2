package defpackage;

import android.util.Log;
import com.google.cardboard.sdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pqf extends pqn {
    private boolean A;
    private long B;
    private final int l;
    private final int m;
    private final int n;
    private List r;
    private List s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private byte x;
    private byte y;
    private static final int[] d = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] e = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] a = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] f = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] g = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] h = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] i = {195, 227, 205, 204, 236, 210, 242, 213, 245, R.styleable.AppCompatTheme_windowFixedWidthMinor, R.styleable.AppCompatTheme_windowMinWidthMinor, 92, 94, 95, R.styleable.AppCompatTheme_windowMinWidthMajor, R.styleable.AppCompatTheme_windowNoTitle, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] j = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final pth k = new pth();
    private final ArrayList p = new ArrayList();
    private pqe q = new pqe(0, 4);
    private int z = 0;
    private final long o = 16000000;

    public pqf(String str, int i2) {
        this.l = true != "application/x-mp4-cea-608".equals(str) ? 3 : 2;
        if (i2 == 1) {
            this.n = 0;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.n = 0;
                } else {
                    if (i2 != 4) {
                        Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.n = 0;
                        this.m = 0;
                        o(0);
                        n();
                        this.A = true;
                        this.B = -9223372036854775807L;
                    }
                    this.n = 1;
                }
                this.m = 1;
                o(0);
                n();
                this.A = true;
                this.B = -9223372036854775807L;
            }
            this.n = 1;
        }
        this.m = 0;
        o(0);
        n();
        this.A = true;
        this.B = -9223372036854775807L;
    }

    private static char l(byte b) {
        return (char) f[b - 32];
    }

    private final List m() {
        int size = this.p.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 2;
        for (int i3 = 0; i3 < size; i3++) {
            ppp b = ((pqe) this.p.get(i3)).b(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            arrayList.add(b);
            if (b != null) {
                i2 = Math.min(i2, b.k);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            ppp pppVar = (ppp) arrayList.get(i4);
            if (pppVar != null) {
                if (pppVar.k != i2) {
                    pppVar = ((pqe) this.p.get(i4)).b(i2);
                    pse.c(pppVar);
                }
                arrayList2.add(pppVar);
            }
        }
        return arrayList2;
    }

    private final void n() {
        this.q.e(this.t);
        this.p.clear();
        this.p.add(this.q);
    }

    private final void o(int i2) {
        int i3 = this.t;
        if (i3 == i2) {
            return;
        }
        this.t = i2;
        if (i2 == 3) {
            for (int i4 = 0; i4 < this.p.size(); i4++) {
                ((pqe) this.p.get(i4)).g = 3;
            }
            return;
        }
        n();
        if (i3 == 3 || i2 == 1 || i2 == 0) {
            this.r = Collections.emptyList();
        }
    }

    private final void p(int i2) {
        this.u = i2;
        this.q.h = i2;
    }

    private static boolean q(byte b) {
        return (b & 224) == 0;
    }

    @Override // defpackage.pqn, defpackage.ast
    public final /* bridge */ /* synthetic */ Object b() {
        return b();
    }

    @Override // defpackage.ast
    public final String c() {
        throw null;
    }

    @Override // defpackage.pqn, defpackage.ast
    public final void d() {
        super.d();
        this.r = null;
        this.s = null;
        o(0);
        p(4);
        n();
        this.v = false;
        this.w = false;
        this.x = (byte) 0;
        this.y = (byte) 0;
        this.z = 0;
        this.A = true;
        this.B = -9223372036854775807L;
    }

    @Override // defpackage.pqn, defpackage.ast
    public final void f() {
    }

    @Override // defpackage.pqn
    protected final ppw h() {
        List list = this.r;
        this.s = list;
        pse.c(list);
        return new pqw(list, 1);
    }

    @Override // defpackage.pqn
    /* renamed from: i */
    public final pqa b() {
        pqa pqaVar;
        pqa b = super.b();
        if (b != null) {
            return b;
        }
        long j2 = this.o;
        long j3 = this.B;
        if (j3 == -9223372036854775807L || this.c - j3 < j2 || (pqaVar = (pqa) this.b.pollFirst()) == null) {
            return null;
        }
        this.r = Collections.emptyList();
        this.B = -9223372036854775807L;
        pqaVar.e(this.c, h(), Long.MAX_VALUE);
        return pqaVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:121:0x01b1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086 A[SYNTHETIC] */
    @Override // defpackage.pqn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void j(defpackage.ppz r15) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqf.j(ppz):void");
    }

    @Override // defpackage.pqn
    protected final boolean k() {
        return this.r != this.s;
    }
}

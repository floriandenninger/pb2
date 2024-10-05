package defpackage;

import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class brd {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    final /* synthetic */ bre j;

    public brd(bre breVar, int i, int i2) {
        this.j = breVar;
        this.a = i;
        this.b = i2;
        b();
    }

    public final int a() {
        return ((this.e - this.d) + 1) * ((this.g - this.f) + 1) * ((this.i - this.h) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        bre breVar = this.j;
        int[] iArr = breVar.a;
        int[] iArr2 = breVar.b;
        int i = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        int i2 = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        int i3 = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = 0;
        for (int i8 = this.a; i8 <= this.b; i8++) {
            int i9 = iArr[i8];
            i7 += iArr2[i9];
            int d = bre.d(i9);
            int c = bre.c(i9);
            int b = bre.b(i9);
            if (d > i) {
                i = d;
            }
            if (d < i4) {
                i4 = d;
            }
            if (c > i2) {
                i2 = c;
            }
            if (c < i5) {
                i5 = c;
            }
            if (b > i3) {
                i3 = b;
            }
            if (b < i6) {
                i6 = b;
            }
        }
        this.d = i4;
        this.e = i;
        this.f = i5;
        this.g = i2;
        this.h = i6;
        this.i = i3;
        this.c = i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return (this.b + 1) - this.a > 1;
    }
}

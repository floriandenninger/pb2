package defpackage;

import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmz {
    private final String a;
    private final int b;
    private final int c;
    private int d;
    private String e;

    public bmz(int i, int i2) {
        this(CellularSignalStrengthError.ERROR_NOT_SUPPORTED, i, i2);
    }

    private final void d() {
        if (this.d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int a() {
        d();
        return this.d;
    }

    public final String b() {
        d();
        return this.e;
    }

    public final void c() {
        int i = this.d;
        int i2 = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.d = i2;
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(i2);
        this.e = sb.toString();
    }

    public bmz(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(12);
            sb.append(i);
            sb.append("/");
            str = sb.toString();
        } else {
            str = "";
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.e = "";
    }
}

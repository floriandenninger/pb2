package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aigr extends ynz {
    public final boolean a;
    public String b;
    public String d;
    public final atyq e;
    public final Throwable f;
    public final String g;
    public final String h;
    public final int i;
    private final int j;

    public aigr(int i, int i2, String str) {
        this(i, false, i2, str, null);
    }

    public final boolean a() {
        int i = this.j - 1;
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return ahbl.e(this.i, 3, 2, 5, 6, 7, 13, 11);
        }
        return false;
    }

    public aigr(int i, boolean z, int i2, String str, Throwable th) {
        this(i, z, i2, str, th, null);
    }

    public aigr(int i, boolean z, int i2, String str, Throwable th, String str2) {
        this(i, z, i2, str, th, str2, null);
    }

    public aigr(int i, boolean z, int i2, String str, Throwable th, String str2, String str3) {
        this(i, z, i2, str, th, str2, str3, null);
    }

    public aigr(int i, boolean z, int i2, String str, Throwable th, String str2, String str3, atyq atyqVar) {
        this.i = i;
        this.a = z;
        this.j = i2;
        this.d = str;
        this.f = th;
        this.g = str2;
        this.h = str3;
        this.e = atyqVar;
    }

    public aigr(int i, boolean z, String str) {
        this(i, z, 1, str, null);
    }

    public aigr(int i, String str, String str2) {
        this(i, true, 1, str, null, str2);
    }

    public aigr(int i, boolean z, String str, Throwable th) {
        this(i, z, 1, str, th);
    }

    public aigr(int i, Throwable th) {
        this(i, true, 1, null, th);
    }
}

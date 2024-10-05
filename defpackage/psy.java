package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class psy {
    public final int a;
    public final int b;

    public psy(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public psy(int i, int i2, byte[] bArr) {
        this.b = i;
        this.a = i2;
    }

    public psy(int i, int i2, byte[] bArr, byte[] bArr2) {
        this.a = i;
        this.b = i2;
    }

    public psy(int i, int i2, char[] cArr) {
        this.b = i;
        this.a = i2;
    }

    public final int a() {
        int i = this.b;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }
}

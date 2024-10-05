package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axjn {
    public static final axjn a = new axjn();
    public final boolean b;
    public final String c;
    public final int d;
    public final boolean e;
    public final axip f;

    private axjn() {
        this.b = false;
        this.c = "";
        this.d = 0;
        this.e = false;
        this.f = null;
    }

    public axjn(String str, int i, boolean z, axip axipVar) {
        this.b = true;
        this.c = str;
        this.d = i;
        this.e = z;
        this.f = axipVar;
    }

    public final String toString() {
        if (!this.b) {
            return "Unsupported codec";
        }
        String str = this.c;
        String hexString = Integer.toHexString(this.d);
        boolean z = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(hexString).length());
        sb.append(str);
        sb.append(" Color format: 0x");
        sb.append(hexString);
        sb.append(" isH264HighProfileSupported: ");
        sb.append(z);
        return sb.toString();
    }
}

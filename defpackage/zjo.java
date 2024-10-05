package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zjo {
    public final shf a;
    public final acpl b;

    public zjo(shf shfVar, acpl acplVar) {
        this.a = shfVar;
        this.b = acplVar;
    }

    public static int a(String str) {
        try {
            return Integer.parseInt(str.substring(0, 3));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return -1;
        }
    }

    public static int b(String str) {
        try {
            return Integer.parseInt(str.substring(3));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return -1;
        }
    }
}

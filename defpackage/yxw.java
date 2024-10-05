package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yxw {
    public final String a;
    public final Object b;
    public final int c;

    public yxw(String str, Object obj, int i) {
        this.a = str;
        this.b = obj;
        this.c = i;
    }

    public static yxw b(String str, String str2) {
        return new yxw(str, str2, 4);
    }

    public static yxw c(String str, boolean z) {
        return new yxw(str, Boolean.valueOf(z), 1);
    }

    public final Object a() {
        pyg pygVar = (pyg) pyp.a.get();
        if (pygVar == null) {
            return this.b;
        }
        int i = this.c - 1;
        if (i == 0) {
            return Boolean.valueOf(pygVar.a.e.getBoolean(this.a, ((Boolean) this.b).booleanValue()));
        }
        if (i == 1) {
            try {
                return Long.valueOf(pygVar.a.e.getLong(this.a, ((Long) this.b).longValue()));
            } catch (ClassCastException unused) {
                return Long.valueOf(pygVar.a.e.getInt(r1, (int) r2));
            }
        }
        if (i != 2) {
            return pygVar.a.e.getString(this.a, (String) this.b);
        }
        return Double.valueOf(pygVar.a.e.getFloat(this.a, (float) ((Double) this.b).doubleValue()));
    }
}

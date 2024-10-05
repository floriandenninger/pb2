package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tff {
    public final String a;
    public final int b;

    public tff(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public static tff a(String str) {
        str.getClass();
        return new tff(1, str);
    }

    public static tff b() {
        return new tff(2, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tff) {
            tff tffVar = (tff) obj;
            if (tffVar.b - 1 == this.b - 1 && amkq.b(tffVar.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b - 1;
        String str = this.a;
        return i + ((str == null ? 0 : str.hashCode()) * 31);
    }
}

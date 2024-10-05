package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgl {
    public final adgk a;
    public final String b;
    public final String c;

    public adgl(adgk adgkVar, String str, String str2) {
        this.a = adgkVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof adgl)) {
            return false;
        }
        return this.a.equals(((adgl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

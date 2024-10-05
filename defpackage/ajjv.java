package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajjv {
    public static final ajjv a = a().a();
    public static final ajjv b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final ajjx h;
    public final ajkb i;
    public final int j;

    static {
        ajju a2 = a();
        a2.d(true);
        b = a2.a();
        ajju a3 = a();
        a3.e = 2;
        a3.a();
        ajju a4 = a();
        a4.e = 3;
        a4.a();
    }

    public ajjv() {
    }

    public ajjv(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, ajjx ajjxVar, ajkb ajkbVar) {
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = z3;
        this.g = z4;
        this.j = i2;
        this.h = ajjxVar;
        this.i = ajkbVar;
    }

    public static ajju a() {
        ajju ajjuVar = new ajju();
        ajjuVar.d(false);
        ajjuVar.c(true);
        ajjuVar.b(0);
        ajjuVar.a = true;
        ajjuVar.b = true;
        ajjuVar.c = null;
        ajjuVar.e = 1;
        return ajjuVar;
    }

    public final ajju b() {
        return new ajju(this);
    }

    public final boolean equals(Object obj) {
        ajjx ajjxVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajjv) {
            ajjv ajjvVar = (ajjv) obj;
            if (this.c == ajjvVar.c && this.d == ajjvVar.d && this.e == ajjvVar.e && this.f == ajjvVar.f && this.g == ajjvVar.g) {
                int i = this.j;
                int i2 = ajjvVar.j;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && ((ajjxVar = this.h) != null ? ajjxVar.equals(ajjvVar.h) : ajjvVar.h == null)) {
                    ajkb ajkbVar = this.i;
                    ajkb ajkbVar2 = ajjvVar.i;
                    if (ajkbVar != null ? ajkbVar.equals(ajkbVar2) : ajkbVar2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        boolean z = this.c;
        boolean z2 = this.d;
        int i = this.e;
        boolean z3 = this.f;
        boolean z4 = this.g;
        int i2 = this.j;
        String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "CACHE_PREFERRED" : "CACHE_ONLY" : "DEFAULT";
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.i);
        StringBuilder sb = new StringBuilder(str.length() + 240 + "null".length() + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("ImageLoadOptions{shouldUpdateOnLayoutChange=");
        sb.append(z);
        sb.append(", shouldAnimate=");
        sb.append(z2);
        sb.append(", placeholderResId=");
        sb.append(i);
        sb.append(", cleanUpDrawableWhenLoading=");
        sb.append(z3);
        sb.append(", waitLayoutRequest=");
        sb.append(z4);
        sb.append(", retrieveFromCacheOption=");
        sb.append(str);
        sb.append(", preloadRendererFactory=");
        sb.append("null");
        sb.append(", loadListener=");
        sb.append(valueOf);
        sb.append(", imageParams=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = ((((((((((true != this.c ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237)) * 1000003;
        int i2 = this.j;
        if (i2 != 0) {
            int i3 = (i ^ i2) * (-721379959);
            ajjx ajjxVar = this.h;
            int hashCode = (i3 ^ (ajjxVar == null ? 0 : ajjxVar.hashCode())) * 1000003;
            ajkb ajkbVar = this.i;
            return hashCode ^ (ajkbVar != null ? ajkbVar.hashCode() : 0);
        }
        throw null;
    }
}

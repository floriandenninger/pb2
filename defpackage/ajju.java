package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajju {
    public Boolean a;
    public Boolean b;
    public ajjx c;
    public ajkb d;
    public int e;
    private Boolean f;
    private Boolean g;
    private Integer h;

    public ajju() {
    }

    public ajju(ajjv ajjvVar) {
        this.f = Boolean.valueOf(ajjvVar.c);
        this.g = Boolean.valueOf(ajjvVar.d);
        this.h = Integer.valueOf(ajjvVar.e);
        this.a = Boolean.valueOf(ajjvVar.f);
        this.b = Boolean.valueOf(ajjvVar.g);
        this.e = ajjvVar.j;
        this.c = ajjvVar.h;
        this.d = ajjvVar.i;
    }

    public final ajjv a() {
        Boolean bool = this.f;
        if (bool == null || this.g == null || this.h == null || this.a == null || this.b == null || this.e == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.f == null) {
                sb.append(" shouldUpdateOnLayoutChange");
            }
            if (this.g == null) {
                sb.append(" shouldAnimate");
            }
            if (this.h == null) {
                sb.append(" placeholderResId");
            }
            if (this.a == null) {
                sb.append(" cleanUpDrawableWhenLoading");
            }
            if (this.b == null) {
                sb.append(" waitLayoutRequest");
            }
            if (this.e == 0) {
                sb.append(" retrieveFromCacheOption");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ajjv(bool.booleanValue(), this.g.booleanValue(), this.h.intValue(), this.a.booleanValue(), this.b.booleanValue(), this.e, this.c, this.d);
    }

    public final void b(int i) {
        this.h = Integer.valueOf(i);
    }

    public final void c(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.f = Boolean.valueOf(z);
    }
}

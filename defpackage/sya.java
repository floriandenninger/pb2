package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sya {
    public azrw a;
    public String b;
    public sxw c;
    public syg d;
    public Object e;
    public syp f;
    public Boolean g;
    private Boolean h;

    public final syb a() {
        String str;
        sxw sxwVar;
        Boolean bool;
        azrw azrwVar = this.a;
        if (azrwVar == null || (str = this.b) == null || (sxwVar = this.c) == null || (bool = this.h) == null || this.g == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" converterProvider");
            }
            if (this.b == null) {
                sb.append(" logTag");
            }
            if (this.c == null) {
                sb.append(" perfLoggerFactory");
            }
            if (this.h == null) {
                sb.append(" useIncrementalMount");
            }
            if (this.g == null) {
                sb.append(" nestedScrollingEnabled");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new syb(azrwVar, str, sxwVar, this.d, bool.booleanValue(), this.e, this.f, this.g.booleanValue());
    }

    public final void b(boolean z) {
        this.h = Boolean.valueOf(z);
    }
}

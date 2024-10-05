package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amfb {
    public String a;
    public amfa b;
    public amrp c;
    public vep d;
    public Boolean e;
    public anib f;
    private aooy g;
    private amru h;

    public final amfc a() {
        aooy aooyVar;
        amfa amfaVar;
        vep vepVar;
        Boolean bool;
        amrp amrpVar = this.c;
        if (amrpVar != null) {
            this.h = amrpVar.g();
        } else if (this.h == null) {
            this.h = amru.q();
        }
        String str = this.a;
        if (str == null || (aooyVar = this.g) == null || (amfaVar = this.b) == null || (vepVar = this.d) == null || (bool = this.e) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" name");
            }
            if (this.g == null) {
                sb.append(" schema");
            }
            if (this.b == null) {
                sb.append(" storage");
            }
            if (this.d == null) {
                sb.append(" handler");
            }
            if (this.e == null) {
                sb.append(" updateSequencingBugFix");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new amfc(str, aooyVar, amfaVar, this.h, vepVar, bool.booleanValue(), this.f);
    }

    public final void b(aooy aooyVar) {
        if (aooyVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.g = aooyVar;
    }
}

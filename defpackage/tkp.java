package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tkp {
    public Boolean a;
    public ammv b;
    private Boolean c;
    private ammv d;
    private ammv e;

    public tkp() {
    }

    public tkp(byte[] bArr) {
        this.b = amlr.a;
        this.d = amlr.a;
        this.e = amlr.a;
    }

    public final tkq a() {
        Boolean bool = this.c;
        if (bool == null || this.a == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" includeAllGroups");
            }
            if (this.a == null) {
                sb.append(" groupWithNoAccountOnly");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        tkq tkqVar = new tkq(bool.booleanValue(), this.a.booleanValue(), this.b, this.d, this.e);
        if (!tkqVar.a) {
            amkq.F(tkqVar.c.h(), "Request must provide a group name or source to filter by");
        } else {
            amkq.E(!tkqVar.c.h());
            amkq.E(true);
            amkq.E(true);
        }
        if (tkqVar.b) {
            amkq.E(true);
        }
        return tkqVar;
    }

    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }
}

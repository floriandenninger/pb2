package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anxg implements anxl {
    private final anxm a;
    private final rpv b;

    public anxg(anxm anxmVar, rpv rpvVar) {
        this.a = anxmVar;
        this.b = rpvVar;
    }

    @Override // defpackage.anxl
    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    @Override // defpackage.anxl
    public final boolean b(anxr anxrVar) {
        Long l;
        if (!anxrVar.d() || this.a.c(anxrVar)) {
            return false;
        }
        rpv rpvVar = this.b;
        anxi anxiVar = new anxi();
        String str = anxrVar.b;
        if (str != null) {
            anxiVar.a = str;
            anxiVar.b = Long.valueOf(anxrVar.d);
            anxiVar.c = Long.valueOf(anxrVar.e);
            String str2 = anxiVar.a;
            if (str2 == null || (l = anxiVar.b) == null || anxiVar.c == null) {
                StringBuilder sb = new StringBuilder();
                if (anxiVar.a == null) {
                    sb.append(" token");
                }
                if (anxiVar.b == null) {
                    sb.append(" tokenExpirationTimestamp");
                }
                if (anxiVar.c == null) {
                    sb.append(" tokenCreationTimestamp");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            rpvVar.b(new anxj(str2, l.longValue(), anxiVar.c.longValue()));
            return true;
        }
        throw new NullPointerException("Null token");
    }
}

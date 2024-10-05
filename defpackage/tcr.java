package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tcr {
    public Long a;
    public Long b;
    public Boolean c;
    private Integer d;
    private amrw e;
    private amrz f;

    public final tcs a() {
        amrw amrwVar = this.e;
        if (amrwVar != null) {
            this.f = amrwVar.c();
        } else if (this.f == null) {
            this.f = amvo.b;
        }
        Integer num = this.d;
        if (num == null || this.c == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" measurementType");
            }
            if (this.c == null) {
                sb.append(" noConnectivity");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        tcs tcsVar = new tcs(this.a, this.b, num.intValue(), this.f, this.c.booleanValue());
        amkq.O((tcsVar.b != null) == (tcsVar.a != null), "downloadBytes and downloadMicros must be set together");
        amkq.O(true, "uploadBytes and uploadMicros must be set together");
        if (tcsVar.e) {
            amkq.O(true, "latencyMicros can't be set if noConnectivity is true");
            amkq.O(tcsVar.a == null, "downloadMicros can't be set if noConnectivity is true");
            amkq.O(tcsVar.b == null, "downloadBytes can't be set if noConnectivity is true");
            amkq.O(true, "uploadMicros can't be set if noConnectivity is true");
            amkq.O(true, "uploadBytes can't be set if noConnectivity is true");
        }
        return tcsVar;
    }

    public final void b(String str, String str2) {
        if (this.e == null) {
            this.e = amrz.h();
        }
        this.e.g(str, str2);
    }

    public final void c(int i) {
        this.d = Integer.valueOf(i);
    }
}

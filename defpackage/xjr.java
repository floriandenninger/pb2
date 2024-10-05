package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xjr {
    private Integer a;
    private Boolean b;
    private xcf c;

    public final xjs a() {
        Integer num = this.a;
        if (num == null || this.b == null || this.c == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" timeRemainingMillis");
            }
            if (this.b == null) {
                sb.append(" showAdChoices");
            }
            if (this.c == null) {
                sb.append(" adCountMetadata");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new xjs(num.intValue(), this.b.booleanValue(), this.c);
    }

    public final void b(xcf xcfVar) {
        if (xcfVar == null) {
            throw new NullPointerException("Null adCountMetadata");
        }
        this.c = xcfVar;
    }

    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void d(int i) {
        this.a = Integer.valueOf(i);
    }
}

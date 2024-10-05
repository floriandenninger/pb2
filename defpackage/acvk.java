package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acvk {
    private Boolean a;
    private Integer b;
    private Integer c;
    private Integer d;

    public final acvl a() {
        Boolean bool = this.a;
        if (bool == null || this.b == null || this.c == null || this.d == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" enabled");
            }
            if (this.b == null) {
                sb.append(" scanDurationSeconds");
            }
            if (this.c == null) {
                sb.append(" scanPeriodNoDevicesDetectedSeconds");
            }
            if (this.d == null) {
                sb.append(" scanPeriodDevicesDetectedSeconds");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new acvl(bool.booleanValue(), this.b.intValue(), this.c.intValue(), this.d.intValue());
    }

    public final void b(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final void c(int i) {
        this.b = Integer.valueOf(i);
    }

    public final void d(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void e(int i) {
        this.c = Integer.valueOf(i);
    }
}

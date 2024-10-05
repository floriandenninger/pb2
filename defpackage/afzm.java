package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afzm {
    public String a;
    private Boolean b;
    private Integer c;
    private Integer d;

    public final afzn a() {
        Boolean bool = this.b;
        if (bool == null || this.c == null || this.d == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" newContent");
            }
            if (this.c == null) {
                sb.append(" deliveryTimestamp");
            }
            if (this.d == null) {
                sb.append(" unseenItemCount");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new afzn(this.a, bool.booleanValue(), this.c.intValue(), this.d.intValue());
    }

    public final void b(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void d(int i) {
        this.d = Integer.valueOf(i);
    }
}

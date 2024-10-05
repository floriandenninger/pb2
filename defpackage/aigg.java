package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aigg {
    public Integer a;
    public int b;

    public final aigh a() {
        Integer num;
        int i = this.b;
        if (i == 0 || (num = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == 0) {
                sb.append(" prefetchReason");
            }
            if (this.a == null) {
                sb.append(" playbackBeginsInSeconds");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new aigh(i, num.intValue());
    }

    public final void b(int i) {
        this.a = Integer.valueOf(i);
    }
}

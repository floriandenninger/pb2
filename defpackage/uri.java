package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uri implements uoo {
    private final long a;
    private final amsx b;
    private final int c;

    public uri() {
    }

    public uri(int i, long j, amsx amsxVar) {
        this.c = i;
        this.a = j;
        this.b = amsxVar;
    }

    @Override // defpackage.uoo
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.uoo
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uri)) {
            return false;
        }
        uri uriVar = (uri) obj;
        int i = this.c;
        int i2 = uriVar.c;
        if (i != 0) {
            return i == i2 && this.a == uriVar.a && this.b.equals(uriVar.b);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.c;
        uop.b(i);
        long j = this.a;
        return ((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((amvs) this.b).c;
    }

    public final String toString() {
        String a = uop.a(this.c);
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(a.length() + 117 + String.valueOf(valueOf).length());
        sb.append("DebugMemoryConfigurations{enablement=");
        sb.append(a);
        sb.append(", debugMemoryServiceThrottleMs=");
        sb.append(j);
        sb.append(", debugMemoryEventsToSample=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

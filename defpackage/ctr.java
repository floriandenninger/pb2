package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctr implements ctw {
    int a;
    public Class b;
    private final cts c;

    public ctr(cts ctsVar) {
        this.c = ctsVar;
    }

    @Override // defpackage.ctw
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctr) {
            ctr ctrVar = (ctr) obj;
            if (this.a == ctrVar.a && this.b == ctrVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Class cls = this.b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Key{size=");
        sb.append(i);
        sb.append("array=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}

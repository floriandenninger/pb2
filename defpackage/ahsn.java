package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahsn extends ahsp {
    private final int a;

    public ahsn(int i) {
        this.a = i;
    }

    @Override // defpackage.ahsp
    public int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ahsp) && this.a == ((ahsp) obj).a();
    }

    public int hashCode() {
        return this.a ^ 1000003;
    }

    public String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("PlaybackLoopDismissedEvent{reason=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

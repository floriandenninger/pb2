package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kgz extends khh {
    private final khl a;
    private final khg b;

    public kgz(khl khlVar, khg khgVar) {
        if (khlVar == null) {
            throw new NullPointerException("Null interruptionEvent");
        }
        this.a = khlVar;
        if (khgVar != null) {
            this.b = khgVar;
            return;
        }
        throw new NullPointerException("Null interruptionContext");
    }

    @Override // defpackage.khh
    public khg a() {
        return this.b;
    }

    @Override // defpackage.khh
    public khl b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof khh) {
            khh khhVar = (khh) obj;
            if (this.a.equals(khhVar.b()) && this.b.equals(khhVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67 + String.valueOf(valueOf2).length());
        sb.append("LoggableInterruptionEvent{interruptionEvent=");
        sb.append(valueOf);
        sb.append(", interruptionContext=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

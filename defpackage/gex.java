package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gex extends ges {
    private final get a;
    private final get b;

    public gex(get getVar, get getVar2) {
        if (getVar == null) {
            throw new NullPointerException("Null currentState");
        }
        this.a = getVar;
        if (getVar2 != null) {
            this.b = getVar2;
            return;
        }
        throw new NullPointerException("Null toState");
    }

    @Override // defpackage.ges
    public get b() {
        return this.a;
    }

    @Override // defpackage.ges
    public get c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ges) {
            ges gesVar = (ges) obj;
            if (this.a.equals(gesVar.b()) && this.b.equals(gesVar.c())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + String.valueOf(valueOf2).length());
        sb.append("ActiveStateChangedEvent{currentState=");
        sb.append(valueOf);
        sb.append(", toState=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

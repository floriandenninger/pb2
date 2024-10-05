package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uim {
    public final uis a;
    public final adrv b;

    public uim() {
    }

    public uim(adrv adrvVar, uis uisVar) {
        this.b = adrvVar;
        this.a = uisVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uim) {
            uim uimVar = (uim) obj;
            if (this.b.equals(uimVar.b) && this.a.equals(uimVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 77 + String.valueOf(valueOf2).length());
        sb.append("ExpressSignInSpec{onContinueWithAccountListenerWithAsyncCallback=");
        sb.append(valueOf);
        sb.append(", features=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

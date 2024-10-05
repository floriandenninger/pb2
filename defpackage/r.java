package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class r {

    @Deprecated
    public final q a;

    @Deprecated
    public final q b;

    @Deprecated
    public r(q qVar, q qVar2) {
        if (qVar.b == qVar2.b) {
            this.a = qVar;
            this.b = qVar2;
            return;
        }
        String valueOf = String.valueOf(qVar);
        String valueOf2 = String.valueOf(qVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55 + String.valueOf(valueOf2).length());
        sb.append("Ranges must have the same number of visible decimals: ");
        sb.append(valueOf);
        sb.append("~");
        sb.append(valueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    @Deprecated
    public final String toString() {
        String sb;
        String valueOf = String.valueOf(this.a);
        q qVar = this.b;
        if (qVar == this.a) {
            sb = "";
        } else {
            String valueOf2 = String.valueOf(qVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1);
            sb2.append("~");
            sb2.append(valueOf2);
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(sb).length());
        sb3.append(valueOf);
        sb3.append(sb);
        return sb3.toString();
    }
}

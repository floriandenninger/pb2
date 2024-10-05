package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajdq extends akbq {
    private final boolean a;
    private final int b;
    private final awos c;
    private final acra d;
    private final boolean e;

    public ajdq() {
    }

    public ajdq(boolean z, int i, awos awosVar, acra acraVar, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = awosVar;
        this.d = acraVar;
        this.e = z2;
    }

    @Override // defpackage.akbn
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        awos awosVar;
        acra acraVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajdq) {
            ajdq ajdqVar = (ajdq) obj;
            if (this.a == ajdqVar.a && this.b == ajdqVar.b && ((awosVar = this.c) != null ? awosVar.equals(ajdqVar.c) : ajdqVar.c == null) && ((acraVar = this.d) != null ? acraVar.equals(ajdqVar.d) : ajdqVar.d == null) && this.e == ajdqVar.e) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.akbq
    public final acra f() {
        return this.d;
    }

    @Override // defpackage.akbn
    public final akbl g() {
        return null;
    }

    @Override // defpackage.akbq
    public final awos h() {
        return this.c;
    }

    @Override // defpackage.akbn
    public final boolean i() {
        return this.a;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        boolean z2 = this.e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 146 + String.valueOf(valueOf2).length() + "null".length());
        sb.append("DefaultElementsTransientUiModel{counterfactual=");
        sb.append(z);
        sb.append(", duration=");
        sb.append(i);
        sb.append(", element=");
        sb.append(valueOf);
        sb.append(", interactionLogger=");
        sb.append(valueOf2);
        sb.append(", transientUiCallback=");
        sb.append("null");
        sb.append(", rateLimited=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = ((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003;
        awos awosVar = this.c;
        int hashCode = (i ^ (awosVar == null ? 0 : awosVar.hashCode())) * 1000003;
        acra acraVar = this.d;
        return ((hashCode ^ (acraVar != null ? acraVar.hashCode() : 0)) * (-721379959)) ^ (true == this.e ? 1231 : 1237);
    }
}

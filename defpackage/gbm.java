package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gbm extends akbq implements gbi {
    public final awos a;
    public final acra b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final int f;

    public gbm() {
    }

    public gbm(boolean z, boolean z2, boolean z3, int i, awos awosVar, acra acraVar) {
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = i;
        this.a = awosVar;
        this.b = acraVar;
    }

    public static gbl d() {
        gbl gblVar = new gbl();
        gblVar.d(-1);
        gblVar.a = false;
        gblVar.b = false;
        gblVar.c = false;
        return gblVar;
    }

    @Override // defpackage.gbi
    public final int a() {
        return 1;
    }

    @Override // defpackage.gbi
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.gbi
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.akbn
    public final int e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        awos awosVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gbm) {
            gbm gbmVar = (gbm) obj;
            if (this.c == gbmVar.c && this.d == gbmVar.d && this.e == gbmVar.e && this.f == gbmVar.f && ((awosVar = this.a) != null ? awosVar.equals(gbmVar.a) : gbmVar.a == null)) {
                acra acraVar = this.b;
                acra acraVar2 = gbmVar.b;
                if (acraVar != null ? acraVar.equals(acraVar2) : acraVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.akbq
    public final acra f() {
        return this.b;
    }

    @Override // defpackage.akbn
    public final akbl g() {
        return null;
    }

    @Override // defpackage.akbq
    public final awos h() {
        return this.a;
    }

    @Override // defpackage.akbn
    public final boolean i() {
        return this.e;
    }

    public final String toString() {
        boolean z = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        int i = this.f;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 161 + String.valueOf(valueOf2).length() + "null".length());
        sb.append("ElementsBottomUiModel{rateLimited=");
        sb.append(z);
        sb.append(", shownOnFullscreen=");
        sb.append(z2);
        sb.append(", counterfactual=");
        sb.append(z3);
        sb.append(", duration=");
        sb.append(i);
        sb.append(", element=");
        sb.append(valueOf);
        sb.append(", interactionLogger=");
        sb.append(valueOf2);
        sb.append(", transientUiCallback=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = ((((((((true != this.c ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ this.f) * 1000003;
        awos awosVar = this.a;
        int hashCode = (i ^ (awosVar == null ? 0 : awosVar.hashCode())) * 1000003;
        acra acraVar = this.b;
        return (hashCode ^ (acraVar != null ? acraVar.hashCode() : 0)) * 1000003;
    }
}

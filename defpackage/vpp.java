package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vpp extends vpr {
    private final amru a;

    public vpp(amru amruVar) {
        this.a = amruVar;
    }

    @Override // defpackage.vqb
    public final int b() {
        return 2;
    }

    @Override // defpackage.vpr, defpackage.vqb
    public final amru c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vqb) {
            vqb vqbVar = (vqb) obj;
            if (vqbVar.b() == 2 && amkq.aV(this.a, vqbVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("Content{clusters=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

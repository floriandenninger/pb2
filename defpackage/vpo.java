package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vpo extends vpr {
    private final amru a;

    public vpo(amru amruVar) {
        this.a = amruVar;
    }

    @Override // defpackage.vpr, defpackage.vqb
    public final amru a() {
        return this.a;
    }

    @Override // defpackage.vqb
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vqb) {
            vqb vqbVar = (vqb) obj;
            if (vqbVar.b() == 3 && amkq.aV(this.a, vqbVar.a())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Content{allPhotos=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

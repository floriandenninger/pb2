package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awnv {
    private final awoa a;

    public awnv(awoa awoaVar) {
        this.a = awoaVar;
    }

    public static awxk b(awoa awoaVar) {
        return new awxk(awoaVar.toBuilder());
    }

    public final amsx a() {
        amsv amsvVar = new amsv();
        awnz awnzVar = this.a.b;
        if (awnzVar == null) {
            awnzVar = awnz.a;
        }
        new awnu((awnz) awnzVar.toBuilder().build());
        amsvVar.j(new amsv().g());
        return amsvVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awnv) && this.a.equals(((awnv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("GestureOptionsModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

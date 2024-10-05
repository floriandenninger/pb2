package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqsr {
    private final aakv a;
    private final aqss b;

    public aqsr(aqss aqssVar, aakv aakvVar) {
        this.b = aqssVar;
        this.a = aakvVar;
    }

    public static awxk b(aqss aqssVar) {
        return new awxk(aqssVar.toBuilder());
    }

    public final amsx a() {
        amsv amsvVar = new amsv();
        avgg avggVar = this.b.f;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        amsvVar.j(avgj.b(avggVar).b(this.a).a());
        return amsvVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqsr) && this.b.equals(((aqsr) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("EmojiModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

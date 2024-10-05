package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asvi {
    public final aakv a;
    public final asvh b;

    public asvi(asvh asvhVar, aakv aakvVar) {
        this.b = asvhVar;
        this.a = aakvVar;
    }

    public final aqyg a() {
        aqyg aqygVar = this.b.c;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    public final awnw b() {
        awnw awnwVar = this.b.g;
        return awnwVar == null ? awnw.a : awnwVar;
    }

    public final Long c() {
        return Long.valueOf(this.b.e);
    }

    public final Long d() {
        return Long.valueOf(this.b.d);
    }

    public final boolean e() {
        return (this.b.b & 64) != 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof asvi) && this.b.equals(((asvi) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("MacroMarkerMessageModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asup {
    private final asut a;

    public asup(asut asutVar) {
        this.a = asutVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof asup) && this.a.equals(((asup) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("MacroModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

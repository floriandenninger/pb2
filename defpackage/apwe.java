package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apwe {
    private final apvl a;

    public apwe(apvl apvlVar) {
        this.a = apvlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apwe) && this.a.equals(((apwe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("PlaylistItemModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

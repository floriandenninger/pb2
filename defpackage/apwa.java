package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apwa {
    public final aakv a;
    public final apve b;

    public apwa(apve apveVar, aakv aakvVar) {
        this.b = apveVar;
        this.a = aakvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apwa) && this.b.equals(((apwa) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("ClientYouTubeDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apwg {
    private final apvm a;

    public apwg(apvm apvmVar) {
        this.a = apvmVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apwg) && this.a.equals(((apwg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("ScoringEventInfoModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

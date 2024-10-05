package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avhd {
    public final aakv a;
    public final avhe b;

    public avhd(avhe avheVar, aakv aakvVar) {
        this.b = avheVar;
        this.a = aakvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof avhd) && this.b.equals(((avhd) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("TimedSectionListDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

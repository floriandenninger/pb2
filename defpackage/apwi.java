package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apwi {
    private final apvo a;

    public apwi(apvo apvoVar) {
        this.a = apvoVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apwi) && this.a.equals(((apwi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("SharingDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apvx {
    private final apvh a;

    public apvx(apvh apvhVar) {
        this.a = apvhVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apvx) && this.a.equals(((apvx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("BackstageItemModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apwj {
    private final apvu a;

    public apwj(apvu apvuVar) {
        this.a = apvuVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apwj) && this.a.equals(((apwj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("ToolboxPageDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

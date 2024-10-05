package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awmz {
    private final awni a;

    public awmz(awni awniVar) {
        this.a = awniVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awmz) && this.a.equals(((awmz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("StyleRunExtensionsModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

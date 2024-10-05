package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awmu {
    private final awnc a;

    public awmu(awnc awncVar) {
        this.a = awncVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awmu) && this.a.equals(((awmu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("AttachmentRunModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

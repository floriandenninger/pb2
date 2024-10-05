package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpm {
    private final atpo a;

    public atpm(atpo atpoVar) {
        this.a = atpoVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof atpm) && this.a.equals(((atpm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("OfflineOrchestrationActionMetadataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

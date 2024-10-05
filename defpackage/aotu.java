package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aotu {
    private final aotv a;

    public aotu(aotv aotvVar) {
        this.a = aotvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aotu) && this.a.equals(((aotu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("AccessibilityIdModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

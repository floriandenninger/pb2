package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awnb {
    private final awnj a;

    public awnb(awnj awnjVar) {
        this.a = awnjVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awnb) && this.a.equals(((awnb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("TextDecoratorModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

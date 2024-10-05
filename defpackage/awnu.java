package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awnu {
    private final awnz a;

    public awnu(awnz awnzVar) {
        this.a = awnzVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awnu) && this.a.equals(((awnu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("GestureAccessibilityInfoModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

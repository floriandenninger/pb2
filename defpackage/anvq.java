package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anvq implements anvv {
    private final int a;
    private final anvu b;

    public anvq(int i, anvu anvuVar) {
        this.a = i;
        this.b = anvuVar;
    }

    @Override // defpackage.anvv
    public final int a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return anvv.class;
    }

    @Override // defpackage.anvv
    public final anvu b() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anvv)) {
            return false;
        }
        anvv anvvVar = (anvv) obj;
        return this.a == anvvVar.a() && this.b.equals(anvvVar.b());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (this.b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
    }
}

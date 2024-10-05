package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aolc implements Comparable {
    public final aolf a;
    public final aole b;

    public aolc(aolf aolfVar, aole aoleVar) {
        this.a = aolfVar;
        this.b = aoleVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aolc a(aolf aolfVar, aole aoleVar) {
        return new aolc(aolfVar, aoleVar);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b.compareTo(((aolc) obj).b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length());
        sb.append("[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}

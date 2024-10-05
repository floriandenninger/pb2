package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amjh implements anfy {
    final /* synthetic */ amir a;
    final /* synthetic */ anfy b;

    public amjh(amir amirVar, anfy anfyVar) {
        this.a = amirVar;
        this.b = anfyVar;
    }

    @Override // defpackage.anfy
    public final anhy a() {
        amir e = amjw.e(this.a);
        try {
            return this.b.a();
        } finally {
            amjw.e(e);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("propagating=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}

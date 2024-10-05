package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amji implements amml {
    final /* synthetic */ amir a;
    final /* synthetic */ amml b;

    public amji(amir amirVar, amml ammlVar) {
        this.a = amirVar;
        this.b = ammlVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        amir e = amjw.e(this.a);
        try {
            return this.b.apply(obj);
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

package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amjj implements anfz {
    final /* synthetic */ amir a;
    final /* synthetic */ anfz b;

    public amjj(amir amirVar, anfz anfzVar) {
        this.a = amirVar;
        this.b = anfzVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        amir e = amjw.e(this.a);
        try {
            return this.b.a(obj);
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

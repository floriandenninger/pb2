package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anhp extends anfi implements Runnable {
    private anhy a;

    public anhp(anhy anhyVar) {
        this.a = anhyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anfm
    public final String b() {
        anhy anhyVar = this.a;
        if (anhyVar == null) {
            return null;
        }
        String valueOf = String.valueOf(anhyVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
        sb.append("delegate=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.anfm
    protected final void qf() {
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        anhy anhyVar = this.a;
        if (anhyVar != null) {
            qK(anhyVar);
        }
    }
}

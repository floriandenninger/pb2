package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anhn extends anfm {
    private anho a;

    public anhn(anho anhoVar) {
        this.a = anhoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anfm
    public final String b() {
        anho anhoVar = this.a;
        if (anhoVar == null) {
            return null;
        }
        int length = anhoVar.d.length;
        int i = anhoVar.c.get();
        StringBuilder sb = new StringBuilder(49);
        sb.append("inputCount=[");
        sb.append(length);
        sb.append("], remaining=[");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.anfm, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        anho anhoVar = this.a;
        if (!super.cancel(z)) {
            return false;
        }
        anhoVar.getClass();
        anhoVar.a = true;
        if (!z) {
            anhoVar.b = false;
        }
        anhoVar.a();
        return true;
    }

    @Override // defpackage.anfm
    protected final void qf() {
        this.a = null;
    }
}

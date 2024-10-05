package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vwp implements Runnable {
    final /* synthetic */ vwu a;

    public vwp(vwu vwuVar) {
        this.a = vwuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean h;
        synchronized (this.a.c) {
            if (this.a.d) {
                return;
            }
            while (this.a.c.size() > 0) {
                vwu vwuVar = this.a;
                vwuVar.d = true;
                int intValue = ((Integer) vwuVar.c.peek()).intValue();
                if (intValue == 0) {
                    h = this.a.h(true);
                } else if (intValue == 1) {
                    h = this.a.h(false);
                } else {
                    StringBuilder sb = new StringBuilder(60);
                    sb.append("VideoPlayerCodecManager: unknown pending action: ");
                    sb.append(intValue);
                    vtv.b(sb.toString());
                    this.a.c.remove();
                }
                if (!h) {
                    break;
                } else {
                    this.a.c.remove();
                }
            }
            this.a.d = false;
        }
    }
}

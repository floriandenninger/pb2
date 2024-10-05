package defpackage;

import java.util.TimerTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nts extends TimerTask {
    final /* synthetic */ ntt a;

    public nts(ntt nttVar) {
        this.a = nttVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.a.o.post(new Runnable() { // from class: ntr
            @Override // java.lang.Runnable
            public final void run() {
                nts ntsVar = nts.this;
                ntt nttVar = ntsVar.a;
                if (nttVar.m) {
                    nttVar.m(false);
                    ntsVar.a.r = true;
                }
            }
        });
    }
}

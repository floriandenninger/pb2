package defpackage;

import java.util.TimerTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajtn extends TimerTask {
    final /* synthetic */ Object a;
    final /* synthetic */ ajce b;
    final /* synthetic */ ajtz c;

    public ajtn(ajtz ajtzVar, Object obj, ajce ajceVar) {
        this.c = ajtzVar;
        this.a = obj;
        this.b = ajceVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.c.D.remove(this.a);
        this.c.u.execute(new ajtm(this));
    }
}

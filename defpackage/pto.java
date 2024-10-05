package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pto implements pso {
    public static final List a = new ArrayList(50);
    public final Handler b;

    public pto(Handler handler) {
        this.b = handler;
    }

    private static ptn i() {
        ptn ptnVar;
        List list = a;
        synchronized (list) {
            ptnVar = list.isEmpty() ? new ptn() : (ptn) list.remove(list.size() - 1);
        }
        return ptnVar;
    }

    @Override // defpackage.pso
    public final ptn a(int i) {
        ptn i2 = i();
        i2.a = this.b.obtainMessage(i);
        return i2;
    }

    @Override // defpackage.pso
    public final ptn b(int i, Object obj) {
        ptn i2 = i();
        i2.a = this.b.obtainMessage(i, obj);
        return i2;
    }

    @Override // defpackage.pso
    public final ptn c(int i, int i2, int i3) {
        ptn i4 = i();
        i4.a = this.b.obtainMessage(i, i2, i3);
        return i4;
    }

    @Override // defpackage.pso
    public final boolean d() {
        return this.b.hasMessages(0);
    }

    @Override // defpackage.pso
    public final void e(Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // defpackage.pso
    public final void f() {
        this.b.removeMessages(2);
    }

    @Override // defpackage.pso
    public final void g(int i) {
        this.b.sendEmptyMessage(i);
    }

    @Override // defpackage.pso
    public final void h(ptn ptnVar) {
        Handler handler = this.b;
        Message message = ptnVar.a;
        pse.c(message);
        handler.sendMessageAtFrontOfQueue(message);
        ptnVar.a();
    }
}

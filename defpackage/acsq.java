package defpackage;

import android.os.Looper;
import android.os.MessageQueue;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsq implements acso {
    public final Set a;
    public boolean b;
    private final MessageQueue.IdleHandler c = new MessageQueue.IdleHandler() { // from class: acsp
        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            acsq acsqVar = acsq.this;
            if (acsqVar.b) {
                return false;
            }
            zga.g("ColdGuard ran");
            acsqVar.b = true;
            Set set = acsqVar.a;
            if (set == null || set.isEmpty()) {
                return false;
            }
            Iterator it = acsqVar.a.iterator();
            while (it.hasNext()) {
                ((acsn) it.next()).c();
            }
            return false;
        }
    };

    public acsq(Set set) {
        this.a = set;
    }

    @Override // defpackage.acso
    public final /* synthetic */ ayqj d() {
        return ayqj.z(new UnsupportedOperationException());
    }

    @Override // defpackage.acso
    public final void e() {
        yjk.f();
        if (this.b) {
            return;
        }
        Looper.myQueue().removeIdleHandler(this.c);
        this.b = true;
    }

    @Override // defpackage.acso
    public final void f() {
        yjk.f();
        MessageQueue myQueue = Looper.myQueue();
        myQueue.removeIdleHandler(this.c);
        myQueue.addIdleHandler(this.c);
        this.b = false;
    }

    @Override // defpackage.acso
    public final /* synthetic */ boolean g() {
        return false;
    }
}

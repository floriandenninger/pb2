package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dxh {
    public final dxj a;
    public dxk b;
    public final dya c;
    public final dxy d;

    public dxh() {
        dxj dxjVar = new dxj();
        this.a = dxjVar;
        this.b = dxjVar.a();
        this.c = new dya();
        this.d = new dxy();
        final int i = 1;
        dxjVar.c("internal.registerCallback", new Callable(this) { // from class: dxg
            public final /* synthetic */ dxh a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return i != 0 ? new dxu(this.a.d) : new dxl(this.a.c);
            }
        });
        final int i2 = 0;
        dxjVar.c("internal.eventLogger", new Callable(this) { // from class: dxg
            public final /* synthetic */ dxh a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return i2 != 0 ? new dxu(this.a.d) : new dxl(this.a.c);
            }
        });
    }

    public final void a(String str, Callable callable) {
        this.a.c(str, callable);
    }

    public final boolean b() {
        return !this.c.c.isEmpty();
    }

    public final boolean c() {
        dya dyaVar = this.c;
        return !dyaVar.b.equals(dyaVar.a);
    }
}

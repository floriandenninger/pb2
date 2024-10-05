package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anho {
    public final AtomicInteger c;
    public final anhy[] d;
    public boolean a = false;
    public boolean b = true;
    public volatile int e = 0;

    public anho(anhy[] anhyVarArr) {
        this.d = anhyVarArr;
        this.c = new AtomicInteger(anhyVarArr.length);
    }

    public final void a() {
        if (this.c.decrementAndGet() == 0 && this.a) {
            for (anhy anhyVar : this.d) {
                if (anhyVar != null) {
                    anhyVar.cancel(this.b);
                }
            }
        }
    }
}

package defpackage;

import j$.util.function.Consumer;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aksb {
    public final Runnable a;
    public final Runnable b;
    public final Consumer c;
    private final anic d;
    private final int f;
    private final int g;
    private final int h;
    private int i = 0;
    private anhy j = anhv.a;
    private final anhh e = new akrz(this);

    public aksb(aksa aksaVar) {
        this.d = aksaVar.g;
        this.a = aksaVar.a;
        this.b = aksaVar.b;
        this.c = aksaVar.c;
        this.h = aksaVar.d;
        this.f = aksaVar.e;
        this.g = aksaVar.f;
    }

    public static final aksa a(anic anicVar, int i) {
        return new aksa(anicVar, i);
    }

    public final synchronized boolean b(boolean z) {
        boolean z2;
        z2 = true;
        int i = this.i + 1;
        if (i > this.h) {
            z2 = false;
        }
        if (z) {
            this.i = i;
        }
        return z2;
    }

    public final synchronized boolean c() {
        return !this.j.isDone();
    }

    public final synchronized void d() {
        if (c()) {
            return;
        }
        if (b(false)) {
            ania scheduleWithFixedDelay = this.d.scheduleWithFixedDelay(new Runnable() { // from class: akry
                @Override // java.lang.Runnable
                public final void run() {
                    aksb aksbVar = aksb.this;
                    if (!aksbVar.b(true)) {
                        aksbVar.e();
                    } else {
                        aksbVar.a.run();
                    }
                }
            }, this.f, this.g, TimeUnit.MILLISECONDS);
            this.j = scheduleWithFixedDelay;
            anaf.Y(scheduleWithFixedDelay, this.e, this.d);
        }
    }

    public final synchronized void e() {
        if (c()) {
            this.j.cancel(false);
        }
    }
}

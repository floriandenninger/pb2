package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbx implements adch {
    public final azrw a;
    public final adlj b;
    public final bph c;
    public final boolean d;
    public final adbu e;
    public final anib f;
    public final Executor g;
    public final adee h;
    private final azrw i;

    public adbx(acun acunVar, adlj adljVar, bph bphVar, azrw azrwVar, boolean z, adbu adbuVar, azrw azrwVar2, anib anibVar, Executor executor, adee adeeVar) {
        acunVar.getClass();
        adljVar.getClass();
        this.b = adljVar;
        bphVar.getClass();
        this.c = bphVar;
        this.a = azrwVar;
        this.d = z;
        this.e = adbuVar;
        this.i = azrwVar2;
        this.f = anibVar;
        this.g = executor;
        this.h = adeeVar;
    }

    @Override // defpackage.adch
    public final List a() {
        adcj adcjVar = new adcj(this.b, this.e, this.d, this.c, (String) this.i.get(), this.g, this.h);
        ArrayList arrayList = new ArrayList(bpw.i());
        adcjVar.b(arrayList);
        return arrayList;
    }

    @Override // defpackage.adch
    public final anhy b() {
        final adcj adcjVar = new adcj(this.b, this.e, this.d, this.c, (String) this.i.get(), this.g, this.h);
        return anfq.i(anaf.S(new Callable() { // from class: adbw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return amru.o(bpw.i());
            }
        }, this.g), new anfz() { // from class: adbv
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                adcj adcjVar2 = adcj.this;
                amru amruVar = (amru) obj;
                return anfq.i(adcjVar2.d.a(amruVar), new adci(adcjVar2, amruVar, 1), adcjVar2.c);
            }
        }, this.f);
    }
}

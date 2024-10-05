package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adpi {
    private final azrw a;
    private final bph b;
    private final addy c;
    private final ysy d;
    private final acyg e;
    private final ypa f;
    private final Executor g;
    private final anib h;
    private final adlj i;
    private final acun j;

    public adpi(azrw azrwVar, bph bphVar, addy addyVar, ysy ysyVar, acyg acygVar, ypa ypaVar, Executor executor, anib anibVar, adlj adljVar, acun acunVar) {
        this.a = azrwVar;
        this.b = bphVar;
        this.c = addyVar;
        this.d = ysyVar;
        this.e = acygVar;
        this.f = ypaVar;
        this.g = executor;
        this.h = anibVar;
        this.i = adljVar;
        this.j = acunVar;
    }

    public final adph a(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 2) {
            return new adof((bpw) this.a.get(), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
        if (i2 != 3) {
            return null;
        }
        return new adom((bpw) this.a.get(), this.b, this.c, this.d, this.f);
    }
}

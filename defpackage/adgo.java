package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgo {
    private final ypa a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final azrw h;
    private final azrw i;
    private boolean j;
    private boolean k;

    public adgo(ypa ypaVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8) {
        this.a = ypaVar;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
        this.e = azrwVar4;
        this.f = azrwVar5;
        this.g = azrwVar6;
        this.h = azrwVar7;
        this.i = azrwVar8;
    }

    public final synchronized void a() {
        if (this.j) {
            return;
        }
        this.j = true;
        adiz adizVar = (adiz) this.b.get();
        ypa ypaVar = this.a;
        adizVar.e = false;
        ypaVar.g(adizVar.f);
        this.a.g(this.d.get());
        this.a.g(this.e.get());
        this.a.g(((adcp) this.c.get()).m);
        ((ncf) this.g.get()).a((actg) this.f.get());
        ((adfp) this.h.get()).a();
        ((aczq) this.i.get()).d();
    }

    public final synchronized void b() {
        if (this.k) {
            return;
        }
        this.k = true;
        ((adfp) this.h.get()).a();
    }
}

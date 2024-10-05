package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alce implements aldg {
    public final alaj a;
    private final aldz b;
    private final albq c;
    private final albe d;
    private final alcn e;
    private final alcg f;
    private final alba g;
    private final alee h;
    private final alcc i;
    private final aldd j;
    private final alav k;
    private final albs l;
    private final albw m;
    private final aldo n;

    public alce(aldz aldzVar, aldo aldoVar, albq albqVar, albe albeVar, alcn alcnVar, alcg alcgVar, alba albaVar, alee aleeVar, alcc alccVar, aldd alddVar, alav alavVar, albs albsVar, albw albwVar, alaj alajVar) {
        this.b = aldzVar;
        this.n = aldoVar;
        this.c = albqVar;
        this.d = albeVar;
        this.e = alcnVar;
        this.f = alcgVar;
        this.g = albaVar;
        this.h = aleeVar;
        this.i = alccVar;
        this.j = alddVar;
        this.k = alavVar;
        this.l = albsVar;
        this.m = albwVar;
        this.a = alajVar;
    }

    @Override // defpackage.aldg
    public final alec a(akzs akzsVar) {
        alec a;
        alec a2 = this.b.a(Arrays.asList(this.b.c(akzsVar.k, this.n, this.c), this.b.c(akzsVar.k, this.n, this.f).a(this.g)), this.d);
        alec a3 = a2.a(this.e);
        alec a4 = this.b.a(Arrays.asList(a2.a(this.h).a(this.i), a3), this.k).a(this.j);
        if (akzsVar.w) {
            a = a4.a(this.l).a(this.m);
        } else {
            a = a4.a(this.m);
        }
        a.b(new Runnable() { // from class: alcd
            @Override // java.lang.Runnable
            public final void run() {
                alce.this.a.c();
            }
        });
        return a;
    }
}

package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alcr implements aldg {
    public final alaj a;
    private final aldz b;
    private final aldo c;
    private final alcs d;
    private final albq e;
    private final albe f;
    private final alee g;
    private final alay h;
    private final alcn i;
    private final albh j;
    private final aldd k;
    private final alch l;
    private final alav m;
    private final albs n;
    private final albw o;
    private final /* synthetic */ int p;

    public alcr(aldz aldzVar, aldo aldoVar, alcs alcsVar, albq albqVar, albe albeVar, alee aleeVar, alay alayVar, alcn alcnVar, albh albhVar, aldd alddVar, alch alchVar, alav alavVar, albs albsVar, albw albwVar, alaj alajVar, int i) {
        this.p = i;
        this.b = aldzVar;
        this.c = aldoVar;
        this.d = alcsVar;
        this.e = albqVar;
        this.f = albeVar;
        this.g = aleeVar;
        this.h = alayVar;
        this.i = alcnVar;
        this.j = albhVar;
        this.k = alddVar;
        this.l = alchVar;
        this.m = alavVar;
        this.n = albsVar;
        this.o = albwVar;
        this.a = alajVar;
    }

    @Override // defpackage.aldg
    public final alec a(akzs akzsVar) {
        alec c;
        alec a;
        alec c2;
        alec a2;
        if (this.p != 0) {
            if (akzsVar.t) {
                c2 = this.b.c(akzsVar.k, this.c, this.d).a(this.e);
            } else {
                c2 = this.b.c(akzsVar.k, this.c, this.e);
            }
            if (akzsVar.z) {
                c2 = c2.a(this.h);
            }
            alec a3 = c2.a(this.f);
            alec a4 = this.b.a(Arrays.asList(a3.a(this.i).a(this.m), a3.a(this.g).a(this.j).a(this.l)), this.k);
            if (akzsVar.w) {
                a2 = a4.a(this.n).a(this.o);
            } else {
                a2 = a4.a(this.o);
            }
            final byte[] bArr = null;
            a2.b(new Runnable(bArr) { // from class: albi
                @Override // java.lang.Runnable
                public final void run() {
                    alcr.this.a.c();
                }
            });
            return a2;
        }
        if (akzsVar.t) {
            c = this.b.c(akzsVar.k, this.c, this.d).a(this.e);
        } else {
            c = this.b.c(akzsVar.k, this.c, this.e);
        }
        if (akzsVar.z) {
            c = c.a(this.h);
        }
        alec a5 = c.a(this.f);
        alec a6 = this.b.a(Arrays.asList(a5.a(this.i).a(this.m), a5.a(this.g).a(this.j).a(this.l)), this.k);
        if (akzsVar.w) {
            a = a6.a(this.n).a(this.o);
        } else {
            a = a6.a(this.o);
        }
        a.b(new Runnable() { // from class: alco
            @Override // java.lang.Runnable
            public final void run() {
                alcr.this.a.c();
            }
        });
        return a;
    }
}

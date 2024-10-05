package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahlj {
    public ahld a;
    public ahld b;
    public ahlb c;
    public ahlb d;
    public Range e;
    public axfg f;
    public axfg g;
    public axfg h;
    public anrc i;
    public anrc j;
    private anrc k;

    public final void a(final ahlh ahlhVar) {
        float f = ahlhVar.d;
        if (f <= 0.0f) {
            f = ahlhVar.c;
        }
        final ahlk ahlkVar = new ahlk(ahlhVar.f, ahlhVar.g, f, ahlhVar.e, ahlhVar.h, ahlhVar.i);
        int i = ahlhVar.a;
        this.k = new anrc(1024, new ahli() { // from class: ahlg
            @Override // defpackage.ahli
            public final double a(int i2, double d) {
                ahlk ahlkVar2 = ahlk.this;
                ahlh ahlhVar2 = ahlhVar;
                double d2 = i2 * 10000.0f;
                Double.isNaN(d2);
                return (((float) (d2 / d)) < ahlkVar2.c ? ahlkVar2.a.a(r5) : ahlkVar2.b.a(r5)) / ahlhVar2.e;
            }
        });
    }

    public final byte[] b() {
        return this.k.a;
    }
}

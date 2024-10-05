package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ltd {
    public final ajom a;
    public final ajpd b;
    public final int c;
    public final int d;

    public ltd(ajom ajomVar, ajpd ajpdVar, int i, int i2) {
        this.a = ajomVar;
        this.b = ajpdVar;
        this.c = i;
        this.d = i2;
    }

    public static lsx a(final ypa ypaVar) {
        return new lsx() { // from class: ltc
            @Override // defpackage.lsx
            public final void b(ajom ajomVar, ajpd ajpdVar, int i, int i2) {
                ypa.this.d(new ltd(ajomVar, ajpdVar, i, i2));
            }
        };
    }
}

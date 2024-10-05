package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ltb {
    public final ajom a;
    public final ajpd b;
    public final int c;
    public final int d;

    public ltb(ajom ajomVar, ajpd ajpdVar, int i, int i2) {
        this.a = ajomVar;
        this.b = ajpdVar;
        this.c = i;
        this.d = i2;
    }

    public static lsw a(final ypa ypaVar) {
        return new lsw() { // from class: lta
            @Override // defpackage.lsw
            public final void oD(ajom ajomVar, ajpd ajpdVar, int i, int i2) {
                ypa.this.d(new ltb(ajomVar, ajpdVar, i, i2));
            }
        };
    }
}

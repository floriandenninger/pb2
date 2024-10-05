package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ltf {
    public final ajom a;
    public final ajpd b;
    public final int c;

    public ltf(ajom ajomVar, ajpd ajpdVar, int i) {
        this.a = ajomVar;
        this.b = ajpdVar;
        this.c = i;
    }

    public static lsy a(final ypa ypaVar) {
        return new lsy() { // from class: lte
            @Override // defpackage.lsy
            public final void c(ajom ajomVar, ajpd ajpdVar, int i) {
                ypa.this.d(new ltf(ajomVar, ajpdVar, i));
            }
        };
    }
}

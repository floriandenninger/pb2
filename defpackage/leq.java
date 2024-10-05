package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class leq implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ leu d;

    public leq(leu leuVar, List list, int i, int i2) {
        this.d = leuVar;
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqrf aqrfVar;
        awcl awclVar;
        leu leuVar = this.d;
        List list = this.a;
        int i = this.b;
        int i2 = this.c;
        awcc awccVar = (awcc) list.get(i);
        int i3 = awccVar.b;
        if (i3 != 122814739) {
            if (i3 == 153515154) {
                ajpd ajpdVar = leuVar.a;
                Object obj = ajpdVar.get(i2 + leuVar.i);
                if (awccVar.b == 153515154) {
                    aqrfVar = (aqrf) awccVar.c;
                } else {
                    aqrfVar = aqrf.a;
                }
                ajpdVar.o(obj, ajds.a(aqrfVar));
                return;
            }
            return;
        }
        ajpd ajpdVar2 = leuVar.a;
        Object obj2 = ajpdVar2.get(leuVar.i + i2);
        if (awccVar.b == 122814739) {
            awclVar = (awcl) awccVar.c;
        } else {
            awclVar = awcl.a;
        }
        ajpdVar2.o(obj2, awclVar);
        if (i >= list.size() - 1 || !leu.d(awccVar)) {
            return;
        }
        ajpd ajpdVar3 = leuVar.a;
        ajpdVar3.o(ajpdVar3.get(i2 + 1 + leuVar.i), new lfu());
    }
}

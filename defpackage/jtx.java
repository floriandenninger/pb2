package defpackage;

import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jtx implements Callable {
    public final /* synthetic */ jtz a;
    public final /* synthetic */ jua b;
    private final /* synthetic */ int c;

    public /* synthetic */ jtx(jtz jtzVar, jua juaVar, int i) {
        this.c = i;
        this.a = jtzVar;
        this.b = juaVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        askd askdVar;
        if (this.c == 0) {
            jtz jtzVar = this.a;
            jua juaVar = this.b;
            String str = juaVar.a;
            auov auovVar = (auov) ((kbh) jtzVar.a.a(juaVar).get(0)).a;
            if (auovVar == null) {
                return new jty(null, null);
            }
            Iterator it = auovVar.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    askdVar = null;
                    break;
                }
                auoy auoyVar = (auoy) it.next();
                if ((auoyVar.b & 16) != 0) {
                    askdVar = auoyVar.j;
                    if (askdVar == null) {
                        askdVar = askd.a;
                    }
                    if (str.equals(askdVar.i)) {
                        break;
                    }
                }
            }
            return new jty(null, askdVar);
        }
        return new jty((auov) ((kbh) this.a.a.a(this.b).get(0)).a, null);
    }
}

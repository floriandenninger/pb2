package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kac implements anfz {
    public final /* synthetic */ kaf a;
    public final /* synthetic */ jua b;
    private final /* synthetic */ int c;

    public /* synthetic */ kac(kaf kafVar, jua juaVar, int i) {
        this.c = i;
        this.a = kafVar;
        this.b = juaVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.c == 0) {
            final kaf kafVar = this.a;
            final jua juaVar = this.b;
            final Boolean bool = (Boolean) obj;
            return anaf.S(new Callable() { // from class: kae
                /* JADX WARN: Code restructure failed: missing block: B:50:0x011f, code lost:
                
                    if (r2 == false) goto L63;
                 */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 444
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.kae.call():java.lang.Object");
                }
            }, kafVar.f);
        }
        kaf kafVar2 = this.a;
        jua juaVar2 = this.b;
        if (((Boolean) obj).booleanValue()) {
            return anfq.i(anht.q(kafVar2.e.e()), new kac(kafVar2, juaVar2, 0), kafVar2.f);
        }
        return anaf.O(kafVar2.d());
    }
}

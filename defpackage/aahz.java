package defpackage;

import com.google.android.libraries.elements.interfaces.Snapshot;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aahz implements Callable {
    public final /* synthetic */ aaih a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ aahz(aaih aaihVar, String str, int i) {
        this.c = i;
        this.a = aaihVar;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.c;
        if (i == 0) {
            aaih aaihVar = this.a;
            String str = this.b;
            aypy Y = aaih.k(aaihVar.e, str).Y(zcz.m);
            final azrs aT = azro.e().aT();
            final int i2 = 0;
            final ayqx ax = Y.ax(new ayrs() { // from class: aaib
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i2 != 0) {
                        aT.c((aakz) obj);
                    } else {
                        aT.c((ammv) obj);
                    }
                }
            });
            return aT.ah(ammv.i(aaihVar.c.d(str))).E(new ayrm() { // from class: aahy
                @Override // defpackage.ayrm
                public final void a() {
                    ayrz.c((AtomicReference) ayqx.this);
                }
            });
        }
        final int i3 = 1;
        if (i == 1) {
            aaih aaihVar2 = this.a;
            String str2 = this.b;
            aali k = aaih.k(aaihVar2.e, str2);
            final azrs aT2 = azro.e().aT();
            final ayqx ax2 = k.ax(new ayrs() { // from class: aaib
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i3 != 0) {
                        aT2.c((aakz) obj);
                    } else {
                        aT2.c((ammv) obj);
                    }
                }
            });
            aaht aahtVar = aaihVar2.c;
            Snapshot a = aahtVar.a();
            aakt e = aahtVar.e(a, str2);
            aakx a2 = aakz.a();
            a2.c(str2);
            a2.b = e;
            awuh g = aahtVar.g(a, str2);
            if (g != null) {
                aqud aqudVar = g.c;
                if (aqudVar == null) {
                    aqudVar = aqud.a;
                }
                a2.b(aaku.b(aqudVar));
            }
            return aT2.ah(a2.a()).E(new ayrm() { // from class: aahy
                @Override // defpackage.ayrm
                public final void a() {
                    ayrz.c((AtomicReference) ayqx.this);
                }
            }).U();
        }
        aaih aaihVar3 = this.a;
        return aaihVar3.c.d(this.b);
    }
}

package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tsc implements axqr {
    private final tsb a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final /* synthetic */ int g;

    public tsc(tsb tsbVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i) {
        this.g = i;
        this.a = tsbVar;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
        this.e = azrwVar4;
        this.f = azrwVar5;
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        int i = this.g;
        if (i == 0) {
            tsb tsbVar = this.a;
            Context context = ((trq) this.b).get();
            Uri uri = (Uri) this.c.get();
            tss tssVar = (tss) this.e.get();
            akbd akbdVar = ((tqk) this.f).get();
            vfe a = vff.a();
            a.f(uri);
            a.e(tlj.a);
            a.g(false);
            a.b(rwh.aK(context, tsbVar.a, tssVar, akbdVar));
            return tsbVar.b.a(a.a());
        }
        if (i == 1) {
            tsb tsbVar2 = this.a;
            Context context2 = ((trq) this.b).get();
            Uri uri2 = (Uri) this.c.get();
            tss tssVar2 = (tss) this.e.get();
            akbd akbdVar2 = ((tqk) this.f).get();
            vfe a2 = vff.a();
            a2.f(uri2);
            a2.e(tlb.a);
            a2.g(false);
            a2.b(rwh.aJ(context2, tsbVar2.a, tssVar2, akbdVar2));
            return tsbVar2.b.a(a2.a());
        }
        if (i == 2) {
            tsb tsbVar3 = this.a;
            Context context3 = ((trq) this.b).get();
            Uri uri3 = (Uri) this.c.get();
            tss tssVar3 = (tss) this.e.get();
            akbd akbdVar3 = ((tqk) this.f).get();
            vfe a3 = vff.a();
            a3.f(uri3);
            a3.e(tlb.a);
            a3.g(false);
            a3.b(rwh.aJ(context3, tsbVar3.a, tssVar3, akbdVar3));
            return tsbVar3.b.a(a3.a());
        }
        tsb tsbVar4 = this.a;
        Context context4 = ((trq) this.b).get();
        Uri uri4 = (Uri) this.c.get();
        tss tssVar4 = (tss) this.e.get();
        akbd akbdVar4 = ((tqk) this.f).get();
        vfe a4 = vff.a();
        a4.f(uri4);
        a4.e(tlj.a);
        a4.g(false);
        a4.b(rwh.aK(context4, tsbVar4.a, tssVar4, akbdVar4));
        return tsbVar4.b.a(a4.a());
    }
}

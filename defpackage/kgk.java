package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kgk extends aide implements View.OnLayoutChangeListener, ahew, fgk, fgp, ahyl {
    private final gop a;
    private final aaea b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgk(gop gopVar, aaea aaeaVar, kgj kgjVar, axpg axpgVar, aadw aadwVar) {
        super(kgjVar, new kgh(axpgVar, 2));
        axpgVar.getClass();
        this.a = gopVar;
        this.b = aaeaVar;
        asvu asvuVar = aadwVar.b().e;
        if ((asvuVar == null ? asvu.a : asvuVar).cd) {
            return;
        }
        axpgVar.get();
    }

    private final boolean m() {
        arfd a;
        if (this.c) {
            return true;
        }
        if ((!this.e && !this.d) || (a = this.b.a()) == null) {
            return false;
        }
        aswb aswbVar = a.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.z;
    }

    @Override // defpackage.ahew
    public final void a(boolean z) {
        if (this.c != z) {
            this.c = z;
            l();
        }
    }

    @Override // defpackage.aide
    protected final int b(aign aignVar) {
        if (aignVar != aign.ENDED || this.c || this.g) {
            return (aignVar == null || !aignVar.c(aign.READY)) ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aide
    public final boolean c() {
        return !m() && this.f && super.c();
    }

    @Override // defpackage.fgk
    public final void g(fhf fhfVar) {
        k();
    }

    @Override // defpackage.ahyl
    public final void h(int i, long j) {
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        this.g = z;
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        boolean z = this.f;
        boolean z2 = false;
        if (fhgVar.b() && !fhgVar.e()) {
            z2 = true;
        }
        this.f = z2;
        if (z2 != z) {
            l();
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i8 - i6;
        int i10 = i3 - i;
        int i11 = i4 - i2;
        if (i7 - i5 == i10 && i9 == i11) {
            return;
        }
        if (this.d == (i11 > i10) && this.e == this.a.isInMultiWindowMode()) {
            return;
        }
        boolean m = m();
        this.d = i11 > i10;
        this.e = this.a.isInMultiWindowMode();
        if (m != m()) {
            l();
        }
    }
}

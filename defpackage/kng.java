package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kng implements kig, fgk {
    public final fgq a;
    public final ajdw b;
    public final fgm c;
    public final boolean d;
    public final ayqw e;
    public final aioc f;
    public long g;
    public final azqv h;
    public boolean i;
    public boolean j;
    public yzr k;
    private final ajok l;
    private final axpg m;
    private boolean n;
    private boolean o;

    /* JADX WARN: Multi-variable type inference failed */
    public kng(fgq fgqVar, ajdw ajdwVar, axpg axpgVar, acra acraVar, aioc aiocVar, fgm fgmVar, axzg axzgVar, byte[] bArr, byte[] bArr2) {
        Boolean bool;
        this.a = fgqVar;
        this.b = ajdwVar;
        ajok ajokVar = new ajok();
        this.l = ajokVar;
        ajokVar.a(acraVar);
        this.m = axpgVar;
        this.e = new ayqw();
        this.f = aiocVar;
        this.c = fgmVar;
        aqvj aqvjVar = axzgVar.b.b().C;
        aqvjVar = aqvjVar == null ? aqvj.a : aqvjVar;
        if (aqvjVar.a(45358110L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45358110L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45358110L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        this.d = bool.booleanValue();
        this.h = azqv.ap();
    }

    public final void a(boolean z) {
        yzr yzrVar;
        if (!this.d || (yzrVar = this.k) == null) {
            return;
        }
        if (!this.j || !this.o || this.i) {
            yzrVar.k(8);
            yzrVar.b(false);
            this.h.c(false);
        } else if (this.n) {
            yzrVar.c(z);
        } else {
            yzrVar.k(4);
            yzrVar.b(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(aqrf aqrfVar) {
        this.o = false;
        if (aqrfVar != null) {
            this.o = true;
            ajdw ajdwVar = this.b;
            ajok ajokVar = this.l;
            ajdwVar.oB(ajokVar, ajds.a(aqrfVar));
        }
        a(false);
    }

    @Override // defpackage.fgk
    public final void g(fhf fhfVar) {
        b(null);
    }

    @Override // defpackage.kig
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void m(fhg fhgVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nA(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nB(zcp zcpVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nC(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nD(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nF(ControlsState controlsState) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nY(boolean z) {
    }

    @Override // defpackage.kig
    public final void nz(boolean z) {
        this.n = false;
        a(z);
    }

    @Override // defpackage.kig
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void r(boolean z) {
    }

    @Override // defpackage.kig
    public final void s(boolean z) {
        this.n = true;
        a(z);
    }
}

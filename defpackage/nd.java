package defpackage;

import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nd implements rd {
    final /* synthetic */ ne a;
    private final /* synthetic */ int b;

    public nd(ne neVar, int i) {
        this.b = i;
        this.a = neVar;
    }

    @Override // defpackage.rd
    public final void a(qq qqVar, boolean z) {
        if (this.b == 0) {
            qq a = qqVar.a();
            nc F = this.a.F(a != qqVar ? a : qqVar);
            if (F != null) {
                if (a != qqVar) {
                    this.a.J(F.a, F, a);
                    this.a.L(F, true);
                    return;
                } else {
                    this.a.L(F, z);
                    return;
                }
            }
            return;
        }
        this.a.K(qqVar);
    }

    @Override // defpackage.rd
    public final boolean b(qq qqVar) {
        Window.Callback H;
        if (this.b != 0) {
            Window.Callback H2 = this.a.H();
            if (H2 != null) {
                H2.onMenuOpened(108, qqVar);
            }
            return true;
        }
        if (qqVar == qqVar.a()) {
            ne neVar = this.a;
            if (neVar.r && (H = neVar.H()) != null && !this.a.x) {
                H.onMenuOpened(108, qqVar);
            }
        }
        return true;
    }
}

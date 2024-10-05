package defpackage;

import android.animation.ArgbEvaluator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class omu implements oet {
    final /* synthetic */ omw a;
    private final /* synthetic */ int b;

    public omu(omw omwVar, int i) {
        this.b = i;
        this.a = omwVar;
    }

    @Override // defpackage.oet
    public final void a(float f) {
    }

    @Override // defpackage.oet
    public final void b(float f) {
        if (this.b != 0) {
            this.a.a(fzh.PLAYER, 1.0f - f);
        } else {
            omw omwVar = this.a;
            omwVar.b.setColor(((Integer) new ArgbEvaluator().evaluate(1.0f - f, Integer.valueOf(omwVar.c), Integer.valueOf(omwVar.d))).intValue());
        }
    }
}

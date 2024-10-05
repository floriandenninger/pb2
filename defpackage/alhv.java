package defpackage;

import android.graphics.Typeface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alhv implements aljs {
    final /* synthetic */ alhw a;
    private final /* synthetic */ int b;

    public alhv(alhw alhwVar, int i) {
        this.b = i;
        this.a = alhwVar;
    }

    @Override // defpackage.aljs
    public final void a(Typeface typeface) {
        if (this.b != 0) {
            alhw alhwVar = this.a;
            if (alhwVar.w(typeface)) {
                alhwVar.h();
                return;
            }
            return;
        }
        alhw alhwVar2 = this.a;
        if (alhwVar2.x(typeface)) {
            alhwVar2.h();
        }
    }
}

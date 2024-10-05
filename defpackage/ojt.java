package defpackage;

import android.graphics.Rect;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ojt implements obo {
    public final int a;
    public final fha b = new fha();
    public obp c;

    public ojt(int i) {
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(obp obpVar) {
        Rect v = obpVar.v();
        int width = v.width();
        int height = v.height();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.b.a(v.width(), v.height(), this.a == 1);
    }

    @Override // defpackage.obo
    public final void pa(obp obpVar) {
        b(obpVar);
    }
}

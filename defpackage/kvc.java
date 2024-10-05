package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kvc implements obn {
    public final kur a;
    public final kut b;
    public final Rect c = new Rect();

    public kvc(kur kurVar, kut kutVar) {
        this.a = kurVar;
        this.b = kutVar;
    }

    @Override // defpackage.obn
    public final Rect a(Rect rect) {
        Rect rect2 = new Rect(rect);
        rect2.left += this.c.left;
        rect2.right -= this.c.right;
        return this.a.a(rect2);
    }

    @Override // defpackage.obn
    public final void i(obd obdVar) {
        this.a.i(obdVar);
    }

    @Override // defpackage.obn
    public final void j(obd obdVar) {
        this.a.j(obdVar);
    }
}

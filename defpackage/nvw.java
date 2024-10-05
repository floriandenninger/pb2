package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nvw implements nwy {
    private final ViewGroup c;
    private final aypn d = azqv.aq(0);
    public final azqw a = azqv.ap().av();
    public Rect b = new Rect();

    public nvw(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    @Override // defpackage.nwy
    public final int a() {
        return 0;
    }

    @Override // defpackage.nwy
    public final Rect b() {
        return this.b;
    }

    @Override // defpackage.nwy
    public final aypn c() {
        return this.a;
    }

    @Override // defpackage.nwy
    public final aypn d() {
        return this.d;
    }

    @Override // defpackage.nwy
    public final void e() {
        this.a.c(new Rect(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom()));
        this.c.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: nvu
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                nvw nvwVar = nvw.this;
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                nvwVar.a.c(new Rect(i, i2, i3, i4));
            }
        });
        this.a.X(new ayrs() { // from class: nvv
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                nvw.this.b = (Rect) obj;
            }
        });
    }
}

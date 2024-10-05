package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lut implements fgn {
    public final zaz a;
    public final Rect b = new Rect();
    public View c;
    public nka d;
    public zat e;
    private final axpg f;
    private final axpg g;
    private ViewGroup h;

    public lut(zaz zazVar, axpg axpgVar, axpg axpgVar2) {
        this.a = zazVar;
        this.f = axpgVar;
        this.g = axpgVar2;
        zazVar.d().X(new ayrs() { // from class: lus
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                lut lutVar = lut.this;
                zbe zbeVar = ((zck) obj).a;
                lutVar.b.setEmpty();
                lutVar.e = zbeVar.b;
                if (lutVar.a.n() == 1 || lutVar.a.n() == 4 || lutVar.a.n() == 3 || lutVar.a.n() == 5) {
                    lutVar.c(new Rect());
                } else {
                    lutVar.c(zbeVar.a);
                }
                Rect rect = zbeVar.c;
                nka nkaVar = lutVar.d;
                if (nkaVar != null) {
                    nkaVar.h(rect);
                }
            }
        });
    }

    @Override // defpackage.fgn
    public final Rect a() {
        return this.b;
    }

    @Override // defpackage.fgn
    public final zat b() {
        return this.e;
    }

    public final void c(Rect rect) {
        ViewGroup viewGroup;
        View view;
        nka nkaVar = this.d;
        if (nkaVar != null) {
            nkaVar.i(rect.left, rect.top, rect.right, rect.bottom);
        }
        View view2 = (View) this.g.get();
        if (true != ((okd) this.f.get()).a()) {
            if (this.h == null && (view = this.c) != null) {
                this.h = (ViewGroup) view.findViewById(R.id.watch_while_layout_coordinator_layout);
            }
            viewGroup = this.h;
        } else {
            viewGroup = null;
        }
        yny.z((View) amkq.Z(viewGroup, view2), yny.v(rect.top), ViewGroup.MarginLayoutParams.class);
        yny.z(view2, yny.h(yny.o(rect.left), yny.u(rect.right), yny.k(rect.bottom)), ViewGroup.MarginLayoutParams.class);
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.view.ViewStub;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aidv implements ahyl, aied {
    private final aiee a;
    public ViewStub f;
    public aidx g;
    public boolean h;

    public aidv(ViewStub viewStub, aiee aieeVar) {
        viewStub.getClass();
        this.f = viewStub;
        aieeVar.getClass();
        this.a = aieeVar;
        aieeVar.b(this);
    }

    private final void a(aief aiefVar) {
        if (this.h) {
            aidx d = d();
            if (!d.d) {
                if (d.c.isStarted()) {
                    d.c.reverse();
                } else {
                    d.c.start();
                }
                d.d = true;
            }
            d.a.setImageBitmap(aiefVar != null ? aiefVar.a : null);
            return;
        }
        aidx d2 = d();
        if (d2.d) {
            d2.c.reverse();
            d2.d = false;
        }
    }

    private final void b(long j) {
        this.a.k(j, -1);
        d().b.setText(TimeBar.I(j));
        f(d());
    }

    protected aidx d() {
        throw null;
    }

    protected abstract void f(aidx aidxVar);

    public final void g(boolean z) {
        aief a;
        if (this.h == z) {
            return;
        }
        this.h = z;
        aiee aieeVar = this.a;
        synchronized (aieeVar.i) {
            Bitmap bitmap = aieeVar.f;
            a = bitmap != null ? aief.a(bitmap) : null;
        }
        a(a);
    }

    @Override // defpackage.ahyl
    public final void h(int i, long j) {
        if (i()) {
            if (i == 1) {
                b(j);
                g(true);
            } else if (i == 2) {
                b(j);
            } else if (i == 3 || i == 4) {
                g(false);
            }
        }
    }

    public final boolean i() {
        return this.a.l();
    }

    @Override // defpackage.aied
    public final /* synthetic */ void x(int i, int i2) {
    }

    @Override // defpackage.aied
    public final void y(aief aiefVar, int i) {
        a(aiefVar);
    }
}

package defpackage;

import android.os.Handler;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gbk extends gan implements akbo {
    private gbn b;
    private final azrw c;

    public gbk(gbh gbhVar, Handler handler, azrw azrwVar) {
        super(gbhVar, handler, ejz.i, gbv.b);
        this.c = azrwVar;
    }

    @Override // defpackage.gan
    protected final /* bridge */ /* synthetic */ gbj c(BottomUiContainer bottomUiContainer) {
        if (this.b == null) {
            if (bottomUiContainer.c == null) {
                bottomUiContainer.c = (FrameLayout) bottomUiContainer.d(R.layout.elements_wrapper);
            }
            this.b = new gbn(bottomUiContainer.c, bottomUiContainer.getContext(), (sqq) this.c.get());
        }
        return this.b;
    }

    @Override // defpackage.gan
    protected final /* bridge */ /* synthetic */ boolean l(akbn akbnVar) {
        return true;
    }

    @Override // defpackage.akbo
    public final /* bridge */ /* synthetic */ akbp m() {
        return (akbp) super.d();
    }

    @Override // defpackage.akbo
    public final /* bridge */ /* synthetic */ void n(akbq akbqVar) {
        super.f(akbqVar);
    }

    @Override // defpackage.gan, defpackage.akbl
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void li(akbq akbqVar, int i) {
        super.li(akbqVar, i);
        gbn gbnVar = this.b;
        if (gbnVar != null) {
            gbnVar.b();
        }
    }

    @Override // defpackage.akbo
    public final /* bridge */ /* synthetic */ void p(akbq akbqVar) {
        super.j(akbqVar);
    }
}

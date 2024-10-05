package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.apps.youtube.app.common.ui.bottomui.Mealbar;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gbw extends gan implements akbw {
    public ajyg b;
    private final ajjz c;
    private gcd d;

    public gbw(gbh gbhVar, Handler handler, ajjz ajjzVar) {
        super(gbhVar, handler, ejz.j, gbv.a);
        this.c = ajjzVar;
    }

    @Override // defpackage.gan
    protected final /* bridge */ /* synthetic */ gbj c(BottomUiContainer bottomUiContainer) {
        if (this.d == null) {
            Context context = bottomUiContainer.getContext();
            Mealbar mealbar = bottomUiContainer.d;
            if (mealbar != null && mealbar.getContext() != context) {
                ViewParent parent = bottomUiContainer.d.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(bottomUiContainer.d);
                }
                bottomUiContainer.d = null;
            }
            if (bottomUiContainer.d == null) {
                bottomUiContainer.d = (Mealbar) bottomUiContainer.e(context, R.layout.mealbar);
            }
            this.d = new gcd(bottomUiContainer.d, this.c, this.b);
        }
        return this.d;
    }

    @Override // defpackage.gan
    protected final /* synthetic */ boolean k(akbn akbnVar) {
        akby akbyVar = (akby) akbnVar;
        if (TextUtils.isEmpty(akbyVar.c) && TextUtils.isEmpty(akbyVar.f)) {
            return false;
        }
        return (TextUtils.isEmpty(akbyVar.a) && TextUtils.isEmpty(akbyVar.b)) ? false : true;
    }

    @Override // defpackage.akbw
    public final /* bridge */ /* synthetic */ akbx m() {
        return (akbx) super.d();
    }

    @Override // defpackage.akbw
    public final /* bridge */ /* synthetic */ void n(akby akbyVar) {
        super.f(akbyVar);
    }

    @Override // defpackage.akbw
    public final /* bridge */ /* synthetic */ void o(akby akbyVar) {
        super.j(akbyVar);
    }
}

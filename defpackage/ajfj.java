package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajfj implements akbo {
    public final Set a = new CopyOnWriteArraySet();
    public ViewGroup b;
    public akbq c;
    ajfa d;
    public int e;
    private final Context f;
    private final azrw g;

    public ajfj(Context context, azrw azrwVar) {
        this.f = context;
        this.g = azrwVar;
    }

    private static final boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // defpackage.akbo
    public final /* synthetic */ akbp m() {
        ajdn ajdnVar = new ajdn();
        ajdnVar.d(-1);
        ajdnVar.b = false;
        ajdnVar.a = false;
        return ajdnVar;
    }

    @Override // defpackage.akbo
    public final void n(akbq akbqVar) {
        ajfa ajfaVar;
        if (a() && akbqVar == this.c && (ajfaVar = this.d) != null) {
            ajfaVar.d();
        }
    }

    @Override // defpackage.akbo
    public final void p(akbq akbqVar) {
        awos h;
        if (a()) {
            this.c = akbqVar;
            if (akbqVar == null || (h = akbqVar.h()) == null) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) ((Activity) this.f).getWindow().findViewById(R.id.interstitials_container);
            this.b = viewGroup;
            if (viewGroup == null) {
                return;
            }
            this.e = viewGroup.getVisibility();
            this.b.setVisibility(0);
            CoordinatorLayout coordinatorLayout = new CoordinatorLayout(this.f);
            this.b.addView(coordinatorLayout);
            acra f = akbqVar.f();
            FrameLayout frameLayout = new FrameLayout(this.f);
            frameLayout.setClickable(true);
            frameLayout.setImportantForAccessibility(2);
            sya a = syb.a((sxt) this.g.get());
            if (f != null) {
                a.d = new acsd(f, null);
            }
            slj sljVar = new slj(this.f, a.a());
            sljVar.a(h.toByteArray());
            frameLayout.addView(sljVar, new FrameLayout.LayoutParams(-1, -2));
            int e = akbqVar.e();
            ajfa ajfaVar = new ajfa(coordinatorLayout, frameLayout, new ajeu(), akbqVar);
            ajfaVar.n = new ajez();
            ajfaVar.h = e;
            ajfaVar.f.setPadding(0, 0, 0, 0);
            this.d = ajfaVar;
            View findViewById = ((Activity) this.f).getWindow().findViewById(R.id.pivot_bar);
            if (findViewById != null && findViewById.getVisibility() == 0) {
                yny.z(coordinatorLayout, yny.k(findViewById.getHeight()), ViewGroup.MarginLayoutParams.class);
            }
            ajfa ajfaVar2 = this.d;
            if (ajfaVar2 != null) {
                ajfi ajfiVar = new ajfi(this);
                if (ajfaVar2.m == null) {
                    ajfaVar2.m = new ArrayList();
                }
                ajfaVar2.m.add(ajfiVar);
                this.d.h();
            }
            this.a.clear();
        }
    }
}

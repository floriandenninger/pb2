package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class may extends lyy {
    boolean c;
    private final axpg d;
    private final ajdw e;
    private final FrameLayout f;

    public may(Activity activity, axpg axpgVar, axpg axpgVar2, ajdw ajdwVar) {
        super(activity, axpgVar);
        this.d = axpgVar2;
        this.e = ajdwVar;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f = frameLayout;
        frameLayout.setBackground(new fyl(wbs.W(activity, R.attr.ytSeparator).orElse(0), activity.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
    }

    @Override // defpackage.lyy
    protected final ViewGroup c() {
        return this.f;
    }

    @Override // defpackage.lyy
    public final void h(gad gadVar) {
        fzx fzxVar = gadVar.e;
        this.c = false;
        if (fzxVar != null) {
            this.f.removeAllViews();
            this.e.oB(new ajok(), ajds.a(fzxVar.a));
            this.f.addView(this.e.a());
            this.c = true;
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lyy
    public final boolean j() {
        return this.c;
    }
}

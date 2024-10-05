package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class gae {
    public ViewStub d;
    public boolean e;
    public View f;

    /* JADX INFO: Access modifiers changed from: protected */
    public gae(View view) {
        this.e = false;
        view.getClass();
        this.f = view;
        this.e = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Drawable b(Context context) {
        return (Drawable) wbs.V(context, R.attr.standaloneBadgeBackground).orElse(aii.a(context, R.drawable.standalone_badge_background_light));
    }

    public static void d(Context context, ViewGroup viewGroup, apkd[] apkdVarArr) {
        if (apkdVarArr == null) {
            return;
        }
        viewGroup.removeAllViews();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.intra_badge_padding);
        for (apkd apkdVar : apkdVarArr) {
            if (apkdVar != null) {
                View view = null;
                if ((apkdVar.b & 1) != 0) {
                    view = View.inflate(context, R.layout.standalone_ypc_badge, null);
                    gag gagVar = new gag(view, 1);
                    apkh apkhVar = apkdVar.c;
                    if (apkhVar == null) {
                        apkhVar = apkh.a;
                    }
                    gagVar.a(apkhVar);
                }
                if (view != null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.setMarginEnd(dimensionPixelSize);
                    viewGroup.addView(view, layoutParams);
                }
            }
        }
    }

    public static void e(Context context, ViewGroup viewGroup, List list) {
        d(context, viewGroup, (apkd[]) Optional.ofNullable(list).map(evy.h).orElse(new apkd[0]));
    }

    public final View c() {
        View view;
        if (this.e && (view = this.f) != null) {
            return view;
        }
        View view2 = (View) Optional.ofNullable(this.d).map(evy.g).orElse(null);
        view2.getClass();
        this.f = view2;
        this.e = true;
        return view2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public gae(ViewStub viewStub) {
        this.e = false;
        viewStub.getClass();
        this.d = viewStub;
    }
}

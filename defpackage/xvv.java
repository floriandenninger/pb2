package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xvv extends ajnc {
    public xvv(Context context, ajos ajosVar) {
        super(context, ajosVar);
    }

    @Override // defpackage.ajnc
    protected final /* bridge */ /* synthetic */ ViewGroup a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return frameLayout;
    }

    public final View b(ajok ajokVar, apyv apyvVar, int i) {
        ajok d = d(ajokVar);
        d.f("replyIndex", Integer.valueOf(i));
        d.f("indentedComment", true);
        return c(d, apyvVar);
    }
}

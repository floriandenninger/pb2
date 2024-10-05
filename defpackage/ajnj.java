package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajnj extends ajnc {
    public ajnj(Context context, ajos ajosVar) {
        super(context, ajosVar);
    }

    @Override // defpackage.ajnc
    protected final /* bridge */ /* synthetic */ ViewGroup a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        return frameLayout;
    }
}

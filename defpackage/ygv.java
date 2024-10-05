package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ygv extends ajnc {
    public ygv(Context context, ajos ajosVar) {
        super(context, ajosVar);
    }

    @Override // defpackage.ajnc
    protected final /* bridge */ /* synthetic */ ViewGroup a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return frameLayout;
    }
}

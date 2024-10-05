package defpackage;

import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zhl implements zhh {
    @Override // defpackage.zhh
    public final /* bridge */ /* synthetic */ boolean a(ViewGroup.LayoutParams layoutParams) {
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (layoutParams2.alignWithParent) {
            return false;
        }
        layoutParams2.alignWithParent = true;
        return true;
    }
}

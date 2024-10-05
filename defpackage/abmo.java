package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abmo extends ablt {
    public abmo(Context context, ajjs ajjsVar, acqz acqzVar, aahd aahdVar, ajla ajlaVar, zim zimVar) {
        super(context, ajjsVar, acqzVar, aahdVar, ajlaVar, zimVar);
        Resources resources = context.getResources();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_vertical_margin);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_horizontal_margin);
        yny.A(this.c, new abld(marginLayoutParams, 3), yny.s(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.ablt
    public final int h() {
        return R.layout.live_chat_overlay_paid_sticker;
    }
}

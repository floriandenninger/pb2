package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abmn extends able {
    public abmn(Context context, acqz acqzVar, ajjz ajjzVar, ajsd ajsdVar, aahd aahdVar, ajut ajutVar) {
        super(context, acqzVar, ajjzVar, ajsdVar, aahdVar, ajutVar);
    }

    @Override // defpackage.able
    protected final boolean d() {
        return true;
    }

    @Override // defpackage.able
    protected final int e() {
        return R.layout.live_chat_overlay_membership_item;
    }

    @Override // defpackage.able
    protected final Drawable f() {
        return this.a.getResources().getDrawable(R.drawable.live_chat_overlay_paid_message_full_background);
    }

    @Override // defpackage.able
    protected final Drawable g() {
        return this.a.getResources().getDrawable(R.drawable.live_chat_overlay_paid_message_top_background);
    }
}

package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abmt extends ablt {
    private final RelativeLayout f;

    public abmt(Context context, ajjs ajjsVar, acqz acqzVar, aahd aahdVar, ajla ajlaVar, zim zimVar) {
        super(context, ajjsVar, acqzVar, aahdVar, ajlaVar, zimVar);
        this.f = (RelativeLayout) this.c.findViewById(R.id.live_chat_sticker_background);
    }

    @Override // defpackage.ablt, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.c.setBackgroundColor(0);
        ((GradientDrawable) this.f.getBackground()).setColor(0);
    }

    @Override // defpackage.ablt
    public final int h() {
        return R.layout.live_chat_paid_sticker;
    }
}

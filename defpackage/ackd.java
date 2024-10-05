package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ackd extends ablr {
    public ackd(Context context, ajjs ajjsVar, acqz acqzVar, aahd aahdVar, ajsd ajsdVar, ajut ajutVar, axze axzeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(context, ajjsVar, acqzVar, aahdVar, ajsdVar, ajutVar, axzeVar, null, null, null, null);
    }

    @Override // defpackage.ablr
    protected final int d() {
        return R.layout.live_chat_overlay_paid_message;
    }

    @Override // defpackage.ablr
    protected final int e() {
        return R.drawable.live_chat_overlay_paid_message_full_background;
    }

    @Override // defpackage.ablr
    protected final int f() {
        return R.drawable.live_chat_overlay_paid_message_top_background;
    }

    @Override // defpackage.ablr
    protected final ViewGroup.MarginLayoutParams g() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // defpackage.ablr
    /* renamed from: h */
    public final void oB(ajok ajokVar, asqj asqjVar) {
        super.oB(ajokVar, asqjVar);
        Resources resources = this.c.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.live_chat_paid_message_avatar_size);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_paid_message_bottom_bar_horizontal_padding);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_avatar_margin);
        if (this.i.getVisibility() != 0) {
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_amount_vertical_padding_when_moderated);
            TextView textView = this.j;
            int i = dimensionPixelSize / 2;
            textView.setPaddingRelative(i, dimensionPixelOffset3, textView.getPaddingEnd(), dimensionPixelOffset3);
            TextView textView2 = this.l;
            textView2.setPaddingRelative(i - dimensionPixelOffset, 0, textView2.getPaddingEnd(), 0);
            return;
        }
        TextView textView3 = this.j;
        textView3.setPaddingRelative(0, 0, textView3.getPaddingEnd(), 0);
        TextView textView4 = this.l;
        textView4.setPaddingRelative(dimensionPixelSize + dimensionPixelOffset + dimensionPixelOffset2, 0, textView4.getPaddingEnd(), 0);
    }

    @Override // defpackage.ablr, defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        oB(ajokVar, (asqj) obj);
    }
}

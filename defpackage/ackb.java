package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ackb extends ablb {
    private final ajkj c;

    public ackb(Context context, ajjz ajjzVar) {
        super(context);
        this.c = new ajkj(ajjzVar.b(), this.b);
    }

    @Override // defpackage.ablb, defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.a();
    }

    @Override // defpackage.ablb
    protected final int d() {
        return R.layout.live_chat_light_overlay_legacy_paid_message;
    }

    @Override // defpackage.ablb
    protected final ImageView e() {
        return (ImageView) this.a.findViewById(R.id.sponsor_thumbnail);
    }

    @Override // defpackage.ablb
    protected final TextView f() {
        return (TextView) this.a.findViewById(R.id.detail_text);
    }

    @Override // defpackage.ablb
    protected final TextView g() {
        return (TextView) this.a.findViewById(R.id.event_text);
    }

    @Override // defpackage.ablb
    protected final void h(avgg avggVar) {
        this.c.k(avggVar);
    }

    @Override // defpackage.ablb
    protected final void i(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_vertical_margin);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_horizontal_margin);
        yny.A(this.a, new abld(new ViewGroup.MarginLayoutParams(-2, -2), 4), yny.h(yny.y(-2, -2), yny.s(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset)), ViewGroup.MarginLayoutParams.class);
    }
}

package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abmk extends ablb {
    private final ajkj c;

    public abmk(Context context, ajjz ajjzVar) {
        super(context);
        this.c = new ajkj(ajjzVar.b(), this.b);
    }

    @Override // defpackage.ablb, defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.a();
    }

    @Override // defpackage.ablb
    protected final int d() {
        return R.layout.live_chat_legacy_paid_message;
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
}

package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abml extends ablo {
    public abml(Context context, aahd aahdVar, ajut ajutVar) {
        super(context, aahdVar, ajutVar);
    }

    @Override // defpackage.ablo
    protected final int d() {
        return R.layout.live_chat_light_metadata_item;
    }

    @Override // defpackage.ablo
    protected final int e() {
        return R.dimen.live_chat_metadata_vertical_margin;
    }

    @Override // defpackage.ablo
    protected final int f() {
        return -1;
    }

    @Override // defpackage.ablo
    protected final ViewGroup g() {
        return (ViewGroup) this.c.findViewById(R.id.buttons_container);
    }

    @Override // defpackage.ablo
    protected final ImageView h() {
        return (ImageView) this.c.findViewById(R.id.icon);
    }

    @Override // defpackage.ablo
    protected final TextView i() {
        return (TextView) this.c.findViewById(R.id.subtitle);
    }

    @Override // defpackage.ablo
    protected final TextView j() {
        return (TextView) this.c.findViewById(R.id.title);
    }
}

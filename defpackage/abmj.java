package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abmj extends abla {
    public abmj(Context context, ajjs ajjsVar, aahd aahdVar, acqz acqzVar) {
        super(context, ajjsVar, aahdVar, acqzVar);
    }

    @Override // defpackage.abla
    protected final int d() {
        return R.layout.live_chat_donation_announcement;
    }

    @Override // defpackage.abla
    protected final ImageView e() {
        return (ImageView) this.a.findViewById(R.id.avatar);
    }

    @Override // defpackage.abla
    protected final TextView f() {
        return (TextView) this.a.findViewById(R.id.subtext);
    }

    @Override // defpackage.abla
    protected final TextView g() {
        return (TextView) this.a.findViewById(R.id.text);
    }
}

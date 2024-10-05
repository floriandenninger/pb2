package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class etq implements ftl {
    public final ajco a;
    public final ftm b;
    public final ViewGroup c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    private final fvd g;
    private final TextView h;
    private final TextView i;

    public etq(Context context, ftn ftnVar, fvf fvfVar, ViewGroup viewGroup, byte[] bArr) {
        ajcn a = ajco.a();
        a.a = context;
        this.a = a.a();
        this.c = viewGroup;
        this.h = (TextView) viewGroup.findViewById(R.id.promo_text);
        this.i = (TextView) viewGroup.findViewById(R.id.promo_text_additional);
        fvd b = fvfVar.b(viewGroup.findViewById(R.id.subscription_notification_view));
        this.g = b;
        this.b = ftnVar.a((TextView) viewGroup.findViewById(R.id.subscribe_button), b);
    }

    public final void b(boolean z, boolean z2, boolean z3) {
        if (z3) {
            bwh.b(this.c, null);
        }
        if (z != z2) {
            this.h.setVisibility(8);
            this.i.setVisibility(8);
        } else if (!z2) {
            whu.G(this.h, this.d);
            whu.G(this.i, this.e);
        } else {
            whu.G(this.h, this.f);
            this.i.setVisibility(8);
        }
    }

    @Override // defpackage.ftl
    public final void nV(boolean z, boolean z2) {
        b(z, z2, true);
    }
}

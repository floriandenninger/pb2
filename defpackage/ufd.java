package defpackage;

import android.widget.FrameLayout;
import com.google.android.libraries.onegoogle.account.disc.RingView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ufd {
    public final RingView a;
    private final int b;
    private final int c;
    private final int d;

    static {
        new ufc(Integer.class);
    }

    public ufd(RingView ringView, int i, int i2) {
        this.a = ringView;
        ufb ufbVar = new ufb(ringView.getResources());
        int round = Math.round(ufbVar.b(i));
        this.c = round;
        int c = ufbVar.c(i);
        this.b = c;
        int i3 = (i2 - c) / 2;
        this.d = i3;
        ringView.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        ringView.setPadding(i3, i3, i3, i3);
        ringView.b = round;
        ringView.c = c / 2;
        ringView.setVisibility(0);
    }
}

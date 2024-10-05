package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ill extends aivd implements ahwk {
    public final aivf a;
    public final ahwu b;
    public View c;
    public final ilk d;
    private final ilk e;
    private final ilk f;

    public ill(Context context, aivf aivfVar, ahwu ahwuVar) {
        super(context);
        this.e = new ilk(R.id.reels_playback);
        this.f = new ilk(R.id.reels_response);
        this.d = new ilk(R.id.reels_sequence);
        this.a = aivfVar;
        this.b = ahwuVar;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahwk
    public final void d() {
        g(false);
        this.b.g();
    }

    public final void e(long j) {
        this.e.b(j);
    }

    public final void f(long j) {
        this.f.b(j);
    }

    public final void g(boolean z) {
        if (this.c == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.reel_player_csi_overlay, this);
            this.e.a(inflate);
            this.f.a(inflate);
            this.d.a(inflate);
            this.c = inflate;
        }
        whu.I(this.c, z);
        Object obj = this.a;
        if (obj != null) {
            ilj iljVar = new ilj(this);
            View findViewById = ((View) obj).findViewById(R.id.nerd_stats_layout);
            if (findViewById != null) {
                if (findViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    yny.z(findViewById, yny.v(getResources().getDimensionPixelSize(R.dimen.reel_nerd_stats_margin_top)), ViewGroup.MarginLayoutParams.class);
                }
                findViewById.addOnLayoutChangeListener(iljVar);
            }
        }
    }

    public final boolean h() {
        View view = this.c;
        return view != null && view.getVisibility() == 0;
    }

    @Override // defpackage.ahwk
    public final void rO() {
        this.b.rO();
    }
}

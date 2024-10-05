package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kjh implements aivf {
    public final obq a;
    public final azqv b;
    public View c;
    private final Context d;

    public kjh(Context context) {
        this.d = context;
        final azqv ap = azqv.ap();
        this.b = ap;
        this.a = new obq() { // from class: kjf
            @Override // defpackage.obq
            public final void o(int i) {
                azqv.this.c(Integer.valueOf(i));
            }
        };
    }

    public final void a() {
        if (this.c != null) {
            return;
        }
        this.c = LayoutInflater.from(this.d).inflate(R.layout.engagement_panel_scrim_overlay, (ViewGroup) null);
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new aivh(-1, -1, false);
    }

    @Override // defpackage.aivf
    public final View ld() {
        a();
        return this.c;
    }
}

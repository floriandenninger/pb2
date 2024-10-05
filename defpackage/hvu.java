package defpackage;

import android.view.View;
import android.widget.Button;
import com.google.android.libraries.video.trim.VideoTrimView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hvu implements View.OnClickListener, hxg {
    public View a;
    public VideoTrimView b;
    public Button c;
    public boolean d;
    public float e;
    public hvt f;
    public acra g;

    @Override // defpackage.hxg
    public final float a() {
        if (this.d) {
            return this.e;
        }
        return 0.0f;
    }

    @Override // defpackage.hxg
    public final float b() {
        if (this.d) {
            return 0.0f;
        }
        return this.e;
    }

    @Override // defpackage.hxg
    public final View c() {
        return this.a;
    }

    public final void d() {
        if (this.d) {
            whu.I(this.b, false);
            gfw.z(this);
            this.d = false;
        }
    }

    @Override // defpackage.hxg
    public final void e() {
    }

    @Override // defpackage.hxg
    public final void f() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.c) {
            this.f.aY();
            this.g.I(3, new acqx(acsb.c(61880)), null);
        }
    }
}

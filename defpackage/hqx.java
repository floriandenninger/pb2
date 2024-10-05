package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;
import com.google.android.libraries.youtube.edit.preview.TrimVideoControllerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hqx implements hxg {
    public View a;
    public ShortsVideoTrimView2 b;
    public float c;
    public boolean d;
    public TrimVideoControllerView e;

    @Override // defpackage.hxg
    public final float a() {
        if (this.d) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // defpackage.hxg
    public final float b() {
        if (this.d) {
            return this.c;
        }
        return 0.0f;
    }

    @Override // defpackage.hxg
    public final View c() {
        return this.a;
    }

    public final void d() {
        this.e.g.setVisibility(0);
        this.e.f(false);
        whu.I(this.b, false);
        whu.I(this.a, false);
    }

    @Override // defpackage.hxg
    public final void e() {
        if (this.d) {
            return;
        }
        d();
    }

    @Override // defpackage.hxg
    public final void f() {
        if (this.d) {
            this.e.g.setVisibility(8);
            this.e.f(true);
            whu.I(this.b, true);
            whu.I(this.a, true);
        }
    }

    public final void g() {
        this.d = true;
        gfw.z(this);
    }
}

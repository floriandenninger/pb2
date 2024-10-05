package defpackage;

import android.content.Context;
import android.media.PlaybackParams;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aema implements aemg, aemf {
    protected final aemg a;
    private aemf b;

    public aema(aemg aemgVar) {
        this.a = aemgVar;
        ((aemb) aemgVar).a = this;
    }

    @Override // defpackage.aemg
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.aemg
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.aemg
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.aemf
    public final void d(aemg aemgVar) {
        aemf aemfVar = this.b;
        if (aemfVar != null) {
            aemfVar.d(this);
        }
    }

    @Override // defpackage.aemf
    public final void e(aemg aemgVar, int i, int i2) {
        aemf aemfVar = this.b;
        if (aemfVar != null) {
            aemfVar.e(this, i, i2);
        }
    }

    @Override // defpackage.aemg
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.aemg
    public final void g() {
        this.a.g();
    }

    @Override // defpackage.aemg
    public final void h() {
        this.a.h();
    }

    @Override // defpackage.aemg
    public final void i() {
        this.a.i();
    }

    @Override // defpackage.aemg
    public final void j(long j) {
        this.a.j(j);
    }

    @Override // defpackage.aemg
    public final void k(int i) {
        this.a.k(i);
    }

    @Override // defpackage.aemg
    public void l(Context context, Uri uri, Map map, PlayerConfigModel playerConfigModel) {
        throw null;
    }

    @Override // defpackage.aemg
    public final void m(SurfaceHolder surfaceHolder) {
        this.a.m(surfaceHolder);
    }

    @Override // defpackage.aemg
    public final void n(aemf aemfVar) {
        this.b = aemfVar;
    }

    @Override // defpackage.aemg
    public final void o(PlaybackParams playbackParams) {
        this.a.o(playbackParams);
    }

    @Override // defpackage.aemg
    public final void p(Surface surface) {
        this.a.p(surface);
    }

    @Override // defpackage.aemg
    public final void q(float f, float f2) {
        this.a.q(f, f2);
    }

    @Override // defpackage.aemg
    public final void r() {
        this.a.r();
    }

    @Override // defpackage.aemf
    public final void s(int i) {
        aemf aemfVar = this.b;
        if (aemfVar != null) {
            aemfVar.s(i);
        }
    }

    @Override // defpackage.aemf
    public final void t() {
        aemf aemfVar = this.b;
        if (aemfVar != null) {
            aemfVar.t();
        }
    }

    @Override // defpackage.aemf
    public final boolean u(int i, int i2) {
        aemf aemfVar = this.b;
        if (aemfVar != null) {
            return aemfVar.u(i, i2);
        }
        return false;
    }

    @Override // defpackage.aemf
    public final void v(int i, int i2) {
        aemf aemfVar = this.b;
        if (aemfVar != null) {
            aemfVar.v(i, i2);
        }
    }

    @Override // defpackage.aemf
    public final void w() {
        aemf aemfVar = this.b;
        if (aemfVar != null) {
            aemfVar.w();
        }
    }
}

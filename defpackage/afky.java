package defpackage;

import android.os.Build;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface afky extends afkl {
    public static final boolean h;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT > 23 || (Build.VERSION.SDK_INT == 23 && "6.0.1".equals(Build.VERSION.RELEASE))) {
            z = true;
        }
        h = z;
    }

    Surface A();

    SurfaceHolder B();

    aflb C();

    SurfaceControl f();

    void g(int i);

    View h();

    bgv i();

    pkd j();

    void k();

    void m(Object obj);

    void n(int i);

    void o();

    void p();

    void q();

    void r(boolean z, byte[] bArr, long j, long j2);

    void rE(int i);

    void s(afkx afkxVar);

    void t(aflb aflbVar);

    void u(afld afldVar);

    void w(boolean z);

    void y(boolean z, float f, float f2, int i);

    void z();
}

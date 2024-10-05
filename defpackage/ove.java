package defpackage;

import android.app.Activity;
import android.os.Parcel;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.databus.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.FancyDismissibleDialogRendererWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.g;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.i;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ove extends alvc {
    public final otp a;
    public final f b;
    public final int c;
    private final d d;
    private final a e;
    private final b f;

    static {
        zga.k("YouTubeAndroidPlayerAPI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ove(Activity activity, osv osvVar, afkl afklVar) {
        super(activity, new com.google.android.apps.youtube.embeddedplayer.service.jar.b(activity), new aivi(activity));
        this.j.h((View) afklVar);
        this.o.pv(new ovc());
        a aVar = new a(this.M);
        this.e = aVar;
        this.f = b.d(this.N, osvVar.b(), osvVar.f());
        d dVar = new d();
        this.d = dVar;
        aivi aiviVar = this.j;
        final ahvr ahvrVar = this.k;
        ahvrVar.getClass();
        aiviVar.o = new Runnable() { // from class: ovb
            @Override // java.lang.Runnable
            public final void run() {
                ahvr.this.pA();
            }
        };
        final i iVar = new i(this.x, ((otb) osvVar).f.b(), osvVar.f());
        aivi aiviVar2 = this.j;
        final ahvr ahvrVar2 = this.k;
        ahvrVar2.getClass();
        aiviVar2.o = new Runnable() { // from class: ovb
            @Override // java.lang.Runnable
            public final void run() {
                ahvr.this.pA();
            }
        };
        this.a = otp.M(activity, new ovd(this), osvVar, afklVar, iVar, this.y, this.k, this.p, this.q, this.r, this.s, this.t, this.o, this.R, dVar, this.l, this.m, this.n, this.z, this.A, this.B, this.w, aVar, new zfi() { // from class: ouz
            @Override // defpackage.zfi
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                zbg zbgVar = ove.this.E;
                boolean z = false;
                if (bool != null && bool.booleanValue()) {
                    z = true;
                }
                zbgVar.j(z);
            }
        }, alux.b, new com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.a() { // from class: ouy
            @Override // com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.a
            public final void a(aqvu aqvuVar) {
                i.this.a.y((aqvu) new FancyDismissibleDialogRendererWrapper(aqvuVar).a);
            }
        }, c.c);
        this.f68J.sc(new aahd() { // from class: ova
            @Override // defpackage.aahd
            public final /* synthetic */ void a(apxf apxfVar) {
                aahc.a(this, apxfVar);
            }

            @Override // defpackage.aahd
            public final /* synthetic */ void b(List list) {
                aahc.b(this, list);
            }

            @Override // defpackage.aahd
            public final void c(apxf apxfVar, Map map) {
                ove.this.a.y(apxfVar);
            }

            @Override // defpackage.aahd
            public final /* synthetic */ void d(List list, Map map) {
                aahc.c(this, list, map);
            }

            @Override // defpackage.aahd
            public final /* synthetic */ void e(List list, Object obj) {
                aahc.d(this, list, obj);
            }
        });
        f c = osvVar.c();
        this.b = c;
        int a = c.a(System.identityHashCode(activity));
        this.c = a;
        c.n(a);
        this.v.k(this.N, dVar, new g(c));
    }

    @Override // defpackage.alvc
    public final boolean A() {
        return this.a.H();
    }

    @Override // defpackage.alvc
    public final boolean B() {
        return this.a.J();
    }

    @Override // defpackage.alvc
    public final boolean C() {
        return this.a.d;
    }

    @Override // defpackage.alvc
    public final boolean D(VisibilityChangeEventData visibilityChangeEventData) {
        if (!au()) {
            return false;
        }
        this.a.s(visibilityChangeEventData);
        return true;
    }

    @Override // defpackage.alvc
    public final boolean E(int i, KeyEvent keyEvent) {
        return this.a.K(i, keyEvent);
    }

    @Override // defpackage.alvc
    public final boolean F(int i, KeyEvent keyEvent) {
        return this.a.L(i, keyEvent);
    }

    @Override // defpackage.alvc
    protected final boolean G(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        this.a.t((PlaybackServiceState) obtain.readParcelable(PlaybackServiceState.class.getClassLoader()));
        obtain.recycle();
        return true;
    }

    @Override // defpackage.alvc
    protected final byte[] H() {
        PlaybackServiceState c = this.a.c();
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(c, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // defpackage.alvc
    public final int a() {
        if (this.a.a() < -2147483648L || this.a.a() > 2147483647L) {
            long a = this.a.a();
            StringBuilder sb = new StringBuilder(42);
            sb.append("32 bit time overflow: ");
            sb.append(a);
            zga.l(sb.toString());
        }
        return (int) this.a.a();
    }

    @Override // defpackage.alvc
    public final int b() {
        if (this.a.b() < -2147483648L || this.a.b() > 2147483647L) {
            long b = this.a.b();
            StringBuilder sb = new StringBuilder(42);
            sb.append("32 bit time overflow: ");
            sb.append(b);
            zga.l(sb.toString());
        }
        return (int) this.a.b();
    }

    @Override // defpackage.alvc
    public final void c() {
        this.a.q();
    }

    @Override // defpackage.alvc
    public final void d(String str, int i, int i2) {
        this.b.u(this.c, opn.c(str, i, i2));
        this.a.e(str, i, i2, this.c);
    }

    @Override // defpackage.alvc
    public final void e(String str, int i) {
        this.b.u(this.c, opn.d(str, i));
        this.a.g(str, i, this.c);
    }

    @Override // defpackage.alvc
    public final void f(List list, int i, int i2) {
        this.b.m(this.c, opn.e(list, i, i2), true);
        this.a.h(list, i, i2, this.c);
    }

    @Override // defpackage.alvc
    public final void g() {
        this.a.j();
    }

    @Override // defpackage.alvc
    public final void h(String str, int i, int i2) {
        this.b.u(this.c, opn.c(str, i, i2));
        this.a.n(str, i, i2, false, this.c);
    }

    @Override // defpackage.alvc
    public final void i(String str, int i) {
        this.b.u(this.c, opn.d(str, i));
        this.a.o(str, false, i, false, this.c);
    }

    @Override // defpackage.alvc
    public final void j(List list, int i, int i2) {
        this.b.m(this.c, opn.e(list, i, i2), true);
        this.a.p(list, i, i2, false, this.c);
    }

    @Override // defpackage.alvc
    public final void k(acsc acscVar) {
        this.b.p(acscVar);
    }

    @Override // defpackage.alvc
    public final void l() {
        this.a.r();
    }

    @Override // defpackage.alvc
    public final void m(boolean z) {
        this.a.i(z);
    }

    @Override // defpackage.alvc
    public final void n() {
        this.a.d();
    }

    @Override // defpackage.alvc
    public final void o() {
        this.a.u();
    }

    @Override // defpackage.alvc
    public final void p() {
        this.a.v();
    }

    @Override // defpackage.alvc
    public final void q() {
        this.a.w();
    }

    @Override // defpackage.alvc
    public final void r(boolean z) {
        this.a.x(z);
        this.b.t(this.c);
        this.e.b();
        this.f.c();
    }

    @Override // defpackage.alvc
    public final void s(int i) {
        this.a.z(i);
    }

    @Override // defpackage.alvc
    public final void t(int i) {
        this.a.A(i);
    }

    @Override // defpackage.alvc
    public final void u(boolean z) {
        this.a.B(z);
    }

    @Override // defpackage.alvc
    public final void v(boolean z) {
        this.a.C(z);
    }

    @Override // defpackage.alvc
    protected final void w(boolean z) {
        this.a.D(z);
    }

    @Override // defpackage.alvc
    public final void x() {
        this.a.E();
    }

    @Override // defpackage.alvc
    public final void y() {
        this.a.F();
    }

    @Override // defpackage.alvc
    public final boolean z() {
        return this.a.G();
    }
}

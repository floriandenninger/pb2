package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pok implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, bhn, awb, pqb, ppa, plb, pon, pnw, plq {
    public final /* synthetic */ pom a;

    public pok(pom pomVar) {
        this.a = pomVar;
    }

    @Override // defpackage.bhn
    public final void A(String str) {
        this.a.e.A(str);
    }

    @Override // defpackage.bhn
    public final void B(auj aujVar) {
        this.a.e.B(aujVar);
    }

    @Override // defpackage.bhn
    public final void C(auj aujVar) {
        this.a.e.C(aujVar);
    }

    @Override // defpackage.bhn
    public final void D(long j, int i) {
        this.a.e.D(j, i);
    }

    @Override // defpackage.bhn
    public final void E(pms pmsVar, auk aukVar) {
        this.a.e.E(pmsVar, aukVar);
    }

    @Override // defpackage.bhn
    public final void F(aso asoVar) {
        this.a.e.F(asoVar);
        Iterator it = this.a.d.iterator();
        while (it.hasNext()) {
            ((pny) it.next()).F(asoVar);
        }
    }

    @Override // defpackage.awb
    public final /* synthetic */ void V() {
    }

    @Override // defpackage.plq
    public final void a(boolean z) {
        this.a.P();
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void aa() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ac() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ad() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ae(int i) {
    }

    @Override // defpackage.bhn
    public final /* synthetic */ void af() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ah() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ai() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void aj() {
    }

    @Override // defpackage.pnw
    public final void al() {
        this.a.P();
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void am() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void an() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ap(asj asjVar) {
    }

    @Override // defpackage.plq
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.awb
    public final void c(Exception exc) {
        this.a.e.c(exc);
    }

    @Override // defpackage.awb
    public final void d(String str, long j, long j2) {
        this.a.e.d(str, j, j2);
    }

    @Override // defpackage.awb
    public final void e(String str) {
        this.a.e.e(str);
    }

    @Override // defpackage.awb
    public final void f(auj aujVar) {
        this.a.e.f(aujVar);
    }

    @Override // defpackage.awb
    public final void g(auj aujVar) {
        this.a.e.g(aujVar);
    }

    @Override // defpackage.awb
    public final void h(pms pmsVar, auk aukVar) {
        this.a.e.h(pmsVar, aukVar);
    }

    @Override // defpackage.awb
    public final void i(long j) {
        this.a.e.i(j);
    }

    @Override // defpackage.awb
    public final void j(Exception exc) {
        this.a.e.j(exc);
    }

    @Override // defpackage.awb
    public final void k(int i, long j, long j2) {
        this.a.e.k(i, j, j2);
    }

    @Override // defpackage.bhn
    public final void m(int i, long j) {
        this.a.e.m(i, j);
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void o(boolean z) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        pom pomVar = this.a;
        Surface surface = new Surface(surfaceTexture);
        pomVar.M(surface);
        pomVar.i = surface;
        this.a.C(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.M(null);
        this.a.C(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.C(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void p(pnu pnuVar) {
    }

    @Override // defpackage.pnw
    public final void q(int i) {
        this.a.P();
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void r(pns pnsVar) {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void s(boolean z, int i) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.C(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.a.C(0, 0);
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void t(pnz pnzVar, pnz pnzVar2, int i) {
    }

    @Override // defpackage.bhn
    public final void v(Object obj, long j) {
        this.a.e.v(obj, j);
        pom pomVar = this.a;
        if (pomVar.h == obj) {
            Iterator it = pomVar.d.iterator();
            while (it.hasNext()) {
                ((pny) it.next()).u();
            }
        }
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.awb
    public final void x(boolean z) {
        pom pomVar = this.a;
        if (pomVar.m == z) {
            return;
        }
        pomVar.m = z;
        pomVar.e.x(z);
        Iterator it = pomVar.d.iterator();
        while (it.hasNext()) {
            ((pny) it.next()).x(pomVar.m);
        }
    }

    @Override // defpackage.bhn
    public final void y(Exception exc) {
        this.a.e.y(exc);
    }

    @Override // defpackage.bhn
    public final void z(String str, long j, long j2) {
        this.a.e.z(str, j, j2);
    }

    @Override // defpackage.pnw
    public final void n(boolean z) {
        pom pomVar = this.a;
        ptk ptkVar = pomVar.n;
        if (ptkVar != null) {
            if (z) {
                if (pomVar.o) {
                    return;
                }
                ptkVar.a(0);
                this.a.o = true;
                return;
            }
            if (pomVar.o) {
                ptkVar.c(0);
                this.a.o = false;
            }
        }
    }
}

package defpackage;

import android.R;
import android.content.Context;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oas extends fmv implements aioa, ypd {
    public final aioc h;
    public final ayqw i;
    public final ypa j;
    public final aadw k;

    public oas(Context context, aadw aadwVar, aioc aiocVar, ypa ypaVar, fna fnaVar) {
        super(context, fnaVar, new fnc());
        this.k = aadwVar;
        this.h = aiocVar;
        this.j = ypaVar;
        this.i = new ayqw();
        i(ControlsOverlayStyle.a);
        fnaVar.u(0);
        fnaVar.s(true);
    }

    @Override // defpackage.fmv, defpackage.fmf
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        super.i(controlsOverlayStyle);
        ahyg ahygVar = this.b;
        ahygVar.m = false;
        ahygVar.k = false;
        ahygVar.l = false;
        ahygVar.o = false;
        ahygVar.e = R.color.transparent;
        this.a.y(ahygVar);
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().e.Y(new ayrs() { // from class: oar
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                oas.this.u((aheg) obj);
            }
        }, nua.m)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aheg.class};
        }
        if (i == 0) {
            u((aheg) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void u(aheg ahegVar) {
        long e = ahegVar.e();
        long h = ahegVar.h();
        long f = ahegVar.f();
        long a = ahegVar.a();
        k(false);
        j(e, h, f, a);
    }
}

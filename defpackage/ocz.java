package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ocz extends odc {
    public final Rect b;
    public boolean c;
    private final float k;
    private final float l;
    private final int m;
    private int n;

    public ocz(Context context, obp obpVar, obp obpVar2, int i, aaea aaeaVar) {
        super(obpVar, obpVar2);
        float f;
        float f2;
        float f3;
        arfd a = aaeaVar.a();
        aswb aswbVar = a.e;
        if (((aswbVar == null ? aswb.a : aswbVar).g & 512) != 0) {
            aswb aswbVar2 = a.e;
            f = (aswbVar2 == null ? aswb.a : aswbVar2).aI;
        } else {
            f = 1.25f;
        }
        arfd a2 = aaeaVar.a();
        aswb aswbVar3 = a2.e;
        if (((aswbVar3 == null ? aswb.a : aswbVar3).g & 1024) != 0) {
            aswb aswbVar4 = a2.e;
            f2 = (aswbVar4 == null ? aswb.a : aswbVar4).aJ;
        } else {
            f2 = 1.0f;
        }
        arfd a3 = aaeaVar.a();
        aswb aswbVar5 = a3.e;
        if (((aswbVar5 == null ? aswb.a : aswbVar5).g & 2048) != 0) {
            aswb aswbVar6 = a3.e;
            f3 = (aswbVar6 == null ? aswb.a : aswbVar6).aK;
        } else {
            f3 = 1.0f;
        }
        this.k = f3;
        this.n = i;
        this.l = Math.min(f, (f2 * 0.15f) + 1.0f);
        this.b = new Rect();
        this.m = aih.d(context, R.color.yt_black2);
        b();
    }

    @Override // defpackage.ocy, defpackage.obp
    public final ammv I() {
        return ammv.j(Integer.valueOf(this.m));
    }

    @Override // defpackage.odc
    public final void b() {
        int i;
        obp obpVar = this.d;
        obpVar.getClass();
        this.h.set(obpVar.r());
        this.i.set(this.d.u());
        this.g.set(this.d.v());
        this.f.set(this.d.t());
        this.j.set(this.d.s());
        fav.z(this.d.v(), this.l, this.g);
        float f = this.k;
        if (f != 1.0f) {
            this.g.offset(0, this.b.top - ((int) ((((this.l - 1.0f) * this.n) / 2.0f) * f)));
        }
        if (!this.c) {
            i = this.b.top;
        } else {
            int i2 = this.b.top;
            i = i2 + i2;
        }
        this.f.set(this.g);
        this.h.offset(0, i);
        this.i.offset(0, i);
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float l() {
        return 1.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float m() {
        return 0.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float n() {
        return 0.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float p() {
        return 1.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final void z(int i, int i2) {
        this.n = i2;
        b();
    }
}

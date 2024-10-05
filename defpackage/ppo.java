package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ppo {
    public CharSequence a;
    public Bitmap b;
    public Layout.Alignment c;
    public Layout.Alignment d;
    public int e;
    public float f;
    public int g;
    public float h;
    public float i;
    public boolean j;
    public int k;
    public float l;
    private float m;
    private int n;
    private int o;
    private float p;
    private int q;

    public ppo() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.m = -3.4028235E38f;
        this.n = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.e = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.f = -3.4028235E38f;
        this.g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.o = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.p = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = -3.4028235E38f;
        this.j = false;
        this.q = -16777216;
        this.k = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    public ppo(ppp pppVar) {
        this.a = pppVar.c;
        this.b = pppVar.f;
        this.c = pppVar.d;
        this.d = pppVar.e;
        this.m = pppVar.g;
        this.n = pppVar.h;
        this.e = pppVar.i;
        this.f = pppVar.j;
        this.g = pppVar.k;
        this.o = pppVar.p;
        this.p = pppVar.q;
        this.h = pppVar.l;
        this.i = pppVar.m;
        this.j = pppVar.n;
        this.q = pppVar.o;
        this.k = pppVar.r;
        this.l = pppVar.s;
    }

    public final ppp a() {
        return new ppp(this.a, this.c, this.d, this.b, this.m, this.n, this.e, this.f, this.g, this.o, this.p, this.h, this.i, this.j, this.q, this.k, this.l);
    }

    public final void b(float f, int i) {
        this.m = f;
        this.n = i;
    }

    public final void c(float f, int i) {
        this.p = f;
        this.o = i;
    }

    public final void d(int i) {
        this.q = i;
        this.j = true;
    }
}

package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adly implements ypd {
    public static final String a = zga.a("MDX.remote");
    public final azrw b;
    public final adfa c;
    private final shf e;
    public int d = 0;
    private long g = 0;
    private final Handler f = new adlx(this);

    public adly(azrw azrwVar, adfa adfaVar, shf shfVar) {
        this.b = azrwVar;
        this.c = adfaVar;
        this.e = shfVar;
    }

    public final void a(int i) {
        adlm g = ((adlt) this.b.get()).g();
        if (g != null) {
            g.W(i);
            this.g = this.e.d();
        }
    }

    public final void b(int i) {
        if (!e()) {
            zga.c(a, "Remote control is not connected, cannot change volume");
            return;
        }
        this.f.removeMessages(1);
        long d = this.e.d() - this.g;
        if (d >= 200) {
            a(i);
        } else {
            Handler handler = this.f;
            handler.sendMessageDelayed(Message.obtain(handler, 1, i, 0), 200 - d);
        }
    }

    public final void c() {
        adlm g = ((adlt) this.b.get()).g();
        if (this.d == 0 || g == null) {
            return;
        }
        adlm g2 = ((adlt) this.b.get()).g();
        g.Z(Math.min(100, Math.max(0, (g2 == null ? 0 : g2.b()) + this.d)), this.d);
        this.g = this.e.d();
        this.d = 0;
    }

    public final void d(int i) {
        if (!e()) {
            zga.c(a, "Remote control is not connected, cannot change volume");
            return;
        }
        this.f.removeMessages(0);
        this.d += i;
        long d = this.e.d() - this.g;
        if (d >= 200) {
            c();
        } else {
            Handler handler = this.f;
            handler.sendMessageDelayed(Message.obtain(handler, 0), 200 - d);
        }
    }

    public final boolean e() {
        adlm g = ((adlt) this.b.get()).g();
        return g != null && g.a() == 1;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{admg.class};
        }
        if (i == 0) {
            this.d = 0;
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}

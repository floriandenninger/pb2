package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajpt extends xu {
    public final Handler a;
    public final ajpq b;
    public final ajpq c;
    public final ajpq d;
    public final ajpq e;
    public final ajpq f;
    private final List g;
    private final ajpj l;

    public ajpt() {
        this(new ajpj());
    }

    private static ajom y(wv wvVar) {
        if (wvVar instanceof ajor) {
            return ((ajor) wvVar).t;
        }
        return ahbw.q(wvVar.a);
    }

    private final void z(ajpq ajpqVar) {
        ArrayList arrayList = new ArrayList(ajpqVar.a);
        ajpqVar.b.addAll(ajpqVar.a);
        ajpqVar.a.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ajph ajphVar = (ajph) arrayList.get(i);
            if (ajphVar instanceof ajpf) {
                long j = ((ajpf) ajphVar).j();
                if (j > 0) {
                    Handler handler = this.a;
                    handler.sendMessageDelayed(handler.obtainMessage(ajpqVar.d, ajphVar), j);
                }
            }
            ajphVar.b();
        }
    }

    public final void a() {
        if (j()) {
            return;
        }
        m();
    }

    @Override // defpackage.vz
    public final void b(wv wvVar) {
        for (ajpq ajpqVar : this.g) {
            ajpr ajprVar = (ajpr) ajpqVar.c.get(wvVar);
            if (ajprVar != null) {
                ajpqVar.a.remove(ajprVar.a);
                ajpqVar.b.remove(ajprVar.a);
                for (wv wvVar2 : ajprVar.b) {
                    ajpqVar.c.remove(wvVar2);
                }
                this.a.removeMessages(ajpqVar.d, ajprVar.a);
                if (!ajprVar.c) {
                    ajprVar.c = true;
                    ajprVar.a.a();
                }
            }
        }
    }

    @Override // defpackage.vz
    public final void c() {
        for (ajpq ajpqVar : this.g) {
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.addAll(ajpqVar.a);
            arrayDeque.addAll(ajpqVar.b);
            ajpqVar.a.clear();
            ajpqVar.b.clear();
            ajpqVar.c.clear();
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((ajph) it.next()).a();
            }
            this.a.removeMessages(ajpqVar.d);
        }
    }

    @Override // defpackage.vz
    public final void d() {
        z(this.c);
        z(this.e);
        if (k(this.c) || k(this.e)) {
            return;
        }
        z(this.d);
        if (k(this.d)) {
            return;
        }
        z(this.b);
        z(this.f);
    }

    @Override // defpackage.xu
    public final boolean e(final wv wvVar) {
        ajom y;
        Long l;
        final ajqg ajqgVar = (ajqg) ajpj.a(this.l.a, wvVar);
        if (ajqgVar == null || (y = y(wvVar)) == null) {
            l(wvVar);
            return false;
        }
        ajpz ajpzVar = new ajpz();
        ajpzVar.a = y;
        ajpzVar.b = Long.valueOf(this.h);
        ajpzVar.c = new ajfg(5);
        ajpzVar.d = new Runnable() { // from class: ajpl
            @Override // java.lang.Runnable
            public final void run() {
                ajpt ajptVar = ajpt.this;
                ajqg ajqgVar2 = ajqgVar;
                wv wvVar2 = wvVar;
                ajptVar.b.a.remove(ajqgVar2);
                ajptVar.b.b.remove(ajqgVar2);
                ajptVar.b.c.remove(wvVar2);
                ajptVar.l(wvVar2);
                ajptVar.a();
            }
        };
        ajom ajomVar = ajpzVar.a;
        if (ajomVar == null || (l = ajpzVar.b) == null || ajpzVar.c == null || ajpzVar.d == null) {
            StringBuilder sb = new StringBuilder();
            if (ajpzVar.a == null) {
                sb.append(" presenter");
            }
            if (ajpzVar.b == null) {
                sb.append(" duration");
            }
            if (ajpzVar.c == null) {
                sb.append(" onStart");
            }
            if (ajpzVar.d == null) {
                sb.append(" onEnd");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        ajqgVar.a = new ajpg(ajomVar, l.longValue(), ajpzVar.c, ajpzVar.d);
        ajqgVar.a.a.a().setAlpha(0.0f);
        b(wvVar);
        this.b.a.add(ajqgVar);
        this.b.c.put(wvVar, new ajpr(ajqgVar, wvVar));
        return true;
    }

    @Override // defpackage.xu
    public final boolean f(final wv wvVar, final wv wvVar2, int i, int i2, int i3, int i4) {
        ajpq ajpqVar;
        final int i5 = 0;
        if (wvVar == wvVar2) {
            l(wvVar);
            return false;
        }
        ajpj ajpjVar = this.l;
        Class b = ajpj.b(wvVar);
        Class b2 = ajpj.b(wvVar2);
        ajqe ajqeVar = null;
        if (b != null && b2 != null) {
            ajqeVar = (ajqe) ajpjVar.d.a(new hx(b, b2));
        }
        ajqe ajqeVar2 = ajqeVar;
        if (ajqeVar2 != null) {
            ajom y = y(wvVar);
            ajom y2 = y(wvVar2);
            if (y != null && y2 != null) {
                if (wvVar.a.getWidth() > wvVar2.a.getWidth() || wvVar.a.getHeight() > wvVar2.a.getHeight()) {
                    ajpqVar = this.f;
                } else {
                    ajpqVar = this.e;
                }
                ajpq ajpqVar2 = ajpqVar;
                final ajps ajpsVar = new ajps(this, wvVar, wvVar2, ajqeVar2, ajpqVar2);
                ajqc a = ajqd.a();
                a.j(y);
                a.g(y2);
                a.b(250L);
                a.i(new ajfg(3));
                final int i6 = 1;
                a.h(new Runnable() { // from class: ajpo
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (i6 != 0) {
                            ajpsVar.a(wvVar);
                        } else {
                            ajpsVar.a(wvVar);
                        }
                    }
                });
                a.f(new ajfg(4));
                a.e(new Runnable() { // from class: ajpo
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (i5 != 0) {
                            ajpsVar.a(wvVar2);
                        } else {
                            ajpsVar.a(wvVar2);
                        }
                    }
                });
                a.c(i);
                a.d(i2);
                a.k(i3);
                a.l(i4);
                if (ajqeVar2.d(a.a())) {
                    b(wvVar);
                    b(wvVar2);
                    ajpqVar2.a.add(ajqeVar2);
                    ajpr ajprVar = new ajpr(ajqeVar2, wvVar, wvVar2);
                    ajpqVar2.c.put(wvVar, ajprVar);
                    ajpqVar2.c.put(wvVar2, ajprVar);
                    return true;
                }
            }
        }
        l(wvVar);
        l(wvVar2);
        return false;
    }

    @Override // defpackage.xu
    public final boolean g(final wv wvVar, int i, int i2, int i3, int i4) {
        ajom y;
        ajpr ajprVar = (ajpr) this.d.c.get(wvVar);
        if (ajprVar != null) {
            ajpy ajpyVar = (ajpy) ajprVar.a;
            ajpu ajpuVar = new ajpu();
            ajpuVar.a = Long.valueOf(this.i);
            ajpuVar.b = Integer.valueOf(i);
            ajpuVar.c = Integer.valueOf(i2);
            ajpuVar.d = Integer.valueOf(i3);
            ajpuVar.e = Integer.valueOf(i4);
            Long l = ajpuVar.a;
            if (l == null || ajpuVar.b == null || ajpuVar.c == null || ajpuVar.d == null || ajpuVar.e == null) {
                StringBuilder sb = new StringBuilder();
                if (ajpuVar.a == null) {
                    sb.append(" duration");
                }
                if (ajpuVar.b == null) {
                    sb.append(" fromX");
                }
                if (ajpuVar.c == null) {
                    sb.append(" fromY");
                }
                if (ajpuVar.d == null) {
                    sb.append(" toX");
                }
                if (ajpuVar.e == null) {
                    sb.append(" toY");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            if (ajpyVar.f(new ajpv(l.longValue(), ajpuVar.b.intValue(), ajpuVar.c.intValue(), ajpuVar.d.intValue(), ajpuVar.e.intValue()))) {
                l(wvVar);
                if (!this.d.a.contains(ajpyVar)) {
                    this.d.a.add(ajpyVar);
                }
                this.d.b.remove(ajpyVar);
                return true;
            }
        }
        final ajpy ajpyVar2 = (ajpy) ajpj.a(this.l.c, wvVar);
        if (ajpyVar2 != null && (y = y(wvVar)) != null) {
            ajpw a = ajpx.a();
            a.g(y);
            a.b(this.i);
            a.f(new ajfg(6));
            a.e(new Runnable() { // from class: ajpm
                @Override // java.lang.Runnable
                public final void run() {
                    ajpt ajptVar = ajpt.this;
                    ajpy ajpyVar3 = ajpyVar2;
                    wv wvVar2 = wvVar;
                    ajptVar.d.a.remove(ajpyVar3);
                    ajptVar.d.b.remove(ajpyVar3);
                    ajptVar.d.c.remove(wvVar2);
                    ajptVar.l(wvVar2);
                    ajptVar.a();
                }
            });
            a.c(i);
            a.d(i2);
            a.h(i3);
            a.i(i4);
            if (ajpyVar2.e(a.a())) {
                b(wvVar);
                this.d.a.add(ajpyVar2);
                this.d.c.put(wvVar, new ajpr(ajpyVar2, wvVar));
                return true;
            }
        }
        l(wvVar);
        return false;
    }

    @Override // defpackage.xu
    public final boolean h(final wv wvVar) {
        ajom y;
        final ajqb ajqbVar = (ajqb) ajpj.a(this.l.b, wvVar);
        if (ajqbVar == null || (y = y(wvVar)) == null) {
            l(wvVar);
            return false;
        }
        ajpz a = ajqa.a();
        a.e(y);
        a.b(120L);
        a.d(new ajfg(7));
        a.c(new Runnable() { // from class: ajpn
            @Override // java.lang.Runnable
            public final void run() {
                ajpt ajptVar = ajpt.this;
                ajqb ajqbVar2 = ajqbVar;
                wv wvVar2 = wvVar;
                ajptVar.c.a.remove(ajqbVar2);
                ajptVar.c.b.remove(ajqbVar2);
                ajptVar.c.c.remove(wvVar2);
                ajptVar.l(wvVar2);
                ajptVar.a();
            }
        });
        ajqbVar.e(a.a());
        b(wvVar);
        this.c.a.add(ajqbVar);
        this.c.c.put(wvVar, new ajpr(ajqbVar, wvVar));
        return true;
    }

    @Override // defpackage.vz
    public final boolean j() {
        return amkq.bm(this.g, wgw.u);
    }

    public final boolean k(ajpq ajpqVar) {
        return this.a.hasMessages(ajpqVar.d);
    }

    @Override // defpackage.vz
    public final void n(wv wvVar) {
        for (ajpq ajpqVar : this.g) {
            ajpr ajprVar = (ajpr) ajpqVar.c.get(wvVar);
            if (ajprVar != null && this.a.hasMessages(ajpqVar.d, ajprVar.a)) {
                this.a.removeMessages(ajpqVar.d, ajprVar.a);
                if (!k(ajpqVar)) {
                    this.a.post(new ajpp(this));
                }
            }
        }
    }

    public ajpt(ajpj ajpjVar) {
        this.a = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: ajpk
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                ajpq ajpqVar;
                ajpt ajptVar = ajpt.this;
                int i = message.what;
                if (i == 1) {
                    ajpqVar = ajptVar.b;
                } else if (i == 2) {
                    ajpqVar = ajptVar.c;
                } else if (i == 3) {
                    ajpqVar = ajptVar.d;
                } else if (i == 4) {
                    ajpqVar = ajptVar.e;
                } else {
                    if (i != 5) {
                        return false;
                    }
                    ajpqVar = ajptVar.f;
                }
                if (ajptVar.k(ajpqVar)) {
                    return true;
                }
                ajptVar.a.post(new ajpp(ajptVar));
                return true;
            }
        });
        ajpq ajpqVar = new ajpq(1);
        this.b = ajpqVar;
        ajpq ajpqVar2 = new ajpq(2);
        this.c = ajpqVar2;
        ajpq ajpqVar3 = new ajpq(3);
        this.d = ajpqVar3;
        ajpq ajpqVar4 = new ajpq(4);
        this.e = ajpqVar4;
        ajpq ajpqVar5 = new ajpq(5);
        this.f = ajpqVar5;
        this.g = Arrays.asList(ajpqVar, ajpqVar2, ajpqVar3, ajpqVar4, ajpqVar5);
        ajpjVar.getClass();
        this.l = ajpjVar;
    }
}

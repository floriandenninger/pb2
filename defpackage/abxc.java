package defpackage;

import android.media.MediaFormat;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abxc {
    private static final SparseArray n = new akah(null);
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    private final abxb o;
    private final Handler p;
    private boolean r;
    private boolean s;
    private int q = 0;
    public int a = 1;

    public abxc(Handler handler, abxb abxbVar) {
        this.o = abxbVar;
        this.p = new abxa(this, handler.getLooper());
    }

    public final int a(int i) {
        if (i == 12 || i == 11 || i == 10) {
            return 10;
        }
        if (i == 4 || i == 7 || i == 9 || i == 8 || i == 6) {
            return 5;
        }
        if (i == 2) {
            return 1;
        }
        return i;
    }

    public final void b() {
        this.j = false;
        h();
    }

    public final void c(int i) {
        int i2 = this.a;
        amkq.N(i2 == 4 || i2 == 7 || i2 == 9 || i2 == 6 || i2 == 8);
        int i3 = this.a;
        if (i3 == 4 || i3 == 6 || i3 == 8) {
            this.i = false;
        }
        this.f = true;
        this.q = i;
        h();
    }

    public final void d() {
        this.r = true;
        int i = this.a;
        if (i == 6) {
            f(6);
            return;
        }
        if (i == 7) {
            f(7);
            return;
        }
        if (i == 8 || i == 9 || i == 5) {
            h();
            return;
        }
        if (this.f) {
            zga.l("LiveSC: Stream was cancelled by user before it went live.");
        } else {
            if (i == 14) {
                zga.b("LiveSC: Stream went into Error state before it went live.");
                return;
            }
            StringBuilder sb = new StringBuilder(22);
            sb.append("State was: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void e(int i) {
        Handler handler = this.p;
        handler.sendMessage(Message.obtain(handler, 1002, i, 0));
    }

    public final void f(int i) {
        Handler handler = this.p;
        handler.sendMessage(Message.obtain(handler, 1003, i, 0));
    }

    public final void g(int i) {
        Handler handler = this.p;
        handler.sendMessage(Message.obtain(handler, 1001, i, 0));
    }

    public final void h() {
        this.p.sendEmptyMessage(1000);
    }

    public final void i(boolean z) {
        int a = a(this.a);
        this.a = a;
        this.r = false;
        this.s = z;
        g(a);
    }

    public final void j(int i, boolean z, boolean z2, boolean z3) {
        MediaFormat mediaFormat;
        String sb;
        yjk.f();
        SparseArray sparseArray = n;
        String valueOf = String.valueOf((String) sparseArray.get(this.a, "UNKNOWN"));
        if (valueOf.length() != 0) {
            "update - Current state: ".concat(valueOf);
        }
        if (z && !z3 && this.a == i) {
            String str = (String) sparseArray.get(i);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32);
            sb2.append("Entering ");
            sb2.append(str);
            sb2.append(" state already occurred");
            zga.l(sb2.toString());
            return;
        }
        if (z) {
            String valueOf2 = String.valueOf((String) sparseArray.get(i, "UNKNOWN"));
            if (valueOf2.length() != 0) {
                "update - Entering state: ".concat(valueOf2);
            }
        }
        if (!z2 || this.a == i) {
            if (z2) {
                String valueOf3 = String.valueOf((String) sparseArray.get(i, "UNKNOWN"));
                if (valueOf3.length() != 0) {
                    "update - Exiting state: ".concat(valueOf3);
                }
            }
            this.a = i;
            switch (i) {
                case 1:
                    if (this.l) {
                        this.b = 2;
                        e(5);
                        return;
                    }
                    if (z) {
                        this.b = 1;
                        this.o.q(false);
                    }
                    if (this.k) {
                        return;
                    }
                    if (this.s) {
                        e(4);
                        return;
                    } else {
                        e(2);
                        return;
                    }
                case 2:
                    if (z) {
                        this.g = false;
                        abwy abwyVar = (abwy) this.o;
                        if (abwyVar.d.d()) {
                            if ((!abwyVar.p || abwyVar.W.l()) && !abwyVar.x()) {
                                return;
                            }
                            if (abwyVar.p) {
                                mediaFormat = null;
                            } else {
                                mediaFormat = abwyVar.l.g(abwyVar.K, abwyVar.z);
                                mediaFormat.getClass();
                            }
                            abwyVar.E = null;
                            abwyVar.D = null;
                            String str2 = abwyVar.x;
                            if (abwyVar.p) {
                                sb = "WebRTC";
                            } else {
                                String valueOf4 = String.valueOf(mediaFormat);
                                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 5);
                                sb3.append("RTMP:");
                                sb3.append(valueOf4);
                                sb = sb3.toString();
                            }
                            String.valueOf(str2).length();
                            String.valueOf(sb).length();
                            abya abyaVar = abwyVar.k;
                            String str3 = abwyVar.x;
                            boolean z4 = abwyVar.p;
                            abyaVar.m(str3, z4, abwyVar.z, true == z4 ? null : mediaFormat, new abwl(abwyVar));
                            return;
                        }
                        return;
                    }
                    if (this.g) {
                        e(3);
                        return;
                    } else {
                        if (z2) {
                            e(4);
                            return;
                        }
                        return;
                    }
                case 3:
                    if (z) {
                        abxb abxbVar = this.o;
                        int i2 = this.d;
                        StringBuilder sb4 = new StringBuilder(37);
                        sb4.append("Create ingestion failure: ");
                        sb4.append(i2);
                        zga.b(sb4.toString());
                        abwy abwyVar2 = (abwy) abxbVar;
                        if (abwyVar2.d.d()) {
                            abwyVar2.c.q(i2);
                            return;
                        }
                        return;
                    }
                    return;
                case 4:
                    if (!z) {
                        if (this.f) {
                            e(10);
                            return;
                        } else {
                            if (this.j) {
                                return;
                            }
                            e(6);
                            return;
                        }
                    }
                    this.j = true;
                    abwy abwyVar3 = (abwy) this.o;
                    if (abwyVar3.d.d()) {
                        if (abwyVar3.p) {
                            abwyVar3.i.b();
                            return;
                        } else {
                            abwyVar3.e(5);
                            return;
                        }
                    }
                    return;
                case 5:
                    if (z) {
                        this.o.q(this.b == 2);
                    }
                    if (this.k) {
                        return;
                    }
                    if (this.j) {
                        e(4);
                        return;
                    } else {
                        e(6);
                        return;
                    }
                case 6:
                    if (z) {
                        abwy abwyVar4 = (abwy) this.o;
                        if (abwyVar4.d.d()) {
                            abwyVar4.j(5, abwyVar4.n, abwyVar4.o, abwyVar4.q);
                            return;
                        }
                        return;
                    }
                    if (!z2) {
                        if (this.f) {
                            e(10);
                            return;
                        }
                        return;
                    } else if (this.m || (this.r && !this.l)) {
                        e(9);
                        return;
                    } else if (this.s) {
                        e(7);
                        return;
                    } else {
                        e(8);
                        return;
                    }
                case 7:
                    if (z) {
                        return;
                    }
                    if (this.r) {
                        e(9);
                        return;
                    } else {
                        if (this.f) {
                            e(10);
                            return;
                        }
                        return;
                    }
                case 8:
                    if (z) {
                        abwy abwyVar5 = (abwy) this.o;
                        if (abwyVar5.d.d()) {
                            abwyVar5.k(20);
                            return;
                        }
                        return;
                    }
                    if (this.r) {
                        e(9);
                        return;
                    } else {
                        if (this.f) {
                            e(10);
                            return;
                        }
                        return;
                    }
                case 9:
                    if (!z) {
                        if (this.f) {
                            e(10);
                            return;
                        }
                        return;
                    }
                    this.b = 2;
                    abwy abwyVar6 = (abwy) this.o;
                    if (abwyVar6.d.d() && abwyVar6.S) {
                        abwyVar6.L = true;
                        abwyVar6.c.w();
                        return;
                    }
                    return;
                case 10:
                    if (!z) {
                        if (this.e) {
                            e(11);
                            return;
                        }
                        return;
                    }
                    abwy abwyVar7 = (abwy) this.o;
                    if (abwyVar7.d.d()) {
                        abwyVar7.c.v();
                    }
                    if (!this.r) {
                        if (!this.s || this.e) {
                            e(12);
                            return;
                        } else {
                            this.o.r();
                            return;
                        }
                    }
                    if ((!this.s && !this.h) || this.e) {
                        e(11);
                        return;
                    } else {
                        this.o.r();
                        return;
                    }
                case 11:
                    if (z) {
                        Handler handler = this.p;
                        handler.sendMessageDelayed(Message.obtain(handler, 1003, 11, 0), 3000L);
                        return;
                    } else {
                        if (z2) {
                            e(12);
                            return;
                        }
                        return;
                    }
                case 12:
                    if (!z) {
                        if (z2) {
                            e(13);
                            return;
                        }
                        return;
                    } else {
                        abwy abwyVar8 = (abwy) this.o;
                        if (abwyVar8.d.d()) {
                            abwyVar8.t();
                            abwyVar8.b(true);
                            return;
                        }
                        return;
                    }
                case 13:
                    if (z) {
                        abxb abxbVar2 = this.o;
                        int i3 = this.q;
                        abwy abwyVar9 = (abwy) abxbVar2;
                        if (abwyVar9.d.d()) {
                            abwyVar9.c.u(i3, abwyVar9.V, abwyVar9.G, abwyVar9.F, abwyVar9.L);
                            return;
                        }
                        return;
                    }
                    return;
                case 14:
                    if (!z) {
                        if (z2) {
                            e(this.c);
                            return;
                        }
                        return;
                    } else {
                        abwy abwyVar10 = (abwy) this.o;
                        if (abwyVar10.d.d()) {
                            abwyVar10.u(true, false);
                            abwyVar10.c.A(new abwl(abwyVar10, null));
                            return;
                        }
                        return;
                    }
                default:
                    return;
            }
        }
        zga.l("Exiting current state already occurred");
    }

    public final boolean k() {
        int i = this.a;
        return i == 4 || i == 2 || i == 1 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9;
    }

    public final boolean l() {
        return this.a == 9;
    }

    public final void m() {
        int i = this.a;
        if (i == 14) {
            return;
        }
        this.c = a(i);
        e(14);
    }
}

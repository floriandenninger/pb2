package defpackage;

import android.animation.AnimatorSet;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hwq implements View.OnTouchListener, zqj, hxf {
    public final ajut a;
    public final hvq b;
    public final iam c;
    public final ida d;
    public View e;
    public ImageView f;
    public View g;
    public View h;
    public ce i;
    public AnimatorSet j;
    public hwo k;
    public zry l;
    public zoe m;
    public hwp n;
    public acra p;
    public final axze q;
    private final Handler r;
    private final iax s;
    private Runnable u;
    public boolean o = false;
    private boolean t = false;

    public hwq(axze axzeVar, ajut ajutVar, Handler handler, iam iamVar, ida idaVar, iax iaxVar, hvq hvqVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.q = axzeVar;
        this.a = ajutVar;
        this.r = handler;
        this.c = iamVar;
        this.d = idaVar;
        this.s = iaxVar;
        this.b = hvqVar;
    }

    @Override // defpackage.hxf
    public final View a() {
        return this.e;
    }

    @Override // defpackage.hxf
    public final void b() {
    }

    @Override // defpackage.hxf
    public final void c() {
    }

    @Override // defpackage.zqj
    public final void d(final axcg axcgVar) {
        final icp icpVar;
        axbp axbpVar;
        this.s.a();
        final iam iamVar = this.c;
        axdi i = axcgVar.c().i();
        int i2 = i.c;
        if (i2 == 1) {
            if (!iamVar.i) {
                return;
            }
            icpVar = iamVar.b;
            axbpVar = ((axdy) i.d).g;
            if (axbpVar == null) {
                axbpVar = axbp.a;
            }
        } else if (i2 == 3) {
            icpVar = iamVar.c;
            axbpVar = ((axcy) i.d).c;
            if (axbpVar == null) {
                axbpVar = axbp.a;
            }
        } else if (i2 == 6) {
            icpVar = iamVar.e;
            axbpVar = ((axbr) i.d).c;
            if (axbpVar == null) {
                axbpVar = axbp.a;
            }
        } else if (i2 == 7) {
            icpVar = iamVar.d;
            axbpVar = ((axed) i.d).c;
            if (axbpVar == null) {
                axbpVar = axbp.a;
            }
        } else if (i2 == 2) {
            icpVar = iamVar.f;
            axbpVar = null;
        } else if (i2 == 4) {
            icpVar = iamVar.g;
            axbpVar = ((axbv) i.d).c;
            if (axbpVar == null) {
                axbpVar = axbp.a;
            }
        } else {
            if (i2 != 12) {
                return;
            }
            icpVar = iamVar.h;
            axbpVar = ((axbz) i.d).c;
            if (axbpVar == null) {
                axbpVar = axbp.a;
            }
        }
        iamVar.a.post(new Runnable() { // from class: iaj
            @Override // java.lang.Runnable
            public final void run() {
                iam iamVar2 = iam.this;
                icp icpVar2 = icpVar;
                axcg axcgVar2 = axcgVar;
                if (etx.S(iamVar2.j)) {
                    icpVar2.a(axcgVar2);
                }
            }
        });
        if (axbpVar != null) {
            if ((axbpVar.b == 1 ? (String) axbpVar.c : "").isEmpty()) {
                return;
            }
            iamVar.b(axbpVar.b == 1 ? (String) axbpVar.c : "");
        }
    }

    @Override // defpackage.zqj
    public final void e(axdb axdbVar) {
    }

    @Override // defpackage.zqj
    public final void f(final axdk axdkVar) {
        final icp icpVar;
        axbp axbpVar;
        this.s.a();
        final iam iamVar = this.c;
        axdi i = axdkVar.i();
        int i2 = i.c;
        if (i2 == 1) {
            if (!iamVar.i) {
                return;
            }
            icpVar = iamVar.b;
            axbpVar = ((axdy) i.d).g;
            if (axbpVar == null) {
                axbpVar = axbp.a;
            }
        } else if (i2 == 3) {
            icpVar = iamVar.c;
            axbpVar = ((axcy) i.d).c;
            if (axbpVar == null) {
                axbpVar = axbp.a;
            }
        } else if (i2 == 6) {
            icpVar = iamVar.e;
            axbpVar = ((axbr) i.d).c;
            if (axbpVar == null) {
                axbpVar = axbp.a;
            }
        } else if (i2 == 7) {
            icpVar = iamVar.d;
            axbpVar = ((axed) i.d).c;
            if (axbpVar == null) {
                axbpVar = axbp.a;
            }
        } else if (i2 == 2) {
            icpVar = iamVar.f;
            axbpVar = null;
        } else if (i2 == 4) {
            icpVar = iamVar.g;
            axbpVar = ((axbv) i.d).c;
            if (axbpVar == null) {
                axbpVar = axbp.a;
            }
        } else {
            if (i2 != 12) {
                return;
            }
            icpVar = iamVar.h;
            axbpVar = ((axbz) i.d).c;
            if (axbpVar == null) {
                axbpVar = axbp.a;
            }
        }
        iamVar.a.post(new Runnable() { // from class: iak
            @Override // java.lang.Runnable
            public final void run() {
                iam iamVar2 = iam.this;
                icp icpVar2 = icpVar;
                axdk axdkVar2 = axdkVar;
                if (etx.S(iamVar2.j)) {
                    icpVar2.my(axdkVar2);
                }
            }
        });
        if (axbpVar != null) {
            if ((axbpVar.b == 1 ? (String) axbpVar.c : "").isEmpty()) {
                return;
            }
            iamVar.b(axbpVar.b == 1 ? (String) axbpVar.c : "");
        }
    }

    @Override // defpackage.zqj
    public final void g(boolean z) {
        if (this.t == z) {
            return;
        }
        this.t = z;
        this.f.post(new hwm(this, z, 1));
    }

    @Override // defpackage.zqj
    public final void h(final boolean z, final boolean z2) {
        if (z) {
            this.s.a();
            this.n.a = true;
        }
        this.f.post(new Runnable() { // from class: hwn
            @Override // java.lang.Runnable
            public final void run() {
                hwq hwqVar = hwq.this;
                boolean z3 = z;
                boolean z4 = z2;
                if (etx.S(hwqVar.i)) {
                    hwo hwoVar = hwqVar.k;
                    if (z3) {
                        ((hvc) hwoVar).aZ();
                    } else {
                        ((hvc) hwoVar).bf();
                    }
                    if (hwqVar.o != z4) {
                        hwqVar.o = z4;
                        hwqVar.j = gfw.x(hwqVar, z4, hwqVar.j);
                    }
                }
            }
        });
    }

    @Override // defpackage.zqj
    public final void m(boolean z) {
        Runnable runnable = this.u;
        if (runnable != null) {
            this.r.removeCallbacks(runnable);
        }
        hwm hwmVar = new hwm(this, z, 0);
        this.u = hwmVar;
        this.r.postDelayed(hwmVar, 300L);
    }

    @Override // defpackage.zqj
    public final void n(boolean z) {
        this.r.post(new hwm(this, z, 2));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        avxn avxnVar = this.q.a.a().s;
        if (avxnVar == null) {
            avxnVar = avxn.a;
        }
        if (avxnVar.f) {
            this.m.onTouch(view, motionEvent);
        }
        zrx r = this.l.r();
        if (r == null || !this.k.bp()) {
            return view.onTouchEvent(motionEvent);
        }
        r.a.a(view, motionEvent, this.e, false);
        return true;
    }
}

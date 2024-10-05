package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahbh {
    public final Context a;
    public final azrw b;
    public final aifs c;
    public final aimb d;
    public final aifk e;
    public zih f;
    public final azrw g;
    public final aaea h;
    public final ahbg i;
    public final axpg j;
    public boolean k;
    public boolean l;
    public int m;
    public aint n;
    public final ahbg o;
    private final azrw p;
    private final aipd q;
    private final ServiceConnection r = new ahbf(this);
    private final ajbh s;

    public ahbh(Context context, azrw azrwVar, aifs aifsVar, azrw azrwVar2, azrw azrwVar3, aimb aimbVar, ajbh ajbhVar, aipd aipdVar, aaea aaeaVar, axpg axpgVar, aifk aifkVar, byte[] bArr) {
        context.getClass();
        this.a = context;
        azrwVar.getClass();
        this.b = azrwVar;
        aifsVar.getClass();
        this.c = aifsVar;
        this.p = azrwVar2;
        this.g = azrwVar3;
        aimbVar.getClass();
        this.d = aimbVar;
        this.q = aipdVar;
        this.h = aaeaVar;
        this.s = ajbhVar;
        this.j = axpgVar;
        this.e = aifkVar;
        this.i = new ahbg(this);
        this.o = new ahbg(this);
        this.m = 1;
        this.k = false;
    }

    private final PlayerResponseModel j() {
        aiwk aiwkVar = this.q.a;
        zih zihVar = this.f;
        if (zihVar == null || zihVar.a() == null || aiwkVar == null) {
            return null;
        }
        return aiwkVar.o();
    }

    private final void k() {
        if (this.d.c()) {
            ((aiki) this.j.get()).b(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, aimk] */
    private final void l() {
        this.m = 2;
        this.c.m(true);
        this.c.k();
        ?? a = this.f.a();
        if (a != 0) {
            a.c(true);
        }
    }

    private final boolean m() {
        return h() && this.c.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x005a, code lost:
    
        if (r0.af() == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce A[Catch: all -> 0x00e9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:8:0x00a9, B:9:0x00af, B:17:0x00ba, B:20:0x00c1, B:23:0x00ce, B:26:0x0016, B:28:0x001e, B:31:0x005c, B:33:0x0064, B:35:0x006c, B:37:0x007a, B:38:0x0080, B:43:0x009d, B:44:0x008e, B:47:0x0095, B:48:0x00a3, B:49:0x003a, B:52:0x0056, B:55:0x00dc, B:56:0x00e2), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.ahbq a() {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahbh.a():ahbq");
    }

    public final void b() {
        this.m = 1;
        k();
        aint aintVar = this.n;
        if (aintVar != null) {
            if (aintVar.b) {
                aintVar.c.t(aintVar.a);
            }
            aintVar.c.k = null;
        }
    }

    public final void c() {
        if (m()) {
            e();
            ((aiki) this.j.get()).h();
        }
    }

    public final synchronized void d(PlayerResponseModel playerResponseModel) {
        if (this.c.m) {
            return;
        }
        boolean c = ahbn.c(playerResponseModel);
        if (this.m == 3) {
            if (!c) {
                b();
            } else {
                l();
                return;
            }
        } else if (c) {
            return;
        }
        k();
    }

    public final void e() {
        if (!this.k) {
            this.a.bindService((Intent) this.b.get(), this.r, 1);
            this.k = true;
        } else if (Build.VERSION.SDK_INT >= 26 && m() && this.l && this.c.j) {
            this.a.startForegroundService((Intent) this.b.get());
            ((aiki) this.j.get()).i(true);
        }
    }

    public final void f() {
        if (this.m == 3) {
            zga.l("About to stop background service while in a pending state.");
        }
        this.m = 1;
        k();
        g();
        this.c.l();
        this.l = false;
    }

    public final void g() {
        if (this.k) {
            this.a.stopService((Intent) this.b.get());
            this.a.unbindService(this.r);
            this.k = false;
        }
    }

    public final boolean h() {
        return this.d.c() && ahbn.c(j());
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, aimk] */
    public final synchronized void i(afkl afklVar, aifp aifpVar) {
        this.c.n(aifpVar);
        aifs aifsVar = this.c;
        aifsVar.j = false;
        this.m = 1;
        aifsVar.m(false);
        aifsVar.f = afklVar;
        if (!aifsVar.l) {
            aifsVar.b.b.c(new aiev(afklVar));
        }
        ?? a = this.f.a();
        if (a != 0) {
            a.c(false);
        }
        k();
    }
}

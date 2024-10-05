package defpackage;

import android.content.Context;
import android.os.Handler;
import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeha {
    public final Handler a;
    public final ysy b;
    private final Context d;
    private final shf e;
    private final afhs g;
    private long f = 0;
    public boolean c = false;

    public aeha(Context context, shf shfVar, afhs afhsVar, Handler handler, ysy ysyVar) {
        this.d = context;
        this.e = shfVar;
        this.g = afhsVar;
        this.a = handler;
        this.b = ysyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zfi a(final ayrn ayrnVar) {
        return new zfi() { // from class: aegu
            @Override // defpackage.zfi
            public final void a(Object obj) {
                ayrn ayrnVar2 = ayrn.this;
                String str = (String) obj;
                try {
                    if (str == null) {
                        afic aficVar = afic.ABR;
                    } else if (str.equals("5g")) {
                        ayrnVar2.a("cat", new aeqs("5g"));
                    } else {
                        ayrnVar2.a("connt", new aeqs(str));
                    }
                } catch (Exception unused) {
                    afic aficVar2 = afic.ABR;
                }
            }
        };
    }

    public final void b(final aeru aeruVar) {
        try {
            if (this.g.l() > 0 && !this.b.r()) {
                if (this.f <= 0 || this.e.c() - this.f >= this.g.l()) {
                    this.f = this.e.c();
                    this.a.postDelayed(new Runnable() { // from class: aegx
                        @Override // java.lang.Runnable
                        public final void run() {
                            aeha aehaVar = aeha.this;
                            final aeru aeruVar2 = aeruVar;
                            aeruVar2.getClass();
                            aehaVar.c(aeha.a(new ayrn() { // from class: aegv
                                @Override // defpackage.ayrn
                                public final void a(Object obj, Object obj2) {
                                    aeru.this.i((String) obj, (aeqs) obj2);
                                }
                            }));
                        }
                    }, this.g.p().Q);
                }
            }
        } catch (RuntimeException unused) {
            afic aficVar = afic.ABR;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(zfi zfiVar) {
        boolean z;
        TelephonyManager telephonyManager = (TelephonyManager) this.d.getSystemService("phone");
        if (telephonyManager == null) {
            return;
        }
        synchronized (this) {
            if (this.c) {
                z = false;
            } else {
                this.c = true;
                z = true;
            }
        }
        if (z) {
            telephonyManager.listen(new aegz(this, telephonyManager, zfiVar), 1);
        }
    }
}

package defpackage;

import android.net.NetworkInfo;
import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aenj implements aenf {
    public final aaoz a;
    private final azrw c;
    private final ysy d;
    private String h;
    private String i;
    private boolean j;
    private final Map e = new HashMap();
    public final Set b = new HashSet();
    private final att f = new aeni(this);
    private final aenh g = new aenh();

    public aenj(azrw azrwVar, ysy ysyVar, aaoz aaozVar) {
        this.c = azrwVar;
        this.d = ysyVar;
        this.a = aaozVar;
    }

    private final aenl q(PlayerConfigModel playerConfigModel) {
        int bL;
        String r;
        apdl apdlVar = playerConfigModel.c.j;
        if (apdlVar == null) {
            apdlVar = apdl.a;
        }
        int bL2 = amkq.bL(apdlVar.e);
        if (bL2 == 0 || bL2 == 1) {
            bL = 2;
        } else {
            apdl apdlVar2 = playerConfigModel.c.j;
            if (apdlVar2 == null) {
                apdlVar2 = apdl.a;
            }
            bL = amkq.bL(apdlVar2.e);
            if (bL == 0) {
                bL = 1;
            }
        }
        int i = bL - 1;
        if (i == 2) {
            r = r(1);
        } else if (i != 3) {
            r = i != 4 ? "" : r(3);
        } else {
            r = r(2);
        }
        if (!r.equals(this.h)) {
            this.i = this.h;
            this.h = r;
            this.j = true;
        }
        aenl aenlVar = (aenl) this.e.get(this.h);
        if (aenlVar != null) {
            return aenlVar;
        }
        this.j = true;
        aenl aenlVar2 = (aenl) this.c.get();
        this.e.put(this.h, aenlVar2);
        return aenlVar2;
    }

    private final String r(int i) {
        String[] s = this.d.s();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < Math.min(i, 3); i2++) {
            sb.append(s[i2]);
        }
        return sb.toString();
    }

    @Override // defpackage.att
    public final synchronized void a(ate ateVar, ath athVar, boolean z, int i) {
        try {
            aenl q = q(this.a.get());
            if (this.j) {
                this.g.a(null);
                this.e.remove(this.i);
            } else {
                q.a(ateVar, athVar, z, i);
            }
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("onBytesTransferred got an exception: ");
            sb.append(valueOf);
            afsi.b(1, 6, sb.toString());
        }
    }

    @Override // defpackage.att
    public final synchronized void b(ate ateVar, ath athVar, boolean z) {
        try {
            aenl q = q(this.a.get());
            if (this.j) {
                this.e.remove(this.i);
            } else {
                q.b(ateVar, athVar, z);
            }
            this.g.a(null);
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("onTransferEnd got an exception: ");
            sb.append(valueOf);
            afsi.b(1, 6, sb.toString());
        }
    }

    @Override // defpackage.att
    public final void c(ate ateVar, ath athVar, boolean z) {
        try {
            q(this.a.get()).c(ateVar, athVar, z);
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("onTransferStart got an exception: ");
            sb.append(valueOf);
            afsi.b(1, 6, sb.toString());
        }
    }

    @Override // defpackage.att
    public final synchronized void d(ate ateVar, ath athVar, boolean z) {
        try {
            aenl q = q(this.a.get());
            this.g.a(q);
            q.d(ateVar, athVar, z);
            this.j = false;
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("onTransferStart got an exception: ");
            sb.append(valueOf);
            afsi.b(1, 6, sb.toString());
        }
    }

    @Override // defpackage.aenf, defpackage.bey
    public final synchronized long e() {
        return j().b;
    }

    @Override // defpackage.bey
    public final void f(Handler handler, bex bexVar) {
        this.g.a.a(handler, bexVar);
    }

    @Override // defpackage.bey
    public final void g(bex bexVar) {
        this.g.a.c(bexVar);
    }

    @Override // defpackage.aenf, defpackage.aenl
    public final synchronized long h() {
        long h = q(this.a.get()).h();
        if (h > 0) {
            return h;
        }
        return j().b;
    }

    @Override // defpackage.aenf
    public final att i() {
        return this.f;
    }

    @Override // defpackage.aenf
    public final synchronized aenk j() {
        long j;
        PlayerConfigModel playerConfigModel = this.a.get();
        NetworkInfo d = this.d.d();
        aqjw g = this.d.g(d);
        long e = q(playerConfigModel).e();
        if (e <= 0) {
            apdl apdlVar = playerConfigModel.c.j;
            if (apdlVar == null) {
                apdlVar = apdl.a;
            }
            if (apdlVar.i.size() != 0) {
                apdl apdlVar2 = playerConfigModel.c.j;
                if (apdlVar2 == null) {
                    apdlVar2 = apdl.a;
                }
                for (apdk apdkVar : apdlVar2.i) {
                    aqjw b = aqjw.b(apdkVar.b);
                    if (b == null) {
                        b = aqjw.DETAILED_NETWORK_TYPE_UNKNOWN;
                    }
                    if (b == g) {
                        j = apdkVar.c;
                        break;
                    }
                }
            }
            j = 0;
            if (j <= 0) {
                apdl apdlVar3 = playerConfigModel.c.j;
                if (apdlVar3 == null) {
                    apdlVar3 = apdl.a;
                }
                if (apdlVar3.c && playerConfigModel.I() > 0) {
                    return new aenk(playerConfigModel.I(), 3, g);
                }
                long c = this.d.c(d);
                if (c != -1) {
                    return new aenk(c, 2, g);
                }
                aquz aquzVar = playerConfigModel.c.e;
                if (aquzVar == null) {
                    aquzVar = aquz.b;
                }
                int i = aquzVar.i * 8;
                if (i == 0) {
                    i = 800000;
                }
                return new aenk(i, 4, g);
            }
            return new aenk(j, 2, g);
        }
        return new aenk(e, 1, g);
    }

    @Override // defpackage.aenf, defpackage.aenl
    public final void k() {
        q(this.a.get()).k();
    }

    @Override // defpackage.aenf
    public final void l(aeru aeruVar, boolean z, PlayerConfigModel playerConfigModel) {
        q(this.a.get()).o(playerConfigModel);
        if (z) {
            int p = p();
            StringBuilder sb = new StringBuilder(11);
            sb.append(p - 1);
            aeruVar.w("bpt", sb.toString());
        }
    }

    @Override // defpackage.aenl
    public final synchronized void m(long j) {
        q(this.a.get()).m(j);
    }

    @Override // defpackage.aenl
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.aenl
    public final /* synthetic */ void o(PlayerConfigModel playerConfigModel) {
    }

    @Override // defpackage.aenl
    public final synchronized int p() {
        return q(this.a.get()).p();
    }
}

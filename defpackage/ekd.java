package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ekd implements wof {
    public final wog a;
    public final wyv b;
    public int c = 0;
    private final wod d;
    private final aryr e;
    private final xgh f;
    private final xev g;
    private final String h;
    private int i;
    private boolean j;

    public ekd(wog wogVar, wod wodVar, wyv wyvVar, aryr aryrVar, xgh xghVar, xev xevVar, String str) {
        this.a = wogVar;
        this.d = wodVar;
        this.b = wyvVar;
        this.e = aryrVar;
        this.f = xghVar;
        this.g = xevVar;
        this.h = str;
    }

    private final void i() {
        if (this.c != 1) {
            return;
        }
        this.c = 2;
        try {
            wod wodVar = this.d;
            aryx aryxVar = this.e.g;
            if (aryxVar == null) {
                aryxVar = aryx.a;
            }
            wodVar.d(aryxVar.c, this.h);
        } catch (wnw e) {
            whu.m(this.f, this.g, e.toString());
        }
        this.b.b(6, new afxe[0]);
        this.b.b(1, new afxe[0]);
    }

    @Override // defpackage.wof
    public final /* synthetic */ void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
    }

    @Override // defpackage.wof
    public final void h(int i, String str) {
        if (this.c == 3) {
            return;
        }
        if (str != null && !TextUtils.equals(str, this.h)) {
            if (this.c == 2) {
                this.c = 3;
                return;
            }
            return;
        }
        if (i == 2) {
            i();
            if (this.i == 0) {
                this.i = 1;
                return;
            } else {
                this.b.a(7, new afxe[0]);
                return;
            }
        }
        if (i == 3) {
            this.b.a(9, new afxe[0]);
            return;
        }
        if (i != 7) {
            return;
        }
        try {
            wod wodVar = this.d;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aryx aryxVar = this.e.g;
            if (aryxVar == null) {
                aryxVar = aryx.a;
            }
            wodVar.e(timeUnit.toMillis(aryxVar.e));
        } catch (wnw e) {
            whu.m(this.f, this.g, e.toString());
        }
        this.b.b(14, new afxe[0]);
        this.b.b(13, new afxe[0]);
        this.i = 5;
        this.c = 3;
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qp(afih afihVar) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qq(String str) {
    }

    @Override // defpackage.wof
    public final void qr(aigf aigfVar, aigf aigfVar2, int i, int i2, boolean z, boolean z2) {
        boolean z3 = this.j;
        boolean z4 = aigfVar == aigf.FULLSCREEN;
        this.j = z4;
        if (this.c != 2) {
            return;
        }
        try {
            this.d.f(aigfVar, aigfVar2, i, i2, z, z2);
        } catch (wnw e) {
            whu.m(this.f, this.g, e.toString());
        }
        if (!z3 && z4) {
            this.b.a(4, new afxe[0]);
        } else {
            if (!z3 || z4) {
                return;
            }
            this.b.a(5, new afxe[0]);
        }
    }

    @Override // defpackage.wof
    public final void qs(String str, long j, long j2, long j3, boolean z) {
        if (this.c != 3 && z && TextUtils.equals(str, this.h)) {
            i();
            int i = (int) j;
            try {
                this.d.e(i);
            } catch (wnw e) {
                whu.m(this.f, this.g, e.toString());
            }
            this.b.c(i, new afxe[0]);
            aryx aryxVar = this.e.g;
            if (aryxVar == null) {
                aryxVar = aryx.a;
            }
            int i2 = (i * 4) / ((int) (aryxVar.e * 1000));
            if (i2 >= this.i) {
                for (int i3 = i2; i3 >= this.i; i3--) {
                    if (i3 == 1) {
                        this.b.b(10, new afxe[0]);
                    } else if (i3 == 2) {
                        this.b.b(11, new afxe[0]);
                    } else if (i3 == 3) {
                        this.b.b(12, new afxe[0]);
                    }
                }
                this.i = i2 + 1;
            }
        }
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qw(String str, int i) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qy(ahcm ahcmVar) {
    }
}

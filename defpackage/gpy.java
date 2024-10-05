package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.apps.tiktok.account.AccountId;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gpy implements aaha {
    public static final /* synthetic */ int c = 0;
    public final ci a;
    public final wjz b;
    private final abcp d;
    private final ysy e;
    private final Executor f;
    private final wjt g;
    private final wju h;
    private final acqz i;
    private final afsy j;
    private final rxm k;
    private final trp l;

    public gpy(ci ciVar, abcp abcpVar, ysy ysyVar, rxm rxmVar, Executor executor, trp trpVar, wjt wjtVar, wju wjuVar, acqz acqzVar, afsy afsyVar, wjz wjzVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = ciVar;
        this.d = abcpVar;
        this.e = ysyVar;
        this.k = rxmVar;
        this.f = executor;
        this.l = trpVar;
        this.g = wjtVar;
        this.h = wjuVar;
        this.i = acqzVar;
        this.j = afsyVar;
        this.b = wjzVar;
    }

    public static final void c(Intent intent, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = (String) llv.a.get(str);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        intent.putExtra(":android:show_fragment", str2);
    }

    public final void b(final Intent intent) {
        if (!this.h.a()) {
            this.a.startActivity(intent);
        } else {
            ynm.n(this.a, this.g.a(this.j.c()), ept.j, new zfi() { // from class: gpw
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    gpy gpyVar = gpy.this;
                    Intent intent2 = intent;
                    AccountId accountId = (AccountId) obj;
                    accountId.getClass();
                    alxb.a(intent2, accountId);
                    gpyVar.b.b(11, 1, 26);
                    gpyVar.a.startActivity(intent2);
                }
            });
        }
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        String str;
        if ((apxfVar.b & 1) != 0) {
            this.i.mM().I(3, new acqx(apxfVar.c), null);
        }
        Intent f = this.l.f();
        apfu apfuVar = (apfu) apxfVar.pX(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint);
        if (!this.e.o() || this.k.a || !apfuVar.c) {
            f.putExtra("show_offline_items", this.k.a);
            int i = apfuVar.b;
            if ((i & 8) != 0) {
                str = apfuVar.e;
            } else if ((i & 16) != 0) {
                str = Integer.toString((aobq.bz(apfuVar.f) != 0 ? r5 : 1) - 1);
            } else {
                str = "";
            }
            c(f, str);
            b(f);
            return;
        }
        gpx gpxVar = new gpx(this, f);
        abcp abcpVar = this.d;
        ynm.l(abcpVar.d(abcpVar.a(apfuVar.d)), this.f, new izp(gpxVar, 1), new izq(gpxVar, 1), anij.a);
    }
}

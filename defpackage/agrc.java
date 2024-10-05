package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agrc implements ypd {
    public final aaea a;
    public final azrw b;
    public final azrw c;
    public String d;
    public String e;
    public boolean f;
    private final ScheduledExecutorService g;

    public agrc(aaea aaeaVar, azrw azrwVar, azrw azrwVar2, ScheduledExecutorService scheduledExecutorService) {
        this.a = aaeaVar;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.g = scheduledExecutorService;
    }

    protected final synchronized void a(ahef ahefVar) {
        String e = ahefVar.e();
        PlayerResponseModel b = ahefVar.b();
        if (e == null || b == null || e.equals(this.d)) {
            return;
        }
        this.d = e;
        this.e = b.y();
        this.f = false;
    }

    protected final synchronized void b(final aeqq aeqqVar) {
        this.g.execute(new Runnable() { // from class: agrb
            @Override // java.lang.Runnable
            public final void run() {
                agnn c;
                agrc agrcVar = agrc.this;
                aeqq aeqqVar2 = aeqqVar;
                atph atphVar = agrcVar.a.a().g;
                if (atphVar == null) {
                    atphVar = atph.a;
                }
                if (!atphVar.e || TextUtils.isEmpty(agrcVar.d) || TextUtils.isEmpty(agrcVar.e) || agrcVar.f || !((agof) agrcVar.b.get()).h()) {
                    return;
                }
                agsn a = ((agof) agrcVar.b.get()).a();
                agnv e = a.m().e(agrcVar.e);
                if (e != null) {
                    if ((e.i() == agnq.PLAYABLE || e.v()) && (c = a.d().c(agrcVar.e, null)) != null) {
                        FormatStreamModel e2 = aeqqVar2.e();
                        FormatStreamModel f = aeqqVar2.f();
                        FormatStreamModel a2 = c.a();
                        FormatStreamModel c2 = c.c();
                        if ((e2 == null || a2 == null || e2.e() != a2.e()) && (f == null || c2 == null || f.e() != c2.e())) {
                            return;
                        }
                        aone createBuilder = awav.a.createBuilder();
                        int i = e.c;
                        byte[] bArr = e.d;
                        if (i != -1 && i != 0) {
                            createBuilder.copyOnWrite();
                            awav awavVar = (awav) createBuilder.instance;
                            awavVar.b |= 2;
                            awavVar.d = i;
                        } else if (bArr != null) {
                            aomf x = aomf.x(bArr);
                            createBuilder.copyOnWrite();
                            awav awavVar2 = (awav) createBuilder.instance;
                            awavVar2.b |= 1;
                            awavVar2.c = x;
                        } else {
                            aomf x2 = aomf.x(aaef.b);
                            createBuilder.copyOnWrite();
                            awav awavVar3 = (awav) createBuilder.instance;
                            awavVar3.b |= 1;
                            awavVar3.c = x2;
                        }
                        agnm agnmVar = c.b;
                        agnm agnmVar2 = c.a;
                        ((agmu) agrcVar.c.get()).d(agrcVar.d, e.m.b(), (awav) createBuilder.build(), a2 == null ? 0 : a2.e(), c2 == null ? 0 : c2.e(), !(agnmVar2 != null && agnmVar2.i() && (agnmVar == null || agnmVar.i())));
                        agrcVar.f = true;
                    }
                }
            }
        });
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aeqq.class, ahef.class};
        }
        if (i == 0) {
            b((aeqq) obj);
            return null;
        }
        if (i == 1) {
            a((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}

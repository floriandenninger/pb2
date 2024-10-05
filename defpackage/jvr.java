package defpackage;

import android.os.Handler;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jvr implements ypd {
    public final azrw a;
    public final azrw b;
    public final azrw c;
    private final Handler d;

    public jvr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, Handler handler) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = handler;
    }

    public final void a(final String str) {
        this.d.post(new Runnable() { // from class: jvp
            @Override // java.lang.Runnable
            public final void run() {
                jvr jvrVar = jvr.this;
                String str2 = str;
                jvo jvoVar = (jvo) jvrVar.c.get();
                jvq jvqVar = new jvq(0);
                yjk.f();
                jvn jvnVar = jvoVar.e;
                if (jvnVar != null) {
                    jvoVar.c.removeCallbacks(jvnVar);
                    jvoVar.e = null;
                }
                jvoVar.d.put(str2, jvqVar);
                jvoVar.e = new jvn(jvoVar);
                jvoVar.c.postDelayed(jvoVar.e, jvo.a);
            }
        });
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        String str;
        if (i == -1) {
            return new Class[]{ghg.class};
        }
        if (i == 0) {
            asno a = ((ghg) obj).a();
            if ((a != asno.LIKE && a != asno.INDIFFERENT) || !((agzz) this.a.get()).c()) {
                return null;
            }
            Iterator it = ((agof) this.b.get()).a().i().j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                agng agngVar = ((agni) it.next()).a;
                agnb agnbVar = agngVar.c;
                if (agngVar.a.startsWith("LL") && agnbVar != null && agnbVar.e) {
                    str = agngVar.a;
                    break;
                }
            }
            if (ammx.e(str)) {
                return null;
            }
            a(str);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}

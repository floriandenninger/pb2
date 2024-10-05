package defpackage;

import android.content.res.Resources;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jlg implements ypd {
    public final ci a;
    public final Resources b;
    public final akbz c;
    public final fka d;

    public jlg(ci ciVar, akbz akbzVar, fka fkaVar) {
        this.a = ciVar;
        this.b = ciVar.getResources();
        this.c = akbzVar;
        this.d = fkaVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{agli.class};
        }
        if (i == 0) {
            final agli agliVar = (agli) obj;
            agnv agnvVar = agliVar.a;
            if (agnvVar == null || agnvVar.j == null) {
                return null;
            }
            ynm.n(this.a, anfq.h(this.d.a.a(), fjw.d, angq.a), hue.s, new zfi() { // from class: jlf
                @Override // defpackage.zfi
                public final void a(Object obj2) {
                    agnu agnuVar;
                    jlg jlgVar = jlg.this;
                    agli agliVar2 = agliVar;
                    if (Boolean.TRUE.equals((Boolean) obj2) || (agnuVar = agliVar2.a.j) == null) {
                        return;
                    }
                    int days = (int) TimeUnit.SECONDS.toDays(agnuVar.a());
                    akca m = jlgVar.c.m();
                    m.k(jlgVar.b.getQuantityString(R.plurals.offline_go_online_to_renew_snackbar_message, days, Integer.valueOf(days)));
                    m.j(false);
                    jlgVar.c.o(m.b());
                    ynm.n(jlgVar.a, jlgVar.d.a.b(new fjw(0)), hue.t, ynm.b);
                }
            });
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}

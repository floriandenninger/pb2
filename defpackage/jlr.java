package defpackage;

import android.app.Activity;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jlr implements ypd {
    public final Activity a;
    public final ypa b;
    public final jvl c;
    public final ajos d;
    public final jsg e;
    public final azrw f;
    public final azrw g;
    public final aaea h;
    public final acra i;
    public final String j;
    public final boolean k;
    public final Set l = new HashSet();
    public LoadingFrameLayout m;
    public ListView n;
    public ajpd o;
    public ykn p;
    public TextView q;
    public ajom r;
    public jlv s;
    public jlz t;
    public final jzp u;
    public final ajoy v;
    public final nmc w;
    public final axzg x;

    public jlr(axzg axzgVar, Activity activity, ypa ypaVar, aaea aaeaVar, jzp jzpVar, nmc nmcVar, jvl jvlVar, azrw azrwVar, ajoy ajoyVar, ajos ajosVar, jsg jsgVar, azrw azrwVar2, acra acraVar, String str, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = activity;
        this.b = ypaVar;
        this.h = aaeaVar;
        this.u = jzpVar;
        this.w = nmcVar;
        this.c = jvlVar;
        this.v = ajoyVar;
        this.d = ajosVar;
        this.e = jsgVar;
        this.f = azrwVar;
        this.g = azrwVar2;
        this.i = acraVar;
        this.j = str;
        this.k = z;
        this.x = axzgVar;
    }

    public final void a(boolean z) {
        ykn yknVar = this.p;
        if (yknVar != null && !yknVar.e()) {
            this.p.d();
        }
        LoadingFrameLayout loadingFrameLayout = this.m;
        loadingFrameLayout.getClass();
        loadingFrameLayout.c();
        this.p = ykn.c(new jlp(this, z));
        agsl i = ((agof) this.g.get()).a().i();
        String str = this.j;
        Activity activity = this.a;
        ykn yknVar2 = this.p;
        yknVar2.getClass();
        i.v(str, yki.c(activity, yknVar2));
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aacj.class, agkr.class, agks.class, aglb.class, aglg.class};
        }
        if (i == 0) {
            ajpd ajpdVar = this.o;
            ajpdVar.getClass();
            ajpdVar.remove(((aacj) obj).b());
            return null;
        }
        if (i == 1) {
            if (!this.j.equals(((agkr) obj).a)) {
                return null;
            }
            a(false);
            return null;
        }
        if (i == 2) {
            if (!this.j.equals(((agks) obj).a.d())) {
                return null;
            }
            a(false);
            return null;
        }
        if (i == 3) {
            if (!this.l.contains(((aglb) obj).a)) {
                return null;
            }
            a(true);
            return null;
        }
        if (i == 4) {
            if (!this.l.contains(((aglg) obj).a)) {
                return null;
            }
            a(false);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}

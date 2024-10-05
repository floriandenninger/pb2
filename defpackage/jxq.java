package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jxq implements ypd {
    public final juy a;
    public final ypa b;
    public final jry c;
    public final azrw d;
    public final TextView e;
    public final OfflineArrowView f;
    public final ajoi g;
    public aqbw h;
    public String i;
    public jrl j;
    public Future k;
    public final ogx l;
    private final agyr m;

    public jxq(juy juyVar, ypa ypaVar, ogx ogxVar, agyr agyrVar, jry jryVar, azrw azrwVar, View view, ajoi ajoiVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = juyVar;
        this.b = ypaVar;
        this.l = ogxVar;
        this.m = agyrVar;
        this.c = jryVar;
        this.d = azrwVar;
        this.g = ajoiVar;
        this.e = (TextView) view.findViewById(R.id.subtitle);
        this.f = (OfflineArrowView) view.findViewById(R.id.offline_arrow);
    }

    public final void a() {
        if (ammx.e(this.i) || "PPSV".equals(this.i)) {
            return;
        }
        this.m.a(this.i, agyg.a(true));
    }

    public final void b(jql jqlVar) {
        aqyg aqygVar;
        if (ammx.e(jqlVar.c[0])) {
            aqbw aqbwVar = this.h;
            aqbwVar.getClass();
            TextView textView = this.e;
            if ((aqbwVar.b & 2) != 0) {
                aqygVar = aqbwVar.h;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            whu.G(textView, ajcq.b(aqygVar));
            TextView textView2 = this.e;
            textView2.setTextColor(wbs.W(textView2.getContext(), R.attr.ytTextSecondary).orElse(0));
            this.e.setTypeface(Typeface.DEFAULT);
            return;
        }
        whu.G(this.e, jqlVar.c[0]);
        TextView textView3 = this.e;
        textView3.setTextColor(wbs.W(textView3.getContext(), jqlVar.a).orElse(0));
        TextView textView4 = this.e;
        Typeface typeface = textView4.getTypeface();
        int i = jqlVar.b;
        textView4.setTypeface(typeface, 0);
    }

    public final void c(agnh agnhVar) {
        this.j.b(jqm.a(agnhVar));
        b(this.c.b(agnhVar));
    }

    public final void d(agnw agnwVar) {
        this.j.b(jqm.a(agnwVar));
        b(this.c.a());
    }

    public final boolean e() {
        return "PPSV".equals(this.i);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{jqd.class, agkl.class, agko.class, agkq.class, aglk.class};
        }
        if (i == 0) {
            if (!e()) {
                return null;
            }
            b(this.c.a());
            return null;
        }
        if (i == 1) {
            String str = this.i;
            if (!((agkl) obj).a.equals(str)) {
                return null;
            }
            c(((agof) this.d.get()).a().i().d(str));
            return null;
        }
        if (i == 2) {
            String str2 = this.i;
            if (((agko) obj).a.equals(str2)) {
                c(((agof) this.d.get()).a().i().d(str2));
                return null;
            }
            if (!e()) {
                return null;
            }
            d(((agof) this.d.get()).a().m().f());
            return null;
        }
        if (i == 3) {
            agkq agkqVar = (agkq) obj;
            if (!agkqVar.a.d().equals(this.i) || this.j == null) {
                return null;
            }
            c(agkqVar.a);
            return null;
        }
        if (i == 4) {
            aglk aglkVar = (aglk) obj;
            if (!"PPSV".equals(this.i) || this.j == null) {
                return null;
            }
            d(aglkVar.a);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}

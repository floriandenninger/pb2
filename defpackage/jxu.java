package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jxu implements ypd {
    public final Context a;
    public final fjs b;
    public final ypa c;
    public final ajoi d;
    public final fjm e;
    public final shf f;
    public final TextView g;
    public final TextView h;
    public fjl i;
    public ajok j;
    public ajop k;
    public aqcj l;
    public String m;
    public ajoi n;
    public Future o = anaf.M();
    public final ajoy p;
    public final trp q;
    private final azrw r;
    private final jry s;
    private final juy t;
    private final TextView u;
    private final axzf v;

    public jxu(Context context, fjs fjsVar, azrw azrwVar, jry jryVar, trp trpVar, ypa ypaVar, juy juyVar, ajoy ajoyVar, fjm fjmVar, shf shfVar, axzf axzfVar, View view, ajoi ajoiVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = context;
        this.b = fjsVar;
        this.r = azrwVar;
        this.s = jryVar;
        this.q = trpVar;
        this.c = ypaVar;
        this.p = ajoyVar;
        this.e = fjmVar;
        this.t = juyVar;
        this.f = shfVar;
        this.v = axzfVar;
        this.d = ajoiVar;
        this.u = (TextView) view.findViewById(R.id.owner);
        this.g = (TextView) view.findViewById(R.id.video_count);
        this.h = (TextView) view.findViewById(R.id.subtitle);
    }

    public final void a(agnh agnhVar) {
        aqyg aqygVar;
        whu.I(this.g, agnhVar == null || agnhVar.e());
        if (agnhVar == null || agnhVar.e()) {
            whu.I(this.h, false);
        } else {
            jql b = this.s.b(agnhVar);
            whu.G(this.h, b.c[0]);
            this.h.setTextColor(wbs.W(this.a, b.a).orElse(0));
            TextView textView = this.h;
            textView.setTypeface(textView.getTypeface(), 0);
        }
        aqcj aqcjVar = this.l;
        aqcjVar.getClass();
        TextView textView2 = this.u;
        if ((aqcjVar.b & 16) != 0) {
            aqygVar = aqcjVar.h;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView2.setText(ajcq.b(aqygVar));
        if (this.v.m() && agnhVar != null && agnhVar.e() && agnhVar.c + agnhVar.a() == agnhVar.c()) {
            this.o.cancel(false);
            juy juyVar = this.t;
            this.o = juyVar.d.submit(new juu(juyVar, agnhVar.d(), new jxt(this), 1));
        }
    }

    public final void b() {
        String str = this.m;
        if (ammx.e(str)) {
            return;
        }
        a(((agof) this.r.get()).a().i().d(str));
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{yro.class, agkq.class};
        }
        if (i == 0) {
            b();
            return null;
        }
        if (i == 1) {
            agkq agkqVar = (agkq) obj;
            if (!agkqVar.a.d().equals(this.m)) {
                return null;
            }
            a(agkqVar.a);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}

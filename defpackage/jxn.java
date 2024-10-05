package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jxn implements ypd {
    public final fjs a;
    public final ypa b;
    public final TextView c;
    public final View d;
    public String e;
    private final Context f;
    private final azrw g;
    private final jry h;

    public jxn(Context context, fjs fjsVar, azrw azrwVar, jry jryVar, ypa ypaVar, View view) {
        this.f = context;
        this.a = fjsVar;
        this.g = azrwVar;
        this.h = jryVar;
        this.b = ypaVar;
        TextView textView = (TextView) view.findViewById(R.id.download_progress_message);
        textView.getClass();
        this.c = textView;
        View findViewById = view.findViewById(R.id.subtitle);
        findViewById.getClass();
        this.d = findViewById;
    }

    public final void a() {
        String str = this.e;
        if (ammx.e(str)) {
            return;
        }
        b(((agof) this.g.get()).a().i().d(str));
    }

    public final void b(agnh agnhVar) {
        if (agnhVar == null || agnhVar.e()) {
            whu.I(this.c, false);
            whu.I(this.d, true);
            return;
        }
        jql b = this.h.b(agnhVar);
        whu.G(this.c, b.c[0]);
        this.c.setTextColor(wbs.W(this.f, b.a).orElse(0));
        TextView textView = this.c;
        textView.setTypeface(textView.getTypeface(), 0);
        whu.I(this.d, false);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{yro.class, agkq.class};
        }
        if (i == 0) {
            a();
            return null;
        }
        if (i == 1) {
            agkq agkqVar = (agkq) obj;
            if (!agkqVar.a.d().equals(this.e)) {
                return null;
            }
            b(agkqVar.a);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}

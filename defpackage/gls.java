package defpackage;

import android.view.View;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gls implements View.OnClickListener {
    private final aahd a;
    private final ajut b;
    private final FloatingActionButton c;
    private gfb d;

    public gls(aahd aahdVar, ajut ajutVar, FloatingActionButton floatingActionButton) {
        this.a = aahdVar;
        this.b = ajutVar;
        this.c = floatingActionButton;
        floatingActionButton.setOnClickListener(this);
    }

    private static Map b(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        return hashMap;
    }

    public final void a(gfb gfbVar) {
        if (gfbVar == null || this.d != gfbVar) {
            this.d = gfbVar;
            if (gfbVar != null) {
                arfs c = gfbVar.c();
                if (c != null) {
                    ajut ajutVar = this.b;
                    arfr b = arfr.b(c.c);
                    if (b == null) {
                        b = arfr.UNKNOWN;
                    }
                    this.c.setImageResource(ajutVar.a(b));
                } else {
                    this.c.setImageDrawable(null);
                }
                this.c.setContentDescription(gfbVar.e());
                whu.I(this.c, true);
                return;
            }
            whu.I(this.c, false);
            return;
        }
        whu.I(this.c, true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gfb gfbVar = this.d;
        if (gfbVar == null) {
            return;
        }
        apxf a = gfbVar.a();
        apxf b = this.d.b();
        if (a != null) {
            this.a.c(a, b(this.d));
        } else if (b != null) {
            this.a.c(b, b(this.d));
        }
    }
}

package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajoi implements View.OnClickListener {
    private static final ajof b = new ajod();
    private static final ajog c = new ajoe();
    public aahd a;
    private final ajop d;
    private final ajof e;
    private acra f;
    private apxf g;
    private Map h;
    private ajog i;

    public ajoi(aahd aahdVar, View view) {
        this(aahdVar, new ajpe(view));
    }

    public final void a(acra acraVar, apxf apxfVar, Map map) {
        b(acraVar, apxfVar, map, null);
    }

    public final void b(acra acraVar, apxf apxfVar, Map map, ajog ajogVar) {
        if (acraVar == null) {
            acraVar = acra.l;
        }
        this.f = acraVar;
        this.g = apxfVar;
        if (map == null) {
            map = Collections.emptyMap();
        }
        this.h = map;
        if (ajogVar == null) {
            ajogVar = c;
        }
        this.i = ajogVar;
        this.d.b(apxfVar != null);
    }

    public final void c() {
        this.g = null;
        this.d.b(false);
        this.f = acra.l;
        this.h = Collections.emptyMap();
        this.i = c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.e.h(view)) {
            return;
        }
        apxf h = this.f.h(this.g);
        this.g = h;
        aahd aahdVar = this.a;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", this.f);
        hashMap.putAll(this.h);
        this.i.oh(hashMap);
        aahdVar.c(h, hashMap);
    }

    public ajoi(aahd aahdVar, View view, ajof ajofVar) {
        this(aahdVar, new ajpe(view), ajofVar);
    }

    public ajoi(aahd aahdVar, ajop ajopVar) {
        this(aahdVar, ajopVar, (ajof) null);
    }

    public ajoi(aahd aahdVar, ajop ajopVar, ajof ajofVar) {
        aahdVar.getClass();
        this.a = aahdVar;
        ajopVar = ajopVar == null ? new ajoh() : ajopVar;
        this.d = ajopVar;
        ajopVar.d(this);
        ajopVar.b(false);
        this.e = ajofVar == null ? b : ajofVar;
        this.f = acra.l;
        this.i = c;
        this.h = Collections.emptyMap();
    }
}

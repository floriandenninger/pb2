package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class teb extends tdx {
    public final tea h;
    public final String i;
    public final tdv j;
    public boolean k;
    public boolean l;
    public boolean m;
    private final View.OnAttachStateChangeListener n;
    private boolean o;

    public teb(View view, tea teaVar, String str, tdv tdvVar) {
        super(new teh());
        this.h = teaVar;
        this.i = str;
        this.j = tdvVar;
        this.n = new tdz(this);
        d(view);
    }

    @Override // defpackage.tdx
    public final void d(View view) {
        super.d(view);
        if (view != null) {
            view.addOnAttachStateChangeListener(this.n);
        }
    }

    @Override // defpackage.tdx
    public final boolean h() {
        return this.a || this.k || this.l;
    }

    public final tdt i(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(c());
        linkedHashMap.put(tdu.ID, str);
        linkedHashMap.put(tdu.DONE_REASON, str2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", rwh.G(tdu.ID));
        linkedHashMap2.put("r", rwh.G(tdu.DONE_REASON));
        linkedHashMap2.put("c", rwh.J(tdu.COVERAGE, tdr.b));
        linkedHashMap2.put("nc", rwh.J(tdu.MIN_COVERAGE, tdr.b));
        linkedHashMap2.put("mc", rwh.J(tdu.MAX_COVERAGE, tdr.b));
        linkedHashMap2.put("tos", rwh.K(tdu.TOS));
        linkedHashMap2.put("mtos", rwh.K(tdu.MAX_CONSECUTIVE_TOS));
        linkedHashMap2.put("p", rwh.K(tdu.POSITION));
        linkedHashMap2.put("cp", rwh.K(tdu.CONTAINER_POSITION));
        linkedHashMap2.put("bs", rwh.K(tdu.VIEWPORT_SIZE));
        linkedHashMap2.put("ps", rwh.K(tdu.APP_SIZE));
        linkedHashMap2.put("scs", rwh.K(tdu.SCREEN_SIZE));
        linkedHashMap2.put("lte", rwh.H("1"));
        linkedHashMap2.put("avms", rwh.H("nl"));
        linkedHashMap2.put("sv", rwh.H("85"));
        linkedHashMap2.put("cb", rwh.H("a"));
        String S = rwh.S(linkedHashMap, Collections.unmodifiableMap(linkedHashMap2), null, null);
        tds a = tdt.a();
        a.a = S;
        return a.a();
    }

    public final void j() {
        if (!this.m || this.o) {
            return;
        }
        this.h.b(i("lidartos", "u"), a());
        this.o = true;
        if (a() != null) {
            a().removeOnAttachStateChangeListener(this.n);
        }
    }
}

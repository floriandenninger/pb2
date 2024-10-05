package defpackage;

import android.content.SharedPreferences;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afxk implements afxl {
    private final SharedPreferences a;
    private final afsy b;

    public afxk(SharedPreferences sharedPreferences, afsy afsyVar) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        this.b = afsyVar;
    }

    @Override // defpackage.afvb
    public final asuq a() {
        return asuq.VISITOR_ID;
    }

    @Override // defpackage.afvb
    public final boolean e() {
        return true;
    }

    @Override // defpackage.afvb
    public final void b(Map map, afvp afvpVar) {
        String string;
        if (afvpVar.z()) {
            string = afvpVar.u();
        } else if (this.b.c().g()) {
            string = this.a.getString("incognito_visitor_id", null);
        } else {
            string = this.a.getString("visitor_id", null);
        }
        if (string != null) {
            map.put("X-Goog-Visitor-Id", string);
        }
    }
}

package defpackage;

import android.content.Context;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afvn implements afvb {
    public afvn(Context context, afqk afqkVar) {
        context.getClass();
        afqkVar.getClass();
    }

    @Override // defpackage.afvb
    public final asuq a() {
        return asuq.PLUS_PAGE_ID;
    }

    @Override // defpackage.afvb
    public final void b(Map map, afvp afvpVar) {
        amkq.N(wbs.am(afvpVar.g()));
        afsx e = afvpVar.e();
        if (e.w()) {
            map.put("X-Goog-PageId", e.e());
        }
    }

    @Override // defpackage.afvb
    public final boolean e() {
        return true;
    }
}

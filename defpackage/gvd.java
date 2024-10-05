package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gvd implements aahd {
    private final Context a;
    private final Set b;

    public gvd(Context context, Set set) {
        this.a = context;
        this.b = set;
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void a(apxf apxfVar) {
        aahc.a(this, apxfVar);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void b(List list) {
        aahc.b(this, list);
    }

    @Override // defpackage.aahd
    public final void c(apxf apxfVar, Map map) {
        Object a = aahe.a(apxfVar);
        if (a == null || !this.b.contains(a.getClass())) {
            afsi.b(2, 5, "Command not supported when delegating to WWA");
            return;
        }
        Intent e = fav.e(this.a);
        e.putExtra("navigation_endpoint", apxfVar.toByteArray());
        this.a.startActivity(e);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void d(List list, Map map) {
        aahc.c(this, list, map);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void e(List list, Object obj) {
        aahc.d(this, list, obj);
    }
}

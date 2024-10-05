package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vwf implements vwc {
    public Date a;
    public Date b;
    public Integer c;
    public Long d;
    public int f = 1;
    public final List e = new ArrayList();

    @Override // defpackage.vwc
    public final /* bridge */ /* synthetic */ deb a() {
        deu deuVar = new deu();
        Date date = this.a;
        if (date != null) {
            deuVar.k(date);
        }
        Date date2 = this.b;
        if (date2 != null) {
            deuVar.m(date2);
        }
        if (this.c != null) {
            deuVar.c = r1.intValue();
        }
        Long l = this.d;
        if (l != null) {
            deuVar.l(l.longValue());
        }
        deuVar.e = this.f;
        det detVar = new det();
        detVar.w(deuVar);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            detVar.w(((vwh) it.next()).a());
        }
        return detVar;
    }
}

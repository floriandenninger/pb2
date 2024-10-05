package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aglx implements swv {
    public final agpd a;

    public aglx(agpd agpdVar) {
        this.a = agpdVar;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return atpk.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, swu swuVar) {
        final atpk atpkVar = (atpk) obj;
        return ayph.t(new ayrm() { // from class: aglw
            @Override // defpackage.ayrm
            public final void a() {
                aglx aglxVar = aglx.this;
                Iterator it = atpkVar.c.iterator();
                while (it.hasNext()) {
                    try {
                        aglxVar.a.d((atpq) it.next());
                    } catch (agpe e) {
                        zga.d("[Offline] Couldn't queue action from Elements' command.", e);
                    }
                }
            }
        });
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}

package defpackage;

import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class udf implements ude {
    private final twx a;
    private final udh b;
    private final udk c;

    public udf(twx twxVar, udh udhVar, udk udkVar) {
        this.a = twxVar;
        this.b = udhVar;
        this.c = udkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ude
    public final synchronized void a(List list) {
        for (twu twuVar : this.a.c()) {
            if (!list.contains(twuVar.b)) {
                udk udkVar = this.c;
                String str = twuVar.b;
                amkq.F(!TextUtils.isEmpty(str), "Account name must not be empty.");
                try {
                    twu b = udkVar.b.b(str);
                    twb twbVar = b.f;
                    if (twbVar != twb.UNREGISTERED && twbVar != twb.PENDING_UNREGISTRATION) {
                        udkVar.d.a(str, twb.PENDING_UNREGISTRATION);
                        udkVar.a.d(b);
                    }
                    ((afyo) ((amna) udkVar.c).a).d();
                    twc twcVar = twc.a;
                } catch (tww e) {
                    ammv ammvVar = udkVar.c;
                    twp a = twu.a();
                    a.b(str);
                    a.a();
                    ((afyo) ((amna) udkVar.c).a).c(e);
                    twc.a(e);
                }
            }
        }
        amxe it = ((amru) list).iterator();
        while (it.hasNext()) {
            b((String) it.next(), aokm.COLLABORATOR_API_CALL);
        }
    }

    public final synchronized void b(String str, aokm aokmVar) {
        uqq.i();
        this.b.a(str, false, aokmVar);
    }
}

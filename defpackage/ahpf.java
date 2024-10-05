package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahpf implements ahqq {
    private final List a;
    private final List b;

    /* JADX WARN: Multi-variable type inference failed */
    public ahpf(List list, List list2) {
        amxe it = ((amru) list).iterator();
        while (it.hasNext()) {
            ((acsc) it.next()).getClass();
        }
        amxe it2 = ((amru) list2).iterator();
        while (it2.hasNext()) {
            ((acsc) it2.next()).getClass();
        }
        this.a = list;
        this.b = list2;
    }

    private static atmc b(apxf apxfVar) {
        if (apxfVar != null) {
            return (atmc) apxfVar.pX(atmb.b);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahqq
    public final InteractionLoggingScreen a(acra acraVar, apxf apxfVar, ahqt ahqtVar) {
        aone builder;
        apxf apxfVar2 = null;
        aong aongVar = apxfVar == null ? null : (aong) apxfVar.toBuilder();
        if (aongVar != null) {
            if (ahqtVar == null) {
                apxfVar2 = (apxf) aongVar.build();
            } else {
                boolean z = !TextUtils.isEmpty(ahqtVar.a);
                if (b((apxf) aongVar.build()) == null) {
                    builder = atmc.a.createBuilder();
                } else {
                    builder = b((apxf) aongVar.build()).toBuilder();
                }
                if (z) {
                    String str = ahqtVar.a;
                    if (str == null) {
                        builder.copyOnWrite();
                        atmc atmcVar = (atmc) builder.instance;
                        atmcVar.b &= -2;
                        atmcVar.c = atmc.a.c;
                    } else {
                        builder.copyOnWrite();
                        atmc atmcVar2 = (atmc) builder.instance;
                        atmcVar2.b |= 1;
                        atmcVar2.c = str;
                    }
                }
                int i = ahqtVar.b.a;
                builder.copyOnWrite();
                atmc atmcVar3 = (atmc) builder.instance;
                atmcVar3.b |= 2;
                atmcVar3.d = i;
                aongVar.e(atmb.b, (atmc) builder.build());
                apxfVar2 = (apxf) aongVar.build();
            }
        }
        apxf apxfVar3 = apxfVar2;
        InteractionLoggingScreen e = acraVar.e(acsb.b(3832), acrs.DEFAULT, apxfVar3, adyu.cg(apxfVar3, asit.b), adyu.cg(apxfVar3, asit.a));
        amxe it = ((amru) this.a).iterator();
        while (it.hasNext()) {
            acsc acscVar = (acsc) it.next();
            if (acscVar != null) {
                acraVar.n(new acqx(acscVar));
            }
        }
        amxe it2 = ((amru) this.b).iterator();
        while (it2.hasNext()) {
            acraVar.D(new acqx((acsc) it2.next()));
        }
        return e;
    }
}

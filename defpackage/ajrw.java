package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajrw {
    public final aqyk a;
    public final List b;
    public aqyg c;

    public ajrw(aqyj aqyjVar) {
        int i;
        aqyk aqykVar;
        aqyk aqykVar2;
        aqyk aqykVar3;
        aqyjVar.getClass();
        int i2 = aqyjVar.b;
        aqyg aqygVar = null;
        if (i2 == 1) {
            aqykVar = (aqyk) aqyjVar.c;
            i = 1;
        } else {
            i = i2;
            aqykVar = null;
        }
        this.a = aqykVar;
        this.b = aqyjVar.d;
        if (i == 1) {
            aqykVar2 = (aqyk) aqyjVar.c;
        } else {
            aqykVar2 = aqyk.a;
        }
        if ((aqykVar2.b & 1) != 0) {
            if (aqyjVar.b == 1) {
                aqykVar3 = (aqyk) aqyjVar.c;
            } else {
                aqykVar3 = aqyk.a;
            }
            aqygVar = aqykVar3.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        }
        this.c = aqygVar;
    }
}

package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajfo extends ajfh {
    public ajfo(Executor executor) {
        super(executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajfh
    public final /* bridge */ /* synthetic */ aqrf a(Object obj) {
        askg askgVar = (askg) obj;
        if ((askgVar.h & 1048576) == 0) {
            return null;
        }
        aqrf aqrfVar = askgVar.av;
        return aqrfVar == null ? aqrf.a : aqrfVar;
    }
}

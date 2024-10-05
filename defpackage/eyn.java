package defpackage;

import com.google.protos.youtube.api.innertube.RefreshCommandOuterClass$RefreshCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eyn implements aaha {
    private final gji a;

    public eyn(gji gjiVar) {
        this.a = gjiVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        RefreshCommandOuterClass$RefreshCommand refreshCommandOuterClass$RefreshCommand = (RefreshCommandOuterClass$RefreshCommand) apxfVar.pX(RefreshCommandOuterClass$RefreshCommand.refreshCommand);
        if (refreshCommandOuterClass$RefreshCommand == null) {
            return;
        }
        int bO = aobq.bO(refreshCommandOuterClass$RefreshCommand.c);
        if (bO == 0) {
            bO = 1;
        }
        if (bO == 2) {
            this.a.o();
        } else if (bO == 3) {
            this.a.p();
        }
    }
}

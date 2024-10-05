package defpackage;

import com.google.protos.youtube.api.innertube.LeaveBroadcastCommandOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abuz implements aaha {
    private final abya a;
    private final abxy b;

    public abuz(abya abyaVar, abxy abxyVar) {
        this.a = abyaVar;
        this.b = abxyVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        asms asmsVar = (asms) apxfVar.pX(LeaveBroadcastCommandOuterClass.leaveBroadcastCommand);
        if ((asmsVar.b & 1) != 0) {
            this.a.f(asmsVar.c, this.b);
        }
    }
}

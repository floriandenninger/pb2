package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.FaultObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class svl extends FaultObserver {
    final /* synthetic */ svo a;

    public svl(svo svoVar) {
        this.a = svoVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.FaultObserver
    public final void storeDidFault(ByteStore byteStore, String str) {
        svo svoVar = this.a;
        awsv a = awsw.a();
        aoqa d = svv.d();
        a.copyOnWrite();
        awsw.c((awsw) a.instance, d);
        awsp a2 = awsq.a();
        a2.copyOnWrite();
        awsq.c((awsq) a2.instance, str);
        awsq awsqVar = (awsq) a2.build();
        a.copyOnWrite();
        awsw.h((awsw) a.instance, awsqVar);
        ((DebuggerClient) svoVar.c.get()).sendTimelineEvent(((awsw) a.build()).toByteArray());
    }
}

package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.TransactionRecord;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class svk extends Observer {
    final /* synthetic */ svo a;

    public svk(svo svoVar) {
        this.a = svoVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.Observer
    public final void storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord) {
        Snapshot endState;
        if (transactionRecord == null || (endState = transactionRecord.endState()) == null) {
            return;
        }
        svo svoVar = this.a;
        aone g = svo.g(endState, transactionRecord.keys());
        g.copyOnWrite();
        awsf awsfVar = (awsf) g.instance;
        awsf awsfVar2 = awsf.a;
        awsfVar.b |= 2;
        awsfVar.d = true;
        aoqa d = svv.d();
        g.copyOnWrite();
        awsf awsfVar3 = (awsf) g.instance;
        d.getClass();
        awsfVar3.e = d;
        awsfVar3.b |= 4;
        svoVar.f((awsf) g.build());
    }
}

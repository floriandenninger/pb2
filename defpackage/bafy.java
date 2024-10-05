package defpackage;

import org.chromium.net.CronetException;
import org.chromium.net.impl.CronetBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bafy implements Runnable {
    final /* synthetic */ CronetException a;
    final /* synthetic */ CronetBidirectionalStream b;

    public bafy(CronetBidirectionalStream cronetBidirectionalStream, CronetException cronetException) {
        this.b = cronetBidirectionalStream;
        this.a = cronetException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}

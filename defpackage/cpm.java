package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpm extends cpr {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ cpp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpm(cpp cppVar, cof cofVar, UrlResponseInfo urlResponseInfo) {
        super(cofVar);
        this.b = cppVar;
        this.a = urlResponseInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ByteBuffer allocateDirect;
        cpp cppVar = this.b;
        UrlResponseInfo urlResponseInfo = this.a;
        cpk cpkVar = cppVar.f;
        cpkVar.b = new RuntimeException();
        ArrayDeque arrayDeque = cpkVar.a;
        cpkVar.a = null;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
        }
        if (atomicBoolean.compareAndSet(false, true)) {
            if (arrayDeque.size() == 0) {
                allocateDirect = ByteBuffer.allocateDirect(0);
            } else if (arrayDeque.size() == 1) {
                allocateDirect = (ByteBuffer) arrayDeque.remove();
            } else {
                Iterator it2 = arrayDeque.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    i += ((ByteBuffer) it2.next()).remaining();
                }
                allocateDirect = ByteBuffer.allocateDirect(i);
                while (!arrayDeque.isEmpty()) {
                    allocateDirect.put((ByteBuffer) arrayDeque.remove());
                }
            }
            cppVar.a(urlResponseInfo, null, false, allocateDirect);
            return;
        }
        throw new IllegalStateException("This BufferQueue has already been consumed");
    }
}

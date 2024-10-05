package defpackage;

import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.logging.Level;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayeu extends BidirectionalStream.Callback {
    final /* synthetic */ ayex a;
    private List b;

    public ayeu(ayex ayexVar) {
        this.a = ayexVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x027a A[Catch: all -> 0x02dc, TryCatch #1 {, blocks: (B:14:0x0070, B:16:0x0077, B:18:0x007b, B:20:0x007f, B:22:0x0089, B:24:0x008d, B:25:0x02a7, B:28:0x00bb, B:30:0x00c5, B:31:0x0100, B:33:0x0107, B:34:0x011d, B:35:0x00d2, B:37:0x00d6, B:38:0x00df, B:40:0x00e9, B:41:0x00fa, B:42:0x00f2, B:43:0x0127, B:45:0x012b, B:50:0x0160, B:52:0x0164, B:53:0x018f, B:61:0x01ad, B:63:0x01b1, B:66:0x01e9, B:74:0x0276, B:76:0x027a, B:83:0x02aa, B:85:0x02ae, B:86:0x02db, B:47:0x0152, B:49:0x0156, B:54:0x0193, B:56:0x019d, B:58:0x01a5, B:64:0x01dd, B:67:0x0216, B:69:0x0238, B:71:0x0244, B:73:0x024a, B:77:0x0262, B:79:0x0266, B:81:0x0271), top: B:13:0x0070, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(java.util.List r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayeu.a(java.util.List, boolean):void");
    }

    private static final Status b(UrlResponseInfo urlResponseInfo) {
        return ayiu.a(urlResponseInfo.getHttpStatusCode());
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        Status status;
        ayix ayixVar = this.a.p;
        ayca aycaVar = ayix.m;
        synchronized (ayixVar.r) {
            status = this.a.p.w;
            if (status == null) {
                if (urlResponseInfo != null) {
                    status = b(urlResponseInfo);
                } else {
                    status = Status.c.withDescription("stream cancelled without reason");
                }
            }
        }
        this.a.r(status);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a.r(Status.o.c(cronetException));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        List list;
        Status withDescription;
        aycd aycdVar;
        byteBuffer.flip();
        ayix ayixVar = this.a.p;
        ayca aycaVar = ayix.m;
        synchronized (ayixVar.r) {
            this.a.p.x = z;
            if (byteBuffer.remaining() != 0) {
                ayix ayixVar2 = this.a.p;
                ayixVar2.v += byteBuffer.remaining();
                aymb a = aymf.a(byteBuffer);
                Status status = ayixVar2.n;
                if (status != null) {
                    String b = aymf.b(a, ayixVar2.p);
                    ayixVar2.n = status.a(b.length() != 0 ? "DATA-----------------------------\n".concat(b) : new String("DATA-----------------------------\n"));
                    if (ayixVar2.n.getDescription().length() > 1000) {
                        withDescription = ayixVar2.n;
                        aycdVar = ayixVar2.o;
                    }
                } else if (!ayixVar2.q) {
                    withDescription = Status.n.withDescription("headers not received before payload");
                    aycdVar = new aycd();
                } else {
                    a.f();
                    if (ayixVar2.l) {
                        ayfd.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                    } else {
                        try {
                            aygr aygrVar = ayixVar2.a;
                            if (!((aylm) aygrVar).b() && !((aylm) aygrVar).f) {
                                ((aylm) aygrVar).d.h(a);
                                ((aylm) aygrVar).a();
                            }
                        } catch (Throwable th) {
                            ayixVar2.k(th);
                        }
                    }
                }
                ayixVar2.l(withDescription, false, aycdVar);
            }
        }
        if (!z || (list = this.b) == null) {
            return;
        }
        a(list, true);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        a(urlResponseInfo.getAllHeadersAsList(), false);
        bidirectionalStream.read(ByteBuffer.allocateDirect(4096));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        boolean z;
        List asList = headerBlock.getAsList();
        this.b = asList;
        ayix ayixVar = this.a.p;
        ayca aycaVar = ayix.m;
        synchronized (ayixVar.r) {
            z = this.a.p.x;
        }
        if (z) {
            a(asList, true);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        ayix ayixVar = this.a.p;
        ayca aycaVar = ayix.m;
        synchronized (ayixVar.r) {
            this.a.p.m();
            ayix ayixVar2 = this.a.p;
            ayixVar2.t = true;
            for (ayev ayevVar : ayixVar2.s) {
                ayixVar2.z.s(ayevVar.a, ayevVar.b, ayevVar.c);
            }
            ayixVar2.s.clear();
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        boolean z;
        ayix ayixVar = this.a.p;
        ayca aycaVar = ayix.m;
        synchronized (ayixVar.r) {
            z = false;
            if (this.b != null && this.a.p.x) {
                z = true;
            }
        }
        if (!z) {
            List list = this.b;
            if (list != null) {
                a(list, true);
            } else if (urlResponseInfo != null) {
                a(urlResponseInfo.getAllHeadersAsList(), true);
            } else {
                throw new AssertionError("No response header or trailer");
            }
        }
        this.a.r(b(urlResponseInfo));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        ayix ayixVar = this.a.p;
        ayca aycaVar = ayix.m;
        synchronized (ayixVar.r) {
            ayex ayexVar = this.a;
            ayix ayixVar2 = ayexVar.p;
            boolean z2 = true;
            if (!ayixVar2.y) {
                ayixVar2.y = true;
                ayexVar.f.c();
            }
            ayix ayixVar3 = this.a.p;
            int position = byteBuffer.position();
            synchronized (ayixVar3.b) {
                amkq.O(ayixVar3.f, "onStreamAllocated was not called, but it seems the stream is active");
                int i = ayixVar3.e;
                int i2 = i - position;
                ayixVar3.e = i2;
                if (i < 32768 || i2 >= 32768) {
                    z2 = false;
                }
            }
            if (z2) {
                ayixVar3.b();
            }
        }
    }
}

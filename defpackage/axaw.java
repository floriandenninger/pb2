package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axaw extends UrlRequest.Callback {
    public final anhz a;
    public axam b;
    public awxr c;
    private final ExecutorService d;
    private final axav e;
    private final axat f;

    public axaw(ExecutorService executorService) {
        axat axatVar = new axat();
        this.d = executorService;
        axav axavVar = new axav();
        this.e = axavVar;
        this.a = anhz.a(axavVar);
        this.f = axatVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        axao axaoVar = new axao(axan.CANCELED, "");
        awxr awxrVar = this.c;
        if (awxrVar != null) {
            awxrVar.b(this.b);
        }
        this.e.a = new axap(axaoVar);
        this.d.execute(this.a);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        axan axanVar = axan.UNKNOWN;
        if (cronetException instanceof NetworkException) {
            switch (((NetworkException) cronetException).getErrorCode()) {
                case 1:
                    axanVar = axan.BAD_URL;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    axanVar = axan.CONNECTION_ERROR;
                    break;
            }
        }
        axao axaoVar = new axao(axanVar, cronetException);
        awxr awxrVar = this.c;
        if (awxrVar != null) {
            awxrVar.b(this.b);
        }
        this.e.a = new axap(axaoVar);
        this.d.execute(this.a);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        axat axatVar = this.f;
        amkq.N(!axatVar.b);
        if (byteBuffer != axatVar.a.peekLast()) {
            axatVar.a.addLast(byteBuffer);
        }
        if (!byteBuffer.hasRemaining()) {
            byteBuffer = ByteBuffer.allocateDirect(8192);
        }
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.cancel();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.net.UrlRequest.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResponseStarted(org.chromium.net.UrlRequest r10, org.chromium.net.UrlResponseInfo r11) {
        /*
            r9 = this;
            axat r0 = r9.f
            boolean r0 = r0.b
            r1 = 1
            r0 = r0 ^ r1
            defpackage.amkq.N(r0)
            java.util.Map r11 = r11.getAllHeaders()
            java.lang.String r0 = "content-length"
            boolean r2 = r11.containsKey(r0)
            r3 = 524288(0x80000, double:2.590327E-318)
            if (r2 == 0) goto L5d
            r2 = 0
            r5 = 0
            java.lang.Object r0 = r11.get(r0)     // Catch: java.lang.NumberFormatException -> L2c
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.NumberFormatException -> L2c
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.NumberFormatException -> L2c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L2c
            long r7 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L2c
            goto L2d
        L2c:
            r7 = r5
        L2d:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L5d
            java.lang.String r0 = "content-encoding"
            boolean r5 = r11.containsKey(r0)
            if (r5 == 0) goto L59
            java.lang.Object r5 = r11.get(r0)
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            if (r5 != r1) goto L57
            java.lang.Object r11 = r11.get(r0)
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = r11.get(r2)
            java.lang.String r0 = "identity"
            boolean r11 = r0.equals(r11)
            if (r11 != 0) goto L59
        L57:
            long r7 = r7 + r7
            goto L5e
        L59:
            r0 = 1
            long r7 = r7 + r0
            goto L5e
        L5d:
            r7 = r3
        L5e:
            long r0 = java.lang.Math.min(r7, r3)
            int r11 = (int) r0
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocateDirect(r11)
            r10.read(r11)
            awxr r10 = r9.c
            if (r10 == 0) goto L71
            r10.d()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axaw.onResponseStarted(org.chromium.net.UrlRequest, org.chromium.net.UrlResponseInfo):void");
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ByteBuffer byteBuffer;
        awzx awzxVar = new awzx();
        for (Map.Entry entry : urlResponseInfo.getAllHeadersAsList()) {
            awzxVar.d((String) entry.getKey(), (String) entry.getValue());
        }
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        axat axatVar = this.f;
        amkq.N(!axatVar.b);
        axatVar.b = true;
        Iterator it = axatVar.a.iterator();
        while (it.hasNext()) {
        }
        if (axatVar.a.isEmpty()) {
            byteBuffer = ByteBuffer.allocateDirect(0);
        } else if (axatVar.a.size() == 1) {
            byteBuffer = (ByteBuffer) axatVar.a.remove();
        } else {
            Iterator it2 = axatVar.a.iterator();
            int i = 0;
            while (it2.hasNext()) {
                i += ((ByteBuffer) it2.next()).remaining();
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
            while (!axatVar.a.isEmpty()) {
                allocateDirect.put((ByteBuffer) axatVar.a.remove());
            }
            byteBuffer = allocateDirect;
        }
        awzy awzyVar = new awzy(httpStatusCode, awzxVar, new vcn(byteBuffer));
        awxr awxrVar = this.c;
        if (awxrVar != null) {
            awxrVar.c(this.b);
        }
        this.e.a = new axap(awzyVar);
        this.d.execute(this.a);
    }
}

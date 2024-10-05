package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.StandardOpenOption;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sfe extends UrlRequest.Callback {
    private final aes a;
    private final File b;
    private FileChannel c;
    private Exception d;

    public sfe(aes aesVar, File file) {
        this.a = aesVar;
        this.b = file;
    }

    private final boolean a() {
        FileChannel fileChannel = this.c;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException e) {
                this.d = e;
            }
            this.c = null;
        }
        Exception exc = this.d;
        if (exc == null) {
            return true;
        }
        this.a.d(exc);
        return false;
    }

    private static final void b(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int receivedByteCount = (int) urlResponseInfo.getReceivedByteCount();
        if (receivedByteCount <= 0) {
            receivedByteCount = 8192;
        }
        urlRequest.read(ByteBuffer.allocateDirect(receivedByteCount));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (a()) {
            this.a.b();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (a()) {
            this.a.d(cronetException);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        try {
            this.c.write(byteBuffer);
            b(urlRequest, urlResponseInfo);
        } catch (IOException e) {
            this.d = e;
            urlRequest.cancel();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        try {
            this.c = FileChannel.open(this.b.toPath(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            b(urlRequest, urlResponseInfo);
        } catch (IOException e) {
            this.c = null;
            this.d = e;
            urlRequest.cancel();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (a()) {
            this.a.c(true);
        }
    }
}

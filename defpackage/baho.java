package defpackage;

import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baho implements Runnable {
    final /* synthetic */ VersionSafeCallbacks$UrlRequestStatusListener a;
    final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public baho(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i, int i2) {
        this.c = i2;
        this.a = versionSafeCallbacks$UrlRequestStatusListener;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        if (this.c == 0) {
            this.a.onStatus(this.b);
            return;
        }
        VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = this.a;
        switch (this.b) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
            default:
                throw new IllegalArgumentException("No request status found.");
            case 6:
                i = 5;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 7;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 9;
                break;
            case 11:
                i = 10;
                break;
            case 12:
                i = 11;
                break;
            case 13:
                i = 12;
                break;
            case 14:
                i = 13;
                break;
            case 15:
                i = 14;
                break;
        }
        versionSafeCallbacks$UrlRequestStatusListener.onStatus(i);
    }
}

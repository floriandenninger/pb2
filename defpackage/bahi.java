package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bahi implements Runnable {
    final /* synthetic */ bahx a;
    private final /* synthetic */ int b;

    public bahi(bahx bahxVar, int i) {
        this.b = i;
        this.a = bahxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            ReadableByteChannel readableByteChannel = this.a.n;
            if (readableByteChannel != null) {
                try {
                    readableByteChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.a.n = null;
                return;
            }
            return;
        }
        if (i != 1) {
            if (i == 2) {
                bahx bahxVar = this.a;
                bahxVar.f.add(bahxVar.m);
                this.a.l();
                return;
            } else {
                bahx bahxVar2 = this.a;
                bahxVar2.m = bahxVar2.p;
                bahxVar2.p = null;
                bahxVar2.l();
                return;
            }
        }
        bahe baheVar = this.a.r;
        if (baheVar != null) {
            try {
                baheVar.d();
            } catch (IOException e2) {
                Log.e(bahx.a, "Exception when closing OutputChannel", e2);
            }
        }
        HttpURLConnection httpURLConnection = this.a.q;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.a.q = null;
        }
    }
}

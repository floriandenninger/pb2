package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import com.google.research.xeno.effect.AssetDownloader;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sda implements anhh {
    final /* synthetic */ AssetDownloader.DownloadCallback a;
    final /* synthetic */ File b;
    final /* synthetic */ String c;
    final /* synthetic */ SettableFuture d;

    public sda(AssetDownloader.DownloadCallback downloadCallback, File file, String str, SettableFuture settableFuture) {
        this.a = downloadCallback;
        this.b = file;
        this.c = str;
        this.d = settableFuture;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (Boolean.TRUE.equals((Boolean) obj)) {
            this.a.onCompletion(this.b.getAbsolutePath(), null);
        } else {
            AssetDownloader.DownloadCallback downloadCallback = this.a;
            String valueOf = String.valueOf(this.c);
            downloadCallback.onCompletion(null, valueOf.length() != 0 ? "Failed to download ".concat(valueOf) : new String("Failed to download "));
        }
        this.d.o(null);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        this.a.onCompletion(null, th.toString());
        this.d.o(null);
    }
}

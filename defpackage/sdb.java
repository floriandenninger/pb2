package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import com.google.research.xeno.effect.AssetDownloader;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sdb implements AssetDownloader {
    public final CronetEngine a;
    public final Executor b;
    public final sfh c;
    public final HashSet d = new HashSet();

    public sdb(CronetEngine cronetEngine, Executor executor, Executor executor2) {
        this.a = cronetEngine;
        this.b = executor;
        this.c = new sfh(executor2);
    }

    @Override // com.google.research.xeno.effect.AssetDownloader
    public final void downloadAsset(final String str, final AssetDownloader.DownloadCallback downloadCallback) {
        synchronized (this.c) {
            if (this.c.b(new sfg() { // from class: scz
                @Override // defpackage.sfg
                public final anhy a() {
                    sdb sdbVar = sdb.this;
                    AssetDownloader.DownloadCallback downloadCallback2 = downloadCallback;
                    final String str2 = str;
                    try {
                        final File createTempFile = File.createTempFile("asset", ".tmp");
                        createTempFile.deleteOnExit();
                        final CronetEngine cronetEngine = sdbVar.a;
                        final Executor executor = sdbVar.b;
                        anhy c = aci.c(new aeu() { // from class: sfd
                            @Override // defpackage.aeu
                            public final Object a(aes aesVar) {
                                CronetEngine cronetEngine2 = CronetEngine.this;
                                String str3 = str2;
                                File file = createTempFile;
                                cronetEngine2.newUrlRequestBuilder(str3, new sfe(aesVar, file), executor).build().start();
                                String absolutePath = file.getAbsolutePath();
                                StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 26 + String.valueOf(str3).length());
                                sb.append("UrlRequest to file: ");
                                sb.append(absolutePath);
                                sb.append(" for: ");
                                sb.append(str3);
                                return sb.toString();
                            }
                        });
                        synchronized (sdbVar.c) {
                            sdbVar.d.add(c);
                        }
                        SettableFuture f = SettableFuture.f();
                        anaf.Y(c, new sda(downloadCallback2, createTempFile, str2, f), sdbVar.b);
                        return f;
                    } catch (IOException e) {
                        downloadCallback2.onCompletion(null, e.toString());
                        return anaf.N(e);
                    }
                }
            }).isCancelled()) {
                downloadCallback.onCompletion(null, "Download cancelled.");
            }
        }
    }
}

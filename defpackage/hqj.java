package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.video.media.VideoMetaData;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hqj {
    public final Context a;
    public final Executor b;
    public final hrq c;
    public zyj d;
    public VideoMetaData e;
    public hqv f;
    private final dd g;
    private vyj h;

    public hqj(Executor executor, ci ciVar, hrq hrqVar) {
        this.a = ciVar;
        this.g = ciVar.getSupportFragmentManager();
        this.b = executor;
        this.c = hrqVar;
    }

    public static VideoMetaData a(Context context, Uri uri) {
        vuv a = vuw.a();
        a.c(true);
        a.b(true);
        a.d(true);
        return vux.b(context, uri, a.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final vyj b() {
        vyj vyjVar = this.h;
        if (vyjVar != null) {
            return vyjVar;
        }
        dd ddVar = this.g;
        if (ddVar == null || ddVar.x || ddVar.Y()) {
            afsi.b(1, 24, "Attempted fragment add (ThumbnailProducer) after instance state saved; finish activity.");
            throw new IllegalStateException("Attempted fragment add (ThumbnailProducer) after instance state saved; finish activity.");
        }
        ce f = this.g.f("thumbnail_producer");
        if (!(f instanceof vyj)) {
            f = new vyj();
            dn k = this.g.k();
            k.r(f, "thumbnail_producer");
            k.a();
        }
        vyj vyjVar2 = (vyj) f;
        this.h = vyjVar2;
        vyjVar2.n(this.d.a);
        this.h.d(true);
        return this.h;
    }
}

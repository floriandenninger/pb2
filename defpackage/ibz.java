package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ibz implements ykl {
    final /* synthetic */ ykl a;
    final /* synthetic */ Uri b;
    final /* synthetic */ int c;
    final /* synthetic */ ica d;

    public ibz(ica icaVar, ykl yklVar, Uri uri, int i) {
        this.d = icaVar;
        this.a = yklVar;
        this.b = uri;
        this.c = i;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.a.a((Uri) obj, exc);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        final Uri uri = (Uri) obj;
        final byte[] bArr = (byte[]) obj2;
        Executor executor = this.d.d;
        final ykl yklVar = this.a;
        final Uri uri2 = this.b;
        final int i = this.c;
        executor.execute(new Runnable() { // from class: iby
            @Override // java.lang.Runnable
            public final void run() {
                ibz ibzVar = ibz.this;
                Uri uri3 = uri;
                byte[] bArr2 = bArr;
                ykl yklVar2 = yklVar;
                Uri uri4 = uri2;
                int i2 = i;
                ica icaVar = ibzVar.d;
                yjk.e();
                icn icnVar = icaVar.e;
                String lastPathSegment = uri3.getLastPathSegment();
                yjk.e();
                if (!icnVar.a.h() || lastPathSegment == null || !((zom) icnVar.a.c()).b(lastPathSegment, bArr2)) {
                    yklVar2.a(uri3, new IOException());
                    return;
                }
                if (ica.c(uri4)) {
                    bArr2 = ica.d(bArr2, i2);
                }
                ibzVar.d.b(uri4, bArr2);
                try {
                    yklVar2.b(uri3, ibzVar.d.c.b(bArr2));
                } catch (zjg e) {
                    yklVar2.a(uri4, e);
                }
            }
        });
    }
}

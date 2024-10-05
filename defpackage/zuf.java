package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zuf {
    public zom a;
    public final Context b;
    public final Executor c;
    public final shf d;

    public zuf(Context context, shf shfVar, Executor executor) {
        this.b = context;
        this.c = executor;
        this.d = shfVar;
    }

    public final void a(final String str, final byte[] bArr, final zue zueVar) {
        this.c.execute(new Runnable() { // from class: zuc
            @Override // java.lang.Runnable
            public final void run() {
                zuf zufVar = zuf.this;
                String str2 = str;
                zue zueVar2 = zueVar;
                byte[] bArr2 = bArr;
                zom zomVar = zufVar.a;
                if (zomVar == null) {
                    return;
                }
                File file = zomVar.a;
                if (file == null || !file.exists() || !new File(file, str2).exists()) {
                    zueVar2.a(zufVar.a.b(str2, bArr2));
                } else {
                    zueVar2.a(true);
                }
            }
        });
    }
}

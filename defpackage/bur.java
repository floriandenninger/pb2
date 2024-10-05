package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bur implements buk {
    public final Object a = new Object();
    public buq b;
    public boolean c;
    private final Context d;
    private final String e;
    private final bug f;
    private final boolean g;

    public bur(Context context, String str, bug bugVar, boolean z) {
        this.d = context;
        this.e = str;
        this.f = bugVar;
        this.g = z;
    }

    @Override // defpackage.buk
    public final buo a() {
        return b().c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b().close();
    }

    private final buq b() {
        buq buqVar;
        synchronized (this.a) {
            if (this.b == null) {
                buo[] buoVarArr = new buo[1];
                if (Build.VERSION.SDK_INT < 23 || this.e == null || !this.g) {
                    this.b = new buq(this.d, this.e, buoVarArr, this.f);
                } else {
                    this.b = new buq(this.d, new File(this.d.getNoBackupFilesDir(), this.e).getAbsolutePath(), buoVarArr, this.f);
                }
                this.b.setWriteAheadLoggingEnabled(this.c);
            }
            buqVar = this.b;
        }
        return buqVar;
    }
}

package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cqt implements cqw {
    private final String a;
    private final AssetManager b;
    private Object c;

    public cqt(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    @Override // defpackage.cqw
    public final void b() {
    }

    @Override // defpackage.cqw
    public final void c() {
        Object obj = this.c;
        if (obj != null) {
            try {
                g(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.cqw
    public final void d(cof cofVar, cqv cqvVar) {
        try {
            Object f = f(this.b, this.a);
            this.c = f;
            cqvVar.f(f);
        } catch (IOException e) {
            cqvVar.g(e);
        }
    }

    @Override // defpackage.cqw
    public final int e() {
        return 1;
    }

    protected abstract Object f(AssetManager assetManager, String str);

    protected abstract void g(Object obj);
}

package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baic extends baib {
    private baim o;

    public baic(Context context) {
        super(context);
    }

    @Override // defpackage.bage
    public final baim b() {
        return this.o;
    }

    @Override // defpackage.bage
    public final void f(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.o = new baim(libraryLoader);
    }

    @Override // defpackage.baib, defpackage.bage, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        f(libraryLoader);
        return this;
    }
}

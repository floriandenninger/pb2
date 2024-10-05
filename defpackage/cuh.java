package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuh implements cub {
    private final cuj a;

    public cuh(Context context) {
        this.a = new cuj(context);
    }

    @Override // defpackage.cub
    public final cuc a() {
        cuj cujVar = this.a;
        File cacheDir = cujVar.a.getCacheDir();
        File file = cacheDir == null ? null : new File(cacheDir, cujVar.b);
        if (file == null) {
            return null;
        }
        if (file.isDirectory() || file.mkdirs()) {
            return new cui(file);
        }
        return null;
    }
}

package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yjz implements axqr {
    private final azrw a;
    private final azrw b;

    public yjz(azrw azrwVar, azrw azrwVar2) {
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public static yjz a(azrw azrwVar, azrw azrwVar2) {
        return new yjz(azrwVar, azrwVar2);
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final File get() {
        return yjk.b((Context) ((axqs) this.a).a, (String) ((axqs) this.b).a);
    }
}

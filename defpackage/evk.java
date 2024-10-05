package defpackage;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class evk {
    public final AudioManager a;

    public evk(Context context) {
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        this.a = (AudioManager) systemService;
    }
}

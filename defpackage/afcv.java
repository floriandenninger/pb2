package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afcv {
    public final Context a;
    public final Intent b;
    public int c = -1;
    public final afhs d;
    private final Intent e;

    public afcv(Context context, afhs afhsVar) {
        this.a = context;
        this.d = afhsVar;
        Intent intent = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
        this.b = intent;
        intent.putExtra("android.media.extra.PACKAGE_NAME", context.getPackageName());
        Intent intent2 = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
        this.e = intent2;
        intent2.putExtra("android.media.extra.PACKAGE_NAME", context.getPackageName());
    }

    public final void a(int i) {
        int bb;
        if ((this.d.D() || ((bb = aocz.bb(this.d.o().d)) != 0 && bb == 3)) && this.c == i && i != -1) {
            this.e.putExtra("android.media.extra.AUDIO_SESSION", i);
            this.a.sendBroadcast(this.e);
            this.c = -1;
        }
    }
}

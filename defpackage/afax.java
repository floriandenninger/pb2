package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper$Listener;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afax {
    public final /* synthetic */ Context a;
    public final /* synthetic */ azrw b;
    public final /* synthetic */ aeqg c;

    public /* synthetic */ afax(Context context, azrw azrwVar, aeqg aeqgVar) {
        this.a = context;
        this.b = azrwVar;
        this.c = aeqgVar;
    }

    public final aepx a(WidevineHelper$Listener widevineHelper$Listener, int i, PlayerConfigModel playerConfigModel) {
        Context context = this.a;
        return new aepx(widevineHelper$Listener, i, playerConfigModel, yjj.k(context), this.b, this.c);
    }
}

package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abnc extends abmf {
    private final azrw c;
    private final aahd d;

    public abnc(azrw azrwVar, Context context, aahd aahdVar, ajut ajutVar, advq advqVar, byte[] bArr) {
        super(context, ajutVar, advqVar, null);
        azrwVar.getClass();
        this.c = azrwVar;
        aahdVar.getClass();
        this.d = aahdVar;
    }

    @Override // defpackage.abmf
    public final int d() {
        return R.layout.live_chat_light_viewer_engagement_message;
    }

    @Override // defpackage.abmf
    public final aahd e() {
        return this.d;
    }

    @Override // defpackage.abmf
    public final Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", (abgl) this.c.get());
        return hashMap;
    }
}

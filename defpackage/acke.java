package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acke extends abmf {
    private final azrw c;
    private final aahd d;

    public acke(azrw azrwVar, Context context, aahd aahdVar, ajut ajutVar, advq advqVar, byte[] bArr) {
        super(context, ajutVar, advqVar, null);
        azrwVar.getClass();
        this.c = azrwVar;
        aahdVar.getClass();
        this.d = aahdVar;
        int dimensionPixelOffset = this.b.getDimensionPixelOffset(R.dimen.live_chat_vem_margin_vertical);
        int dimensionPixelOffset2 = this.b.getDimensionPixelOffset(R.dimen.live_chat_vem_margin_horizontal);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = dimensionPixelOffset;
        marginLayoutParams.bottomMargin = dimensionPixelOffset;
        marginLayoutParams.leftMargin = dimensionPixelOffset2;
        marginLayoutParams.rightMargin = dimensionPixelOffset2;
        this.a.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.abmf
    public final int d() {
        return R.layout.live_chat_light_overlay_viewer_engagement_message;
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

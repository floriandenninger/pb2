package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.google.protos.youtube.api.innertube.CopyTextEndpointOuterClass$CopyTextEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ewu implements aaha {
    private final Context a;
    private final aahd b;

    public ewu(Context context, aahd aahdVar) {
        this.a = context;
        aahdVar.getClass();
        this.b = aahdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        CopyTextEndpointOuterClass$CopyTextEndpoint copyTextEndpointOuterClass$CopyTextEndpoint = (CopyTextEndpointOuterClass$CopyTextEndpoint) apxfVar.pX(CopyTextEndpointOuterClass$CopyTextEndpoint.copyTextEndpoint);
        ((ClipboardManager) this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text/plain", copyTextEndpointOuterClass$CopyTextEndpoint.b));
        this.b.d(copyTextEndpointOuterClass$CopyTextEndpoint.c, null);
    }
}

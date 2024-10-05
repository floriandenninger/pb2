package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ewe implements aaha {
    private final Context a;
    private final aahd b;
    private final ajdh c;

    public ewe(Context context, aahd aahdVar, ajdh ajdhVar) {
        this.a = context;
        aahdVar.getClass();
        this.b = aahdVar;
        ajdhVar.getClass();
        this.c = ajdhVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aowf aowfVar = ((AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint) apxfVar.pX(AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.adChoicesDialogEndpoint)).b;
        if (aowfVar == null) {
            aowfVar = aowf.a;
        }
        aqvu aqvuVar = aowfVar.c;
        if (aqvuVar == null) {
            aqvuVar = aqvu.a;
        }
        ajdj.g(this.a, aqvuVar, this.b, this.c, yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"));
    }
}

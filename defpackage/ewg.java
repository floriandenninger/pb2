package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import com.google.protos.youtube.api.innertube.AdFeedbackEndpointOuterClass$AdFeedbackEndpoint;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ewg implements aaha {
    private final Activity a;
    private final aahd b;
    private final ypa c;
    private final ajdh d;

    public ewg(Activity activity, aahd aahdVar, ypa ypaVar, ajdh ajdhVar) {
        this.a = activity;
        aahdVar.getClass();
        this.b = aahdVar;
        ypaVar.getClass();
        this.c = ypaVar;
        this.d = ajdhVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        Activity activity = this.a;
        aowr aowrVar = ((AdFeedbackEndpointOuterClass$AdFeedbackEndpoint) apxfVar.pX(AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.adFeedbackEndpoint)).b;
        if (aowrVar == null) {
            aowrVar = aowr.a;
        }
        aowt aowtVar = aowrVar.b;
        if (aowtVar == null) {
            aowtVar = aowt.a;
        }
        aahd aahdVar = this.b;
        ypa ypaVar = this.c;
        ajdh ajdhVar = this.d;
        Object s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        xhv xhvVar = new xhv(activity, aowtVar, aahdVar, ypaVar, ajdhVar, s);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        aqyg aqygVar4 = null;
        if ((aowtVar.b & 1) != 0) {
            aqygVar = aowtVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        builder.setTitle(ajcq.b(aqygVar));
        if (aowtVar.g.size() > 0) {
            CharSequence[] charSequenceArr = new CharSequence[aowtVar.g.size()];
            for (int i = 0; i < aowtVar.g.size(); i++) {
                if ((((aows) aowtVar.g.get(i)).b & 1) != 0) {
                    aqygVar3 = ((aows) aowtVar.g.get(i)).c;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                } else {
                    aqygVar3 = null;
                }
                charSequenceArr[i] = ajcq.b(aqygVar3);
            }
            builder.setSingleChoiceItems(charSequenceArr, -1, xhvVar);
        }
        if ((aowtVar.b & 4) != 0) {
            aqygVar2 = aowtVar.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        builder.setNegativeButton(ajcq.b(aqygVar2), xhvVar);
        if ((aowtVar.b & 2) != 0 && (aqygVar4 = aowtVar.d) == null) {
            aqygVar4 = aqyg.a;
        }
        builder.setPositiveButton(ajcq.b(aqygVar4), xhvVar);
        builder.setCancelable(false);
        if ((aowtVar.b & 64) != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", s);
            apxf apxfVar2 = aowtVar.i;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar.c(apxfVar2, hashMap);
        }
        xhvVar.j(builder.create());
        xhvVar.k();
        xhvVar.i.getButton(-1).setEnabled(false);
    }
}

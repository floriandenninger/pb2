package defpackage;

import com.google.protos.youtube.api.innertube.OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xqz implements aaha {
    private final xqx a;

    public xqz(xqx xqxVar) {
        this.a = xqxVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction = (OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction) apxfVar.pX(OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.openCreateReplyDialogAction);
        xqx xqxVar = this.a;
        xou xouVar = (xou) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", xou.class);
        aqgt aqgtVar = openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.b;
        if (aqgtVar == null) {
            aqgtVar = aqgt.a;
        }
        aqgt aqgtVar2 = aqgtVar;
        apxl apxlVar = openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.c;
        if (apxlVar == null) {
            apxlVar = apxl.a;
        }
        apxl apxlVar2 = apxlVar;
        apxl apxlVar3 = openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.d;
        if (apxlVar3 == null) {
            apxlVar3 = apxl.a;
        }
        xqxVar.a(xouVar, aqgtVar2, apxlVar2, apxlVar3, false);
    }
}

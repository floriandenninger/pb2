package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agao implements aaha {
    private final Context a;
    private final acra b;

    public agao(Context context, acra acraVar) {
        this.a = context;
        this.b = acraVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.removeNotificationTrayItemAction)) {
            RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction = (RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction) apxfVar.pX(RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.removeNotificationTrayItemAction);
            aear.V(this.a, this.b, agbs.a(removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.b, removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.c));
        }
    }
}

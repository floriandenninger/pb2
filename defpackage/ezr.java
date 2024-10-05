package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ezr implements aaha {
    private final qwk a;
    private final qob b;

    public ezr(Context context) {
        this.b = qwj.e(context);
        this.a = new qwk(context);
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        String str = (String) yjj.u(map, "SilentSubmitUserFeedbackCommandResolver.DESCRIPTION_KEY", String.class);
        if (str == null || str.length() == 0) {
            return;
        }
        SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand = (SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand) apxfVar.pX(SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.silentSubmitUserFeedbackCommand);
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : Collections.unmodifiableMap(silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.c).entrySet()) {
            hashMap.put((String) entry.getKey(), (String) entry.getValue());
        }
        qwk qwkVar = this.a;
        qwkVar.b = str;
        qwkVar.c = silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.b;
        qwkVar.c();
        qwkVar.b(true);
        for (Map.Entry entry2 : hashMap.entrySet()) {
            qwkVar.a.putString((String) entry2.getKey(), (String) entry2.getValue());
        }
        this.b.z(qwkVar.a());
    }
}

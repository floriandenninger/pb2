package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afxy implements ylb {
    public final afya a;
    private final agcm b;

    public afxy(afya afyaVar, agcm agcmVar) {
        this.a = afyaVar;
        this.b = agcmVar;
    }

    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        final String string = bundle.getString("renderer_class_name");
        if (string == null) {
            return 1;
        }
        final String string2 = bundle.getString("unique_payload_id");
        byte[] byteArray = bundle.getByteArray("com.google.android.libraries.youtube.notification.pref.notification_renderer");
        if (byteArray != null) {
            this.a.a(byteArray, string);
            return 0;
        }
        if (string2 == null) {
            return 1;
        }
        final agcm agcmVar = this.b;
        return ((Integer) ynm.g(anfq.h(anfq.i(anfq.h(agcmVar.a.a(), new wgs(string2, 20), angq.a), new anfz() { // from class: agcl
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                final aomf aomfVar = (aomf) obj;
                return anfq.h(agcm.this.a.b(new ailh(string2, 1), angq.a), new amml() { // from class: agcj
                    @Override // defpackage.amml
                    public final Object apply(Object obj2) {
                        return aomf.this;
                    }
                }, angq.a);
            }
        }, angq.a), new amml() { // from class: afxx
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                afxy afxyVar = afxy.this;
                afxyVar.a.a(((aomf) obj).I(), string);
                return 0;
            }
        }, angq.a), 1L, TimeUnit.HOURS, 1)).intValue();
    }
}

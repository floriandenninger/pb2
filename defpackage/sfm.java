package defpackage;

import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class sfm implements amml {
    public final /* synthetic */ sgu a;
    private final /* synthetic */ int b;

    public /* synthetic */ sfm(sgu sguVar, int i) {
        this.b = i;
        this.a = sguVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.b == 0) {
            try {
                ((edu) obj).b(this.a);
                return null;
            } catch (RemoteException e) {
                ((amxh) ((amxh) ((amxh) sfp.a.f()).h(e)).i("com/google/android/libraries/assistant/appintegration/AssistantConnector", "lambda$sendData$2", (char) 131, "AssistantConnector.java")).q("Can't send data");
                return null;
            }
        }
        return Boolean.valueOf(((edu) obj).c(this.a));
    }
}

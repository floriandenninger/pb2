package defpackage;

import com.google.vr.vrcore.controller.api.ControllerRequest;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class axhs implements Runnable {
    public final /* synthetic */ ControllerServiceBridge a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ControllerRequest c;
    private final /* synthetic */ int d;

    public /* synthetic */ axhs(ControllerServiceBridge controllerServiceBridge, int i, ControllerRequest controllerRequest, int i2) {
        this.d = i2;
        this.a = controllerServiceBridge;
        this.b = i;
        this.c = controllerRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            this.a.c(this.b, this.c);
        } else {
            this.a.c(this.b, this.c);
        }
    }
}

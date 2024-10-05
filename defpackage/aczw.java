package defpackage;

import com.google.android.libraries.youtube.mdx.handoff.HandoffCoordinator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aczw implements ynl {
    public final /* synthetic */ HandoffCoordinator a;
    public final /* synthetic */ adah b;
    private final /* synthetic */ int c;

    public /* synthetic */ aczw(HandoffCoordinator handoffCoordinator, adah adahVar, int i) {
        this.c = i;
        this.a = handoffCoordinator;
        this.b = adahVar;
    }

    @Override // defpackage.ynl, defpackage.zfi
    public final void a(Object obj) {
        if (this.c == 0) {
            HandoffCoordinator handoffCoordinator = this.a;
            adah adahVar = this.b;
            handoffCoordinator.b.a((arsw) obj, adahVar);
            return;
        }
        HandoffCoordinator handoffCoordinator2 = this.a;
        adah adahVar2 = this.b;
        handoffCoordinator2.b.a((arsw) obj, adahVar2);
    }
}

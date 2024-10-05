package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ixi implements ykl {
    final /* synthetic */ ixj a;
    private final /* synthetic */ int b;

    public ixi(ixj ixjVar, int i) {
        this.b = i;
        this.a = ixjVar;
    }

    @Override // defpackage.ykl
    public final /* synthetic */ void b(Object obj, Object obj2) {
        if (this.b == 0) {
            this.a.aI((PlayerResponseModel) obj2);
        } else {
            ixj ixjVar = this.a;
            ixjVar.az = (PlayerResponseModel) obj2;
            if (ixjVar.az != null) {
                ixjVar.aM();
            }
        }
    }

    @Override // defpackage.ykl
    public final /* synthetic */ void a(Object obj, Exception exc) {
        if (this.b == 0) {
            zaw zawVar = this.a.aA;
            zawVar.d(zawVar.b(exc));
            this.a.an.m(this);
            return;
        }
        ixj ixjVar = this.a;
        ixjVar.az = null;
        ixjVar.ae.setVisibility(8);
        ixjVar.af.setVisibility(0);
        ixjVar.ag.setVisibility(8);
    }
}

package defpackage;

import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jwp implements akbl {
    final /* synthetic */ jws a;

    public jwp(jws jwsVar) {
        this.a = jwsVar;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
        acra mM = this.a.e.mM();
        InteractionLoggingScreen c = mM.c();
        if (c != null) {
            acsa acsaVar = new acsa(c, acrb.OFFLINE_VIDEO_DOWNLOADING_SNACKBAR);
            acsa acsaVar2 = new acsa(c, acrb.OFFLINE_VIDEO_DOWNLOADING_SNACKBAR_VIEW_BUTTON);
            mM.n(acsaVar);
            mM.o(acsaVar2, acsaVar);
        }
    }
}

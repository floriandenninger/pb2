package defpackage;

import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsk implements acsm {
    private final acre a;
    private final InteractionLoggingScreen b;
    private final acrr c;

    public acsk(acre acreVar, final InteractionLoggingScreen interactionLoggingScreen) {
        this.a = acreVar;
        this.b = interactionLoggingScreen;
        this.c = new acrr(acreVar, new acrq() { // from class: acsj
            @Override // defpackage.acrq
            public final InteractionLoggingScreen c() {
                return InteractionLoggingScreen.this;
            }
        }, acrz.b);
    }

    @Override // defpackage.acsm
    public final void I(int i, acsa acsaVar, asht ashtVar) {
        adyu.ci(this.a, this.b, 3, acsaVar, null);
    }

    @Override // defpackage.acsm
    public final void u(acsa acsaVar, asht ashtVar) {
        adyu.ch(this.c, acsaVar, null);
    }
}

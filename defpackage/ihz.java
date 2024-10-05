package defpackage;

import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ihz implements ahqq {
    public String a;
    public String b;
    private final ion c;
    private final ijp d;

    public ihz(acsh acshVar, imu imuVar, ion ionVar) {
        this.c = ionVar;
        this.d = new ijp(acshVar, imuVar);
    }

    @Override // defpackage.ahqq
    public final InteractionLoggingScreen a(acra acraVar, apxf apxfVar, ahqt ahqtVar) {
        if (apxfVar == null) {
            zga.b("No reel nav endpoint.");
            return null;
        }
        return this.d.a(Optional.ofNullable(this.c.b), acraVar, apxfVar, this.a, this.b, false, false);
    }
}

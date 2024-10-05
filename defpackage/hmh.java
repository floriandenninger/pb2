package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.protos.youtube.api.innertube.SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hmh implements aaha {
    private final ci a;
    private final hmw b;
    private final acqz c;

    public hmh(ci ciVar, hmw hmwVar, acqz acqzVar) {
        this.a = ciVar;
        this.b = hmwVar;
        this.c = acqzVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        ShortsCreationSelectedTrack a;
        amkq.E(apxfVar.pY(SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.sfvAudioItemSelectCommand));
        dd supportFragmentManager = this.a.getSupportFragmentManager();
        for (int a2 = supportFragmentManager.a(); a2 > 0; a2--) {
            supportFragmentManager.Z();
        }
        this.c.mM().I(3, new acqx(apxfVar.c), null);
        hmw hmwVar = this.b;
        SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand = (SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand) apxfVar.pX(SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.sfvAudioItemSelectCommand);
        hmwVar.h = false;
        hmwVar.i = true;
        azqv azqvVar = hmwVar.b;
        hmx m = ShortsCreationSelectedTrack.m();
        m.d(sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.c);
        if ((sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.b & 4) == 0) {
            a = m.a();
        } else {
            aurh aurhVar = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.e;
            if (aurhVar == null) {
                aurhVar = aurh.a;
            }
            if ((1 & aurhVar.b) != 0) {
                aurh aurhVar2 = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.e;
                if (aurhVar2 == null) {
                    aurhVar2 = aurh.a;
                }
                avgg avggVar = aurhVar2.c;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                m.c = avggVar;
            }
            aurh aurhVar3 = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.e;
            if (aurhVar3 == null) {
                aurhVar3 = aurh.a;
            }
            if ((aurhVar3.b & 2) != 0) {
                aurh aurhVar4 = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.e;
                if (aurhVar4 == null) {
                    aurhVar4 = aurh.a;
                }
                m.e = aurhVar4.d;
            }
            if ((sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.b & 8) != 0) {
                apxf apxfVar2 = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.g;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                m.b = apxfVar2;
            }
            m.a = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.d;
            m.b(false);
            m.c(fkc.y(sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand));
            a = m.a();
        }
        azqvVar.c(ammv.j(a));
        if ((sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.b & 8) == 0) {
            hmwVar.g(fkc.y(sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand));
        }
        String str = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.c;
        String str2 = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.d;
        apxf apxfVar3 = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.g;
        if (apxfVar3 == null) {
            apxfVar3 = apxf.a;
        }
        hmwVar.d(str, str2, apxfVar3);
    }
}

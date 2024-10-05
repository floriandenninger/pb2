package defpackage;

import com.google.protos.youtube.api.innertube.RunAttestationCommandOuterClass$RunAttestationCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aact implements aaha {
    private final aacs a;

    public aact(aacs aacsVar) {
        this.a = aacsVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(RunAttestationCommandOuterClass$RunAttestationCommand.runAttestationCommand)) {
            aacs aacsVar = this.a;
            RunAttestationCommandOuterClass$RunAttestationCommand runAttestationCommandOuterClass$RunAttestationCommand = (RunAttestationCommandOuterClass$RunAttestationCommand) apxfVar.pX(RunAttestationCommandOuterClass$RunAttestationCommand.runAttestationCommand);
            afsx c = aacsVar.b.c();
            aatw a = aacsVar.f.a(c, aacsVar.c.f(), c.g());
            int aX = anaf.aX(runAttestationCommandOuterClass$RunAttestationCommand.c);
            int i = 1;
            if (aX == 0) {
                aX = 1;
            }
            a.b = aX;
            a.a.addAll(runAttestationCommandOuterClass$RunAttestationCommand.b);
            ynm.k(aacsVar.f.b(a, aacsVar.a), angq.a, new aacq(aacsVar, 1), new aacr(aacsVar, i));
        }
    }
}

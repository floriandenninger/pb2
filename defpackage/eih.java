package defpackage;

import com.google.protos.youtube.api.innertube.ProfileCardCommandOuterClass$ProfileCardCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eih implements aaha {
    private final eiv a;

    public eih(eiv eivVar) {
        this.a = eivVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        ProfileCardCommandOuterClass$ProfileCardCommand profileCardCommandOuterClass$ProfileCardCommand = (ProfileCardCommandOuterClass$ProfileCardCommand) apxfVar.pX(ProfileCardCommandOuterClass$ProfileCardCommand.profileCardCommand);
        this.a.h(profileCardCommandOuterClass$ProfileCardCommand.b, profileCardCommandOuterClass$ProfileCardCommand.c, profileCardCommandOuterClass$ProfileCardCommand.e, profileCardCommandOuterClass$ProfileCardCommand.d, apxfVar);
    }
}

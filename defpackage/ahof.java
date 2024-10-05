package defpackage;

import com.google.protos.youtube.api.innertube.EnterVrModeCommandOuterClass$EnterVrModeCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahof implements aaha {
    private final ahos a;

    public ahof(ahos ahosVar) {
        ahosVar.getClass();
        this.a = ahosVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (!apxfVar.pY(EnterVrModeCommandOuterClass$EnterVrModeCommand.enterVrModeCommand)) {
            throw new aahm("Expected a EnterVrModeCommand, but did not find one.");
        }
        this.a.g();
    }
}

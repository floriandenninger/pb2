package defpackage;

import com.google.protos.youtube.api.innertube.EntityUpdateCommandOuterClass$EntityUpdateCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aahn implements aaha {
    private final aakq a;
    private final afsy b;

    public aahn(aakq aakqVar, afsy afsyVar) {
        this.a = aakqVar;
        this.b = afsyVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(EntityUpdateCommandOuterClass$EntityUpdateCommand.entityUpdateCommand)) {
            aakq aakqVar = this.a;
            afsx c = this.b.c();
            aqty aqtyVar = ((EntityUpdateCommandOuterClass$EntityUpdateCommand) apxfVar.pX(EntityUpdateCommandOuterClass$EntityUpdateCommand.entityUpdateCommand)).b;
            if (aqtyVar == null) {
                aqtyVar = aqty.a;
            }
            aakqVar.a(c, aqtyVar);
            return;
        }
        throw new aahm("no entityUpdateCommand");
    }
}

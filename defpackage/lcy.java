package defpackage;

import com.google.protos.youtube.api.innertube.LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lcy implements aaha {
    private final acpl a;
    private final acqz b;

    public lcy(acpl acplVar, acqz acqzVar) {
        this.a = acplVar;
        this.b = acqzVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand logBackToAppEventCommandOuterClass$LogBackToAppEventCommand = (LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand) apxfVar.pX(LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.logBackToAppEventCommand);
        arpn a = arpp.a();
        aphv a2 = aphw.a();
        int db = amkq.db(logBackToAppEventCommandOuterClass$LogBackToAppEventCommand.b);
        if (db == 0) {
            db = 1;
        }
        int i = db - 1;
        int i2 = i != 1 ? i != 2 ? i != 3 ? 83769 : 3832 : 6827 : 4724;
        a2.copyOnWrite();
        ((aphw) a2.instance).d(i2);
        aphw aphwVar = (aphw) a2.build();
        a.copyOnWrite();
        ((arpp) a.instance).cd(aphwVar);
        this.a.c((arpp) a.build());
        acra mM = this.b.mM();
        aone createBuilder = asht.a.createBuilder();
        aone createBuilder2 = ashw.a.createBuilder();
        aone createBuilder3 = ashv.a.createBuilder();
        long currentTimeMillis = System.currentTimeMillis();
        createBuilder3.copyOnWrite();
        ashv ashvVar = (ashv) createBuilder3.instance;
        ashvVar.b = 1 | ashvVar.b;
        ashvVar.c = currentTimeMillis;
        createBuilder2.copyOnWrite();
        ashw ashwVar = (ashw) createBuilder2.instance;
        ashv ashvVar2 = (ashv) createBuilder3.build();
        ashvVar2.getClass();
        aony aonyVar = ashwVar.b;
        if (!aonyVar.c()) {
            ashwVar.b = aonm.mutableCopy(aonyVar);
        }
        ashwVar.b.add(ashvVar2);
        createBuilder.copyOnWrite();
        asht ashtVar = (asht) createBuilder.instance;
        ashw ashwVar2 = (ashw) createBuilder2.build();
        ashwVar2.getClass();
        ashtVar.F = ashwVar2;
        ashtVar.c |= 33554432;
        mM.w(new acqx(apxfVar.c), (asht) createBuilder.build());
    }
}

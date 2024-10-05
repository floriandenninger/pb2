package defpackage;

import com.google.protos.youtube.api.innertube.RegisterTasksCommandOuterClass$RegisterTasksCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abfg implements aaha {
    private final abey a;

    public abfg(abey abeyVar) {
        this.a = abeyVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        this.a.b(((RegisterTasksCommandOuterClass$RegisterTasksCommand) apxfVar.pX(RegisterTasksCommandOuterClass$RegisterTasksCommand.registerTasksCommand)).b);
    }
}

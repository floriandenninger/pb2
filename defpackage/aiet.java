package defpackage;

import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import java.util.Observable;
import java.util.Observer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aiet implements Observer {
    final /* synthetic */ awfl a;
    final /* synthetic */ aieu b;

    public aiet(aieu aieuVar, awfl awflVar) {
        this.b = aieuVar;
        this.a = awflVar;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        this.b.d.deleteObserver(this);
        awfl awflVar = this.a;
        if ((awflVar.b & 65536) != 0) {
            apxf apxfVar = awflVar.p;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (apxfVar.pY(CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)) {
                apxf apxfVar2 = this.a.p;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                this.b.e.b(((CommandExecutorCommandOuterClass$CommandExecutorCommand) apxfVar2.pX(CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)).b);
            }
        }
        this.b.g();
        this.b.a();
        this.b.b(awfj.YOU_THERE_EVENT_TYPE_LACT_RESET, this.a);
    }
}

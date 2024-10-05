package defpackage;

import com.google.android.apps.youtube.app.extensions.clips.ClipController;
import com.google.protos.youtube.api.innertube.LoopCommandOuterClass$LoopCommand;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class exv implements aaha {
    private final azrw a;
    private final azrw b;

    public exv(azrw azrwVar, azrw azrwVar2) {
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        apxfVar.getClass();
        if (!apxfVar.pY(LoopCommandOuterClass$LoopCommand.loopCommand)) {
            throw new aahm();
        }
        ahsq ahsqVar = (ahsq) this.a.get();
        if (ahsqVar == null) {
            return;
        }
        LoopCommandOuterClass$LoopCommand loopCommandOuterClass$LoopCommand = (LoopCommandOuterClass$LoopCommand) apxfVar.pX(LoopCommandOuterClass$LoopCommand.loopCommand);
        if (loopCommandOuterClass$LoopCommand.c) {
            amrp f = amru.f();
            if ((loopCommandOuterClass$LoopCommand.b & 2) == 0) {
                f.h("loop_command.start_time_ms is not filled.");
            }
            if ((loopCommandOuterClass$LoopCommand.b & 4) == 0) {
                f.h("loop_command.end_time_ms is not filled.");
            }
            amru g = f.g();
            if (!g.isEmpty()) {
                amrp f2 = amru.f();
                if (map == null) {
                    f2.h("args is null.");
                } else {
                    if (map.containsKey("loop_command_resolver_start_time_ms")) {
                        if (!(map.get("loop_command_resolver_start_time_ms") instanceof Long)) {
                            f2.h("Value of loop_command_resolver_start_time_ms is not a Long.");
                        }
                    } else {
                        f2.h("args does not contain key: loop_command_resolver_start_time_ms");
                    }
                    if (map.containsKey("loop_command_resolver_end_time_ms")) {
                        if (!(map.get("loop_command_resolver_end_time_ms") instanceof Long)) {
                            f2.h("Value of loop_command_resolver_end_time_ms is not a Long.");
                        }
                    } else {
                        f2.h("args does not contain key: loop_command_resolver_end_time_ms");
                    }
                }
                amru g2 = f2.g();
                if (g2.isEmpty()) {
                    ahsqVar.b(((Long) map.get("loop_command_resolver_start_time_ms")).longValue(), ((Long) map.get("loop_command_resolver_end_time_ms")).longValue());
                } else {
                    List[] listArr = {g, g2};
                    StringBuilder sb = new StringBuilder("There were problems with resolving LoopCommand.");
                    for (int i = 0; i < 2; i++) {
                        for (String str : listArr[i]) {
                            sb.append(" ");
                            sb.append(str);
                        }
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                ahsqVar.b(loopCommandOuterClass$LoopCommand.d, loopCommandOuterClass$LoopCommand.e);
            }
            if ((loopCommandOuterClass$LoopCommand.b & 8) != 0) {
                ClipController clipController = (ClipController) this.b.get();
                String str2 = loopCommandOuterClass$LoopCommand.f;
                if (clipController.v.get() != null) {
                    ((aiqu) clipController.v.get()).b(str2);
                    return;
                }
                return;
            }
            return;
        }
        ahsqVar.a();
    }
}

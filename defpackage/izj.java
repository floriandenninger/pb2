package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.SetAppThemeCommandOuterClass$SetAppThemeCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class izj implements aaha {
    private final Activity a;
    private final gni b;

    public izj(Activity activity, gni gniVar) {
        this.a = activity;
        this.b = gniVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (!apxfVar.pY(SetAppThemeCommandOuterClass$SetAppThemeCommand.setAppThemeCommand)) {
            throw new aahm("Expected a SetAppThemeCommand, but did not find one.");
        }
        SetAppThemeCommandOuterClass$SetAppThemeCommand setAppThemeCommandOuterClass$SetAppThemeCommand = (SetAppThemeCommandOuterClass$SetAppThemeCommand) apxfVar.pX(SetAppThemeCommandOuterClass$SetAppThemeCommand.setAppThemeCommand);
        gng a = this.b.a();
        int bB = aobq.bB(setAppThemeCommandOuterClass$SetAppThemeCommand.b);
        if (bB == 0) {
            bB = 1;
        }
        if (bB - 1 == 2) {
            if (a == gng.DARK) {
                return;
            } else {
                this.b.d(gng.DARK);
            }
        } else if (a == gng.LIGHT) {
            return;
        } else {
            this.b.d(gng.LIGHT);
        }
        this.a.recreate();
    }
}

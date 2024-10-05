package defpackage;

import android.content.Intent;
import com.google.android.libraries.parenttools.youtube.ParentToolsActivity;
import com.google.android.libraries.parenttools.youtube.ParentToolsResult;
import com.google.protos.youtube.api.innertube.StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wbl implements aaha, ykj {
    private final ci a;
    private final wiu b;
    private final aahd c;
    private final aaea d;
    private final ykz e;

    public wbl(ci ciVar, aahd aahdVar, ykz ykzVar, wiu wiuVar, aaea aaeaVar) {
        this.a = ciVar;
        this.c = aahdVar;
        this.e = ykzVar;
        this.b = wiuVar;
        this.d = aaeaVar;
    }

    @Override // defpackage.ykj
    public final void kD(int i, int i2, Intent intent) {
        ParentToolsResult parentToolsResult;
        apxf apxfVar;
        if ((i != 9406 && i2 != -1) || intent == null || intent.getExtras() == null || (parentToolsResult = (ParentToolsResult) intent.getExtras().getParcelable("parent_tools_result")) == null || parentToolsResult.b() != 3) {
            return;
        }
        try {
            apxfVar = (apxf) ((aong) ((aong) apxf.a.createBuilder()).mergeFrom(parentToolsResult.a(), aomw.b())).build();
        } catch (aoob unused) {
            this.b.a();
            apxfVar = null;
        }
        this.c.a(apxfVar);
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar == null || !apxfVar.pY(StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.startModularOnboardingCommand)) {
            return;
        }
        StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand startModularOnboardingCommandOuterClass$StartModularOnboardingCommand = (StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand) apxfVar.pX(StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.startModularOnboardingCommand);
        arfd a = this.d.a();
        boolean z = false;
        if ((a.b & 64) != 0) {
            aswb aswbVar = a.e;
            if (aswbVar == null) {
                aswbVar = aswb.a;
            }
            if (aswbVar.bl) {
                z = true;
            }
        }
        umj a2 = ParentToolsActivity.a(this.a);
        a2.b = "HOST_CLIENT_NAME_MAIN_ANDROID";
        a2.c = zgx.c(this.a);
        a2.e = startModularOnboardingCommandOuterClass$StartModularOnboardingCommand.c;
        a2.f = startModularOnboardingCommandOuterClass$StartModularOnboardingCommand.d;
        a2.i = startModularOnboardingCommandOuterClass$StartModularOnboardingCommand.f;
        apud apudVar = startModularOnboardingCommandOuterClass$StartModularOnboardingCommand.b;
        if (apudVar == null) {
            apudVar = apud.b;
        }
        a2.d = apudVar.i;
        apxf apxfVar2 = startModularOnboardingCommandOuterClass$StartModularOnboardingCommand.e;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        a2.h = apxfVar2.toByteArray();
        a2.j = umm.MODULAR_ONBOARDING;
        a2.k = z;
        this.e.a(a2.a(), 9406, this);
    }
}

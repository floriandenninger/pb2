package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface acra extends acsl, acsm {
    public static final acra l = new acrw();

    @Deprecated
    void B(InteractionLoggingScreen interactionLoggingScreen);

    void D(acsa acsaVar);

    void F(acsa acsaVar, acsa acsaVar2);

    InteractionLoggingScreen G(acsc acscVar, acrs acrsVar, apxf apxfVar);

    void H(aooy aooyVar, aomf aomfVar, View view);

    acqy a();

    @Deprecated
    acra b(acrz acrzVar);

    InteractionLoggingScreen c();

    InteractionLoggingScreen d(acsc acscVar, apxf apxfVar, asht ashtVar);

    InteractionLoggingScreen e(acsc acscVar, acrs acrsVar, apxf apxfVar, asht ashtVar, asht ashtVar2);

    @Override // defpackage.acsl
    apxf h(apxf apxfVar);

    awav i(Object obj, acsc acscVar);

    awav j(Object obj, acsc acscVar, int i);

    String k();

    void l(Object obj, acsc acscVar, int i);

    void m(List list);

    void n(acsa acsaVar);

    void o(acsa acsaVar, acsa acsaVar2);

    void p(acrs acrsVar);

    void q(acsa acsaVar, asht ashtVar);

    void r(String str);

    void s(acsa acsaVar, String str);

    @Override // defpackage.acsl
    void t();

    void u(acsa acsaVar, asht ashtVar);

    void v(aooy aooyVar, aomf aomfVar, asht ashtVar);

    void w(acsa acsaVar, asht ashtVar);

    void x(String str, acsa acsaVar, asht ashtVar);

    void y();

    void z(acrs acrsVar, InteractionLoggingScreen interactionLoggingScreen);
}

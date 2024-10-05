package defpackage;

import com.google.android.libraries.youtube.mdx.model.AppStatus;
import com.google.android.libraries.youtube.mdx.model.AutoValue_AppStatus;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acyt implements admf {
    private static final String a = zga.a("MDX.DialShortLivedLoungeTokenRefresher");
    private final adfy b;
    private final acyg c;

    public acyt(adfy adfyVar, acyg acygVar) {
        this.b = adfyVar;
        this.c = acygVar;
    }

    @Override // defpackage.admf
    public final void a(admc admcVar) {
        AutoValue_AppStatus autoValue_AppStatus;
        int i;
        String str = a;
        zga.h(str, String.format("Attempting to get a new lounge token for DIAL screen %s", this.b.d));
        adfy adfyVar = this.b;
        AppStatus a2 = this.c.a(adfyVar.b, adfyVar.n());
        if (a2 == null || (i = (autoValue_AppStatus = (AutoValue_AppStatus) a2).a) == -1 || i == -2) {
            zga.h(str, String.format("The app status could not be retrieved for screen %s.", this.b.d));
            admcVar.a(adme.DIAL_HTTP_ERROR);
            return;
        }
        if (i == 1) {
            Optional optional = autoValue_AppStatus.e;
            if (!optional.isPresent()) {
                zga.h(str, String.format("No proper Short Lived Lounge Token found in the DIAL additional data for screen %s.", this.b.d));
                admcVar.a(adme.MISSING_LOUNGE_TOKEN);
                return;
            } else {
                zga.h(str, String.format("SUCCESS! Got new lounge token for DIAL screen %s: %s, refresh interval: %s", this.b.d, optional.get(), ((adgm) optional.get()).b));
                admcVar.b((adgm) optional.get());
                return;
            }
        }
        zga.h(str, String.format("The app is not running for screen %s.", this.b.d));
        admcVar.a(adme.APP_NOT_RUNNING);
    }
}

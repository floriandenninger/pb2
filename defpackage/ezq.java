package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ezq implements aaha {
    public final Activity a;
    private final acra b;
    private final ykz c;

    public ezq(Activity activity, ykz ykzVar, acra acraVar) {
        this.a = activity;
        this.c = ykzVar;
        this.b = acraVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        this.b.d(acsb.b(18046), apxfVar, null);
        ((acqq) this.b).D(new acqx(acsb.c(22163)));
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT", (Uri) null);
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        intent.setType("video/*");
        intent.addCategory("android.intent.category.OPENABLE");
        Intent addFlags = intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"video/*"}).addFlags(64).addFlags(1);
        InteractionLoggingScreen interactionLoggingScreen = ((acqq) this.b).g;
        String str = interactionLoggingScreen.a;
        int i = interactionLoggingScreen.f;
        aong aongVar = (aong) apxf.a.createBuilder();
        aone createBuilder = atmc.a.createBuilder();
        createBuilder.copyOnWrite();
        atmc atmcVar = (atmc) createBuilder.instance;
        atmcVar.b |= 2;
        atmcVar.d = i;
        if (str != null) {
            createBuilder.copyOnWrite();
            atmc atmcVar2 = (atmc) createBuilder.instance;
            atmcVar2.b = 1 | atmcVar2.b;
            atmcVar2.c = str;
        }
        aongVar.e(atmb.b, (atmc) createBuilder.build());
        ykz ykzVar = this.c;
        final apxf apxfVar2 = (apxf) aongVar.build();
        ykzVar.a(addFlags, 901, new ykj() { // from class: ezp
            @Override // defpackage.ykj
            public final void kD(int i2, int i3, Intent intent2) {
                Intent z;
                ezq ezqVar = ezq.this;
                apxf apxfVar3 = apxfVar2;
                if (i2 == 901 && i3 == -1 && (z = akwg.z(ezqVar.a, intent2)) != null) {
                    z.putExtra("navigation_endpoint", apxfVar3.toByteArray());
                    ezqVar.a.startActivityForResult(z, 902);
                }
            }
        });
    }
}

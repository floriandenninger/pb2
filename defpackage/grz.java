package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class grz implements aaha {
    public final ci a;
    public final zaw b;
    public final aahd c;
    public final Executor d;
    public final abab e;
    protected AlertDialog f;

    public grz(ci ciVar, abab ababVar, zaw zawVar, aahd aahdVar, Executor executor) {
        this.a = ciVar;
        this.e = ababVar;
        this.b = zawVar;
        this.c = aahdVar;
        this.d = executor;
    }

    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, final Map map) {
        aqyg aqygVar = null;
        if (this.f == null) {
            this.f = new AlertDialog.Builder(this.a).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
        }
        this.f.setButton(-1, this.a.getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: grw
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final grz grzVar = grz.this;
                final apxf apxfVar2 = apxfVar;
                final Map map2 = map;
                abab ababVar = grzVar.e;
                aazz aazzVar = new aazz(ababVar.f, ababVar.a.c(), null, null, null);
                NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint = (NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint) apxfVar2.pX(NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.notificationOptOutEndpoint);
                aazzVar.a = notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.c;
                aazzVar.b = notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.e;
                aazzVar.l(whl.G(apxfVar2));
                ci ciVar = grzVar.a;
                abab ababVar2 = grzVar.e;
                ynm.n(ciVar, ababVar2.b.b(aazzVar, grzVar.d), new zfi() { // from class: grx
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        grz grzVar2 = grz.this;
                        Throwable th = (Throwable) obj;
                        zga.d("Error rating", th);
                        grzVar2.b.e(th);
                    }
                }, new zfi() { // from class: gry
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        grz grzVar2 = grz.this;
                        apxf apxfVar3 = apxfVar2;
                        Map map3 = map2;
                        whu.K(grzVar2.a, R.string.notifications_settings_changed, 1);
                        grzVar2.c.d(((NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint) apxfVar3.pX(NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.notificationOptOutEndpoint)).f, map3);
                    }
                });
            }
        });
        if (apxfVar.pY(NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.notificationOptOutEndpoint)) {
            NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint = (NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint) apxfVar.pX(NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.notificationOptOutEndpoint);
            AlertDialog alertDialog = this.f;
            if ((notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.b & 8) != 0 && (aqygVar = notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.d) == null) {
                aqygVar = aqyg.a;
            }
            alertDialog.setMessage(ajcq.b(aqygVar));
        } else {
            this.f.setMessage("");
        }
        this.f.show();
    }
}

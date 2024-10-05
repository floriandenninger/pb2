package defpackage;

import android.content.Context;
import android.view.View;
import com.google.protos.youtube.api.innertube.AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint;
import com.google.protos.youtube.api.innertube.RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class lyp extends ajwn implements ypd {
    protected atdc a;

    public lyp(Context context, ypa ypaVar, aahd aahdVar, ajvb ajvbVar, ajoy ajoyVar, lru lruVar, aalw aalwVar, aoae aoaeVar, byte[] bArr, byte[] bArr2) {
        super(context, aahdVar, ajvbVar, ajoyVar, lruVar, aalwVar, aoaeVar, null, null);
        ypaVar.g(this);
    }

    @Override // defpackage.ajwn, defpackage.ajva
    public void a(atdc atdcVar, View view, Object obj, acra acraVar) {
        super.a(atdcVar, view, obj, acraVar);
        this.a = atdcVar;
    }

    public final void b(izi iziVar) {
        ammv d = iziVar.d();
        if (d.h()) {
            atde atdeVar = (atde) d.c();
            if ((atdeVar.b & 8) == 0 || this.a == null) {
                return;
            }
            apxf apxfVar = atdeVar.e;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (apxfVar.pY(AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.addUpcomingEventReminderEndpoint) || apxfVar.pY(RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.removeUpcomingEventReminderEndpoint)) {
                atdc atdcVar = this.a;
                apxf apxfVar2 = atdeVar.e;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aone builder = atdcVar.toBuilder();
                for (int i = 0; i < atdcVar.c.size(); i++) {
                    if ((((atda) atdcVar.c.get(i)).b & 2) != 0) {
                        atde atdeVar2 = ((atda) atdcVar.c.get(i)).d;
                        if (atdeVar2 == null) {
                            atdeVar2 = atde.a;
                        }
                        apxf apxfVar3 = atdeVar2.e;
                        if (apxfVar3 == null) {
                            apxfVar3 = apxf.a;
                        }
                        if (!apxfVar2.pY(AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.addUpcomingEventReminderEndpoint) || !apxfVar3.pY(RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.removeUpcomingEventReminderEndpoint)) {
                            if (apxfVar2.pY(RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.removeUpcomingEventReminderEndpoint) && apxfVar3.pY(AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.addUpcomingEventReminderEndpoint)) {
                                aone createBuilder = atda.a.createBuilder();
                                createBuilder.copyOnWrite();
                                atda atdaVar = (atda) createBuilder.instance;
                                atdaVar.d = atdeVar;
                                atdaVar.b |= 2;
                                builder.aF(i, createBuilder);
                            }
                        } else {
                            aone createBuilder2 = atda.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            atda atdaVar2 = (atda) createBuilder2.instance;
                            atdaVar2.d = atdeVar;
                            atdaVar2.b |= 2;
                            builder.aF(i, createBuilder2);
                        }
                    }
                }
                this.a = (atdc) builder.build();
            }
        }
    }

    public Class[] kz(Class cls, Object obj, int i) {
        return mcy.h(this, obj, i);
    }
}

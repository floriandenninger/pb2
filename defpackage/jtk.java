package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jtk extends jso {
    private final Context a;

    public jtk(azrw azrwVar, Context context) {
        super(azrwVar, atdn.class);
        this.a = context;
    }

    @Override // defpackage.jso
    protected final /* bridge */ /* synthetic */ Object a(agsn agsnVar, amrz amrzVar) {
        int i;
        Iterator it = agsnVar.m().j().iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            agnv agnvVar = (agnv) it.next();
            agnvVar.getClass();
            agnu agnuVar = agnvVar.j;
            if (agnuVar != null && agnuVar.a() > 0) {
                i = (int) TimeUnit.SECONDS.toDays(agnuVar.a());
                break;
            }
        }
        if (i <= 0) {
            return null;
        }
        aone createBuilder = atdp.a.createBuilder();
        aqyg g = ajcq.g(this.a.getResources().getQuantityString(R.plurals.offline_go_online_to_renew_dialog_message, i, Integer.valueOf(i)));
        createBuilder.copyOnWrite();
        atdp atdpVar = (atdp) createBuilder.instance;
        g.getClass();
        atdpVar.c = g;
        atdpVar.b |= 1;
        atdp atdpVar2 = (atdp) createBuilder.build();
        aone createBuilder2 = atdn.a.createBuilder();
        aone createBuilder3 = atdq.a.createBuilder();
        createBuilder3.copyOnWrite();
        atdq atdqVar = (atdq) createBuilder3.instance;
        atdpVar2.getClass();
        atdqVar.c = atdpVar2;
        atdqVar.b |= 1;
        createBuilder2.copyOnWrite();
        atdn atdnVar = (atdn) createBuilder2.instance;
        atdq atdqVar2 = (atdq) createBuilder3.build();
        atdqVar2.getClass();
        atdnVar.f = atdqVar2;
        atdnVar.b |= 2;
        aone createBuilder4 = atdo.a.createBuilder();
        createBuilder4.copyOnWrite();
        atdo atdoVar = (atdo) createBuilder4.instance;
        atdoVar.c = 2;
        atdoVar.b = 1 | atdoVar.b;
        createBuilder2.copyOnWrite();
        atdn atdnVar2 = (atdn) createBuilder2.instance;
        atdo atdoVar2 = (atdo) createBuilder4.build();
        atdoVar2.getClass();
        atdnVar2.g = atdoVar2;
        atdnVar2.b |= 16;
        return (atdn) createBuilder2.build();
    }

    @Override // defpackage.jso
    protected final /* bridge */ /* synthetic */ Object f() {
        return null;
    }
}

package defpackage;

import com.google.android.gms.cast.CastDevice;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adci implements anfz {
    public final /* synthetic */ adcj a;
    public final /* synthetic */ amru b;
    private final /* synthetic */ int c;

    public /* synthetic */ adci(adcj adcjVar, amru amruVar, int i) {
        this.c = i;
        this.a = adcjVar;
        this.b = amruVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        char c;
        if (this.c != 0) {
            adcj adcjVar = this.a;
            amru amruVar = this.b;
            Map map = (Map) obj;
            if (map == null) {
                zga.c(adcj.a, "Could not retrieve RouteInfo to CastDevice map.");
                return anaf.N(new Throwable());
            }
            return anaf.O(adcjVar.a(amruVar, map));
        }
        adcj adcjVar2 = this.a;
        amru amruVar2 = this.b;
        Map map2 = (Map) obj;
        atai[] d = adcj.d();
        if (map2 == null) {
            zga.c(adcj.a, "Could not retrieve RouteInfo to CastDevice map.");
            return anaf.O(d);
        }
        adcjVar2.a(amruVar2, map2);
        for (int i = 0; i < amruVar2.size(); i++) {
            bpv bpvVar = (bpv) amruVar2.get(i);
            Optional optional = (Optional) map2.get(bpvVar);
            if (adeg.i(bpvVar)) {
                c = adcjVar2.c(bpvVar) ? (char) 5 : (char) 2;
            } else if (optional != null && optional.isPresent() && adee.b((CastDevice) optional.get()) && adcjVar2.b) {
                c = 4;
            } else if (optional == null || !optional.isPresent()) {
                c = adeg.g(bpvVar) ? (char) 3 : (char) 6;
            } else {
                c = 1;
            }
            aone builder = d[c].toBuilder();
            int i2 = d[c].d;
            builder.copyOnWrite();
            atai ataiVar = (atai) builder.instance;
            ataiVar.b = 2 | ataiVar.b;
            ataiVar.d = i2 + 1;
            d[c] = (atai) builder.build();
        }
        return anaf.O(d);
    }
}

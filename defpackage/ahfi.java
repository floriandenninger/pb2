package defpackage;

import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahfi extends ahzy {
    private final ahff d;

    public ahfi(ypa ypaVar, Executor executor, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, WillAutonavInformer willAutonavInformer, ahff ahffVar, aadw aadwVar, ammv ammvVar, Map map) {
        super(ypaVar, executor, azrwVar, azrwVar2, azrwVar3, azrwVar4, willAutonavInformer, aadwVar, ammvVar, map);
        ahffVar.getClass();
        this.d = ahffVar;
    }

    @Override // defpackage.ahzy
    protected final amsv b(apxf apxfVar, atxo atxoVar) {
        aone builder = atxoVar.toBuilder();
        ahfh ahfhVar = null;
        if (((atxo) builder.instance).e != 0) {
            if (this.d.a()) {
                int i = ((atxo) builder.instance).e;
                builder.copyOnWrite();
                atxo atxoVar2 = (atxo) builder.instance;
                atxoVar2.b |= 4;
                atxoVar2.d = i;
                if (builder != null && apxfVar != null && apxfVar.pY(WatchEndpointOuterClass.watchEndpoint)) {
                    aone builder2 = ((awdp) apxfVar.pX(WatchEndpointOuterClass.watchEndpoint)).toBuilder();
                    awdp awdpVar = (awdp) builder2.instance;
                    if ((awdpVar.b & 1024) != 0) {
                        awdq awdqVar = awdpVar.m;
                        if (awdqVar == null) {
                            awdqVar = awdq.a;
                        }
                        aone builder3 = awdqVar.toBuilder();
                        builder3.copyOnWrite();
                        awdq awdqVar2 = (awdq) builder3.instance;
                        atxo atxoVar3 = (atxo) builder.build();
                        atxoVar3.getClass();
                        awdqVar2.c = atxoVar3;
                        awdqVar2.b |= 1;
                        builder2.copyOnWrite();
                        awdp awdpVar2 = (awdp) builder2.instance;
                        awdq awdqVar3 = (awdq) builder3.build();
                        awdqVar3.getClass();
                        awdpVar2.m = awdqVar3;
                        awdpVar2.b |= 1024;
                        aong aongVar = (aong) apxfVar.toBuilder();
                        aongVar.e(WatchEndpointOuterClass.watchEndpoint, (awdp) builder2.build());
                        apxfVar = (apxf) aongVar.build();
                    }
                }
                apxfVar = null;
            } else {
                ahfhVar = new ahfh(this.a, ((atxo) builder.instance).e);
            }
        }
        amsv b = super.b(apxfVar, (atxo) builder.build());
        if (ahfhVar != null) {
            ahfhVar.d.g(ahfhVar);
            b.c(ahfhVar);
        }
        return b;
    }
}

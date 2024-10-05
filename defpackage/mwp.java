package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwp implements ajyc {
    final /* synthetic */ mwt a;
    private final /* synthetic */ int b;

    public mwp(mwt mwtVar, int i) {
        this.b = i;
        this.a = mwtVar;
    }

    public /* synthetic */ mwp(mwt mwtVar, int i, byte[] bArr) {
        this.b = i;
        this.a = mwtVar;
    }

    @Override // defpackage.ajyc
    public final void oC(aong aongVar) {
        if (this.b == 0) {
            mwt mwtVar = this.a;
            apxf apxfVar = ((apmg) aongVar.instance).o;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (apxfVar != null && apxfVar.pY(BrowseEndpointOuterClass.browseEndpoint)) {
                aone builder = ((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).toBuilder();
                amrp f = amru.f();
                f.j(mwtVar.h);
                aplw aplwVar = ((aplt) builder.instance).h;
                if (aplwVar == null) {
                    aplwVar = aplw.a;
                }
                if (aplwVar.d.size() != 0) {
                    aplw aplwVar2 = ((aplt) builder.instance).h;
                    if (aplwVar2 == null) {
                        aplwVar2 = aplw.a;
                    }
                    f.j(aplwVar2.d);
                }
                aone createBuilder = aplw.a.createBuilder();
                amru g = f.g();
                createBuilder.copyOnWrite();
                aplw aplwVar3 = (aplw) createBuilder.instance;
                aony aonyVar = aplwVar3.d;
                if (!aonyVar.c()) {
                    aplwVar3.d = aonm.mutableCopy(aonyVar);
                }
                aolo.addAll((Iterable) g, (List) aplwVar3.d);
                builder.copyOnWrite();
                aplt apltVar = (aplt) builder.instance;
                aplw aplwVar4 = (aplw) createBuilder.build();
                aplwVar4.getClass();
                apltVar.h = aplwVar4;
                apltVar.b |= 64;
                aong aongVar2 = (aong) apxfVar.toBuilder();
                aongVar2.e(BrowseEndpointOuterClass.browseEndpoint, (aplt) builder.build());
                apxfVar = (apxf) aongVar2.build();
            }
            aongVar.copyOnWrite();
            apmg apmgVar = (apmg) aongVar.instance;
            apxfVar.getClass();
            apmgVar.o = apxfVar;
            apmgVar.b |= 16384;
            this.a.a();
            return;
        }
        this.a.a();
    }
}

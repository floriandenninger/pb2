package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.CreationEntryEndpointOuterClass$CreationEntryEndpoint;
import com.google.protos.youtube.api.innertube.IconBadgeRendererOuterClass;
import j$.util.Collection;
import j$.util.function.Function;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class nld extends nky {
    public final acra e;
    final max f;
    final max g;
    public final ohg h;
    public final ajyw i;
    private final BrowseResponseModel j;

    public nld(aahd aahdVar, ohg ohgVar, ajyw ajywVar, acra acraVar, BrowseResponseModel browseResponseModel, Object obj, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(obj);
        max maxVar;
        this.h = ohgVar;
        this.i = ajywVar;
        this.e = acraVar;
        this.j = browseResponseModel;
        avsr f = f();
        max maxVar2 = null;
        if (f != null) {
            apxf apxfVar = f.c;
            if ((apxfVar == null ? apxf.a : apxfVar).pY(CreationEntryEndpointOuterClass$CreationEntryEndpoint.creationEntryEndpoint)) {
                arfs arfsVar = f.d;
                arfr b = arfr.b((arfsVar == null ? arfs.a : arfsVar).c);
                if ((b == null ? arfr.UNKNOWN : b) == arfr.CREATION_ENTRY) {
                    maxVar = new max(f, aahdVar, 1, null);
                    this.g = maxVar;
                    if (f != null && maxVar == null) {
                        maxVar2 = new max(f, aahdVar, 0);
                    }
                    this.f = maxVar2;
                }
            }
        }
        maxVar = null;
        this.g = maxVar;
        if (f != null) {
            maxVar2 = new max(f, aahdVar, 0);
        }
        this.f = maxVar2;
    }

    @Override // defpackage.nky
    public final amsx a(amsx amsxVar) {
        amsx amsxVar2 = (amsx) Collection.EL.stream(this.j.a.m).filter(jzf.q).map(new Function() { // from class: nlc
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                nld nldVar = nld.this;
                aulq aulqVar = (aulq) obj;
                if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                    return nldVar.h.a(nldVar.e, (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer), new ArrayList());
                }
                return nldVar.i.k(nldVar.e, (arfm) aulqVar.pX(IconBadgeRendererOuterClass.iconBadgeRenderer));
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).collect(ampm.b);
        if (!amsxVar2.isEmpty()) {
            amsxVar = (amsx) Collection.EL.stream(amsxVar).filter(jzf.p).collect(ampm.b);
        }
        amsv i = amsx.i();
        i.j(amsxVar);
        max maxVar = this.f;
        if (maxVar != null || this.g != null) {
            max maxVar2 = this.g;
            if (maxVar2 != null) {
                maxVar = maxVar2;
            }
            i.c(maxVar);
        }
        i.j(amsxVar2);
        return i.g();
    }

    public abstract avsr f();
}

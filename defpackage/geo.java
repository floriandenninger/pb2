package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class geo implements zij {
    private final /* synthetic */ int i;
    public static final /* synthetic */ geo h = new geo(7);
    public static final /* synthetic */ geo g = new geo(6);
    public static final /* synthetic */ geo f = new geo(5);
    public static final /* synthetic */ geo e = new geo(4);
    public static final /* synthetic */ geo d = new geo(3);
    public static final /* synthetic */ geo c = new geo(2);
    public static final /* synthetic */ geo b = new geo(1);
    public static final /* synthetic */ geo a = new geo(0);

    private /* synthetic */ geo(int i) {
        this.i = i;
    }

    @Override // defpackage.zij
    public final void a(Object obj, Object obj2) {
        aprn aprnVar;
        boolean z = true;
        switch (this.i) {
            case 0:
                ((geu) obj).a();
                return;
            case 1:
                String str = (String) obj2;
                eru eruVar = ((ero) obj).a;
                if (eruVar.a.h()) {
                    apro aproVar = ((aprk) eruVar.a.c()).f;
                    if (aproVar == null) {
                        aproVar = apro.a;
                    }
                    if (aproVar.b == 105917786) {
                        aprnVar = (aprn) aproVar.c;
                    } else {
                        aprnVar = aprn.a;
                    }
                    aone builder = aprnVar.toBuilder();
                    aone createBuilder = aprn.a.createBuilder();
                    aqyg h2 = ajcq.h(str.length() != 0 ? "@".concat(str) : new String("@"));
                    createBuilder.copyOnWrite();
                    aprn aprnVar2 = (aprn) createBuilder.instance;
                    h2.getClass();
                    aprnVar2.d = h2;
                    aprnVar2.b |= 4;
                    aong aongVar = (aong) apxf.a.createBuilder();
                    aonk aonkVar = ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint;
                    aone createBuilder2 = ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.a.createBuilder();
                    aone createBuilder3 = apru.a.createBuilder();
                    aone createBuilder4 = aprv.a.createBuilder();
                    createBuilder4.copyOnWrite();
                    aprv aprvVar = (aprv) createBuilder4.instance;
                    aprvVar.b |= 1;
                    aprvVar.c = str;
                    aprv aprvVar2 = (aprv) createBuilder4.build();
                    createBuilder3.copyOnWrite();
                    apru apruVar = (apru) createBuilder3.instance;
                    aprvVar2.getClass();
                    apruVar.c = aprvVar2;
                    apruVar.b = 372524273;
                    apru apruVar2 = (apru) createBuilder3.build();
                    createBuilder2.copyOnWrite();
                    ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint = (ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint) createBuilder2.instance;
                    apruVar2.getClass();
                    channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.c = apruVar2;
                    channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.b |= 1;
                    aongVar.e(aonkVar, (ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint) createBuilder2.build());
                    createBuilder.copyOnWrite();
                    aprn aprnVar3 = (aprn) createBuilder.instance;
                    apxf apxfVar = (apxf) aongVar.build();
                    apxfVar.getClass();
                    aprnVar3.e = apxfVar;
                    aprnVar3.b |= 8;
                    builder.mergeFrom(createBuilder.build());
                    eruVar.aF((aprn) builder.build());
                    return;
                }
                return;
            case 2:
                gic gicVar = (gic) obj2;
                ((giz) obj).f(gicVar.b(), gicVar.a());
                return;
            case 3:
                gid gidVar = (gid) obj2;
                gir c2 = gidVar.c();
                PaneDescriptor b2 = gidVar.b();
                ony onyVar = ((onw) obj).a;
                aone createBuilder5 = atmc.a.createBuilder();
                if ((onyVar.c & 8) != 0 || c2 == null || c2.mM() == null || c2.mM().k() == null) {
                    z = false;
                } else {
                    String k = c2.mM().k();
                    createBuilder5.copyOnWrite();
                    atmc atmcVar = (atmc) createBuilder5.instance;
                    k.getClass();
                    atmcVar.b |= 1;
                    atmcVar.c = k;
                }
                int i = onyVar.c & (-9);
                onyVar.c = i;
                if ((i & 4) != 0) {
                    createBuilder5.copyOnWrite();
                    atmc atmcVar2 = (atmc) createBuilder5.instance;
                    atmcVar2.b |= 2;
                    atmcVar2.d = 22156;
                } else if (!z) {
                    return;
                }
                b2.j((atmc) createBuilder5.build());
                return;
            case 4:
                ((gjb) obj).g((gir) obj2);
                return;
            case 5:
                ((gjd) obj).aJ((gjf) obj2);
                return;
            case 6:
                ((Runnable) obj).run();
                return;
            default:
                ((xrp) obj).u((aacm) obj2);
                return;
        }
    }
}

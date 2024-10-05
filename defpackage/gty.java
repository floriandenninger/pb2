package defpackage;

import android.net.Uri;
import com.google.protos.youtube.api.innertube.FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gty implements aaha {
    private final xhi a;
    private final xbs b;
    private final aahd c;

    public gty(xho xhoVar, xbq xbqVar, aahd aahdVar) {
        this.a = xhoVar.b(new guq(1));
        this.b = xbqVar.a();
        this.c = aahdVar;
    }

    private static Object b(Map map, String str, Object obj) {
        if (map == null || !map.containsKey(str)) {
            return obj;
        }
        try {
            return map.get(str);
        } catch (ClassCastException e) {
            afsi.c(2, 1, "FormfillPostSubmitCommand: This should never happen.", e);
            return null;
        }
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        dxf dxfVar;
        if (apxfVar.pY(FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.formfillPostSubmitEndpoint)) {
            FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint = (FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint) apxfVar.pX(FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.formfillPostSubmitEndpoint);
            int aL = aocz.aL(formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.d);
            if (aL == 0 || aL != 2) {
                ArrayList arrayList = new ArrayList();
                List<dxd> list = (List) b(map, "FORM_RESULTS_ARG", new ArrayList());
                if (list != null) {
                    for (dxd dxdVar : list) {
                        String str = dxdVar.e;
                        if (dxdVar.c == 4) {
                            dxfVar = (dxf) dxdVar.d;
                        } else {
                            dxfVar = dxf.a;
                        }
                        String str2 = dxfVar.c;
                        if (!ammx.e(str) && !ammx.e(str2)) {
                            arrayList.add(amkq.aK(str, str2));
                        }
                    }
                }
                xhi xhiVar = this.a;
                aoye aoyeVar = formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.b;
                if (aoyeVar == null) {
                    aoyeVar = aoye.a;
                }
                xhiVar.d(aoyeVar, arrayList, false, new afxe[0]);
            } else {
                ArrayList arrayList2 = (ArrayList) b(map, "FORM_RESULTS_ARG", new ArrayList());
                aone createBuilder = dxe.a.createBuilder();
                String str3 = formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.c;
                createBuilder.copyOnWrite();
                dxe dxeVar = (dxe) createBuilder.instance;
                str3.getClass();
                dxeVar.b |= 1;
                dxeVar.c = str3;
                createBuilder.copyOnWrite();
                dxe dxeVar2 = (dxe) createBuilder.instance;
                aony aonyVar = dxeVar2.d;
                if (!aonyVar.c()) {
                    dxeVar2.d = aonm.mutableCopy(aonyVar);
                }
                aolo.addAll((Iterable) arrayList2, (List) dxeVar2.d);
                byte[] byteArray = ((dxe) createBuilder.build()).toByteArray();
                xhi xhiVar2 = this.a;
                aoye aoyeVar2 = formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.b;
                if (aoyeVar2 == null) {
                    aoyeVar2 = aoye.a;
                }
                afxe[] afxeVarArr = {this.b};
                Uri j = xhn.j(aoyeVar2);
                if (j != null && !Uri.EMPTY.equals(j)) {
                    xhn xhnVar = (xhn) xhiVar2;
                    Uri g = xhnVar.g(j, afxeVarArr);
                    xhnVar.i(g, aoyeVar2, xhnVar.d.d(g, byteArray, xhnVar.a.c()));
                }
            }
            List list2 = (List) b(map, "SUBMIT_COMMANDS_ARG", new ArrayList());
            if (list2 != null) {
                this.c.d(list2, map);
            }
        }
    }
}

package defpackage;

import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SignalServiceEndpointOuterClass$SignalServiceEndpoint;
import com.google.protos.youtube.api.innertube.UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ezo implements aaha {
    private final aahd a;
    private final /* synthetic */ int b;

    public ezo(aahd aahdVar, int i) {
        this.b = i;
        this.a = aahdVar;
    }

    public ezo(aahd aahdVar, int i, byte[] bArr) {
        this.b = i;
        aahdVar.getClass();
        this.a = aahdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        int i = this.b;
        if (i == 0) {
            this.a.d(((UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint) apxfVar.pX(UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.updateHorizontalCardListActionEndpoint)).b, map);
            return;
        }
        if (i == 1) {
            if (apxfVar.pY(SignalServiceEndpointOuterClass$SignalServiceEndpoint.signalServiceEndpoint)) {
                this.a.d(((SignalServiceEndpointOuterClass$SignalServiceEndpoint) apxfVar.pX(SignalServiceEndpointOuterClass$SignalServiceEndpoint.signalServiceEndpoint)).b, map);
            }
        } else {
            if (i == 2) {
                HashMap hashMap = new HashMap();
                if (map != null) {
                    hashMap.putAll(map);
                }
                hashMap.put("replace_previous_search_result_page", true);
                aong aongVar = (aong) apxf.a.createBuilder();
                aongVar.e(SearchEndpointOuterClass.searchEndpoint, aunn.a);
                this.a.c((apxf) aongVar.build(), hashMap);
                return;
            }
            Iterator it = ((CommandExecutorCommandOuterClass$CommandExecutorCommand) apxfVar.pX(CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)).b.iterator();
            while (it.hasNext()) {
                this.a.c((apxf) it.next(), map);
            }
        }
    }
}

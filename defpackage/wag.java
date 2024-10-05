package defpackage;

import com.google.protos.youtube.api.innertube.ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wag implements aaha {
    private final azrw a;
    private final wbk b;

    public wag(azrw azrwVar, wbk wbkVar) {
        this.a = azrwVar;
        this.b = wbkVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        awjx awjxVar;
        ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint = (ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint) apxfVar.pX(ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.channelCreationServiceEndpoint);
        if ((channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.b & 2) == 0) {
            ((wan) this.a.get()).aG(apxfVar);
            return;
        }
        awjw awjwVar = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.d;
        if (awjwVar == null) {
            awjwVar = awjw.a;
        }
        if (awjwVar.b != 1) {
            throw new aahm("Zero step parameters not set.");
        }
        wbk wbkVar = this.b;
        aawb aawbVar = (aawb) yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        awjw awjwVar2 = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.d;
        if (awjwVar2 == null) {
            awjwVar2 = awjw.a;
        }
        aone builder = awjwVar2.toBuilder();
        aaum b = wbkVar.c.b();
        b.a = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.c;
        if (aawbVar != null) {
            awjw awjwVar3 = (awjw) builder.instance;
            if (awjwVar3.b == 1) {
                awjxVar = (awjx) awjwVar3.c;
            } else {
                awjxVar = awjx.a;
            }
            aone builder2 = awjxVar.toBuilder();
            String c = aawbVar.c();
            builder2.copyOnWrite();
            awjx awjxVar2 = (awjx) builder2.instance;
            c.getClass();
            awjxVar2.b |= 1;
            awjxVar2.c = c;
            awjx awjxVar3 = (awjx) builder2.build();
            builder.copyOnWrite();
            awjw awjwVar4 = (awjw) builder.instance;
            awjxVar3.getClass();
            awjwVar4.c = awjxVar3;
            awjwVar4.b = 1;
        }
        b.v = (awjw) builder.build();
        wbkVar.c.d(b, new wbi(wbkVar, aawbVar, builder));
    }
}

package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apxf;
import defpackage.aqtn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint extends aonm implements aooz {
    public static final ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint a;
    private static volatile aopf d;
    public static final aonk resizeEngagementPanelToFullBleedEndpoint;
    public int b = 0;
    public Object c;

    static {
        ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint = new ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint();
        a = resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint;
        aonm.registerDefaultInstance(ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.class, resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint);
        resizeEngagementPanelToFullBleedEndpoint = aonm.newSingularGeneratedExtension(apxf.a, resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint, resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint, null, 300135747, aoqn.MESSAGE, ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.class);
    }

    private ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000", new Object[]{"c", "b", aqtn.class});
            case NEW_MUTABLE_INSTANCE:
                return new ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

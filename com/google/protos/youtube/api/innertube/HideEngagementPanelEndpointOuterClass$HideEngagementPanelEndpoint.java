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
public final class HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint extends aonm implements aooz {
    public static final HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint a;
    private static volatile aopf h;
    public static final aonk hideEngagementPanelEndpoint;
    public int b;
    public Object d;
    public boolean e;
    public apxf f;
    public boolean g;
    public int c = 0;
    private byte i = 2;

    static {
        HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = new HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint();
        a = hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
        aonm.registerDefaultInstance(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.class, hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint);
        hideEngagementPanelEndpoint = aonm.newSingularGeneratedExtension(apxf.a, hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint, hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint, null, 183437148, aoqn.MESSAGE, HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.class);
    }

    private HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ျ\u0000\u0002ဇ\u0002\u0003ᐉ\u0003\u0004ြ\u0000\u0005ဇ\u0004", new Object[]{"d", "c", "b", "e", "f", aqtn.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

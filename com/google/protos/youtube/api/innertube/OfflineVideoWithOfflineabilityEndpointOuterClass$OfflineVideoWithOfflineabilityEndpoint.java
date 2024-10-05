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
import defpackage.atqp;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint extends aonm implements aooz {
    public static final OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint a;
    private static volatile aopf e;
    public static final aonk offlineVideoWithOfflineabilityEndpoint;
    public int c;
    public aulq d;
    private int f;
    private byte g = 2;
    public String b = "";

    static {
        OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint = new OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint();
        a = offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint;
        aonm.registerDefaultInstance(OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.class, offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint);
        offlineVideoWithOfflineabilityEndpoint = aonm.newSingularGeneratedExtension(apxf.a, offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint, offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint, null, 171338118, aoqn.MESSAGE, OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.class);
    }

    private OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002", new Object[]{"f", "b", "c", atqp.g, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

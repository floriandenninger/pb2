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
import defpackage.atom;
import defpackage.atqp;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class OfflineVideoEndpointOuterClass$OfflineVideoEndpoint extends aonm implements aooz {
    public static final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint a;
    private static volatile aopf i;
    public static final aonk offlineVideoEndpoint;
    public int b;
    public Object d;
    public int f;
    public aulq g;
    public atom h;
    public int c = 0;
    private byte j = 2;
    public String e = "";

    static {
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = new OfflineVideoEndpointOuterClass$OfflineVideoEndpoint();
        a = offlineVideoEndpointOuterClass$OfflineVideoEndpoint;
        aonm.registerDefaultInstance(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.class, offlineVideoEndpointOuterClass$OfflineVideoEndpoint);
        offlineVideoEndpoint = aonm.newSingularGeneratedExtension(apxf.a, offlineVideoEndpointOuterClass$OfflineVideoEndpoint, offlineVideoEndpointOuterClass$OfflineVideoEndpoint, null, 73080600, aoqn.MESSAGE, OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.class);
    }

    private OfflineVideoEndpointOuterClass$OfflineVideoEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ျ\u0000\u0002ဌ\u0003\u0004ᐉ\u0005\u0005ဈ\u0002\u0006ဉ\u0006\u0007ျ\u0000", new Object[]{"d", "c", "b", "f", atqp.g, "g", "e", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new OfflineVideoEndpointOuterClass$OfflineVideoEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.youtube.api.innertube;

import defpackage.aomf;
import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aony;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.aovq;
import defpackage.apxf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint extends aonm implements aooz {
    public static final SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint a;
    private static volatile aopf c;
    public static final aonk selectActiveIdentityEndpoint;
    private int d;
    private apxf e;
    private apxf f;
    private byte g = 2;
    public aony b = emptyProtobufList();

    static {
        SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint = new SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint();
        a = selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;
        aonm.registerDefaultInstance(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.class, selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint);
        selectActiveIdentityEndpoint = aonm.newSingularGeneratedExtension(apxf.a, selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint, selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint, null, 77196420, aoqn.MESSAGE, SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.class);
    }

    private SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001Л\u0003ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"d", "b", aovq.class, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AddByEmailEndpointOuterClass$AddByEmailEndpoint extends aonm implements aooz {
    public static final AddByEmailEndpointOuterClass$AddByEmailEndpoint a;
    public static final aonk addByEmailEndpoint;
    private static volatile aopf b;

    static {
        AddByEmailEndpointOuterClass$AddByEmailEndpoint addByEmailEndpointOuterClass$AddByEmailEndpoint = new AddByEmailEndpointOuterClass$AddByEmailEndpoint();
        a = addByEmailEndpointOuterClass$AddByEmailEndpoint;
        aonm.registerDefaultInstance(AddByEmailEndpointOuterClass$AddByEmailEndpoint.class, addByEmailEndpointOuterClass$AddByEmailEndpoint);
        addByEmailEndpoint = aonm.newSingularGeneratedExtension(apxf.a, addByEmailEndpointOuterClass$AddByEmailEndpoint, addByEmailEndpointOuterClass$AddByEmailEndpoint, null, 161983468, aoqn.MESSAGE, AddByEmailEndpointOuterClass$AddByEmailEndpoint.class);
    }

    private AddByEmailEndpointOuterClass$AddByEmailEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new AddByEmailEndpointOuterClass$AddByEmailEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (AddByEmailEndpointOuterClass$AddByEmailEndpoint.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

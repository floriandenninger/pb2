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
import defpackage.aqyg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AddPlaceEndpointOuterClass$AddPlaceEndpoint extends aonm implements aooz {
    public static final AddPlaceEndpointOuterClass$AddPlaceEndpoint a;
    public static final aonk addPlaceEndpoint;
    private static volatile aopf e;
    public int b;
    public aqyg d;
    private aqyg f;
    private byte g = 2;
    public String c = "";

    static {
        AddPlaceEndpointOuterClass$AddPlaceEndpoint addPlaceEndpointOuterClass$AddPlaceEndpoint = new AddPlaceEndpointOuterClass$AddPlaceEndpoint();
        a = addPlaceEndpointOuterClass$AddPlaceEndpoint;
        aonm.registerDefaultInstance(AddPlaceEndpointOuterClass$AddPlaceEndpoint.class, addPlaceEndpointOuterClass$AddPlaceEndpoint);
        addPlaceEndpoint = aonm.newSingularGeneratedExtension(apxf.a, addPlaceEndpointOuterClass$AddPlaceEndpoint, addPlaceEndpointOuterClass$AddPlaceEndpoint, null, 153675053, aoqn.MESSAGE, AddPlaceEndpointOuterClass$AddPlaceEndpoint.class);
    }

    private AddPlaceEndpointOuterClass$AddPlaceEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new AddPlaceEndpointOuterClass$AddPlaceEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (AddPlaceEndpointOuterClass$AddPlaceEndpoint.class) {
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

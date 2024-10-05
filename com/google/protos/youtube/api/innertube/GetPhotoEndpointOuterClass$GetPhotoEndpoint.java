package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apmh;
import defpackage.apxf;
import defpackage.aqyg;
import defpackage.aqze;
import defpackage.arbo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetPhotoEndpointOuterClass$GetPhotoEndpoint extends aonm implements aooz {
    public static final GetPhotoEndpointOuterClass$GetPhotoEndpoint a;
    private static volatile aopf g;
    public static final aonk getPhotoEndpoint;
    public int b;
    public int c;
    public apmh d;
    public arbo e;
    public aqyg f;
    private byte h = 2;

    static {
        GetPhotoEndpointOuterClass$GetPhotoEndpoint getPhotoEndpointOuterClass$GetPhotoEndpoint = new GetPhotoEndpointOuterClass$GetPhotoEndpoint();
        a = getPhotoEndpointOuterClass$GetPhotoEndpoint;
        aonm.registerDefaultInstance(GetPhotoEndpointOuterClass$GetPhotoEndpoint.class, getPhotoEndpointOuterClass$GetPhotoEndpoint);
        getPhotoEndpoint = aonm.newSingularGeneratedExtension(apxf.a, getPhotoEndpointOuterClass$GetPhotoEndpoint, getPhotoEndpointOuterClass$GetPhotoEndpoint, null, 99404607, aoqn.MESSAGE, GetPhotoEndpointOuterClass$GetPhotoEndpoint.class);
    }

    private GetPhotoEndpointOuterClass$GetPhotoEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", aqze.f, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new GetPhotoEndpointOuterClass$GetPhotoEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (GetPhotoEndpointOuterClass$GetPhotoEndpoint.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

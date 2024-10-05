package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aony;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apxf;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LightweightCameraEndpointOuterClass$LightweightCameraEndpoint extends aonm implements aooz {
    public static final LightweightCameraEndpointOuterClass$LightweightCameraEndpoint a;
    private static volatile aopf g;
    public static final aonk lightweightCameraEndpoint;
    public int b;
    public int c;
    public apxf d;
    private byte h = 2;
    public aony e = emptyProtobufList();
    public String f = "";

    static {
        LightweightCameraEndpointOuterClass$LightweightCameraEndpoint lightweightCameraEndpointOuterClass$LightweightCameraEndpoint = new LightweightCameraEndpointOuterClass$LightweightCameraEndpoint();
        a = lightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
        aonm.registerDefaultInstance(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.class, lightweightCameraEndpointOuterClass$LightweightCameraEndpoint);
        lightweightCameraEndpoint = aonm.newSingularGeneratedExtension(apxf.a, lightweightCameraEndpointOuterClass$LightweightCameraEndpoint, lightweightCameraEndpointOuterClass$LightweightCameraEndpoint, null, 139979438, aoqn.MESSAGE, LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.class);
    }

    private LightweightCameraEndpointOuterClass$LightweightCameraEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0002\u0002င\u0001\u0003ᐉ\u0002\u0005Л\u0006ဈ\u0004", new Object[]{"b", "c", "d", "e", aulq.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new LightweightCameraEndpointOuterClass$LightweightCameraEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.class) {
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

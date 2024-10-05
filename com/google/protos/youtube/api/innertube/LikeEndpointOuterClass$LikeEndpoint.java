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
import defpackage.asno;
import defpackage.asnp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LikeEndpointOuterClass$LikeEndpoint extends aonm implements aooz {
    public static final LikeEndpointOuterClass$LikeEndpoint a;
    private static volatile aopf h;
    public static final aonk likeEndpoint;
    public int b;
    public Object d;
    public int e;
    public asnp f;
    public int c = 0;
    private byte i = 2;
    public aony g = emptyProtobufList();

    static {
        LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = new LikeEndpointOuterClass$LikeEndpoint();
        a = likeEndpointOuterClass$LikeEndpoint;
        aonm.registerDefaultInstance(LikeEndpointOuterClass$LikeEndpoint.class, likeEndpointOuterClass$LikeEndpoint);
        likeEndpoint = aonm.newSingularGeneratedExtension(apxf.a, likeEndpointOuterClass$LikeEndpoint, likeEndpointOuterClass$LikeEndpoint, null, 63158558, aoqn.MESSAGE, LikeEndpointOuterClass$LikeEndpoint.class);
    }

    private LikeEndpointOuterClass$LikeEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0003Л\u0006ျ\u0000\u0007ျ\u0000\bျ\u0000", new Object[]{"d", "c", "b", "e", asno.a(), "f", "g", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new LikeEndpointOuterClass$LikeEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (LikeEndpointOuterClass$LikeEndpoint.class) {
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

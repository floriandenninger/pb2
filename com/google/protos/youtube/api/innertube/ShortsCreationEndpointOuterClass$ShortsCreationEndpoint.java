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
import defpackage.auqy;
import defpackage.autl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShortsCreationEndpointOuterClass$ShortsCreationEndpoint extends aonm implements aooz {
    public static final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint a;
    private static volatile aopf g;
    public static final aonk shortsCreationEndpoint;
    public int b;
    public int d;
    public int e;
    public apxf f;
    private byte h = 2;
    public aony c = emptyProtobufList();

    static {
        ShortsCreationEndpointOuterClass$ShortsCreationEndpoint shortsCreationEndpointOuterClass$ShortsCreationEndpoint = new ShortsCreationEndpointOuterClass$ShortsCreationEndpoint();
        a = shortsCreationEndpointOuterClass$ShortsCreationEndpoint;
        aonm.registerDefaultInstance(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.class, shortsCreationEndpointOuterClass$ShortsCreationEndpoint);
        shortsCreationEndpoint = aonm.newSingularGeneratedExtension(apxf.a, shortsCreationEndpointOuterClass$ShortsCreationEndpoint, shortsCreationEndpointOuterClass$ShortsCreationEndpoint, null, 307460408, aoqn.MESSAGE, ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.class);
    }

    private ShortsCreationEndpointOuterClass$ShortsCreationEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0002\u0002Л\u0003ဌ\u0001\u0004ဌ\u0002\u0005ᐉ\u0003", new Object[]{"b", "c", aulq.class, "d", autl.a(), "e", auqy.i, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new ShortsCreationEndpointOuterClass$ShortsCreationEndpoint();
            case NEW_BUILDER:
                return new aone((boolean[]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.class) {
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

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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint extends aonm implements aooz {
    public static final PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint a;
    private static volatile aopf e;
    public static final aonk performCommentActionEndpoint;
    private int f;
    private byte g = 2;
    public String b = "";
    public aony c = aonm.emptyProtobufList();
    public aony d = emptyProtobufList();

    static {
        PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint performCommentActionEndpointOuterClass$PerformCommentActionEndpoint = new PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint();
        a = performCommentActionEndpointOuterClass$PerformCommentActionEndpoint;
        aonm.registerDefaultInstance(PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.class, performCommentActionEndpointOuterClass$PerformCommentActionEndpoint);
        performCommentActionEndpoint = aonm.newSingularGeneratedExtension(apxf.a, performCommentActionEndpointOuterClass$PerformCommentActionEndpoint, performCommentActionEndpointOuterClass$PerformCommentActionEndpoint, null, 65929205, aoqn.MESSAGE, PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.class);
    }

    private PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001ဈ\u0000\u0002Л\u0003\u001a", new Object[]{"f", "b", "d", apxf.class, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.class) {
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

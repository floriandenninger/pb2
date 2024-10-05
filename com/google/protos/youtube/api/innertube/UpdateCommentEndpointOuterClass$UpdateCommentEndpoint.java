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
public final class UpdateCommentEndpointOuterClass$UpdateCommentEndpoint extends aonm implements aooz {
    public static final UpdateCommentEndpointOuterClass$UpdateCommentEndpoint a;
    private static volatile aopf e;
    public static final aonk updateCommentEndpoint;
    public aqyg c;
    public boolean d;
    private int f;
    private byte g = 2;
    public String b = "";

    static {
        UpdateCommentEndpointOuterClass$UpdateCommentEndpoint updateCommentEndpointOuterClass$UpdateCommentEndpoint = new UpdateCommentEndpointOuterClass$UpdateCommentEndpoint();
        a = updateCommentEndpointOuterClass$UpdateCommentEndpoint;
        aonm.registerDefaultInstance(UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.class, updateCommentEndpointOuterClass$UpdateCommentEndpoint);
        updateCommentEndpoint = aonm.newSingularGeneratedExtension(apxf.a, updateCommentEndpointOuterClass$UpdateCommentEndpoint, updateCommentEndpointOuterClass$UpdateCommentEndpoint, null, 99326409, aoqn.MESSAGE, UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.class);
    }

    private UpdateCommentEndpointOuterClass$UpdateCommentEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002", new Object[]{"f", "b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new UpdateCommentEndpointOuterClass$UpdateCommentEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.class) {
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

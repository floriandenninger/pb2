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
public final class UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint extends aonm implements aooz {
    public static final UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint a;
    private static volatile aopf e;
    public static final aonk updateCommentReplyEndpoint;
    public aqyg c;
    public boolean d;
    private int f;
    private byte g = 2;
    public String b = "";

    static {
        UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint = new UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint();
        a = updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint;
        aonm.registerDefaultInstance(UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.class, updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint);
        updateCommentReplyEndpoint = aonm.newSingularGeneratedExtension(apxf.a, updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint, updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint, null, 100723586, aoqn.MESSAGE, UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.class);
    }

    private UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ဇ\u0003", new Object[]{"f", "b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.class) {
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

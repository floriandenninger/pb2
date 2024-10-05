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
public final class CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint extends aonm implements aooz {
    public static final CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint a;
    public static final aonk createCommentReplyEndpoint;
    private static volatile aopf h;
    public int b;
    public aqyg d;
    public boolean e;
    private aqyg i;
    private byte j = 2;
    public String c = "";
    public String f = "";
    public String g = "";

    static {
        CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint = new CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint();
        a = createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint;
        aonm.registerDefaultInstance(CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.class, createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint);
        createCommentReplyEndpoint = aonm.newSingularGeneratedExtension(apxf.a, createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint, createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint, null, 66712070, aoqn.MESSAGE, CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.class);
    }

    private CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0002\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"b", "c", "i", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.class) {
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

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
public final class CreateCommentEndpointOuterClass$CreateCommentEndpoint extends aonm implements aooz {
    public static final CreateCommentEndpointOuterClass$CreateCommentEndpoint a;
    public static final aonk createCommentEndpoint;
    private static volatile aopf h;
    public int b;
    public aqyg d;
    public boolean e;
    private byte i = 2;
    public String c = "";
    public String f = "";
    public String g = "";

    static {
        CreateCommentEndpointOuterClass$CreateCommentEndpoint createCommentEndpointOuterClass$CreateCommentEndpoint = new CreateCommentEndpointOuterClass$CreateCommentEndpoint();
        a = createCommentEndpointOuterClass$CreateCommentEndpoint;
        aonm.registerDefaultInstance(CreateCommentEndpointOuterClass$CreateCommentEndpoint.class, createCommentEndpointOuterClass$CreateCommentEndpoint);
        createCommentEndpoint = aonm.newSingularGeneratedExtension(apxf.a, createCommentEndpointOuterClass$CreateCommentEndpoint, createCommentEndpointOuterClass$CreateCommentEndpoint, null, 68212148, aoqn.MESSAGE, CreateCommentEndpointOuterClass$CreateCommentEndpoint.class);
    }

    private CreateCommentEndpointOuterClass$CreateCommentEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new CreateCommentEndpointOuterClass$CreateCommentEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (CreateCommentEndpointOuterClass$CreateCommentEndpoint.class) {
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

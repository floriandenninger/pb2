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
import defpackage.apxl;
import defpackage.aqgt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint extends aonm implements aooz {
    public static final CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint a;
    public static final aonk createCommentReplyDialogEndpoint;
    private static volatile aopf j;
    public int b;
    public aqgt c;
    public apxl d;
    public apxl e;
    public boolean f;
    public apxf h;
    private byte k = 2;
    public String g = "";
    public String i = "";

    static {
        CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint = new CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint();
        a = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint;
        aonm.registerDefaultInstance(CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.class, createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint);
        createCommentReplyDialogEndpoint = aonm.newSingularGeneratedExtension(apxf.a, createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint, createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint, null, 95237586, aoqn.MESSAGE, CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.class);
    }

    private CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ဇ\u0004\u0006ဈ\u0005\u0007ᐉ\u0006\bဈ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

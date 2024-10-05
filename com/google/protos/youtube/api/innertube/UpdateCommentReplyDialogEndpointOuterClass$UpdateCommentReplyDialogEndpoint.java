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
import defpackage.avsa;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint extends aonm implements aooz {
    public static final UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint a;
    private static volatile aopf f;
    public static final aonk updateCommentReplyDialogEndpoint;
    public int b;
    public avsa c;
    public boolean d;
    private byte g = 2;
    public String e = "";

    static {
        UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint = new UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint();
        a = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint;
        aonm.registerDefaultInstance(UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.class, updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint);
        updateCommentReplyDialogEndpoint = aonm.newSingularGeneratedExtension(apxf.a, updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint, updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint, null, 122558141, aoqn.MESSAGE, UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.class);
    }

    private UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဇ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

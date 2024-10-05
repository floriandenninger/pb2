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
import defpackage.avrz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint extends aonm implements aooz {
    public static final UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint a;
    private static volatile aopf f;
    public static final aonk updateCommentDialogEndpoint;
    public int b;
    public avrz c;
    public boolean d;
    private byte g = 2;
    public String e = "";

    static {
        UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint = new UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint();
        a = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint;
        aonm.registerDefaultInstance(UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.class, updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint);
        updateCommentDialogEndpoint = aonm.newSingularGeneratedExtension(apxf.a, updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint, updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint, null, 122557296, aoqn.MESSAGE, UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.class);
    }

    private UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.class) {
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

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
import defpackage.aqgs;
import defpackage.awkb;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint extends aonm implements aooz {
    public static final CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint a;
    public static final aonk createCommentDialogEndpoint;
    private static volatile aopf e;
    public aqgs b;
    public awkb c;
    public boolean d;
    private int f;
    private apxf g;
    private apxf h;
    private byte i = 2;

    static {
        CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint = new CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint();
        a = createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint;
        aonm.registerDefaultInstance(CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.class, createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint);
        createCommentDialogEndpoint = aonm.newSingularGeneratedExtension(apxf.a, createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint, createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint, null, 122289677, aoqn.MESSAGE, CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.class);
    }

    private CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ဇ\u0003\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"f", "b", "c", "d", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.class) {
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

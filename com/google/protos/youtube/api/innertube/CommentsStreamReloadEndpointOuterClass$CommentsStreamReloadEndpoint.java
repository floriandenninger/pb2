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
import defpackage.apyu;
import defpackage.aqan;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint extends aonm implements aooz {
    public static final CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint a;
    public static final aonk commentsStreamReloadEndpoint;
    private static volatile aopf h;
    public int b;
    public aqan c;
    public int d;
    public int f;
    public boolean g;
    private byte i = 2;
    public String e = "";

    static {
        CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint = new CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint();
        a = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint;
        aonm.registerDefaultInstance(CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.class, commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint);
        commentsStreamReloadEndpoint = aonm.newSingularGeneratedExtension(apxf.a, commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint, commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint, null, 137332281, aoqn.MESSAGE, CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.class);
    }

    private CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", apyu.f, "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.class) {
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

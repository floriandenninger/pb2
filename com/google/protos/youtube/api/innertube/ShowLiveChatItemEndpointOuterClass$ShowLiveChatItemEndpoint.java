package com.google.protos.youtube.api.innertube;

import defpackage.aomf;
import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.aota;
import defpackage.apxf;
import defpackage.aspl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint extends aonm implements aooz {
    public static final ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint a;
    private static volatile aopf d;
    public static final aonk showLiveChatItemEndpoint;
    public int b;
    public aspl c;
    private aota e;
    private byte f = 2;

    static {
        ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint = new ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint();
        a = showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint;
        aonm.registerDefaultInstance(ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.class, showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint);
        showLiveChatItemEndpoint = aonm.newSingularGeneratedExtension(apxf.a, showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint, showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint, null, 135843030, aoqn.MESSAGE, ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.class);
    }

    private ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint extends aonm implements aooz {
    public static final SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint a;
    private static volatile aopf d;
    public static final aonk sharePrivateVideoEndpoint;
    public apxf c;
    private int e;
    private byte f = 2;
    public String b = "";

    static {
        SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint = new SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint();
        a = sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint;
        aonm.registerDefaultInstance(SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.class, sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint);
        sharePrivateVideoEndpoint = aonm.newSingularGeneratedExtension(apxf.a, sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint, sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint, null, 117735229, aoqn.MESSAGE, SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.class);
    }

    private SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.class) {
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

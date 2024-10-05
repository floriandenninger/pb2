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
public final class ShareVideoEndpointOuterClass$ShareVideoEndpoint extends aonm implements aooz {
    public static final ShareVideoEndpointOuterClass$ShareVideoEndpoint a;
    private static volatile aopf d;
    public static final aonk shareVideoEndpoint;
    public String b = "";
    public String c = "";
    private int e;

    static {
        ShareVideoEndpointOuterClass$ShareVideoEndpoint shareVideoEndpointOuterClass$ShareVideoEndpoint = new ShareVideoEndpointOuterClass$ShareVideoEndpoint();
        a = shareVideoEndpointOuterClass$ShareVideoEndpoint;
        aonm.registerDefaultInstance(ShareVideoEndpointOuterClass$ShareVideoEndpoint.class, shareVideoEndpointOuterClass$ShareVideoEndpoint);
        shareVideoEndpoint = aonm.newSingularGeneratedExtension(apxf.a, shareVideoEndpointOuterClass$ShareVideoEndpoint, shareVideoEndpointOuterClass$ShareVideoEndpoint, null, 73844178, aoqn.MESSAGE, ShareVideoEndpointOuterClass$ShareVideoEndpoint.class);
    }

    private ShareVideoEndpointOuterClass$ShareVideoEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ShareVideoEndpointOuterClass$ShareVideoEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ShareVideoEndpointOuterClass$ShareVideoEndpoint.class) {
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

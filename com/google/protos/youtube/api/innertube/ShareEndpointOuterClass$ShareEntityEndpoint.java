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
import defpackage.auqy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShareEndpointOuterClass$ShareEntityEndpoint extends aonm implements aooz {
    public static final ShareEndpointOuterClass$ShareEntityEndpoint a;
    private static volatile aopf g;
    public static final aonk shareEntityEndpoint;
    public int b;
    public apxf f;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public int e = 1;

    static {
        ShareEndpointOuterClass$ShareEntityEndpoint shareEndpointOuterClass$ShareEntityEndpoint = new ShareEndpointOuterClass$ShareEntityEndpoint();
        a = shareEndpointOuterClass$ShareEntityEndpoint;
        aonm.registerDefaultInstance(ShareEndpointOuterClass$ShareEntityEndpoint.class, shareEndpointOuterClass$ShareEntityEndpoint);
        shareEntityEndpoint = aonm.newSingularGeneratedExtension(apxf.a, shareEndpointOuterClass$ShareEntityEndpoint, shareEndpointOuterClass$ShareEntityEndpoint, null, 90650344, aoqn.MESSAGE, ShareEndpointOuterClass$ShareEntityEndpoint.class);
    }

    private ShareEndpointOuterClass$ShareEntityEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0006ဌ\u0003\u0007ᐉ\u0004", new Object[]{"b", "c", "d", "e", auqy.e, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new ShareEndpointOuterClass$ShareEntityEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (ShareEndpointOuterClass$ShareEntityEndpoint.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

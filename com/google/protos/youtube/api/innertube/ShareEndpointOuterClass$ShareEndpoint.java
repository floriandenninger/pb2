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
import defpackage.aurq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShareEndpointOuterClass$ShareEndpoint extends aonm implements aooz {
    public static final ShareEndpointOuterClass$ShareEndpoint a;
    private static volatile aopf d;
    public static final aonk shareEndpoint;
    private int e;
    private aurq f;
    private byte g = 2;
    public String b = "";
    public String c = "";

    static {
        ShareEndpointOuterClass$ShareEndpoint shareEndpointOuterClass$ShareEndpoint = new ShareEndpointOuterClass$ShareEndpoint();
        a = shareEndpointOuterClass$ShareEndpoint;
        aonm.registerDefaultInstance(ShareEndpointOuterClass$ShareEndpoint.class, shareEndpointOuterClass$ShareEndpoint);
        shareEndpoint = aonm.newSingularGeneratedExtension(apxf.a, shareEndpointOuterClass$ShareEndpoint, shareEndpointOuterClass$ShareEndpoint, null, 85383280, aoqn.MESSAGE, ShareEndpointOuterClass$ShareEndpoint.class);
    }

    private ShareEndpointOuterClass$ShareEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002", new Object[]{"e", "b", "c", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new ShareEndpointOuterClass$ShareEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ShareEndpointOuterClass$ShareEndpoint.class) {
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

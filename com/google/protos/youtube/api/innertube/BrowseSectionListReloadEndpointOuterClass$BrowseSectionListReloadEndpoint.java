package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.aply;
import defpackage.apxf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint extends aonm implements aooz {
    public static final BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint a;
    public static final aonk browseSectionListReloadEndpoint;
    private static volatile aopf g;
    public int b;
    public aply c;
    public boolean e;
    public int f;
    private byte h = 2;
    public String d = "";

    static {
        BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint = new BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint();
        a = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint;
        aonm.registerDefaultInstance(BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.class, browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint);
        browseSectionListReloadEndpoint = aonm.newSingularGeneratedExtension(apxf.a, browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint, browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint, null, 120837120, aoqn.MESSAGE, BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.class);
    }

    private BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.class) {
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

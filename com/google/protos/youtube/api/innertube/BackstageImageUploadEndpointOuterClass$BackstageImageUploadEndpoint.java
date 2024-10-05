package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apik;
import defpackage.apir;
import defpackage.apxf;
import defpackage.aqyg;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint extends aonm implements aooz {
    public static final BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint a;
    public static final aonk backstageImageUploadEndpoint;
    private static volatile aopf k;
    public int b;
    public apir e;
    public apik f;
    public aulq g;
    public apxf h;
    public boolean i;
    public aulq j;
    private aqyg l;
    private aqyg m;
    private byte n = 2;
    public String c = "";
    public String d = "";

    static {
        BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = new BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint();
        a = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
        aonm.registerDefaultInstance(BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.class, backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint);
        backstageImageUploadEndpoint = aonm.newSingularGeneratedExtension(apxf.a, backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint, backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint, null, 125827176, aoqn.MESSAGE, BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.class);
    }

    private BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0006\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0007ᐉ\u0006\bᐉ\u0007\tဇ\b\u000bᐉ\u000b\fᐉ\f\rᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "l", "m", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

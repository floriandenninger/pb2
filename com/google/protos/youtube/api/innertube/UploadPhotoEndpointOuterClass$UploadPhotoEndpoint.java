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
import defpackage.aqyg;
import defpackage.avgg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UploadPhotoEndpointOuterClass$UploadPhotoEndpoint extends aonm implements aooz {
    public static final UploadPhotoEndpointOuterClass$UploadPhotoEndpoint a;
    private static volatile aopf j;
    public static final aonk uploadPhotoEndpoint;
    public int b;
    public Object d;
    public avgg g;
    public aqyg h;
    public aqyg i;
    public int c = 0;
    private byte k = 2;
    public String e = "";
    public String f = "";

    static {
        UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = new UploadPhotoEndpointOuterClass$UploadPhotoEndpoint();
        a = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
        aonm.registerDefaultInstance(UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.class, uploadPhotoEndpointOuterClass$UploadPhotoEndpoint);
        uploadPhotoEndpoint = aonm.newSingularGeneratedExtension(apxf.a, uploadPhotoEndpointOuterClass$UploadPhotoEndpoint, uploadPhotoEndpointOuterClass$UploadPhotoEndpoint, null, 99402190, aoqn.MESSAGE, UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.class);
    }

    private UploadPhotoEndpointOuterClass$UploadPhotoEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0002\t\u0007\u0000\u0000\u0005\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ᐉ\b\bဈ\u0003\tဈ\u0002", new Object[]{"d", "c", "b", apxf.class, apxf.class, "g", "h", "i", "f", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new UploadPhotoEndpointOuterClass$UploadPhotoEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

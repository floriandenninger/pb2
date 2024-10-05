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
import defpackage.apxf;
import defpackage.asrh;
import defpackage.avit;
import defpackage.awgg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcGetCartEndpoint$YPCGetCartEndpoint extends aonm implements aooz {
    public static final YpcGetCartEndpoint$YPCGetCartEndpoint a;
    private static volatile aopf n;
    public static final aonk ypcGetCartEndpoint;
    public int b;
    public long f;
    public asrh h;
    public awgg i;
    public String j;
    public long k;
    public avit l;
    public String m;
    private byte o = 2;
    public String c = "";
    public aomf d = aomf.b;
    public String e = "";
    public String g = "";

    static {
        YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = new YpcGetCartEndpoint$YPCGetCartEndpoint();
        a = ypcGetCartEndpoint$YPCGetCartEndpoint;
        aonm.registerDefaultInstance(YpcGetCartEndpoint$YPCGetCartEndpoint.class, ypcGetCartEndpoint$YPCGetCartEndpoint);
        ypcGetCartEndpoint = aonm.newSingularGeneratedExtension(apxf.a, ypcGetCartEndpoint$YPCGetCartEndpoint, ypcGetCartEndpoint$YPCGetCartEndpoint, null, 95253721, aoqn.MESSAGE, YpcGetCartEndpoint$YPCGetCartEndpoint.class);
    }

    private YpcGetCartEndpoint$YPCGetCartEndpoint() {
        emptyProtobufList();
        this.j = "";
        this.m = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000f\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0006\u0004ည\u0001\u0005ဂ\u0003\u0006ဈ\u0004\u0007ဉ\u0005\nဈ\t\u000bဃ\n\fဈ\u0002\u000eဉ\u000b\u000fဈ\f", new Object[]{"b", "c", "i", "d", "f", "g", "h", "j", "k", "e", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new YpcGetCartEndpoint$YPCGetCartEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (YpcGetCartEndpoint$YPCGetCartEndpoint.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

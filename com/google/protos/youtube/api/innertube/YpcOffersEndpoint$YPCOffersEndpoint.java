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
import defpackage.awgj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcOffersEndpoint$YPCOffersEndpoint extends aonm implements aooz {
    public static final YpcOffersEndpoint$YPCOffersEndpoint a;
    private static volatile aopf e;
    public static final aonk ypcOffersEndpoint;
    public boolean c;
    public boolean d;
    private int f;
    private awgj g;
    private apxf h;
    private byte i = 2;
    public String b = "";

    static {
        YpcOffersEndpoint$YPCOffersEndpoint ypcOffersEndpoint$YPCOffersEndpoint = new YpcOffersEndpoint$YPCOffersEndpoint();
        a = ypcOffersEndpoint$YPCOffersEndpoint;
        aonm.registerDefaultInstance(YpcOffersEndpoint$YPCOffersEndpoint.class, ypcOffersEndpoint$YPCOffersEndpoint);
        ypcOffersEndpoint = aonm.newSingularGeneratedExtension(apxf.a, ypcOffersEndpoint$YPCOffersEndpoint, ypcOffersEndpoint$YPCOffersEndpoint, null, 64681250, aoqn.MESSAGE, YpcOffersEndpoint$YPCOffersEndpoint.class);
    }

    private YpcOffersEndpoint$YPCOffersEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\uf70f⩻\u0005\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0002\u0003ဇ\u0003\u0005ဇ\u0004\uf70f⩻ᐉ\u0001", new Object[]{"f", "b", "h", "c", "d", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new YpcOffersEndpoint$YPCOffersEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (YpcOffersEndpoint$YPCOffersEndpoint.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

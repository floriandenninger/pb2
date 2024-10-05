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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint extends aonm implements aooz {
    public static final YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint a;
    private static volatile aopf h;
    public static final aonk ypcFixInstrumentEndpoint;
    public Object c;
    public Object e;
    private int i;
    public int b = 0;
    public int d = 0;
    private byte j = 2;
    public aomf f = aomf.b;
    public aomf g = aomf.b;

    static {
        YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint = new YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint();
        a = ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint;
        aonm.registerDefaultInstance(YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.class, ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint);
        ypcFixInstrumentEndpoint = aonm.newSingularGeneratedExtension(apxf.a, ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint, ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint, null, 152316869, aoqn.MESSAGE, YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.class);
    }

    private YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0002\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ည\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0001\u0005ᐼ\u0001\u0006ည\u0005", new Object[]{"c", "b", "e", "d", "i", "f", apxf.class, apxf.class, apxf.class, apxf.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

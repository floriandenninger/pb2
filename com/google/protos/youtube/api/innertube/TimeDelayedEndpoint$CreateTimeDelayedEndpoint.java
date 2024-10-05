package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aony;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apxf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TimeDelayedEndpoint$CreateTimeDelayedEndpoint extends aonm implements aooz {
    public static final TimeDelayedEndpoint$CreateTimeDelayedEndpoint a;
    public static final aonk createTimeDelayedEndpoint;
    private static volatile aopf h;
    public int b;
    public int d;
    public apxf f;
    private byte i = 2;
    public String c = "";
    public aony e = emptyProtobufList();
    public aony g = emptyProtobufList();

    static {
        TimeDelayedEndpoint$CreateTimeDelayedEndpoint timeDelayedEndpoint$CreateTimeDelayedEndpoint = new TimeDelayedEndpoint$CreateTimeDelayedEndpoint();
        a = timeDelayedEndpoint$CreateTimeDelayedEndpoint;
        aonm.registerDefaultInstance(TimeDelayedEndpoint$CreateTimeDelayedEndpoint.class, timeDelayedEndpoint$CreateTimeDelayedEndpoint);
        createTimeDelayedEndpoint = aonm.newSingularGeneratedExtension(apxf.a, timeDelayedEndpoint$CreateTimeDelayedEndpoint, timeDelayedEndpoint$CreateTimeDelayedEndpoint, null, 165976025, aoqn.MESSAGE, TimeDelayedEndpoint$CreateTimeDelayedEndpoint.class);
    }

    private TimeDelayedEndpoint$CreateTimeDelayedEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0003\u0001ဈ\u0000\u0002င\u0001\u0003Л\u0004ᐉ\u0002\u0005Л", new Object[]{"b", "c", "d", "e", apxf.class, "f", "g", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new TimeDelayedEndpoint$CreateTimeDelayedEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (TimeDelayedEndpoint$CreateTimeDelayedEndpoint.class) {
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

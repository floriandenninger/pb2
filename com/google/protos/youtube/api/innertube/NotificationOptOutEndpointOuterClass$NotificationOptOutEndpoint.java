package com.google.protos.youtube.api.innertube;

import defpackage.aomf;
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
import defpackage.aqyg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint extends aonm implements aooz {
    public static final NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint a;
    private static volatile aopf g;
    public static final aonk notificationOptOutEndpoint;
    public int b;
    public aqyg d;
    public aomf e;
    public aony f;
    private aqyg h;
    private byte i = 2;
    public aomf c = aomf.b;

    static {
        NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint = new NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint();
        a = notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint;
        aonm.registerDefaultInstance(NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.class, notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint);
        notificationOptOutEndpoint = aonm.newSingularGeneratedExtension(apxf.a, notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint, notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint, null, 65091333, aoqn.MESSAGE, NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.class);
    }

    private NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint() {
        emptyProtobufList();
        this.e = aomf.b;
        this.f = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\t\u0005\u0000\u0001\u0003\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0000\bည\u0004\tЛ", new Object[]{"b", "h", "d", "c", "e", "f", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.class) {
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

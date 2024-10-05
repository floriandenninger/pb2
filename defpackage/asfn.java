package defpackage;

import com.google.protos.youtube.api.innertube.CompleteTransactionActionOuterClass$CompleteTransactionAction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asfn extends aonm implements aooz {
    public static final asfn a;
    private static volatile aopf g;
    public int b;
    public Object d;
    public arnd e;
    public apxf f;
    private aqzg h;
    private aota i;
    public int c = 0;
    private byte j = 2;

    static {
        asfn asfnVar = new asfn();
        a = asfnVar;
        aonm.registerDefaultInstance(asfn.class, asfnVar);
    }

    private asfn() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001̉\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0005ᐉ\u0006\u0007ᐉ\u0003̉ᐉ\u0004", new Object[]{"d", "c", "b", "e", CompleteTransactionActionOuterClass$CompleteTransactionAction.class, auun.class, "i", "f", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new asfn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (asfn.class) {
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

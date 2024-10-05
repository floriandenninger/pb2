package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awec extends aonm implements aooz {
    public static final awec a;
    private static volatile aopf i;
    public int b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public boolean h;

    static {
        awec awecVar = new awec();
        a = awecVar;
        aonm.registerDefaultInstance(awec.class, awecVar);
    }

    private awec() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဇ\u0001\u0003င\u0004\u0004င\u0005\u0005င\u0000\u0006ဂ\u0003\u0007ဇ\u0006", new Object[]{"b", "d", "f", "g", "c", "e", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new awec();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (awec.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

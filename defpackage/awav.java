package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awav extends aonm implements aooz {
    public static final awav a;
    private static volatile aopf i;
    public int b;
    public int d;
    public int f;
    public awav g;
    public apve h;
    public aomf c = aomf.b;
    public int e = -1;

    static {
        awav awavVar = new awav();
        a = awavVar;
        aonm.registerDefaultInstance(awav.class, awavVar);
    }

    private awav() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001\u0003င\u0002\u0006င\u0003\u0007ဉ\u0004\bဉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new awav();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (awav.class) {
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

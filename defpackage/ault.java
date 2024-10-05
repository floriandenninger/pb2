package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ault extends aonm implements aooz {
    public static final ault a;
    private static volatile aopf i;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public long f;
    public boolean g;
    public long h;

    static {
        ault aultVar = new ault();
        a = aultVar;
        aonm.registerDefaultInstance(ault.class, aultVar);
    }

    private ault() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0003ဇ\u0002\u0004င\u0003\u0006ဂ\u0005\u0007ဇ\u0006\bဂ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new ault();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (ault.class) {
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

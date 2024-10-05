package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avtb extends aonm implements aooz {
    public static final avtb a;
    private static volatile aopf f;
    public int b;
    public avta c;
    public int d;
    public long e;

    static {
        avtb avtbVar = new avtb();
        a = avtbVar;
        aonm.registerDefaultInstance(avtb.class, avtbVar);
    }

    private avtb() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"b", "c", "d", avhw.h, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new avtb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (avtb.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

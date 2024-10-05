package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aofn extends aonm implements aooz {
    public static final aofn a;
    private static volatile aopf e;
    public int b;
    public int c;
    public String d = "";

    static {
        aofn aofnVar = new aofn();
        a = aofnVar;
        aonm.registerDefaultInstance(aofn.class, aofnVar);
    }

    private aofn() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဈ\u0001", new Object[]{"b", "c", awwu.h, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aofn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aofn.class) {
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

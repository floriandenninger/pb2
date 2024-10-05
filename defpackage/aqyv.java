package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqyv extends aonm implements aooz {
    public static final aqyv a;
    private static volatile aopf g;
    public int b;
    public Object d;
    public boolean f;
    public int c = 0;
    public String e = "";

    static {
        aqyv aqyvVar = new aqyv();
        a = aqyvVar;
        aonm.registerDefaultInstance(aqyv.class, aqyvVar);
    }

    private aqyv() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0003\u0006\u0003\u0000\u0000\u0000\u0003ဇ\u0001\u0004ြ\u0000\u0006ဈ\u0000", new Object[]{"d", "c", "b", "f", aqyw.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aqyv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aqyv.class) {
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

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqrl extends aonm implements aooz {
    public static final aqrl a;
    private static volatile aopf g;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public int f;

    static {
        aqrl aqrlVar = new aqrl();
        a = aqrlVar;
        aonm.registerDefaultInstance(aqrl.class, aqrlVar);
    }

    private aqrl() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004", new Object[]{"b", "c", aweb.u, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqrl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aqrl.class) {
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

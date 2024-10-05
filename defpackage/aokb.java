package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aokb extends aonm implements aooz {
    public static final aokb a;
    private static volatile aopf g;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    private int h;

    static {
        aokb aokbVar = new aokb();
        a = aokbVar;
        aonm.registerDefaultInstance(aokb.class, aokbVar);
    }

    private aokb() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"h", "b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aokb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aokb.class) {
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

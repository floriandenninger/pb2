package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avxc extends aonm implements aooz {
    public static final avxc a;
    private static volatile aopf g;
    public int b;
    public int c;
    public String d = "";
    public boolean e;
    public int f;

    static {
        avxc avxcVar = new avxc();
        a = avxcVar;
        aonm.registerDefaultInstance(avxc.class, avxcVar);
    }

    private avxc() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0004ဇ\u0003\u0006ဌ\u0005", new Object[]{"b", "c", avwx.a(), "d", "e", "f", avts.q});
            case NEW_MUTABLE_INSTANCE:
                return new avxc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (avxc.class) {
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

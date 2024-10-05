package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aouc extends aonm implements aooz {
    public static final aouc a;
    private static volatile aopf g;
    public int b;
    public boolean c;
    public apmh d;
    public apmh e;
    private byte h = 2;
    public String f = "";

    static {
        aouc aoucVar = new aouc();
        a = aoucVar;
        aonm.registerDefaultInstance(aouc.class, aoucVar);
    }

    private aouc() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0002\u0002ဇ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ဈ\u0005", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aouc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aouc.class) {
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

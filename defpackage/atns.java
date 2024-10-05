package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atns extends aonm implements aooz {
    public static final atns a;
    private static volatile aopf h;
    public int b;
    public boolean d;
    public boolean e;
    public aomf c = aomf.b;
    public String f = "";
    public aony g = emptyProtobufList();

    static {
        atns atnsVar = new atns();
        a = atnsVar;
        aonm.registerDefaultInstance(atns.class, atnsVar);
    }

    private atns() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", atnr.class});
            case NEW_MUTABLE_INSTANCE:
                return new atns();
            case NEW_BUILDER:
                return new aone((boolean[]) null, (int[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (atns.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
